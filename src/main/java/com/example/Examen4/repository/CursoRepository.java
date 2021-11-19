package com.example.Examen4.repository;

import com.example.Examen4.entity.Curso;
import org.springframework.beans.factory.annotation.Autowired;

public class CursoRepository {

    @Autowired
    CursoRepositoryDao cursoRepositoryDao;

    public void creacionCursos(Curso curso) {
        cursoRepositoryDao.save(curso);
    }

}
