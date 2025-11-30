package co.edu.udea.certificacion.citasalud.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DatosPqrs {
    private String nombre;
    private String email;
    private String telefono;
    private String tipo;
    private String descripcion;
}

