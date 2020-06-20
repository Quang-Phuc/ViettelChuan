package edu.fa.controller;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.fa.model.Packs;
import edu.fa.service.PackService;

@Controller
public class IndexController {

	@Autowired
	private PackService packService;

	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String indexPage(Model model, HttpSession session) {
		List<Packs> listPack = packService.findAllPack();
		List<Packs> listPacks = listPack
				.stream().sorted(
						Comparator
								.comparing(Packs::getTitle,
										Comparator.comparing((String s) -> !s.toUpperCase().contains("NHẤT"))
												.thenComparing(Comparator.naturalOrder())))
				.collect(Collectors.toList());

		session.setAttribute("listPacks", listPacks);

		return "index";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model, HttpSession session) {
		List<Packs> listPack = packService.findAllPack();
		List<Packs> listPacks = listPack
				.stream().sorted(
						Comparator
								.comparing(Packs::getTitle,
										Comparator.comparing((String s) -> !s.toUpperCase().contains("NHẤT"))
												.thenComparing(Comparator.naturalOrder())))
				.collect(Collectors.toList());

		session.setAttribute("listPacks", listPacks);

		return "index";
	}

	@RequestMapping(value = "datatheongay", method = RequestMethod.GET)
	public String dataDay(Model model, HttpSession session) {

		List<Packs> listPack = packService.findAllPack();

		List<Packs> listPacksortName = listPack
				.stream().sorted(
						Comparator
								.comparing(Packs::getTitle,
										Comparator.comparing((String s) -> !s.toUpperCase().contains("NGÀY"))
												.thenComparing(Comparator.naturalOrder())))
				.collect(Collectors.toList());

		session.setAttribute("listPacksortName", listPacksortName);

		return "datatheongay";
	}

	@RequestMapping(value = "goidatadcom", method = RequestMethod.GET)
	public String goiDatadCom(Model model, HttpSession session) {
		List<Packs> listPack = packService.findAllPack();

		List<Packs> listPacksortName = listPack
				.stream().sorted(
						Comparator
								.comparing(Packs::getTitle,
										Comparator.comparing((String s) -> !s.toUpperCase().contains("DCOM"))
												.thenComparing(Comparator.naturalOrder())))
				.collect(Collectors.toList());

		session.setAttribute("listPacksortNameDcom", listPacksortName);
		return "goidatadcom";
	}

	@RequestMapping(value = "goicombo", method = RequestMethod.GET)
	public String goiCombo(Model model, HttpSession session) {
		List<Packs> listPack = packService.findAllPack();

		List<Packs> listPacksortName = listPack
				.stream().sorted(
						Comparator
								.comparing(Packs::getTitle,
										Comparator.comparing((String s) -> !s.toUpperCase().contains("COMBO"))
												.thenComparing(Comparator.naturalOrder())))
				.collect(Collectors.toList());

		session.setAttribute("listPacksortNameCombo", listPacksortName);
		return "goicombo";
	}

}
