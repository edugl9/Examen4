package com.example.Examen4.controller;

import com.example.Examen4.entity.Curso;
import com.example.Examen4.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class CursoController {
    @Autowired
    private CursoService cursoService;

    @PostMapping("/agregarCurso")
    public ResponseEntity<Curso> addCurso(@RequestBody Curso curso){
        System.out.println("Se agrego el curso");
        cursoService.addCurso(curso);
        return ResponseEntity.ok(curso);
    }

    @GetMapping("/alumno/{pornombre}/{nombrevariable}")
    public Curso getCursoPorNombre(@PathVariable("nombrevariable") String nombre) {
        return cursoService.getCurso(nombre);
    }
}
