package com.grokonez.jwtauthentication.repository;

import com.grokonez.jwtauthentication.model.CategoriaEscuela;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaEscuelaRepository extends JpaRepository<CategoriaEscuela, Long> {
}