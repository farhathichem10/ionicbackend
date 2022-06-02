package com.bezkoder.springjwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bezkoder.springjwt.models.ERole;
import com.bezkoder.springjwt.models.Role;
import com.bezkoder.springjwt.repository.RoleRepository;

@SpringBootApplication
public class SpringBootSecurityJwtApplication {
	

	public static void main(String[] args) {
		
		
		
    SpringApplication.run(SpringBootSecurityJwtApplication.class, args);
	}

}
