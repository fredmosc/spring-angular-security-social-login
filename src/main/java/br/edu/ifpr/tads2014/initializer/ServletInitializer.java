package br.edu.ifpr.tads2014.initializer;

import br.edu.ifpr.tads2014.SecurityLoginApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SecurityLoginApplication.class);
	}

}
