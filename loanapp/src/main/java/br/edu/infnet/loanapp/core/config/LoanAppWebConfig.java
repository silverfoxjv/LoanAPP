package br.edu.infnet.loanapp.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class LoanAppWebConfig {

	@Bean
	public WebMvcConfigurer forwardToIndex() {
		return new WebMvcConfigurer() {
			@Override
			public void addViewControllers(final ViewControllerRegistry registry) {
				registry.addViewController("/").setViewName("forward:/WEB-INF/views/pages/login.jsp");
			}
		};
	}

}
