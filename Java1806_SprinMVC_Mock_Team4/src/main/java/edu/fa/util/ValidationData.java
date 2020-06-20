package edu.fa.util;

import java.util.regex.Pattern;

public class ValidationData {

	public static boolean checkPassWord(String pass) {
		return Pattern.matches("^[a-zA-Z]{1,30}[0-9]{1,5}$", pass) ? true : false;
	}

	public static boolean checkName(String name) {
		return Pattern.matches("^[a-zA-Z]{1,30}[0-9]{1,5}$", name) ? true : false;
	}

}
