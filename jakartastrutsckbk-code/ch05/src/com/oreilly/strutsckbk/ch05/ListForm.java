package com.oreilly.strutsckbk.ch05;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class ListForm extends ActionForm {
	
	private int size = 3;
	private List friends = new ArrayList(size);
	
  public List getFriends() { 
    return friends;
  }

  public String getFriend(int index) {
  	return (String) friends.get(index);
  }

  public void setFriend(int index, String name) {
  	friends.set(index, name);
  }
  
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		friends = new ArrayList();
		for (int i=0; i<size;i++) friends.add("");
	}
}
