package edu.fa.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.fa.common.PageAction;
import edu.fa.model.PackDatas;
import edu.fa.model.User;
import edu.fa.service.PackDataService;
import edu.fa.service.PackService;

@Controller
public class PacksDatasController {
	@Autowired
	private PackService packService;
	@Autowired
	private PackDataService packDataService;

	@RequestMapping(value = "/savePackData", method = RequestMethod.GET)
	public String savePackData(Model model, HttpSession session) {
		User user = (User) session.getAttribute("userSession");

		if (user != null) {
			model.addAttribute("listPack", packService.findAllPack());
			return PageAction.PackDataPage.SAVE_PACKDATA;
		}
		return PageAction.UserPage.INDEX;

	}

	@RequestMapping(value = "/savePackData", method = RequestMethod.POST)
	public String savePackDataPost(PackDatas packDatas, Model model, HttpSession session) {
		User user = (User) session.getAttribute("userSession");

		if (user != null) {
			packDataService.save(packDatas);
			model.addAttribute("listPackData", packDataService.findAllPackDatas());
			return PageAction.PackDataPage.VIEW_PACKDATA;
		}
		return PageAction.UserPage.INDEX;

	}

	@RequestMapping(value = "/updatePackData", method = RequestMethod.GET)
	public String updatePackData(@RequestParam("packDataId") int packDataId, Model model, HttpSession session) {
		User user = (User) session.getAttribute("userSession");

		if (user != null) {
			model.addAttribute("findPackDataById", packDataService.findPackDataById(packDataId));
			model.addAttribute("listPackData", packService.findAllPack());
			return PageAction.PackDataPage.EDIT_PACKDATA;
		}
		return PageAction.UserPage.INDEX;

	}

	@RequestMapping(value = "/updatePackData", method = RequestMethod.POST)
	public String updatePackDataPost(PackDatas packDatas, Model model, HttpSession session) {
		User user = (User) session.getAttribute("userSession");

		if (user != null) {
			packDataService.save(packDatas);
			model.addAttribute("listPackData", packDataService.findAllPackDatas());
			return PageAction.PackDataPage.VIEW_PACKDATA;
		}
		return PageAction.UserPage.INDEX;

	}

	@RequestMapping(value = "/deletePackData", method = RequestMethod.GET)
	public String deletePackData(@RequestParam("packDataId") int packDataId, Model model, HttpSession session) {
		User user = (User) session.getAttribute("userSession");

		if (user != null) {
			packDataService.deleteById(packDataId);
			model.addAttribute("listPackData", packDataService.findAllPackDatas());
			return PageAction.PackDataPage.VIEW_PACKDATA;
		}
		return PageAction.UserPage.INDEX;

	}

	@RequestMapping(value = "/viewpackdata", method = RequestMethod.GET)
	public String viewPackData(Model model) {
		model.addAttribute("listPackData", packDataService.findAllPackDatas());
		return PageAction.PackDataPage.VIEW_PACKDATA;

	}

}
