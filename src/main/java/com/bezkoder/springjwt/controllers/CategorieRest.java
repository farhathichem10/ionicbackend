package com.bezkoder.springjwt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.springjwt.models.Categorie;
import com.bezkoder.springjwt.models.Produit;
import com.bezkoder.springjwt.repository.ICategorie;
import com.bezkoder.springjwt.repository.IProdRepository;

@CrossOrigin("*")

@RestController
@RequestMapping("/cat")
public class CategorieRest {
	@Autowired ICategorie icat;
	@GetMapping("/getall")
	public List <Categorie> getall(){
		
		return (List <Categorie>) icat.findAll(); 
	}
	@PostMapping("/save")
	public void save (@RequestBody Categorie p) {
		icat.save(p);
		
	}

}
