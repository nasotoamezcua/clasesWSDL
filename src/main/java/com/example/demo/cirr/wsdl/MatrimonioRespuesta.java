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
 * <p>Clase Java para matrimonioRespuesta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="matrimonioRespuesta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://mx.gob.segob.renapo.cirr.controller/}abstractRespuesta"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="matrimonios" type="{http://mx.gob.segob.renapo.cirr.controller/}matrimonioVerActo" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "matrimonioRespuesta", propOrder = {
    "matrimonios",
    "warning",
    "msgWarning"
})
public class MatrimonioRespuesta
    extends AbstractRespuesta
{

    @XmlElement(nillable = true)
    protected List<MatrimonioVerActo> matrimonios;
    @XmlElement(name = "Warning")
    protected String warning;
    @XmlElement(name = "MsgWarning")
    protected String msgWarning;

    /**
     * Gets the value of the matrimonios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matrimonios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatrimonios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatrimonioVerActo }
     * 
     * 
     */
    public List<MatrimonioVerActo> getMatrimonios() {
        if (matrimonios == null) {
            matrimonios = new ArrayList<MatrimonioVerActo>();
        }
        return this.matrimonios;
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
