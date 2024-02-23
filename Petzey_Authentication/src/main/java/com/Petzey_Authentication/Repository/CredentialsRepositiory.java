package com.Petzey_Authentication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Petzey_Authentication.Entity.Credentials;

public interface CredentialsRepositiory extends JpaRepository<Credentials, Long>{

}
