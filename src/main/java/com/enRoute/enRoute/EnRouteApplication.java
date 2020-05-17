package com.enRoute.enRoute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;


@SpringBootApplication
public class EnRouteApplication {

	/**
	 * @author Kacper Bąk, Paweł Norwa
	 * The main class that opens the entire application.
	 * It connects to the database from which it retrieves user data.
	 * Here is the entire application configuration.
	 * We also used a builder to build a good SQL database connection.
	 * @param dataSource
	 */
	@Bean
	public WebSecurityConfigurerAdapter webSecurityConfig(DataSource dataSource) {
		return new WebSecurityConfigurerAdapter() {
			@Override
			protected void configure(final HttpSecurity http) throws Exception {
				http.csrf().disable()

						.authorizeRequests()
						.antMatchers("/h2-console/**").hasRole("ADMIN")//allow h2 console access to admins only
						.antMatchers("/anonymous*").anonymous()
						.antMatchers("/login*").permitAll()
						.antMatchers("/css/**").permitAll()
						.antMatchers("/img/**").permitAll()
						.anyRequest().authenticated()//all other urls can be access by any authenticated role
						.and().formLogin().loginPage("/login")//enable form login instead of basic login
						.loginProcessingUrl("/perform_login")
						.defaultSuccessUrl("/home", true)
						.failureUrl("/login?error=true")
						.and()
						.logout()
						.logoutUrl("/perform_logout")
						.and().csrf().ignoringAntMatchers("/h2-console/**")//don't apply CSRF protection to /h2-console
						.and().headers().frameOptions().sameOrigin();//allow use of frame to same origin urls
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