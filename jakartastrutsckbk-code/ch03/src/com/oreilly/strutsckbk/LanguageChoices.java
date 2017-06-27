package com.oreilly.strutsckbk;

import java.util.*;
import org.apache.struts.util.LabelValueBean;

public class LanguageChoices {
	public LanguageChoices() {
		// create the set of languages
		languages = new ArrayList();
		languages.add(createBean("Java"));
		languages.add(createBean("C#"));

		languageIdeMap = new HashMap();

		// create the set of Java IDEs
		LabelValueBean[] javaIdes =  new LabelValueBean[] {
				createBean("Eclipse"),
				createBean("NetBeans"),
				createBean("JDeveloper"),
				createBean("IDEA") };

		// create the set of C# IDEs
		LabelValueBean[] csharpIdes =  new LabelValueBean[] {
				createBean("SharpDevelop"),
				createBean("Visual Studio") };

		// relate the language and IDEs
		languageIdeMap.put("Java", javaIdes);
		languageIdeMap.put("C#", csharpIdes);				
	}

	private LabelValueBean createBean(String name) {
		return new LabelValueBean(name, name);
	}
	
	public Map getLanguageIdeMap() {
		return languageIdeMap;
	}

	public List getLanguages() {
		return languages;
	}

	private List languages;
	private Map languageIdeMap;
}
