package com.example.Examen4.controller;

import com.example.Examen4.entity.Expediente;
import com.example.Examen4.service.ExpedienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExpedienteController {

    @Autowired
    private ExpedienteService expedienteService;

    @PostMapping("/agregarExpediente")
    public ResponseEntity<Expediente> addExpediente(@RequestBody Expediente expediente){
        System.out.println("Se agrego el expediente de alumno");
        expedienteService.addExpediente(expediente);
        return ResponseEntity.ok(expediente);
    }

    @GetMapping("/expedienteAlumno/{pordni}/{nombrevariable}")
    public Expediente getExpedienteByDni(@PathVariable("nombrevariable") String dni) {
        return expedienteService.getExpediente(dni);
    }
}
