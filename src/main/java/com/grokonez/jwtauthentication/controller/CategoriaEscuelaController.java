package com.grokonez.jwtauthentication.controller;

import com.grokonez.jwtauthentication.model.CategoriaEscuela;
import com.grokonez.jwtauthentication.repository.CategoriaEscuelaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class CategoriaEscuelaController {

    @Autowired
    private CategoriaEscuelaRepository categoriaEscuelaRepository;

    @GetMapping("/categoria_escuelas")
    public Page<CategoriaEscuela> getCategorias(Pageable pageable) {
        return categoriaEscuelaRepository.findAll(pageable);
    }
  
    
}