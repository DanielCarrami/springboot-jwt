package com.grokonez.jwtauthentication.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.grokonez.jwtauthentication.model.Escuela;

@Repository
public interface EscuelaRepository extends JpaRepository<Escuela, Long> {

    @Query(value = "select NEW com.grokonez.jwtauthentication.model.Escuela(c.nombre, c.tipo, c.descripcion, " +
    "c.calle, c.numero, c.colonia, c.cp, c.idestado, c.estado, c.idmunicipio, " + 
    " c.municipio, c.lat, c.lng) " +
    " from Escuela c where c.idestado=?1 and c.idmunicipio=?2 and c.tipo=?3 order by c.idmunicipio")
    List<Escuela> findEscuelaByMunicipio(Long idestado, Long idmunicipio, String tipo);

}