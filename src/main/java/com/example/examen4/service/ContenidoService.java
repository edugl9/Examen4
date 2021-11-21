package com.example.examen4.service;

import com.example.examen4.repository.ContenidoRepository;
import com.example.examen4.repository.ContenidoRepositoryDao;
import com.example.examen4.entity.Contenido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContenidoService {
    @Autowired
    ContenidoRepositoryDao contenidoRepositoryDao;

    @Autowired
    ContenidoRepository contenidoRepository;

    public void AddContenido(Contenido contenido) {
        contenidoRepository.creacionContenido(contenido);
    }

    public List<Contenido> getLista() {
        return null;
    }

    public Contenido getContenido(String nombre){
        return null;
    }

    public List<Contenido> getContenidoByNombrePorQueryNativa(String nombre){
        return contenidoRepositoryDao.findContenidoByNombrePorQueryNativa(nombre);
    }

    public List<Contenido> getContenidoById(Integer id){
        return contenidoRepositoryDao.findContenidoById(id);
    }

    public Contenido updateContenido(Contenido contenido){
        return contenidoRepositoryDao.save(contenido);
    }

    public void deleteContenido(Contenido contenido){
        contenidoRepositoryDao.deleteContenido(contenido.getId());
    }
}
