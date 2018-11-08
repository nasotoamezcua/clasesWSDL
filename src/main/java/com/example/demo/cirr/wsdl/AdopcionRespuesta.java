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
 * <p>Clase Java para adopcionRespuesta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="adopcionRespuesta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://mx.gob.segob.renapo.cirr.controller/}abstractRespuesta"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adopciones" type="{http://mx.gob.segob.renapo.cirr.controller/}adopcionVerActo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adopcionRespuesta", propOrder = {
    "adopciones"
})
public class AdopcionRespuesta
    extends AbstractRespuesta
{

    @XmlElement(nillable = true)
    protected List<AdopcionVerActo> adopciones;

    /**
     * Gets the value of the adopciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adopciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdopciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdopcionVerActo }
     * 
     * 
     */
    public List<AdopcionVerActo> getAdopciones() {
        if (adopciones == null) {
            adopciones = new ArrayList<AdopcionVerActo>();
        }
        return this.adopciones;
    }

}
