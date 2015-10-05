package org.springframework.social.pinterest.connect;

import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;
import org.springframework.social.oauth2.OAuth2Operations;
import org.springframework.social.pinterest.api.Pinterest;

public class PinterestServiceProvider extends AbstractOAuth2ServiceProvider<Pinterest>{

	//TODO: Implement Service Provider
	public PinterestServiceProvider(OAuth2Operations oauth2Operations) {
		super(oauth2Operations);
	}

	@Override
	public Pinterest getApi(String accessToken) {
		return null;
	}
}
