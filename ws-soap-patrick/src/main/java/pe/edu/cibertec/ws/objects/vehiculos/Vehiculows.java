//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.10.23 a las 09:37:50 AM PET 
//


package pe.edu.cibertec.ws.objects.vehiculos;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para vehiculows complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="vehiculows"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_vehiculo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="anio_vehiculo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tipo_bateria" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="autonomia" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehiculows", propOrder = {
    "idVehiculo",
    "modelo",
    "anioVehiculo",
    "tipoBateria",
    "precio",
    "autonomia"
})
public class Vehiculows {

    @XmlElement(name = "id_vehiculo")
    protected int idVehiculo;
    @XmlElement(required = true)
    protected String modelo;
    @XmlElement(name = "anio_vehiculo")
    protected int anioVehiculo;
    @XmlElement(name = "tipo_bateria", required = true)
    protected String tipoBateria;
    protected double precio;
    protected int autonomia;

    /**
     * Obtiene el valor de la propiedad idVehiculo.
     * 
     */
    public int getIdVehiculo() {
        return idVehiculo;
    }

    /**
     * Define el valor de la propiedad idVehiculo.
     * 
     */
    public void setIdVehiculo(int value) {
        this.idVehiculo = value;
    }

    /**
     * Obtiene el valor de la propiedad modelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Define el valor de la propiedad modelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelo(String value) {
        this.modelo = value;
    }

    /**
     * Obtiene el valor de la propiedad anioVehiculo.
     * 
     */
    public int getAnioVehiculo() {
        return anioVehiculo;
    }

    /**
     * Define el valor de la propiedad anioVehiculo.
     * 
     */
    public void setAnioVehiculo(int value) {
        this.anioVehiculo = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoBateria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoBateria() {
        return tipoBateria;
    }

    /**
     * Define el valor de la propiedad tipoBateria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoBateria(String value) {
        this.tipoBateria = value;
    }

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     */
    public void setPrecio(double value) {
        this.precio = value;
    }

    /**
     * Obtiene el valor de la propiedad autonomia.
     * 
     */
    public int getAutonomia() {
        return autonomia;
    }

    /**
     * Define el valor de la propiedad autonomia.
     * 
     */
    public void setAutonomia(int value) {
        this.autonomia = value;
    }

}
