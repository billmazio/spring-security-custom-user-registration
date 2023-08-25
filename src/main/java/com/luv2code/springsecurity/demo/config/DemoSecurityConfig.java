package com.luv2code.springsecurity.demo.config;

import com.luv2code.springsecurity.demo.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class DemoSecurityConfig {

    private UserService userService;
	
    private CustomAuthenticationSuccessHandler customAuthenticationSuccessHandler;

	public DemoSecurityConfig(UserService userService, CustomAuthenticationSuccessHandler customAuthenticationSuccessHandler) {
		this.userService = userService;
		this.customAuthenticationSuccessHandler = customAuthenticationSuccessHandler;
	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

		http.authorizeHttpRequests(configurer ->
						configurer
								.requestMatchers("/").authenticated()
								.requestMatchers("/").hasRole("EMPLOYEE")
								.requestMatchers("/leaders/**").hasAnyRole("MANAGER")
								.requestMatchers("/systems").hasRole("ADMIN")
								.requestMatchers("/**").permitAll()
				)
				.formLogin(form ->
						form
								.loginPage("/showMyLoginPage")
								.loginProcessingUrl("/authenticateTheUser")
								.successHandler(customAuthenticationSuccessHandler)
								.permitAll()
				)
				.logout(logout -> logout.permitAll()
				);

		return http.build();
	}
	
	//beans
	//bcrypt bean definition
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	//authenticationProvider bean definition
	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
		auth.setUserDetailsService(userService); //set the custom user details service
		auth.setPasswordEncoder(passwordEncoder()); //set the password encoder - bcrypt
		return auth;
	}
	  
}






