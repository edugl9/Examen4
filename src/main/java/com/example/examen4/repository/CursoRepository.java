package com.example.examen4.repository;

import com.example.examen4.entity.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CursoRepository {
    @Autowired
    CursoRepositoryDao cursoRepositoryDao;

    public void creacionCurso(Curso curso){
        cursoRepositoryDao.save(curso);
    }
}
