package org.springframework.social.pinterest.api.impl;

import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.pinterest.api.Pinterest;

public class PinterestTemplate  extends AbstractOAuth2ApiBinding implements Pinterest{

	public PinterestTemplate() {
		//TODO: Set access token 
		super( null );
	}
	
}
