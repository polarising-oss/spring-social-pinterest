package org.springframework.social.pinterest.connect;

import org.springframework.social.connect.support.OAuth2ConnectionFactory;
import org.springframework.social.pinterest.api.Pinterest;

public class PinterestConnectionFactory extends OAuth2ConnectionFactory<Pinterest>  {

	//TODO: Define connection factory arguments
	//TODO: Implement Connection Factory
	public PinterestConnectionFactory( String providerId ) {
		super( providerId, new PinterestServiceProvider( null ), new PinterestAdapter() );
	}
}
