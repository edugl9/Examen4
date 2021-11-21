package com.example.examen4.service;

import com.example.examen4.repository.AlumnoRepository;
import com.example.examen4.repository.AlumnoRepositoryDao;
import com.example.examen4.entity.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoService {

    @Autowired
    AlumnoRepositoryDao alumnoRepositoryDao;

    @Autowired
    AlumnoRepository alumnoRepository;

    public void AddAlumno(Alumno alumno) {
        alumnoRepository.creacionAlumnos(alumno);
    }

    public List<Alumno> getLista() {
        return null;
    }

    public Alumno getAlumno(String nombre){
        return null;
    }

    public List<String> getAlumno3(String nombre){
        return alumnoRepositoryDao.findAlumnoByNombrePorJPQueryN(nombre);
    }

    public List<Alumno> getAlumnoByNombreJoinExpediente(Integer dni){
        return alumnoRepositoryDao.findAlumnoByNombreJoinExpediente(dni);
    }

    public List<Alumno> getAlumnoByNombrePorQueryNativa(String nombre){
        return alumnoRepositoryDao.findAlumnoByNombrePorQueryNativa(nombre);
    }

    public List<Alumno> getAlumnoByDni(Integer dni){
        return alumnoRepositoryDao.findAlumnoByDniPorQueryNativa(dni);
    }

    public Alumno updateAlumno(Alumno alumno){
        return alumnoRepositoryDao.save(alumno);
    }

    public void deleteAlumno(Alumno alumno){
        //alumnoRepositoryDao.delete(alumno);
        alumnoRepositoryDao.deleteAlumno(alumno.getDni());
    }

}