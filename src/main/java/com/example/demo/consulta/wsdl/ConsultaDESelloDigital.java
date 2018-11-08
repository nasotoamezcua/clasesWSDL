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
 * <p>Clase Java para consultaDESelloDigital complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaDESelloDigital"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dependencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cadena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaDESelloDigital", propOrder = {
    "dependencia",
    "cadena",
    "hash"
})
public class ConsultaDESelloDigital {

    protected String dependencia;
    protected String cadena;
    protected String hash;

    /**
     * Obtiene el valor de la propiedad dependencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDependencia() {
        return dependencia;
    }

    /**
     * Define el valor de la propiedad dependencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependencia(String value) {
        this.dependencia = value;
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
     * Obtiene el valor de la propiedad hash.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHash() {
        return hash;
    }

    /**
     * Define el valor de la propiedad hash.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHash(String value) {
        this.hash = value;
    }

}
