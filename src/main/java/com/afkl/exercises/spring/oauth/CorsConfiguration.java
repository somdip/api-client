package com.afkl.exercises.spring.oauth;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
@Order(-1)
public class CorsConfiguration extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.requestMatchers().antMatchers(HttpMethod.OPTIONS, "/oauth/token")
				.antMatchers(HttpMethod.OPTIONS, "/airports/**").antMatchers(HttpMethod.OPTIONS, "/fares/**")
				.regexMatchers(HttpMethod.OPTIONS, "\\A/airports\\?term.*\\Z").and().csrf().disable()
				.authorizeRequests().anyRequest().permitAll().and().sessionManagement()
				.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}
}
