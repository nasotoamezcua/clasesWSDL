//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.11.08 a las 11:26:01 AM CST 
//


package com.example.demo.cirr.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para abstractRespuesta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="abstractRespuesta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Folio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Dependencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="actos" type="{http://mx.gob.segob.renapo.cirr.controller/}actoVer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MsgError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parametrosEnviados" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractRespuesta", propOrder = {
    "folio",
    "dependencia",
    "actos",
    "error",
    "msgError",
    "parametrosEnviados"
})
@XmlSeeAlso({
    AdopcionRespuesta.class,
    DefuncionRespuesta.class,
    DivorcioRespuesta.class,
    MatrimonioRespuesta.class,
    NacimientoRespuesta.class,
    ReconocimientoRespuesta.class,
    CurpRESTRespuesta.class,
    DatosFolioRespuesta.class,
    FolioRespuesta.class,
    DocumentoRespuesta.class
})
public abstract class AbstractRespuesta {

    @XmlElement(name = "Folio")
    protected String folio;
    @XmlElement(name = "Dependencia")
    protected String dependencia;
    @XmlElement(nillable = true)
    protected List<ActoVer> actos;
    @XmlElement(name = "Error")
    protected String error;
    @XmlElement(name = "MsgError")
    protected String msgError;
    @XmlElement(nillable = true)
    protected List<Object> parametrosEnviados;

    /**
     * Obtiene el valor de la propiedad folio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolio() {
        return folio;
    }

    /**
     * Define el valor de la propiedad folio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolio(String value) {
        this.folio = value;
    }

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
     * Gets the value of the actos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActoVer }
     * 
     * 
     */
    public List<ActoVer> getActos() {
        if (actos == null) {
            actos = new ArrayList<ActoVer>();
        }
        return this.actos;
    }

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
     * Obtiene el valor de la propiedad msgError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgError() {
        return msgError;
    }

    /**
     * Define el valor de la propiedad msgError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgError(String value) {
        this.msgError = value;
    }

    /**
     * Gets the value of the parametrosEnviados property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parametrosEnviados property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParametrosEnviados().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getParametrosEnviados() {
        if (parametrosEnviados == null) {
            parametrosEnviados = new ArrayList<Object>();
        }
        return this.parametrosEnviados;
    }

}
