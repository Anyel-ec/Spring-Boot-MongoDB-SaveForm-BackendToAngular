package top.anyel.saveform;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SaveFormAngularMongoDbApplication {

    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.configure().load(); // Carga el archivo .env
        dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue())); // Establece las variables de entorno

        SpringApplication.run(SaveFormAngularMongoDbApplication.class, args); // Inicia la aplicación Spring Boot
    }


}
