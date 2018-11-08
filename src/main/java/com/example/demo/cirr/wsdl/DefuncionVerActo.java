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
 * <p>Clase Java para defuncionVerActo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="defuncionVerActo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://mx.gob.segob.renapo.cirr.controller/}actoVer"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="causasDefuncion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destinoCadaver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estadoCivil" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="estadoCivilTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaDefuncion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaDefuncionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaDefuncionTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaNacimientoDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaRegistroDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lugarDefuncion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="minutos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreConyuge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "defuncionVerActo", propOrder = {
    "causasDefuncion",
    "destinoCadaver",
    "estadoCivil",
    "estadoCivilTxt",
    "fechaDefuncion",
    "fechaDefuncionDate",
    "fechaDefuncionTxt",
    "fechaNacimientoDate",
    "fechaRegistroDate",
    "hora",
    "lugarDefuncion",
    "minutos",
    "nombreConyuge"
})
public class DefuncionVerActo
    extends ActoVer
{

    protected String causasDefuncion;
    protected String destinoCadaver;
    protected int estadoCivil;
    protected String estadoCivilTxt;
    protected String fechaDefuncion;
    protected String fechaDefuncionDate;
    protected String fechaDefuncionTxt;
    protected String fechaNacimientoDate;
    protected String fechaRegistroDate;
    protected String hora;
    protected String lugarDefuncion;
    protected String minutos;
    protected String nombreConyuge;

    /**
     * Obtiene el valor de la propiedad causasDefuncion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCausasDefuncion() {
        return causasDefuncion;
    }

    /**
     * Define el valor de la propiedad causasDefuncion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCausasDefuncion(String value) {
        this.causasDefuncion = value;
    }

    /**
     * Obtiene el valor de la propiedad destinoCadaver.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinoCadaver() {
        return destinoCadaver;
    }

    /**
     * Define el valor de la propiedad destinoCadaver.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinoCadaver(String value) {
        this.destinoCadaver = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoCivil.
     * 
     */
    public int getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * Define el valor de la propiedad estadoCivil.
     * 
     */
    public void setEstadoCivil(int value) {
        this.estadoCivil = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoCivilTxt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoCivilTxt() {
        return estadoCivilTxt;
    }

    /**
     * Define el valor de la propiedad estadoCivilTxt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoCivilTxt(String value) {
        this.estadoCivilTxt = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDefuncion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDefuncion() {
        return fechaDefuncion;
    }

    /**
     * Define el valor de la propiedad fechaDefuncion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDefuncion(String value) {
        this.fechaDefuncion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDefuncionDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDefuncionDate() {
        return fechaDefuncionDate;
    }

    /**
     * Define el valor de la propiedad fechaDefuncionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDefuncionDate(String value) {
        this.fechaDefuncionDate = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDefuncionTxt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDefuncionTxt() {
        return fechaDefuncionTxt;
    }

    /**
     * Define el valor de la propiedad fechaDefuncionTxt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDefuncionTxt(String value) {
        this.fechaDefuncionTxt = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacimientoDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacimientoDate() {
        return fechaNacimientoDate;
    }

    /**
     * Define el valor de la propiedad fechaNacimientoDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacimientoDate(String value) {
        this.fechaNacimientoDate = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRegistroDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaRegistroDate() {
        return fechaRegistroDate;
    }

    /**
     * Define el valor de la propiedad fechaRegistroDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaRegistroDate(String value) {
        this.fechaRegistroDate = value;
    }

    /**
     * Obtiene el valor de la propiedad hora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHora() {
        return hora;
    }

    /**
     * Define el valor de la propiedad hora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHora(String value) {
        this.hora = value;
    }

    /**
     * Obtiene el valor de la propiedad lugarDefuncion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugarDefuncion() {
        return lugarDefuncion;
    }

    /**
     * Define el valor de la propiedad lugarDefuncion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugarDefuncion(String value) {
        this.lugarDefuncion = value;
    }

    /**
     * Obtiene el valor de la propiedad minutos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinutos() {
        return minutos;
    }

    /**
     * Define el valor de la propiedad minutos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinutos(String value) {
        this.minutos = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreConyuge.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreConyuge() {
        return nombreConyuge;
    }

    /**
     * Define el valor de la propiedad nombreConyuge.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreConyuge(String value) {
        this.nombreConyuge = value;
    }

}
