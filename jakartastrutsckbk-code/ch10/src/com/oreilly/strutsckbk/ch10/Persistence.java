package com.jadecove.util;

import java.io.*;
import javax.servlet.*;
import net.sf.hibernate.*;
import net.sf.hibernate.cfg.Configuration;

/**
 * Filter which manages a ThreadLocal hibernate session.  Obtain the session
 * by calling Persistance.getSession().
 */
public class Persistence implements Filter {

  /**
   * Holds the current hibernate session, if one has been created.
   */
  protected static ThreadLocal hibernateHolder = new ThreadLocal(); 
  
  /**
   */
  protected static SessionFactory factory;
  
  /**
   */
  public void init(FilterConfig filterConfig) throws ServletException {
      // Initialize hibernate
      try {
				doInit();
      }
      catch (HibernateException ex) { 
      	throw new ServletException(ex); 
      }      
   }
   
	/**
	 * This method should only be called when this class is used directly -- that is,
	 * when using this class outside of the servlet container.
	 * @throws HibernateException
	 */
	public static void doInit() throws HibernateException {
		factory = new Configuration().configure().buildSessionFactory();
	}

  /**
   */
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
                 throws IOException, ServletException
  {
      if (hibernateHolder.get() != null)
          throw new IllegalStateException(
              "A session is already associated with this thread!  "
              + "Someone must have called getSession() outside of the context "
              + "of a servlet request.");
          
      try
      {
          chain.doFilter(request, response);
      }
      finally
      {
          Session sess = (Session)hibernateHolder.get();
          if (sess != null)
          {
              hibernateHolder.set(null);
              
              try
              {
                  sess.close();
              }
              catch (HibernateException ex) { throw new ServletException(ex); }
          }
      }
  }
  
  /**
   * ONLY ever call this method from within the context of a servlet request
   * (specifically, one that has been associated with this filter).  If you
   * want a Hibernate session at some other time, call getSessionFactory()
   * and open/close the session yourself.
   *
   * @return an appropriate Session object
   */
  public static Session getSession() throws HibernateException
  {
      Session sess = (Session)hibernateHolder.get();
      
      if (sess == null)
      {
          sess = factory.openSession();
          hibernateHolder.set(sess);
      }
      
      return sess;
  }
  
  /**
   * @return the hibernate session factory
   */
  public static SessionFactory getSessionFactory()
  {
      return factory;
  }
  
  /**
   * This is a simple method to reduce the amount of code that needs
   * to be written every time hibernate is used.
   */
  public static void rollback(net.sf.hibernate.Transaction tx)
  {
      if (tx != null)
      {
          try
          {
              tx.rollback();
          }
          catch (HibernateException ex)
          {
              // Probably don't need to do anything - this is likely being
              // called because of another exception, and we don't want to
              // mask it with yet another exception.
          }
      }
  }
  /**
   */
  public void destroy()
  {
      // Nothing necessary
  }
}