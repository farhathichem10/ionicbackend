package com.bezkoder.springjwt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bezkoder.springjwt.models.Congee;

public interface ICongee extends JpaRepository<Congee, Integer> {
	@Query("select s from Congee s where s.user.id=:x")
	public List <Congee> getallCongeebyUser(@Param("x")int id);

}
