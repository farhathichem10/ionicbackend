package com.bezkoder.springjwt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bezkoder.springjwt.models.Autorisation;
@Repository

public interface IAutorisation extends JpaRepository<Autorisation, Integer> {
	@Query("select s from Autorisation s where s.user.id=:x")
	public List <Autorisation> getallAutorisationbyUser(@Param("x")int id);


}
