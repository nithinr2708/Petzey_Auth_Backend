package com.Petzey_Authentication.Entity;


import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Credentials {
	
	@Id
	private long userid;
	private String role;
	private String name;
	private String emailid;

}
