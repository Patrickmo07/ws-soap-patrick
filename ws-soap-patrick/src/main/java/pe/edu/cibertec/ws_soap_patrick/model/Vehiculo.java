package pe.edu.cibertec.ws_soap_patrick.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="vehiculo")
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_vehiculo;
    private String modelo;
    private Integer anio_vehiculo;
    private String tipo_batería;
    private Double precio;
    private Integer autonomia;

}
