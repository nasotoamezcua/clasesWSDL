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
 * <p>Clase Java para reconocimientoVerActo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reconocimientoVerActo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://mx.gob.segob.renapo.cirr.controller/}actoVer"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="entidadRegistroReconocedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaNacimientoReconocedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sexoReconocedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reconocimientoVerActo", propOrder = {
    "entidadRegistroReconocedor",
    "fechaNacimientoReconocedor",
    "sexoReconocedor"
})
public class ReconocimientoVerActo
    extends ActoVer
{

    protected String entidadRegistroReconocedor;
    protected String fechaNacimientoReconocedor;
    protected String sexoReconocedor;

    /**
     * Obtiene el valor de la propiedad entidadRegistroReconocedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntidadRegistroReconocedor() {
        return entidadRegistroReconocedor;
    }

    /**
     * Define el valor de la propiedad entidadRegistroReconocedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntidadRegistroReconocedor(String value) {
        this.entidadRegistroReconocedor = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacimientoReconocedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacimientoReconocedor() {
        return fechaNacimientoReconocedor;
    }

    /**
     * Define el valor de la propiedad fechaNacimientoReconocedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacimientoReconocedor(String value) {
        this.fechaNacimientoReconocedor = value;
    }

    /**
     * Obtiene el valor de la propiedad sexoReconocedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexoReconocedor() {
        return sexoReconocedor;
    }

    /**
     * Define el valor de la propiedad sexoReconocedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexoReconocedor(String value) {
        this.sexoReconocedor = value;
    }

}
