package top.anyel.saveform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.anyel.saveform.collection.Formulario;
import top.anyel.saveform.service.FormularioService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/formularios")
@Validated
public class FormularioController {

    @Autowired
    private FormularioService formularioService;



    @PostMapping
    public ResponseEntity<Formulario> createFormulario(@Valid @RequestBody Formulario formulario) {
        return ResponseEntity.ok(formularioService.saveFormulario(formulario));
    }

    @GetMapping
    public List<Formulario> getAllFormularios() {
        return formularioService.getAllFormularios();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Formulario> getFormularioById(@PathVariable String id) {
        Formulario formulario = formularioService.getFormularioById(id);
        if (formulario == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(formulario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFormulario(@PathVariable String id) {
        formularioService.deleteFormulario(id);
        return ResponseEntity.noContent().build();
    }
}