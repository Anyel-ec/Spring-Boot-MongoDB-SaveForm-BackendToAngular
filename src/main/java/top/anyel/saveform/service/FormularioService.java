package top.anyel.saveform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.anyel.saveform.model.Formulario;
import top.anyel.saveform.repository.FormularioRepository;

import java.util.List;

@Service
public class FormularioService {

    @Autowired
    private FormularioRepository formularioRepository;

    public Formulario saveFormulario(Formulario formulario) {
        return formularioRepository.save(formulario);
    }

    public List<Formulario> getAllFormularios() {
        return formularioRepository.findAll();
    }

    public Formulario getFormularioById(String id) {
        return formularioRepository.findById(id).orElse(null);
    }

    public void deleteFormulario(String id) {
        formularioRepository.deleteById(id);
    }
}
