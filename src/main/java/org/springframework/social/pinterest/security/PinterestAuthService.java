package org.springframework.social.pinterest.security;

import org.springframework.social.pinterest.api.Pinterest;
import org.springframework.social.pinterest.connect.PinterestConnectionFactory;
import org.springframework.social.security.provider.OAuth2AuthenticationService;

public class PinterestAuthService  extends OAuth2AuthenticationService<Pinterest> {
	
	//TODO: Define service arguments
	//TODO: Implement Auth Service
	public PinterestAuthService() {
		super( new PinterestConnectionFactory( null ) );
	}	
}
