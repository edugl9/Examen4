package com.example.examen4.repository;

import com.example.examen4.entity.Contenido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ContenidoRepository {
    @Autowired
    ContenidoRepositoryDao contenidoRepositoryDao;

    public void creacionContenido(Contenido contenido){
        contenidoRepositoryDao.save(contenido);
    }
}
