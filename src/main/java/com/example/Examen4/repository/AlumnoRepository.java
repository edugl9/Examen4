package com.example.Examen4.repository;

import com.example.Examen4.entity.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AlumnoRepository {
    @Autowired
    AlumnoRepositoryDao alumnoRepositoryDao;


    public void creacionAlumnos(Alumno alumno) {
        alumnoRepositoryDao.save(alumno);
    }
}
