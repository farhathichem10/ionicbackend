package com.bezkoder.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bezkoder.springjwt.models.Mission;
@Repository
public interface IMission extends JpaRepository<Mission, Integer> {

}
