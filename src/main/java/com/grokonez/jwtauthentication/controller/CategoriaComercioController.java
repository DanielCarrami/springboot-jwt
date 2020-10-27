package com.grokonez.jwtauthentication.controller;

import com.grokonez.jwtauthentication.model.CategoriaComercio;
import com.grokonez.jwtauthentication.repository.CategoriaComercioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class CategoriaComercioController {

    @Autowired
    private CategoriaComercioRepository categoriaComercioRepository;

    @GetMapping("/categoria_comercios")
    public Page<CategoriaComercio> getCategorias(Pageable pageable) {
        return categoriaComercioRepository.findAll(pageable);
    }
  
    
}