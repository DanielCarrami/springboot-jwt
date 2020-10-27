package com.grokonez.jwtauthentication.controller;

import com.grokonez.jwtauthentication.model.CategoriaHospital;
import com.grokonez.jwtauthentication.repository.CategoriaHospitalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class CategoriaHospitalController {

    @Autowired
    private CategoriaHospitalRepository categoriaHospitalRepository;

    @GetMapping("/categoria_hospitales")
    public Page<CategoriaHospital> getCategorias(Pageable pageable) {
        return categoriaHospitalRepository.findAll(pageable);
    }
  
    
}