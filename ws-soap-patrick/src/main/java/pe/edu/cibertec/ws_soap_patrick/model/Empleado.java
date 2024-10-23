package pe.edu.cibertec.ws_soap_patrick.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id_empleado;
   private String nombre_empleado;
   private String apellido_empleado;
   private String cargo;
   private Double salario;
   private Date fecha_contratacion;

}
