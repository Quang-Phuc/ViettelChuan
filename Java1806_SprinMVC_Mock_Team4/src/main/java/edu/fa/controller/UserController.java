package edu.fa.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.fa.common.PageAction;
import edu.fa.model.User;
import edu.fa.service.UserService;
import edu.fa.util.ValidationData;

@Controller
public class UserController {
	@Autowired
	private UserService userSevice;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLogin(Model model) {
		model.addAttribute("user", new User());
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String doLogin(User user, Model model, HttpSession session) {

		String userName = user.getUserName();
		String password = user.getPassword();
		User userSession = userSevice.findOneUserByUserNameAndPassword(userName, password);

		session.setAttribute("userSession", userSession);

		if (ValidationData.checkName(userName) && userSession != null) {

			return "redirect:" + PageAction.UserPage.VIEW_ADMIN;
		} else {
			model.addAttribute("error", true);
			return "redirect:" + PageAction.UserPage.LOGIN;
		}
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String showRegisterGet(Model model, HttpSession session) {

		User user = (User) session.getAttribute("userSession");
		String userName = user.getUserName();
		String password = user.getPassword();
		if (userName.equals(PageAction.UserPage.USER_ADMIN) && password.equals(PageAction.UserPage.USER_ADMIN_PASS)) {
			return "register";
		}
		return "redirect:" + PageAction.UserPage.VIEW_ADMIN;
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(User user, Model model) {

		if (ValidationData.checkName(user.getUserName()) && ValidationData.checkPassWord(user.getPassword())
				&& user.getPassword().equals(user.getRepassword())
				&& userSevice.findOneUserByUserName(user.getUserName()) == null) {
			userSevice.save(user);
			return "login";

		} else {
			return PageAction.UserPage.REGISTER;
		}

	}

	@RequestMapping(value = "/viewpost", method = RequestMethod.GET)
	public String viewPost(Model model) {

		return PageAction.UserPage.VIEW_POST;
	}

	@RequestMapping(value = "/viewuser", method = RequestMethod.GET)
	public String viewUser(Model model) {
		model.addAttribute("listuser", userSevice.users());
		return PageAction.UserPage.VIEW_USER;
	}

	@RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
	public String deletePack(@RequestParam("userId") int userId, Model model) {
		userSevice.deleteById(userId);
		model.addAttribute("listuser", userSevice.users());
		return PageAction.UserPage.VIEW_USER;
	}
	@RequestMapping(value = "/insertAdmin", method = RequestMethod.GET)
	public String insertAdmin() {
		String userName= PageAction.UserPage.USER_ADMIN;
		String password= PageAction.UserPage.USER_ADMIN_PASS;
		User userAdmin = userSevice.findOneUserByUserNameAndPassword(userName, password);
		if(userAdmin==null)
		{
		User user = new  User(userName, password);
		userSevice.save(user);
		}
		return "index";
	}

}
