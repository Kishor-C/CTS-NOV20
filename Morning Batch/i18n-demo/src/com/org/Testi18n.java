package com.org;

import java.util.Locale;
import java.util.ResourceBundle;

public class Testi18n {

	public static void main(String[] args) {
		String language = Locale.ITALIAN.getLanguage();
		String country = Locale.ITALY.getCountry();
		
		System.out.println("Language: "+language+", Country: "+country);
		Locale locale = new Locale(language, country);
		ResourceBundle resource = ResourceBundle.getBundle("MessagesBundle", locale);
		System.out.println("Greetings: "+resource.getString("greetings"));
	}

}
