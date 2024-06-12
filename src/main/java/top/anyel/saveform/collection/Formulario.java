package top.anyel.saveform.collection;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@Document(collection = "formularios")
public class Formulario {

    @Id
    private String id;

    @NotBlank(message = "El nombre es obligatorio")
    private String name;

    @NotBlank(message = "La fecha es obligatoria")
    private Date date;

    @Email(message = "Email inválido")
    @NotBlank(message = "El email es obligatorio")
    private String email;

    @NotBlank(message = "El texto es obligatorio")
    @Size(max = 200, message = "Máximo 200 caracteres")
    private String text;

    @NotBlank(message = "La categoría es obligatoria")
    private String category;

    @NotBlank(message = "El género es obligatorio")
    private String gender;

}