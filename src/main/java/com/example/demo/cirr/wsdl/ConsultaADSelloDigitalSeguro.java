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
 * <p>Clase Java para consultaADSelloDigitalSeguro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaADSelloDigitalSeguro"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dependencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sello" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isImg" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaADSelloDigitalSeguro", propOrder = {
    "dependencia",
    "sello",
    "firma",
    "isImg"
})
public class ConsultaADSelloDigitalSeguro {

    protected String dependencia;
    protected String sello;
    protected String firma;
    protected int isImg;

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
     * Obtiene el valor de la propiedad sello.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSello() {
        return sello;
    }

    /**
     * Define el valor de la propiedad sello.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSello(String value) {
        this.sello = value;
    }

    /**
     * Obtiene el valor de la propiedad firma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirma() {
        return firma;
    }

    /**
     * Define el valor de la propiedad firma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirma(String value) {
        this.firma = value;
    }

    /**
     * Obtiene el valor de la propiedad isImg.
     * 
     */
    public int getIsImg() {
        return isImg;
    }

    /**
     * Define el valor de la propiedad isImg.
     * 
     */
    public void setIsImg(int value) {
        this.isImg = value;
    }

}
