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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para nacimientoRespuesta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="nacimientoRespuesta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://mx.gob.segob.renapo.cirr.controller/}abstractRespuesta"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nacimientos" type="{http://mx.gob.segob.renapo.cirr.controller/}nacimientoRepActo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Warning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MsgWarning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nacimientoRespuesta", propOrder = {
    "nacimientos",
    "warning",
    "msgWarning"
})
public class NacimientoRespuesta
    extends AbstractRespuesta
{

    @XmlElement(nillable = true)
    protected List<NacimientoRepActo> nacimientos;
    @XmlElement(name = "Warning")
    protected String warning;
    @XmlElement(name = "MsgWarning")
    protected String msgWarning;

    /**
     * Gets the value of the nacimientos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nacimientos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNacimientos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NacimientoRepActo }
     * 
     * 
     */
    public List<NacimientoRepActo> getNacimientos() {
        if (nacimientos == null) {
            nacimientos = new ArrayList<NacimientoRepActo>();
        }
        return this.nacimientos;
    }

    /**
     * Obtiene el valor de la propiedad warning.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarning() {
        return warning;
    }

    /**
     * Define el valor de la propiedad warning.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarning(String value) {
        this.warning = value;
    }

    /**
     * Obtiene el valor de la propiedad msgWarning.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgWarning() {
        return msgWarning;
    }

    /**
     * Define el valor de la propiedad msgWarning.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgWarning(String value) {
        this.msgWarning = value;
    }

}
