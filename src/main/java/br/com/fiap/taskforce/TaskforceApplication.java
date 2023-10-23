package br.com.fiap.taskforce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

@SpringBootApplication
public class TaskforceApplication implements WebMvcConfigurer {

	private LocaleChangeInterceptor interceptor;

	public TaskforceApplication(LocaleChangeInterceptor interceptor) {
		this.interceptor = interceptor;
	}

	public static void main(String[] args) {
		SpringApplication.run(TaskforceApplication.class, args);
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(interceptor);
	}

}
