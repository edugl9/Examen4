package com.example.examen4.controller;

import com.example.examen4.entity.Curso;
import com.example.examen4.exception.InexistenteException;
import com.example.examen4.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CursoController {
    @Autowired
    private CursoService cursoService;

    @PostMapping("/agregarcurso")
    public ResponseEntity<Curso> addCurso(@RequestBody Curso curso){
        System.out.println("Se agrego curso");
        cursoService.AddCurso(curso);
        return ResponseEntity.ok(curso);
    }

    @GetMapping("/CursoPorNombreContenido/{id}")
    public List<Curso> getCursoPorNombreJoinContenido(@PathVariable("id") Integer id) {
        return cursoService.getCursoByNombreJoinContenido(id);
    }

    @GetMapping("/curso/{nombre}")
    public List<Curso> getCursoPorNombrePorQueryNativa(@PathVariable("nombre") String nombre){
        return cursoService.getCursoByNombrePorQueryNativa(nombre);
    }

    @PutMapping("/updateCurso")
    public ResponseEntity<String> updateCurso(@RequestBody Curso curso) throws InexistenteException {
        if (cursoService.getCursoById(curso.getId()).isEmpty()){
            throw new InexistenteException("Curso no encontrado");
        }
        cursoService.updateCurso(curso);
        return ResponseEntity.ok("Actualizacion correcta");
    }

    @DeleteMapping("/deleteCurso")
    public ResponseEntity<Curso> deleteCurso(@RequestBody Curso curso) throws InexistenteException {
        cursoService.deleteCurso(curso);
        return ResponseEntity.ok(curso);
    }
}
