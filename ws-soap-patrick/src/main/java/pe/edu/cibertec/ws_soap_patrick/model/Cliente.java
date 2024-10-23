package pe.edu.cibertec.ws_soap_patrick.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="cliente")
public class Cliente {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
            private Integer id_cliente;
           private String  nombre_cliente ;
   private String apellido_cliente;
   private String correo_electronico ;
   private String direccion ;
   private String  telefono ;


}
