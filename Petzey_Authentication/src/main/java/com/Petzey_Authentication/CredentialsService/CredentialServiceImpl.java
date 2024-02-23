package com.Petzey_Authentication.CredentialsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Petzey_Authentication.Credentials.CredentialService;
import com.Petzey_Authentication.Entity.Credentials;
import com.Petzey_Authentication.Exception.CredException;
import com.Petzey_Authentication.Repository.CredentialsRepositiory;

@Service
public class CredentialServiceImpl implements CredentialService{
	
	@Autowired
	public CredentialsRepositiory repository;
	

	@Override
	public Credentials saveCredentials(Credentials cred) throws CredException {
		Credentials creds = new Credentials();
		if(repository.existsById(cred.getUserid())) {
			throw new CredException("user already exists");
		}else {
			creds = repository.save(cred);
		}
		return creds;
	}

}
