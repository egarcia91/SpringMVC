//package com.example.servingwebcontent;
//
////import org.springframework.security.config.annotation.web.configuration;
////import org.springframework.security.config.annotation.*;
////import org.springframework.security.config.annotation.web.configuration.*;
//import org.springframework.context.annotation.Configuration;
//
////import org.springframework.security.config.annotation.authentication.builders.*;
//
//@Configuration
//@EnableWebSecurity
//public class HttpBasicAuthenticationAdapter extends
//WebSecurityConfigurerAdapter {
//
//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder auth)
//		throws Exception {
//		auth
//			.inMemoryAuthentication()
//			.withUser("userId").password("passwd")
//			.authorities("ROLE_USER");
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http
//			.authorizeRequests()
//			.antMatchers("/formulario").permitAll()
//			.anyRequest().authenticated()
//			.and()
//			.httpBasic()
//			.realmName("Prueba seguridad");
//	}
//
//}
