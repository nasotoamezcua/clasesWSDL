//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.11.08 a las 11:26:01 AM CST 
//


package com.example.demo.cirr.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultarFolios complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultarFolios"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="entidad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="municipio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="oficialia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="cadena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="masivo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="noFolios" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarFolios", propOrder = {
    "entidad",
    "municipio",
    "oficialia",
    "cadena",
    "masivo",
    "noFolios",
    "usuario"
})
public class ConsultarFolios {

    protected Integer entidad;
    protected Integer municipio;
    protected Integer oficialia;
    protected String cadena;
    protected Integer masivo;
    protected Integer noFolios;
    protected String usuario;

    /**
     * Obtiene el valor de la propiedad entidad.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEntidad() {
        return entidad;
    }

    /**
     * Define el valor de la propiedad entidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEntidad(Integer value) {
        this.entidad = value;
    }

    /**
     * Obtiene el valor de la propiedad municipio.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMunicipio() {
        return municipio;
    }

    /**
     * Define el valor de la propiedad municipio.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMunicipio(Integer value) {
        this.municipio = value;
    }

    /**
     * Obtiene el valor de la propiedad oficialia.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOficialia() {
        return oficialia;
    }

    /**
     * Define el valor de la propiedad oficialia.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOficialia(Integer value) {
        this.oficialia = value;
    }

    /**
     * Obtiene el valor de la propiedad cadena.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCadena() {
        return cadena;
    }

    /**
     * Define el valor de la propiedad cadena.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCadena(String value) {
        this.cadena = value;
    }

    /**
     * Obtiene el valor de la propiedad masivo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMasivo() {
        return masivo;
    }

    /**
     * Define el valor de la propiedad masivo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMasivo(Integer value) {
        this.masivo = value;
    }

    /**
     * Obtiene el valor de la propiedad noFolios.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoFolios() {
        return noFolios;
    }

    /**
     * Define el valor de la propiedad noFolios.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoFolios(Integer value) {
        this.noFolios = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

}
