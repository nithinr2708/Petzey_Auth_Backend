package com.Petzey_Authentication.Credentials;

import com.Petzey_Authentication.Entity.Credentials;
import com.Petzey_Authentication.Exception.CredException;

public interface CredentialService {
	
	public Credentials saveCredentials(Credentials cred) throws CredException;

}
