package br.edu.infnet.loanapp.core.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.edu.infnet.loanapp.business.model.Client;
import br.edu.infnet.loanapp.business.model.Customer;
import br.edu.infnet.loanapp.business.service.FunctionalitySingleton;
import br.edu.infnet.loanapp.business.service.LoginService;
import br.edu.infnet.loanapp.business.type.ClientType;
import br.edu.infnet.loanapp.core.constants.URLConsts;
import br.edu.infnet.loanapp.core.dto.LoginDTO;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@PostMapping
	public ModelAndView logar(@ModelAttribute("loginFormData") final LoginDTO loginDto, final Model model) {

		final Optional<Client> optClient = this.loginService.doLogin(loginDto);

		if (optClient.isPresent()) {
			final ModelAndView modelAndView = new ModelAndView(URLConsts.getMainMenuPath());
			modelAndView.addObject("clientSession", optClient.get());
			modelAndView.addObject("sessionFunctionalities", //
					optClient.get() instanceof Customer //
							? FunctionalitySingleton//
									.getInstance()//
									.getFunctionalitiesByClientType(ClientType.CUSTOMER)
							: FunctionalitySingleton//
									.getInstance() //
									.getFunctionalitiesByClientType(ClientType.COLLECTOR));
			return modelAndView;
		}
		final String mensagem = "Login/Senha inválidos";
		model.addAttribute("message", mensagem);
		return new ModelAndView(URLConsts.getLoginPath());

	}

}
