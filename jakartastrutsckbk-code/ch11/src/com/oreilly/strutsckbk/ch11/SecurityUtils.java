package com.oreilly.strutsckbk.ch11;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Utility methods for in Security. This class contains static methods that
 * can manipulate cookies containing a user's credentials.
 */
public class SecurityUtils {

	private static final String USERNAME_COOKIE = "StrutsCookbookUsername";
    private static final String PASSWORD_COOKIE = "StrutsCookbookPassword";
	private static final int COOKIE_MAX_AGE = 60 * 60 * 24 * 30; // 30 days

    /**
     * Adds a cookie containing the user's credentials
     * to the servlet response.
     * 
     * @param credentials user authentication credentials.
     * @param response HTTP servlet response.
     */
	public final static void addCredentials(Credentials credentials, HttpServletResponse response) {
		Cookie unameCookie = new Cookie(USERNAME_COOKIE, credentials.getName());
        unameCookie.setMaxAge(COOKIE_MAX_AGE);
        response.addCookie(unameCookie);
        Cookie pwordCookie = new Cookie(PASSWORD_COOKIE, credentials.getPassword());
        pwordCookie.setMaxAge(COOKIE_MAX_AGE);
		response.addCookie(pwordCookie);
	}

    /**
     * Removes a user's credentials by expiring the cookie.
     * 
     * @param request HTTP servlet response.
     */
	public final static void removeCredentials(HttpServletResponse response) {
		Cookie unameCookie = new Cookie(USERNAME_COOKIE, "expired");
        // setting the max age to zero causes the cookie to be removed on the client-side
        unameCookie.setMaxAge(0);
        response.addCookie(unameCookie);

        Cookie pwordCookie = new Cookie(PASSWORD_COOKIE, "expired");
        // setting the max age to zero causes the cookie to be removed on the client-side
        pwordCookie.setMaxAge(0);
        response.addCookie(pwordCookie);
	}

    /**
     * Searches for the user's credentials stored as a cookie
     * in the servlet request.
     * 
     * @param request HTTP servlet request.
     * @return credentials.
     */
	public final static Credentials findCredentials(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
        String username = null;
        String password = null;
		if (cookies != null) {
			for (int i=0; i<cookies.length; i++) {
				if (cookies[i].getName().equals(USERNAME_COOKIE)) {
					username = cookies[i].getValue();
				}
                if (cookies[i].getName().equals(PASSWORD_COOKIE)) {
                    password = cookies[i].getValue();
                }
			}
		}
        if (username != null && password != null) {
            return new Credentials(username, password);
        }
		return null;
	}

    /**
	 * Private default constructor to prevent inadvertent instantiation.
	 */
	private SecurityUtils() {
	}
}
