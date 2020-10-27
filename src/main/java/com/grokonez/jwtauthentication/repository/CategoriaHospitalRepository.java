package com.grokonez.jwtauthentication.repository;

import com.grokonez.jwtauthentication.model.CategoriaHospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaHospitalRepository extends JpaRepository<CategoriaHospital, Long> {
}