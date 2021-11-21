package com.example.examen4.service;

import com.example.examen4.repository.CursoRepository;
import com.example.examen4.repository.CursoRepositoryDao;
import com.example.examen4.entity.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {
    @Autowired
    CursoRepositoryDao cursoRepositoryDao;

    @Autowired
    CursoRepository cursoRepository;

    public void AddCurso(Curso curso) {
        cursoRepository.creacionCurso(curso);
    }

    public List<Curso> getLista() {
        return null;
    }

    public Curso getCurso(String nombre){
        return null;
    }

//    public List<String> getCurso3(String nombre){
//        return cursoRepositoryDao.findCursoByNombrePorJPQL(nombre);
//    }

    public List<Curso> getCursoByNombreJoinContenido(Integer id){
        return cursoRepositoryDao.findCursoByIdJoinContenido(id);
    }

    public List<Curso> getCursoByNombrePorQueryNativa(String nombre){
        return cursoRepositoryDao.findCursoByNombrePorQueryNativa(nombre);
    }

    public List<Curso> getCursoById(Integer id){
        return cursoRepositoryDao.findCursoById(id);
    }

    public Curso updateCurso(Curso curso){
        return cursoRepositoryDao.save(curso);
    }

    public void deleteCurso(Curso curso){
        cursoRepositoryDao.deleteCurso(curso.getId());
    }
}
