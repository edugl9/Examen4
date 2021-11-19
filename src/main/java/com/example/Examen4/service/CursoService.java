package com.example.Examen4.service;

import com.example.Examen4.entity.Curso;
import com.example.Examen4.repository.CursoRepository;
import com.example.Examen4.repository.CursoRepositoryDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CursoService {

    @Autowired
    CursoRepositoryDao cursoRepositoryDao;

    @Autowired
    CursoRepository cursoRepository;

    public void addCurso(Curso curso) {
        cursoRepository.creacionCursos(curso);
    }

    public List<Curso> getLista(){
        return null;
    }

    public Curso getCurso(String nombre) {
        return null;
    }
}
