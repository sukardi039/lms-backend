package com.hcteo.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcteo.lms.model.Param;

@Repository
public interface ParamRepository extends JpaRepository<Param, String> {

}
