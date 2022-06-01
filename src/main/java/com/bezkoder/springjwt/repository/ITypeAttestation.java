package com.bezkoder.springjwt.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bezkoder.springjwt.models.TypeAttestation;
@Repository
public interface ITypeAttestation extends JpaRepository<TypeAttestation, Integer> {
	

}
