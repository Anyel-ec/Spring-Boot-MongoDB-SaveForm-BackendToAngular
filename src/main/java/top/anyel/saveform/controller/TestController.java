package top.anyel.saveform.controller;


import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @Value("${spring.data.mongodb.uri}")
    private String mongoDbUri;

    @GetMapping("/test-mongo-connection")
    public String testMongoConnection() {
        try {
            // Conectarse a MongoDB utilizando la URI especificada en las propiedades
            MongoClient mongoClient = MongoClients.create(mongoDbUri);

            // Verificar la conexión
            mongoClient.listDatabaseNames().first();

            // Si no hay excepción, la conexión fue exitosa
            return "Conexión exitosa a MongoDB!";
        } catch (Exception e) {
            // Si hay una excepción, la conexión falló
            return "Error al conectar a MongoDB: " + e.getMessage();
        }
    }
}