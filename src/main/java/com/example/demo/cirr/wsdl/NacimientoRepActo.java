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
 * <p>Clase Java para nacimientoRepActo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="nacimientoRepActo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://mx.gob.segob.renapo.cirr.controller/}nacimientoVerActo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nacMadreTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nacPadreTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nacimientoRepActo", propOrder = {
    "nacMadreTxt",
    "nacPadreTxt"
})
public class NacimientoRepActo
    extends NacimientoVerActo
{

    protected String nacMadreTxt;
    protected String nacPadreTxt;

    /**
     * Obtiene el valor de la propiedad nacMadreTxt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacMadreTxt() {
        return nacMadreTxt;
    }

    /**
     * Define el valor de la propiedad nacMadreTxt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacMadreTxt(String value) {
        this.nacMadreTxt = value;
    }

    /**
     * Obtiene el valor de la propiedad nacPadreTxt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacPadreTxt() {
        return nacPadreTxt;
    }

    /**
     * Define el valor de la propiedad nacPadreTxt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacPadreTxt(String value) {
        this.nacPadreTxt = value;
    }

}
