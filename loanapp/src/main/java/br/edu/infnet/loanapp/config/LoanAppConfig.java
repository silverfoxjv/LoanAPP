package br.edu.infnet.loanapp.config;

import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

//@Configuration
//@EnableWebMvc
//@ComponentScan(basePackages = "br.edu.infnet.loanapp")
public class LoanAppConfig {

//	@Bean
	public ViewResolver getViewResolver() {
		final InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setViewClass(JstlView.class);
		vr.setPrefix("WEB-INF/views/");
		vr.setSuffix(".jsp");
		return vr;
	}

}
