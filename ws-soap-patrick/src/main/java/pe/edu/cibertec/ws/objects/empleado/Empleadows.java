//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.10.23 a las 09:37:22 AM PET 
//


package pe.edu.cibertec.ws.objects.empleado;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para empleadows complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="empleadows"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_empleado" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombre_empleado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="apellido_empleado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cargo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="salario" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="fecha_contratacion" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "empleadows", propOrder = {
    "idEmpleado",
    "nombreEmpleado",
    "apellidoEmpleado",
    "cargo",
    "salario",
    "fechaContratacion"
})
public class Empleadows {

    @XmlElement(name = "id_empleado")
    protected int idEmpleado;
    @XmlElement(name = "nombre_empleado", required = true)
    protected String nombreEmpleado;
    @XmlElement(name = "apellido_empleado", required = true)
    protected String apellidoEmpleado;
    @XmlElement(required = true)
    protected String cargo;
    protected double salario;
    @XmlElement(name = "fecha_contratacion", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaContratacion;

    /**
     * Obtiene el valor de la propiedad idEmpleado.
     * 
     */
    public int getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * Define el valor de la propiedad idEmpleado.
     * 
     */
    public void setIdEmpleado(int value) {
        this.idEmpleado = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreEmpleado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    /**
     * Define el valor de la propiedad nombreEmpleado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEmpleado(String value) {
        this.nombreEmpleado = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidoEmpleado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    /**
     * Define el valor de la propiedad apellidoEmpleado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoEmpleado(String value) {
        this.apellidoEmpleado = value;
    }

    /**
     * Obtiene el valor de la propiedad cargo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Define el valor de la propiedad cargo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargo(String value) {
        this.cargo = value;
    }

    /**
     * Obtiene el valor de la propiedad salario.
     * 
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Define el valor de la propiedad salario.
     * 
     */
    public void setSalario(double value) {
        this.salario = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaContratacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaContratacion() {
        return fechaContratacion;
    }

    /**
     * Define el valor de la propiedad fechaContratacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaContratacion(XMLGregorianCalendar value) {
        this.fechaContratacion = value;
    }

}
