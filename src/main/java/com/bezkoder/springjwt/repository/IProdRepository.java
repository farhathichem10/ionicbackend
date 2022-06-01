package com.bezkoder.springjwt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bezkoder.springjwt.models.Produit;
@Repository

public interface IProdRepository extends JpaRepository<Produit, Integer> {
	@Query("select p from Produit p where p.id=:x")
	public List<Produit> getprodbyid(@Param("x")int x);
	


}
