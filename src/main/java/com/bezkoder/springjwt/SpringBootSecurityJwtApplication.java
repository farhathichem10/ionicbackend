package com.bezkoder.springjwt;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import com.bezkoder.springjwt.models.ERole;
import com.bezkoder.springjwt.models.Role;
import com.bezkoder.springjwt.repository.RoleRepository;



@SpringBootApplication
public class SpringBootSecurityJwtApplication extends  SpringBootServletInitializer {
	

	public static void main(String[] args) {
		
		
		
    SpringApplication.run(SpringBootSecurityJwtApplication.class, args);
	}
	 @Bean
	    public CommandLineRunner demoData(RoleRepository repo) {
	        return args -> {
	            repo.save(new Role(1, ERole.ROLE_ADMIN ));
	        };
	    }

}
