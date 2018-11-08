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
 * <p>Clase Java para defuncionRespuesta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="defuncionRespuesta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://mx.gob.segob.renapo.cirr.controller/}abstractRespuesta"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="defunciones" type="{http://mx.gob.segob.renapo.cirr.controller/}defuncionVerActo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "defuncionRespuesta", propOrder = {
    "defunciones"
})
public class DefuncionRespuesta
    extends AbstractRespuesta
{

    @XmlElement(nillable = true)
    protected List<DefuncionVerActo> defunciones;

    /**
     * Gets the value of the defunciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defunciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefunciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefuncionVerActo }
     * 
     * 
     */
    public List<DefuncionVerActo> getDefunciones() {
        if (defunciones == null) {
            defunciones = new ArrayList<DefuncionVerActo>();
        }
        return this.defunciones;
    }

}
