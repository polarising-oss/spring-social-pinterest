package org.springframework.social.pinterest.connect;

import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.pinterest.api.Pinterest;

public class PinterestAdapter implements ApiAdapter<Pinterest> {

	public PinterestAdapter() {
		
	}
	
	//TODO: Implement ApiAdapter
	@Override
	public boolean test(Pinterest api) {
		return false;
	}

	@Override
	public void setConnectionValues(Pinterest api, ConnectionValues values) {
		
	}

	@Override
	public UserProfile fetchUserProfile(Pinterest api) {
		return null;
	}

	@Override
	public void updateStatus(Pinterest api, String message) {
		
	}
}