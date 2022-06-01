package com.bezkoder.springjwt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.springjwt.models.TypeAttestation;
import com.bezkoder.springjwt.repository.ITypeAttestation;

@CrossOrigin("*")

@RestController
@RequestMapping("/typeat")
public class typeatRest {
	@Autowired ITypeAttestation typeat;
	@GetMapping("/getall")
	public List <TypeAttestation> getall(){
		return (List <TypeAttestation>) typeat.findAll();
	}
	@PostMapping("/save")
	public void save(@RequestBody TypeAttestation c) {
		
		typeat.save(c);
	}

}
