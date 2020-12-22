package com.example.securingweb;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import java.util.ArrayList;
import org.springframework.stereotype.Component;
import com.example.securingweb.CallLoginLink;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {

		String name = authentication.getName();
		String password = authentication.getCredentials().toString();

		boolean isValid = false;
		try {
			System.out.println(name);
			System.out.println(password);
			CallLoginLink a = new CallLoginLink();
			isValid = a.callLoginLinkMethod(name,password);
		} catch(Exception e){
			System.out.println("me fui por excepcion");
			System.out.println(e);
			isValid = false;
		}

		if (isValid) {

			// use the credentials
			// and authenticate against the third-party system
			return new UsernamePasswordAuthenticationToken(
					name, password, new ArrayList<>());
		} else {
			return null;
		}
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}
}
