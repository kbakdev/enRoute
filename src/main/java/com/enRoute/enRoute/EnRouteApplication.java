package com.enRoute.enRoute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

@SpringBootApplication
public class EnRouteApplication {

	@Bean
	public WebSecurityConfigurerAdapter webSecurityConfig(DataSource dataSource) {
		return new WebSecurityConfigurerAdapter() {
			@Override
			protected void configure(HttpSecurity http) throws Exception {
				http.formLogin()
						.loginPage("/login.html")
						.loginProcessingUrl("/perform_login")
						.defaultSuccessUrl("/homepage.html",true)
						.failureUrl("/login.html?error=true");
			}

			@Override
			protected void configure(AuthenticationManagerBuilder builder) throws Exception {
				builder.jdbcAuthentication()
						.dataSource(dataSource);
			}

		};
	}

	public static void main(String[] args) {
		SpringApplication.run(EnRouteApplication.class, args);
	}

}