package com.asselmeyer.catalina.realm;

import java.security.Principal;

import org.apache.catalina.realm.RealmBase;

/**
 * A custom realm for Tomcat 6. It adds functionality for salted and iterated password hashes.  
 */
public class CustomRealm extends RealmBase {

	private static final String NAME = "CustomRealm";
	
	@Override
	protected String getName() {
		return NAME;
	}

	@Override
	protected String getPassword(String arg0) {
		// TODO Implement
		return "";
	}

	@Override
	protected Principal getPrincipal(String arg0) {
		// TODO Implement
		return null;
	}

}
