//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.11.08 a las 01:26:34 PM CST 
//


package com.example.demo.consulta.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actoSalud complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actoSalud"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estadoNac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estadoNacNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="municipioNac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="municipioNacNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombrePrimeraPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreSegundaPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="primerApellidoPrimeraPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="primerApellidoSegundaPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="respuesta" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="segundoApellidoPrimeraPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="segundoApellidoSegundaPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ssa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actoSalud", propOrder = {
    "error",
    "estadoNac",
    "estadoNacNombre",
    "fechaNacimiento",
    "municipioNac",
    "municipioNacNombre",
    "nombre",
    "nombrePrimeraPersona",
    "nombreSegundaPersona",
    "primerApellido",
    "primerApellidoPrimeraPersona",
    "primerApellidoSegundaPersona",
    "respuesta",
    "segundoApellido",
    "segundoApellidoPrimeraPersona",
    "segundoApellidoSegundaPersona",
    "ssa"
})
public class ActoSalud {

    protected String error;
    protected String estadoNac;
    protected String estadoNacNombre;
    protected String fechaNacimiento;
    protected String municipioNac;
    protected String municipioNacNombre;
    protected String nombre;
    protected String nombrePrimeraPersona;
    protected String nombreSegundaPersona;
    protected String primerApellido;
    protected String primerApellidoPrimeraPersona;
    protected String primerApellidoSegundaPersona;
    protected int respuesta;
    protected String segundoApellido;
    protected String segundoApellidoPrimeraPersona;
    protected String segundoApellidoSegundaPersona;
    protected String ssa;

    /**
     * Obtiene el valor de la propiedad error.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Define el valor de la propiedad error.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoNac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoNac() {
        return estadoNac;
    }

    /**
     * Define el valor de la propiedad estadoNac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoNac(String value) {
        this.estadoNac = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoNacNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoNacNombre() {
        return estadoNacNombre;
    }

    /**
     * Define el valor de la propiedad estadoNacNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoNacNombre(String value) {
        this.estadoNacNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Define el valor de la propiedad fechaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacimiento(String value) {
        this.fechaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad municipioNac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipioNac() {
        return municipioNac;
    }

    /**
     * Define el valor de la propiedad municipioNac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipioNac(String value) {
        this.municipioNac = value;
    }

    /**
     * Obtiene el valor de la propiedad municipioNacNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipioNacNombre() {
        return municipioNacNombre;
    }

    /**
     * Define el valor de la propiedad municipioNacNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipioNacNombre(String value) {
        this.municipioNacNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePrimeraPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePrimeraPersona() {
        return nombrePrimeraPersona;
    }

    /**
     * Define el valor de la propiedad nombrePrimeraPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePrimeraPersona(String value) {
        this.nombrePrimeraPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreSegundaPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreSegundaPersona() {
        return nombreSegundaPersona;
    }

    /**
     * Define el valor de la propiedad nombreSegundaPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreSegundaPersona(String value) {
        this.nombreSegundaPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad primerApellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * Define el valor de la propiedad primerApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerApellido(String value) {
        this.primerApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad primerApellidoPrimeraPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerApellidoPrimeraPersona() {
        return primerApellidoPrimeraPersona;
    }

    /**
     * Define el valor de la propiedad primerApellidoPrimeraPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerApellidoPrimeraPersona(String value) {
        this.primerApellidoPrimeraPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad primerApellidoSegundaPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerApellidoSegundaPersona() {
        return primerApellidoSegundaPersona;
    }

    /**
     * Define el valor de la propiedad primerApellidoSegundaPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerApellidoSegundaPersona(String value) {
        this.primerApellidoSegundaPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad respuesta.
     * 
     */
    public int getRespuesta() {
        return respuesta;
    }

    /**
     * Define el valor de la propiedad respuesta.
     * 
     */
    public void setRespuesta(int value) {
        this.respuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoApellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoApellido() {
        return segundoApellido;
    }

    /**
     * Define el valor de la propiedad segundoApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoApellido(String value) {
        this.segundoApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoApellidoPrimeraPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoApellidoPrimeraPersona() {
        return segundoApellidoPrimeraPersona;
    }

    /**
     * Define el valor de la propiedad segundoApellidoPrimeraPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoApellidoPrimeraPersona(String value) {
        this.segundoApellidoPrimeraPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoApellidoSegundaPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoApellidoSegundaPersona() {
        return segundoApellidoSegundaPersona;
    }

    /**
     * Define el valor de la propiedad segundoApellidoSegundaPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoApellidoSegundaPersona(String value) {
        this.segundoApellidoSegundaPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad ssa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsa() {
        return ssa;
    }

    /**
     * Define el valor de la propiedad ssa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsa(String value) {
        this.ssa = value;
    }

}
