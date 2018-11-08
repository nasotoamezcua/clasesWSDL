//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.11.08 a las 11:26:01 AM CST 
//


package com.example.demo.cirr.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para nacimientoVerActo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="nacimientoVerActo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://mx.gob.segob.renapo.cirr.controller/}actoVer"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vivoMuerto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nacimientoVerActo", propOrder = {
    "vivoMuerto"
})
@XmlSeeAlso({
    NacimientoRepActo.class
})
public class NacimientoVerActo
    extends ActoVer
{

    protected String vivoMuerto;

    /**
     * Obtiene el valor de la propiedad vivoMuerto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVivoMuerto() {
        return vivoMuerto;
    }

    /**
     * Define el valor de la propiedad vivoMuerto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVivoMuerto(String value) {
        this.vivoMuerto = value;
    }

}
