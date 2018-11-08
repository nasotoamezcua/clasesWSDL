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
 * <p>Clase Java para consultaMaDatosDos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaMaDatosDos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dependencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreP1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paternoP1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maternoP1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreP2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paternoP2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maternoP2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "consultaMaDatosDos", propOrder = {
    "dependencia",
    "nombreP1",
    "paternoP1",
    "maternoP1",
    "nombreP2",
    "paternoP2",
    "maternoP2",
    "hash",
    "isImg"
})
public class ConsultaMaDatosDos {

    protected String dependencia;
    protected String nombreP1;
    protected String paternoP1;
    protected String maternoP1;
    protected String nombreP2;
    protected String paternoP2;
    protected String maternoP2;
    protected String hash;
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
     * Obtiene el valor de la propiedad nombreP1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreP1() {
        return nombreP1;
    }

    /**
     * Define el valor de la propiedad nombreP1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreP1(String value) {
        this.nombreP1 = value;
    }

    /**
     * Obtiene el valor de la propiedad paternoP1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaternoP1() {
        return paternoP1;
    }

    /**
     * Define el valor de la propiedad paternoP1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaternoP1(String value) {
        this.paternoP1 = value;
    }

    /**
     * Obtiene el valor de la propiedad maternoP1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaternoP1() {
        return maternoP1;
    }

    /**
     * Define el valor de la propiedad maternoP1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaternoP1(String value) {
        this.maternoP1 = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreP2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreP2() {
        return nombreP2;
    }

    /**
     * Define el valor de la propiedad nombreP2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreP2(String value) {
        this.nombreP2 = value;
    }

    /**
     * Obtiene el valor de la propiedad paternoP2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaternoP2() {
        return paternoP2;
    }

    /**
     * Define el valor de la propiedad paternoP2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaternoP2(String value) {
        this.paternoP2 = value;
    }

    /**
     * Obtiene el valor de la propiedad maternoP2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaternoP2() {
        return maternoP2;
    }

    /**
     * Define el valor de la propiedad maternoP2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaternoP2(String value) {
        this.maternoP2 = value;
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
