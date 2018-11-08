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
 * <p>Clase Java para datosFolioRespuesta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="datosFolioRespuesta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://mx.gob.segob.renapo.cirr.controller/}abstractRespuesta"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actaBisCadena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="actaCadena" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="anioCadena" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="anioExpedicion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="entCadena" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="entFolio" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="fechaExpedicion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaUso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="folioUsado" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="munCadena" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="munFolio" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="noFolio" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ofiCadena" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ofiFolio" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="tipoActo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosFolioRespuesta", propOrder = {
    "actaBisCadena",
    "actaCadena",
    "anioCadena",
    "anioExpedicion",
    "entCadena",
    "entFolio",
    "fechaExpedicion",
    "fechaUso",
    "folioUsado",
    "munCadena",
    "munFolio",
    "noFolio",
    "ofiCadena",
    "ofiFolio",
    "tipoActo",
    "usuario"
})
public class DatosFolioRespuesta
    extends AbstractRespuesta
{

    protected String actaBisCadena;
    protected Long actaCadena;
    protected Long anioCadena;
    protected Long anioExpedicion;
    protected Long entCadena;
    protected Long entFolio;
    protected String fechaExpedicion;
    protected String fechaUso;
    protected Long folioUsado;
    protected Long munCadena;
    protected Long munFolio;
    protected Long noFolio;
    protected Long ofiCadena;
    protected Long ofiFolio;
    protected Long tipoActo;
    protected String usuario;

    /**
     * Obtiene el valor de la propiedad actaBisCadena.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActaBisCadena() {
        return actaBisCadena;
    }

    /**
     * Define el valor de la propiedad actaBisCadena.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActaBisCadena(String value) {
        this.actaBisCadena = value;
    }

    /**
     * Obtiene el valor de la propiedad actaCadena.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActaCadena() {
        return actaCadena;
    }

    /**
     * Define el valor de la propiedad actaCadena.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActaCadena(Long value) {
        this.actaCadena = value;
    }

    /**
     * Obtiene el valor de la propiedad anioCadena.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAnioCadena() {
        return anioCadena;
    }

    /**
     * Define el valor de la propiedad anioCadena.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAnioCadena(Long value) {
        this.anioCadena = value;
    }

    /**
     * Obtiene el valor de la propiedad anioExpedicion.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAnioExpedicion() {
        return anioExpedicion;
    }

    /**
     * Define el valor de la propiedad anioExpedicion.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAnioExpedicion(Long value) {
        this.anioExpedicion = value;
    }

    /**
     * Obtiene el valor de la propiedad entCadena.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEntCadena() {
        return entCadena;
    }

    /**
     * Define el valor de la propiedad entCadena.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEntCadena(Long value) {
        this.entCadena = value;
    }

    /**
     * Obtiene el valor de la propiedad entFolio.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEntFolio() {
        return entFolio;
    }

    /**
     * Define el valor de la propiedad entFolio.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEntFolio(Long value) {
        this.entFolio = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaExpedicion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaExpedicion() {
        return fechaExpedicion;
    }

    /**
     * Define el valor de la propiedad fechaExpedicion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaExpedicion(String value) {
        this.fechaExpedicion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaUso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaUso() {
        return fechaUso;
    }

    /**
     * Define el valor de la propiedad fechaUso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaUso(String value) {
        this.fechaUso = value;
    }

    /**
     * Obtiene el valor de la propiedad folioUsado.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFolioUsado() {
        return folioUsado;
    }

    /**
     * Define el valor de la propiedad folioUsado.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFolioUsado(Long value) {
        this.folioUsado = value;
    }

    /**
     * Obtiene el valor de la propiedad munCadena.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMunCadena() {
        return munCadena;
    }

    /**
     * Define el valor de la propiedad munCadena.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMunCadena(Long value) {
        this.munCadena = value;
    }

    /**
     * Obtiene el valor de la propiedad munFolio.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMunFolio() {
        return munFolio;
    }

    /**
     * Define el valor de la propiedad munFolio.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMunFolio(Long value) {
        this.munFolio = value;
    }

    /**
     * Obtiene el valor de la propiedad noFolio.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNoFolio() {
        return noFolio;
    }

    /**
     * Define el valor de la propiedad noFolio.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNoFolio(Long value) {
        this.noFolio = value;
    }

    /**
     * Obtiene el valor de la propiedad ofiCadena.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOfiCadena() {
        return ofiCadena;
    }

    /**
     * Define el valor de la propiedad ofiCadena.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOfiCadena(Long value) {
        this.ofiCadena = value;
    }

    /**
     * Obtiene el valor de la propiedad ofiFolio.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOfiFolio() {
        return ofiFolio;
    }

    /**
     * Define el valor de la propiedad ofiFolio.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOfiFolio(Long value) {
        this.ofiFolio = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoActo.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTipoActo() {
        return tipoActo;
    }

    /**
     * Define el valor de la propiedad tipoActo.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTipoActo(Long value) {
        this.tipoActo = value;
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
