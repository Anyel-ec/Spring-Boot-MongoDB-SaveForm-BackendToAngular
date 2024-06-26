package top.anyel.saveform.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import top.anyel.saveform.collection.Formulario;

@Repository
public interface FormularioRepository extends MongoRepository<Formulario, String> {
}