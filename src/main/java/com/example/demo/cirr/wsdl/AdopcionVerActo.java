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
 * <p>Clase Java para adopcionVerActo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="adopcionVerActo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://mx.gob.segob.renapo.cirr.controller/}actoVer"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="entRegElAdoptante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entRegLaAdoptante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaNacElAdoptante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaNacLaAdoptante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaResolutivaJudicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parteResolutivaJudicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sexoElAdoptante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sexoLaAdoptante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adopcionVerActo", propOrder = {
    "entRegElAdoptante",
    "entRegLaAdoptante",
    "fechaNacElAdoptante",
    "fechaNacLaAdoptante",
    "fechaResolutivaJudicial",
    "parteResolutivaJudicial",
    "sexoElAdoptante",
    "sexoLaAdoptante"
})
public class AdopcionVerActo
    extends ActoVer
{

    protected String entRegElAdoptante;
    protected String entRegLaAdoptante;
    protected String fechaNacElAdoptante;
    protected String fechaNacLaAdoptante;
    protected String fechaResolutivaJudicial;
    protected String parteResolutivaJudicial;
    protected String sexoElAdoptante;
    protected String sexoLaAdoptante;

    /**
     * Obtiene el valor de la propiedad entRegElAdoptante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntRegElAdoptante() {
        return entRegElAdoptante;
    }

    /**
     * Define el valor de la propiedad entRegElAdoptante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntRegElAdoptante(String value) {
        this.entRegElAdoptante = value;
    }

    /**
     * Obtiene el valor de la propiedad entRegLaAdoptante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntRegLaAdoptante() {
        return entRegLaAdoptante;
    }

    /**
     * Define el valor de la propiedad entRegLaAdoptante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntRegLaAdoptante(String value) {
        this.entRegLaAdoptante = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacElAdoptante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacElAdoptante() {
        return fechaNacElAdoptante;
    }

    /**
     * Define el valor de la propiedad fechaNacElAdoptante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacElAdoptante(String value) {
        this.fechaNacElAdoptante = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacLaAdoptante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacLaAdoptante() {
        return fechaNacLaAdoptante;
    }

    /**
     * Define el valor de la propiedad fechaNacLaAdoptante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacLaAdoptante(String value) {
        this.fechaNacLaAdoptante = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaResolutivaJudicial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaResolutivaJudicial() {
        return fechaResolutivaJudicial;
    }

    /**
     * Define el valor de la propiedad fechaResolutivaJudicial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaResolutivaJudicial(String value) {
        this.fechaResolutivaJudicial = value;
    }

    /**
     * Obtiene el valor de la propiedad parteResolutivaJudicial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParteResolutivaJudicial() {
        return parteResolutivaJudicial;
    }

    /**
     * Define el valor de la propiedad parteResolutivaJudicial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParteResolutivaJudicial(String value) {
        this.parteResolutivaJudicial = value;
    }

    /**
     * Obtiene el valor de la propiedad sexoElAdoptante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexoElAdoptante() {
        return sexoElAdoptante;
    }

    /**
     * Define el valor de la propiedad sexoElAdoptante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexoElAdoptante(String value) {
        this.sexoElAdoptante = value;
    }

    /**
     * Obtiene el valor de la propiedad sexoLaAdoptante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexoLaAdoptante() {
        return sexoLaAdoptante;
    }

    /**
     * Define el valor de la propiedad sexoLaAdoptante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexoLaAdoptante(String value) {
        this.sexoLaAdoptante = value;
    }

}
