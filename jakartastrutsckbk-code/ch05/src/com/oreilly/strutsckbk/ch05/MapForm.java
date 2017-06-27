package com.oreilly.strutsckbk.ch05;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts.action.ActionForm;

public class MapForm extends ActionForm {

	private static String[] skillLevels = new String[] {"Beginner","Intermediate","Advanced"};
	private Map skills = new HashMap();

	public Object getSkill(String key) { 
    return skills.get(key);
  }

  public void setSkill(String key, Object value) { 
  	skills.put(key, value); 
  }
  
	public Map getSkills() {
		return skills;
	}
	
  public String[] getSkillLevels() {
  	return skillLevels;
  }
}
