package com.bezkoder.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.springjwt.models.Categorie;

public interface ICategorie extends JpaRepository<Categorie, Integer> {

}
