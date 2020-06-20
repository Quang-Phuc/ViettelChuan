package edu.fa.common;

public class PageAction {
	public interface UserPage {
		String LOGIN = "login";
		String VIEW_ADMIN = "adminHome";
		String VIEW_POST = "view-post";
		String REGISTER = "register";
		String VIEW_USER = "viewuser";
		String USER_ADMIN = "tranxuanan81";
		String USER_ADMIN_PASS = "tranxuanan81";
		String INDEX = "index";
	}

	public interface PacksPage {
		String VIEW_PACKS = "viewpack";
		String SAVE_PACK = "savepack";
		String EDIT_PACK = "editpack";
	}

	public interface PackDataPage {
		String VIEW_PACKDATA = "viewpackdata";
		String SAVE_PACKDATA = "savepackdata";
		String EDIT_PACKDATA = "editpackdata";
	}

}
