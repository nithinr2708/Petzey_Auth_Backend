package com.Petzey_Authentication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Petzey_Authentication.Credentials.CredentialService;
import com.Petzey_Authentication.Entity.Credentials;
import com.Petzey_Authentication.Exception.CredException;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/Credentials")
public class PetzeyController {
	
	@Autowired
	private CredentialService service;
	
	

	
	
	@PostMapping("/Savecredentials")
	@Operation(summary = "saving creds")
	public ResponseEntity<?> post(@RequestBody Credentials creds) throws CredException {
		ResponseEntity<?> response = null;
		try {
			response = new ResponseEntity<>(service.saveCredentials(creds), HttpStatus.OK);
			} catch (CredException e) {
			response = new ResponseEntity<>(e.getMessage(), HttpStatus.OK);
					}
		return response;
	}
}
