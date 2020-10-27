package com.grokonez.jwtauthentication.repository;

import com.grokonez.jwtauthentication.model.CategoriaComercio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaComercioRepository extends JpaRepository<CategoriaComercio, Long> {
}