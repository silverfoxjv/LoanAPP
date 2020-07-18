package br.edu.infnet.loanapp.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import br.edu.infnet.loanapp.business.model.Client;
import br.edu.infnet.loanapp.core.constants.URLConsts;

@Controller
@RequestMapping(value = "/mainmenu")
@SessionAttributes("clientSession")
public class MainMenuController {

	@GetMapping
	public ModelAndView doGet(final Model model) {
		final Client client = (Client) model.getAttribute("clientSession");
		return new ModelAndView(URLConsts.getMainMenuPath());
	}

}
