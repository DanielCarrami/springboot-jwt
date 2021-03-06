package com.grokonez.jwtauthentication.controller;
import java.util.List;

import com.grokonez.jwtauthentication.model.Escuela;
import com.grokonez.jwtauthentication.repository.EscuelaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class EscuelaController {

    @Autowired
    private EscuelaRepository escuelaRepository;

    @GetMapping("/escuelas")
    public List<Escuela> getEscuela(
            @RequestParam(value="idestado") Long idestado,
            @RequestParam(value="idmunicipio") Long idmunicipio,
            @RequestParam(value="tipo") String tipo
            )
    {
        return escuelaRepository.findEscuelaByMunicipio(idestado, idmunicipio, tipo);
    }
  
    
}