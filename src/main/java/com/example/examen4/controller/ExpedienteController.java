package com.example.examen4.controller;

import com.example.examen4.entity.Expediente;
import com.example.examen4.exception.InexistenteException;
import com.example.examen4.service.ExpedienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExpedienteController {
    @Autowired
    private ExpedienteService expedienteService;

    @PostMapping("/agregarexpediente")
    public ResponseEntity<Expediente> addExpediente(@RequestBody Expediente expediente){
        System.out.println("Se agrego expediente");
        expedienteService.AddExpediente(expediente);
        return ResponseEntity.ok(expediente);
    }

    @GetMapping("/expediente/{dni}")
    public List<Expediente> getExpedientePorDniPorQueryNativa(@PathVariable("dni") Integer dni){
        return expedienteService.getExpedienteById(dni);
    }

    @PutMapping("/updateExpediente")
    public ResponseEntity<String> updateExpediente(@RequestBody Expediente expediente) throws InexistenteException {
        if (expedienteService.getExpedienteById(expediente.getDni()).isEmpty()){
            throw new InexistenteException("Expediente no encontrado");
        }
        expedienteService.updateExpediente(expediente);
        return ResponseEntity.ok("Actualizacion correcta");
    }

    @DeleteMapping("/deleteExpediente")
    public ResponseEntity<Expediente> deleteExpediente(@RequestBody Expediente expediente) throws InexistenteException {
        expedienteService.deleteExpediente(expediente);
        return ResponseEntity.ok(expediente);
    }
}
