//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.12.21 a las 03:11:09 PM ART 
//


package ar.com.bna.fu.link.hb.delegate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para usuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="usuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apellidoYNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claveFechaModificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claveVencida" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="codigoRespuesta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cuil" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroTarjeta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usuario", propOrder = {
    "apellidoYNombre",
    "claveFechaModificacion",
    "claveVencida",
    "codigoRespuesta",
    "cuil",
    "descripcion",
    "email",
    "numeroTarjeta"
})
public class Usuario {

    protected String apellidoYNombre;
    protected String claveFechaModificacion;
    protected Boolean claveVencida;
    protected int codigoRespuesta;
    protected Long cuil;
    protected String descripcion;
    protected String email;
    protected String numeroTarjeta;

    /**
     * Obtiene el valor de la propiedad apellidoYNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoYNombre() {
        return apellidoYNombre;
    }

    /**
     * Define el valor de la propiedad apellidoYNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoYNombre(String value) {
        this.apellidoYNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad claveFechaModificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveFechaModificacion() {
        return claveFechaModificacion;
    }

    /**
     * Define el valor de la propiedad claveFechaModificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveFechaModificacion(String value) {
        this.claveFechaModificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad claveVencida.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClaveVencida() {
        return claveVencida;
    }

    /**
     * Define el valor de la propiedad claveVencida.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClaveVencida(Boolean value) {
        this.claveVencida = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoRespuesta.
     * 
     */
    public int getCodigoRespuesta() {
        return codigoRespuesta;
    }

    /**
     * Define el valor de la propiedad codigoRespuesta.
     * 
     */
    public void setCodigoRespuesta(int value) {
        this.codigoRespuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad cuil.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCuil() {
        return cuil;
    }

    /**
     * Define el valor de la propiedad cuil.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCuil(Long value) {
        this.cuil = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroTarjeta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    /**
     * Define el valor de la propiedad numeroTarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTarjeta(String value) {
        this.numeroTarjeta = value;
    }

}
