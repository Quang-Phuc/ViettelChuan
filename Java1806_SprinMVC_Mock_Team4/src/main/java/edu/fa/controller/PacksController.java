package edu.fa.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.fa.common.PageAction;
import edu.fa.model.Packs;
import edu.fa.model.User;
import edu.fa.service.PackService;

@Controller
public class PacksController {
	@Autowired
	private PackService packService;

	@RequestMapping(value = "/savePack", method = RequestMethod.GET)
	public String savePack(HttpSession session) {
		User user = (User) session.getAttribute("userSession");

		if (user != null) {
			return PageAction.PacksPage.SAVE_PACK;
		}
		return PageAction.UserPage.INDEX;

	}

	@RequestMapping(value = "/savePack", method = RequestMethod.POST)
	public String savePackPost(Packs packs, Model model, HttpSession session) {

		User user = (User) session.getAttribute("userSession");

		if (user != null) {
			packService.save(packs);
			model.addAttribute("listPacks", packService.findAllPack());
			return PageAction.PacksPage.VIEW_PACKS;
		}
		return PageAction.UserPage.INDEX;

	}

	@RequestMapping(value = "/updatePack", method = RequestMethod.GET)
	public String updatePack(@RequestParam("packId") int packId, Model model, HttpSession session) {
		User user = (User) session.getAttribute("userSession");

		if (user != null) {
			model.addAttribute("findPackById", packService.findPackById(packId));
			return PageAction.PacksPage.EDIT_PACK;
		}
		return PageAction.UserPage.INDEX;

	}

	@RequestMapping(value = "/updatePack", method = RequestMethod.POST)
	public String updatePackPost(Packs packs, Model model, HttpSession session) {
		User user = (User) session.getAttribute("userSession");

		if (user != null) {
			packService.save(packs);
			model.addAttribute("listPacks", packService.findAllPack());
			return PageAction.PacksPage.VIEW_PACKS;
		}
		return PageAction.UserPage.INDEX;

	}

	@RequestMapping(value = "/deletePack", method = RequestMethod.GET)
	public String deletePack(@RequestParam("packId") int packId, Model model, HttpSession session) {
		User user = (User) session.getAttribute("userSession");

		if (user != null) {
			packService.deleteById(packId);
			model.addAttribute("listPacks", packService.findAllPack());
			return PageAction.PacksPage.VIEW_PACKS;
		}
		return PageAction.UserPage.INDEX;

	}

	@RequestMapping(value = "/viewpack", method = RequestMethod.GET)
	public String viewPacks(Model model) {
		model.addAttribute("listPacks", packService.findAllPack());
		return PageAction.PacksPage.VIEW_PACKS;
	}

}
