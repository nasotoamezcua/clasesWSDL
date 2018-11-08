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
 * <p>Clase Java para divorcioVerActo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="divorcioVerActo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://mx.gob.segob.renapo.cirr.controller/}actoVer"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actaBisRegEl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="actaBisRegElla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="actaNumero" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="actaRegEl" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="actaRegElla" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="anio" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="anioRegEl" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="anioRegElla" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="archivoOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cripEl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cripElla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curpEl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curpElla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="divFechaOri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="divFirmaRc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="divResolucionAdmva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="edadEl" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="edadElla" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="entidadCodigoRegEl" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="entidadCodigoRegElTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entidadCodigoRegElla" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="entidadCodigoRegEllaTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entidadCodigoRegistro" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="entidadNacEl" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="entidadNacElla" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="errorOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaModificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaNacRegEl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaNacRegElla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaNacimientoEl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaNacimientoElTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaNacimientoElla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaNacimientoEllaTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaRegActaMatDiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaResolucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imaNombreHomologado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="llave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localidadNacEl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localidadNacElla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="matActaBisReg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="matActaNumeroReg" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="matAnioReg" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="matEntReg" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="matMunReg" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="matOficiliaReg" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="municipioCodigoRegEl" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="municipioCodigoRegElla" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="municipioCodigoRegistro" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="municipioNacEl" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="municipioNacElla" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nacionalidadEl" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nacionalidadElTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nacionalidadElla" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nacionalidadEllaTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreEl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreElla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ofiCodigo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ofiCodigoRegEl" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ofiCodigoRegElla" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="paisNacEl" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="paisNacElla" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="primerApellidoEl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="primerApellidoElla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="segundoApellidoEl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="segundoApellidoElla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sexoEl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sexoElla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoDivorcio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoDivorcioTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "divorcioVerActo", propOrder = {
    "actaBisRegEl",
    "actaBisRegElla",
    "actaNumero",
    "actaRegEl",
    "actaRegElla",
    "anio",
    "anioRegEl",
    "anioRegElla",
    "archivoOrigen",
    "cripEl",
    "cripElla",
    "curpEl",
    "curpElla",
    "divFechaOri",
    "divFirmaRc",
    "divResolucionAdmva",
    "edadEl",
    "edadElla",
    "entidadCodigoRegEl",
    "entidadCodigoRegElTxt",
    "entidadCodigoRegElla",
    "entidadCodigoRegEllaTxt",
    "entidadCodigoRegistro",
    "entidadNacEl",
    "entidadNacElla",
    "errorOrigen",
    "fechaModificacion",
    "fechaNacRegEl",
    "fechaNacRegElla",
    "fechaNacimientoEl",
    "fechaNacimientoElTxt",
    "fechaNacimientoElla",
    "fechaNacimientoEllaTxt",
    "fechaRegActaMatDiv",
    "fechaResolucion",
    "imaNombreHomologado",
    "llave",
    "localidadNacEl",
    "localidadNacElla",
    "matActaBisReg",
    "matActaNumeroReg",
    "matAnioReg",
    "matEntReg",
    "matMunReg",
    "matOficiliaReg",
    "municipioCodigoRegEl",
    "municipioCodigoRegElla",
    "municipioCodigoRegistro",
    "municipioNacEl",
    "municipioNacElla",
    "nacionalidadEl",
    "nacionalidadElTxt",
    "nacionalidadElla",
    "nacionalidadEllaTxt",
    "nombreEl",
    "nombreElla",
    "ofiCodigo",
    "ofiCodigoRegEl",
    "ofiCodigoRegElla",
    "paisNacEl",
    "paisNacElla",
    "primerApellidoEl",
    "primerApellidoElla",
    "segundoApellidoEl",
    "segundoApellidoElla",
    "sexoEl",
    "sexoElla",
    "tipoDivorcio",
    "tipoDivorcioTxt"
})
public class DivorcioVerActo
    extends ActoVer
{

    protected String actaBisRegEl;
    protected String actaBisRegElla;
    protected int actaNumero;
    protected int actaRegEl;
    protected int actaRegElla;
    protected int anio;
    protected int anioRegEl;
    protected int anioRegElla;
    protected String archivoOrigen;
    protected String cripEl;
    protected String cripElla;
    protected String curpEl;
    protected String curpElla;
    protected String divFechaOri;
    protected String divFirmaRc;
    protected String divResolucionAdmva;
    protected int edadEl;
    protected int edadElla;
    protected int entidadCodigoRegEl;
    protected String entidadCodigoRegElTxt;
    protected int entidadCodigoRegElla;
    protected String entidadCodigoRegEllaTxt;
    protected int entidadCodigoRegistro;
    protected int entidadNacEl;
    protected int entidadNacElla;
    protected String errorOrigen;
    protected String fechaModificacion;
    protected String fechaNacRegEl;
    protected String fechaNacRegElla;
    protected String fechaNacimientoEl;
    protected String fechaNacimientoElTxt;
    protected String fechaNacimientoElla;
    protected String fechaNacimientoEllaTxt;
    protected String fechaRegActaMatDiv;
    protected String fechaResolucion;
    protected String imaNombreHomologado;
    protected String llave;
    protected String localidadNacEl;
    protected String localidadNacElla;
    protected String matActaBisReg;
    protected int matActaNumeroReg;
    protected int matAnioReg;
    protected int matEntReg;
    protected int matMunReg;
    protected int matOficiliaReg;
    protected int municipioCodigoRegEl;
    protected int municipioCodigoRegElla;
    protected int municipioCodigoRegistro;
    protected int municipioNacEl;
    protected int municipioNacElla;
    protected int nacionalidadEl;
    protected String nacionalidadElTxt;
    protected int nacionalidadElla;
    protected String nacionalidadEllaTxt;
    protected String nombreEl;
    protected String nombreElla;
    protected int ofiCodigo;
    protected int ofiCodigoRegEl;
    protected int ofiCodigoRegElla;
    protected int paisNacEl;
    protected int paisNacElla;
    protected String primerApellidoEl;
    protected String primerApellidoElla;
    protected String segundoApellidoEl;
    protected String segundoApellidoElla;
    protected String sexoEl;
    protected String sexoElla;
    protected String tipoDivorcio;
    protected String tipoDivorcioTxt;

    /**
     * Obtiene el valor de la propiedad actaBisRegEl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActaBisRegEl() {
        return actaBisRegEl;
    }

    /**
     * Define el valor de la propiedad actaBisRegEl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActaBisRegEl(String value) {
        this.actaBisRegEl = value;
    }

    /**
     * Obtiene el valor de la propiedad actaBisRegElla.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActaBisRegElla() {
        return actaBisRegElla;
    }

    /**
     * Define el valor de la propiedad actaBisRegElla.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActaBisRegElla(String value) {
        this.actaBisRegElla = value;
    }

    /**
     * Obtiene el valor de la propiedad actaNumero.
     * 
     */
    public int getActaNumero() {
        return actaNumero;
    }

    /**
     * Define el valor de la propiedad actaNumero.
     * 
     */
    public void setActaNumero(int value) {
        this.actaNumero = value;
    }

    /**
     * Obtiene el valor de la propiedad actaRegEl.
     * 
     */
    public int getActaRegEl() {
        return actaRegEl;
    }

    /**
     * Define el valor de la propiedad actaRegEl.
     * 
     */
    public void setActaRegEl(int value) {
        this.actaRegEl = value;
    }

    /**
     * Obtiene el valor de la propiedad actaRegElla.
     * 
     */
    public int getActaRegElla() {
        return actaRegElla;
    }

    /**
     * Define el valor de la propiedad actaRegElla.
     * 
     */
    public void setActaRegElla(int value) {
        this.actaRegElla = value;
    }

    /**
     * Obtiene el valor de la propiedad anio.
     * 
     */
    public int getAnio() {
        return anio;
    }

    /**
     * Define el valor de la propiedad anio.
     * 
     */
    public void setAnio(int value) {
        this.anio = value;
    }

    /**
     * Obtiene el valor de la propiedad anioRegEl.
     * 
     */
    public int getAnioRegEl() {
        return anioRegEl;
    }

    /**
     * Define el valor de la propiedad anioRegEl.
     * 
     */
    public void setAnioRegEl(int value) {
        this.anioRegEl = value;
    }

    /**
     * Obtiene el valor de la propiedad anioRegElla.
     * 
     */
    public int getAnioRegElla() {
        return anioRegElla;
    }

    /**
     * Define el valor de la propiedad anioRegElla.
     * 
     */
    public void setAnioRegElla(int value) {
        this.anioRegElla = value;
    }

    /**
     * Obtiene el valor de la propiedad archivoOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchivoOrigen() {
        return archivoOrigen;
    }

    /**
     * Define el valor de la propiedad archivoOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchivoOrigen(String value) {
        this.archivoOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad cripEl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCripEl() {
        return cripEl;
    }

    /**
     * Define el valor de la propiedad cripEl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCripEl(String value) {
        this.cripEl = value;
    }

    /**
     * Obtiene el valor de la propiedad cripElla.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCripElla() {
        return cripElla;
    }

    /**
     * Define el valor de la propiedad cripElla.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCripElla(String value) {
        this.cripElla = value;
    }

    /**
     * Obtiene el valor de la propiedad curpEl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurpEl() {
        return curpEl;
    }

    /**
     * Define el valor de la propiedad curpEl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurpEl(String value) {
        this.curpEl = value;
    }

    /**
     * Obtiene el valor de la propiedad curpElla.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurpElla() {
        return curpElla;
    }

    /**
     * Define el valor de la propiedad curpElla.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurpElla(String value) {
        this.curpElla = value;
    }

    /**
     * Obtiene el valor de la propiedad divFechaOri.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivFechaOri() {
        return divFechaOri;
    }

    /**
     * Define el valor de la propiedad divFechaOri.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivFechaOri(String value) {
        this.divFechaOri = value;
    }

    /**
     * Obtiene el valor de la propiedad divFirmaRc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivFirmaRc() {
        return divFirmaRc;
    }

    /**
     * Define el valor de la propiedad divFirmaRc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivFirmaRc(String value) {
        this.divFirmaRc = value;
    }

    /**
     * Obtiene el valor de la propiedad divResolucionAdmva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivResolucionAdmva() {
        return divResolucionAdmva;
    }

    /**
     * Define el valor de la propiedad divResolucionAdmva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivResolucionAdmva(String value) {
        this.divResolucionAdmva = value;
    }

    /**
     * Obtiene el valor de la propiedad edadEl.
     * 
     */
    public int getEdadEl() {
        return edadEl;
    }

    /**
     * Define el valor de la propiedad edadEl.
     * 
     */
    public void setEdadEl(int value) {
        this.edadEl = value;
    }

    /**
     * Obtiene el valor de la propiedad edadElla.
     * 
     */
    public int getEdadElla() {
        return edadElla;
    }

    /**
     * Define el valor de la propiedad edadElla.
     * 
     */
    public void setEdadElla(int value) {
        this.edadElla = value;
    }

    /**
     * Obtiene el valor de la propiedad entidadCodigoRegEl.
     * 
     */
    public int getEntidadCodigoRegEl() {
        return entidadCodigoRegEl;
    }

    /**
     * Define el valor de la propiedad entidadCodigoRegEl.
     * 
     */
    public void setEntidadCodigoRegEl(int value) {
        this.entidadCodigoRegEl = value;
    }

    /**
     * Obtiene el valor de la propiedad entidadCodigoRegElTxt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntidadCodigoRegElTxt() {
        return entidadCodigoRegElTxt;
    }

    /**
     * Define el valor de la propiedad entidadCodigoRegElTxt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntidadCodigoRegElTxt(String value) {
        this.entidadCodigoRegElTxt = value;
    }

    /**
     * Obtiene el valor de la propiedad entidadCodigoRegElla.
     * 
     */
    public int getEntidadCodigoRegElla() {
        return entidadCodigoRegElla;
    }

    /**
     * Define el valor de la propiedad entidadCodigoRegElla.
     * 
     */
    public void setEntidadCodigoRegElla(int value) {
        this.entidadCodigoRegElla = value;
    }

    /**
     * Obtiene el valor de la propiedad entidadCodigoRegEllaTxt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntidadCodigoRegEllaTxt() {
        return entidadCodigoRegEllaTxt;
    }

    /**
     * Define el valor de la propiedad entidadCodigoRegEllaTxt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntidadCodigoRegEllaTxt(String value) {
        this.entidadCodigoRegEllaTxt = value;
    }

    /**
     * Obtiene el valor de la propiedad entidadCodigoRegistro.
     * 
     */
    public int getEntidadCodigoRegistro() {
        return entidadCodigoRegistro;
    }

    /**
     * Define el valor de la propiedad entidadCodigoRegistro.
     * 
     */
    public void setEntidadCodigoRegistro(int value) {
        this.entidadCodigoRegistro = value;
    }

    /**
     * Obtiene el valor de la propiedad entidadNacEl.
     * 
     */
    public int getEntidadNacEl() {
        return entidadNacEl;
    }

    /**
     * Define el valor de la propiedad entidadNacEl.
     * 
     */
    public void setEntidadNacEl(int value) {
        this.entidadNacEl = value;
    }

    /**
     * Obtiene el valor de la propiedad entidadNacElla.
     * 
     */
    public int getEntidadNacElla() {
        return entidadNacElla;
    }

    /**
     * Define el valor de la propiedad entidadNacElla.
     * 
     */
    public void setEntidadNacElla(int value) {
        this.entidadNacElla = value;
    }

    /**
     * Obtiene el valor de la propiedad errorOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorOrigen() {
        return errorOrigen;
    }

    /**
     * Define el valor de la propiedad errorOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorOrigen(String value) {
        this.errorOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaModificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaModificacion() {
        return fechaModificacion;
    }

    /**
     * Define el valor de la propiedad fechaModificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaModificacion(String value) {
        this.fechaModificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacRegEl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacRegEl() {
        return fechaNacRegEl;
    }

    /**
     * Define el valor de la propiedad fechaNacRegEl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacRegEl(String value) {
        this.fechaNacRegEl = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacRegElla.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacRegElla() {
        return fechaNacRegElla;
    }

    /**
     * Define el valor de la propiedad fechaNacRegElla.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacRegElla(String value) {
        this.fechaNacRegElla = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacimientoEl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacimientoEl() {
        return fechaNacimientoEl;
    }

    /**
     * Define el valor de la propiedad fechaNacimientoEl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacimientoEl(String value) {
        this.fechaNacimientoEl = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacimientoElTxt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacimientoElTxt() {
        return fechaNacimientoElTxt;
    }

    /**
     * Define el valor de la propiedad fechaNacimientoElTxt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacimientoElTxt(String value) {
        this.fechaNacimientoElTxt = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacimientoElla.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacimientoElla() {
        return fechaNacimientoElla;
    }

    /**
     * Define el valor de la propiedad fechaNacimientoElla.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacimientoElla(String value) {
        this.fechaNacimientoElla = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacimientoEllaTxt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacimientoEllaTxt() {
        return fechaNacimientoEllaTxt;
    }

    /**
     * Define el valor de la propiedad fechaNacimientoEllaTxt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacimientoEllaTxt(String value) {
        this.fechaNacimientoEllaTxt = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRegActaMatDiv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaRegActaMatDiv() {
        return fechaRegActaMatDiv;
    }

    /**
     * Define el valor de la propiedad fechaRegActaMatDiv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaRegActaMatDiv(String value) {
        this.fechaRegActaMatDiv = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaResolucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaResolucion() {
        return fechaResolucion;
    }

    /**
     * Define el valor de la propiedad fechaResolucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaResolucion(String value) {
        this.fechaResolucion = value;
    }

    /**
     * Obtiene el valor de la propiedad imaNombreHomologado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImaNombreHomologado() {
        return imaNombreHomologado;
    }

    /**
     * Define el valor de la propiedad imaNombreHomologado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImaNombreHomologado(String value) {
        this.imaNombreHomologado = value;
    }

    /**
     * Obtiene el valor de la propiedad llave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLlave() {
        return llave;
    }

    /**
     * Define el valor de la propiedad llave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLlave(String value) {
        this.llave = value;
    }

    /**
     * Obtiene el valor de la propiedad localidadNacEl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalidadNacEl() {
        return localidadNacEl;
    }

    /**
     * Define el valor de la propiedad localidadNacEl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalidadNacEl(String value) {
        this.localidadNacEl = value;
    }

    /**
     * Obtiene el valor de la propiedad localidadNacElla.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalidadNacElla() {
        return localidadNacElla;
    }

    /**
     * Define el valor de la propiedad localidadNacElla.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalidadNacElla(String value) {
        this.localidadNacElla = value;
    }

    /**
     * Obtiene el valor de la propiedad matActaBisReg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatActaBisReg() {
        return matActaBisReg;
    }

    /**
     * Define el valor de la propiedad matActaBisReg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatActaBisReg(String value) {
        this.matActaBisReg = value;
    }

    /**
     * Obtiene el valor de la propiedad matActaNumeroReg.
     * 
     */
    public int getMatActaNumeroReg() {
        return matActaNumeroReg;
    }

    /**
     * Define el valor de la propiedad matActaNumeroReg.
     * 
     */
    public void setMatActaNumeroReg(int value) {
        this.matActaNumeroReg = value;
    }

    /**
     * Obtiene el valor de la propiedad matAnioReg.
     * 
     */
    public int getMatAnioReg() {
        return matAnioReg;
    }

    /**
     * Define el valor de la propiedad matAnioReg.
     * 
     */
    public void setMatAnioReg(int value) {
        this.matAnioReg = value;
    }

    /**
     * Obtiene el valor de la propiedad matEntReg.
     * 
     */
    public int getMatEntReg() {
        return matEntReg;
    }

    /**
     * Define el valor de la propiedad matEntReg.
     * 
     */
    public void setMatEntReg(int value) {
        this.matEntReg = value;
    }

    /**
     * Obtiene el valor de la propiedad matMunReg.
     * 
     */
    public int getMatMunReg() {
        return matMunReg;
    }

    /**
     * Define el valor de la propiedad matMunReg.
     * 
     */
    public void setMatMunReg(int value) {
        this.matMunReg = value;
    }

    /**
     * Obtiene el valor de la propiedad matOficiliaReg.
     * 
     */
    public int getMatOficiliaReg() {
        return matOficiliaReg;
    }

    /**
     * Define el valor de la propiedad matOficiliaReg.
     * 
     */
    public void setMatOficiliaReg(int value) {
        this.matOficiliaReg = value;
    }

    /**
     * Obtiene el valor de la propiedad municipioCodigoRegEl.
     * 
     */
    public int getMunicipioCodigoRegEl() {
        return municipioCodigoRegEl;
    }

    /**
     * Define el valor de la propiedad municipioCodigoRegEl.
     * 
     */
    public void setMunicipioCodigoRegEl(int value) {
        this.municipioCodigoRegEl = value;
    }

    /**
     * Obtiene el valor de la propiedad municipioCodigoRegElla.
     * 
     */
    public int getMunicipioCodigoRegElla() {
        return municipioCodigoRegElla;
    }

    /**
     * Define el valor de la propiedad municipioCodigoRegElla.
     * 
     */
    public void setMunicipioCodigoRegElla(int value) {
        this.municipioCodigoRegElla = value;
    }

    /**
     * Obtiene el valor de la propiedad municipioCodigoRegistro.
     * 
     */
    public int getMunicipioCodigoRegistro() {
        return municipioCodigoRegistro;
    }

    /**
     * Define el valor de la propiedad municipioCodigoRegistro.
     * 
     */
    public void setMunicipioCodigoRegistro(int value) {
        this.municipioCodigoRegistro = value;
    }

    /**
     * Obtiene el valor de la propiedad municipioNacEl.
     * 
     */
    public int getMunicipioNacEl() {
        return municipioNacEl;
    }

    /**
     * Define el valor de la propiedad municipioNacEl.
     * 
     */
    public void setMunicipioNacEl(int value) {
        this.municipioNacEl = value;
    }

    /**
     * Obtiene el valor de la propiedad municipioNacElla.
     * 
     */
    public int getMunicipioNacElla() {
        return municipioNacElla;
    }

    /**
     * Define el valor de la propiedad municipioNacElla.
     * 
     */
    public void setMunicipioNacElla(int value) {
        this.municipioNacElla = value;
    }

    /**
     * Obtiene el valor de la propiedad nacionalidadEl.
     * 
     */
    public int getNacionalidadEl() {
        return nacionalidadEl;
    }

    /**
     * Define el valor de la propiedad nacionalidadEl.
     * 
     */
    public void setNacionalidadEl(int value) {
        this.nacionalidadEl = value;
    }

    /**
     * Obtiene el valor de la propiedad nacionalidadElTxt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacionalidadElTxt() {
        return nacionalidadElTxt;
    }

    /**
     * Define el valor de la propiedad nacionalidadElTxt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacionalidadElTxt(String value) {
        this.nacionalidadElTxt = value;
    }

    /**
     * Obtiene el valor de la propiedad nacionalidadElla.
     * 
     */
    public int getNacionalidadElla() {
        return nacionalidadElla;
    }

    /**
     * Define el valor de la propiedad nacionalidadElla.
     * 
     */
    public void setNacionalidadElla(int value) {
        this.nacionalidadElla = value;
    }

    /**
     * Obtiene el valor de la propiedad nacionalidadEllaTxt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacionalidadEllaTxt() {
        return nacionalidadEllaTxt;
    }

    /**
     * Define el valor de la propiedad nacionalidadEllaTxt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacionalidadEllaTxt(String value) {
        this.nacionalidadEllaTxt = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreEl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEl() {
        return nombreEl;
    }

    /**
     * Define el valor de la propiedad nombreEl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEl(String value) {
        this.nombreEl = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreElla.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreElla() {
        return nombreElla;
    }

    /**
     * Define el valor de la propiedad nombreElla.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreElla(String value) {
        this.nombreElla = value;
    }

    /**
     * Obtiene el valor de la propiedad ofiCodigo.
     * 
     */
    public int getOfiCodigo() {
        return ofiCodigo;
    }

    /**
     * Define el valor de la propiedad ofiCodigo.
     * 
     */
    public void setOfiCodigo(int value) {
        this.ofiCodigo = value;
    }

    /**
     * Obtiene el valor de la propiedad ofiCodigoRegEl.
     * 
     */
    public int getOfiCodigoRegEl() {
        return ofiCodigoRegEl;
    }

    /**
     * Define el valor de la propiedad ofiCodigoRegEl.
     * 
     */
    public void setOfiCodigoRegEl(int value) {
        this.ofiCodigoRegEl = value;
    }

    /**
     * Obtiene el valor de la propiedad ofiCodigoRegElla.
     * 
     */
    public int getOfiCodigoRegElla() {
        return ofiCodigoRegElla;
    }

    /**
     * Define el valor de la propiedad ofiCodigoRegElla.
     * 
     */
    public void setOfiCodigoRegElla(int value) {
        this.ofiCodigoRegElla = value;
    }

    /**
     * Obtiene el valor de la propiedad paisNacEl.
     * 
     */
    public int getPaisNacEl() {
        return paisNacEl;
    }

    /**
     * Define el valor de la propiedad paisNacEl.
     * 
     */
    public void setPaisNacEl(int value) {
        this.paisNacEl = value;
    }

    /**
     * Obtiene el valor de la propiedad paisNacElla.
     * 
     */
    public int getPaisNacElla() {
        return paisNacElla;
    }

    /**
     * Define el valor de la propiedad paisNacElla.
     * 
     */
    public void setPaisNacElla(int value) {
        this.paisNacElla = value;
    }

    /**
     * Obtiene el valor de la propiedad primerApellidoEl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerApellidoEl() {
        return primerApellidoEl;
    }

    /**
     * Define el valor de la propiedad primerApellidoEl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerApellidoEl(String value) {
        this.primerApellidoEl = value;
    }

    /**
     * Obtiene el valor de la propiedad primerApellidoElla.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerApellidoElla() {
        return primerApellidoElla;
    }

    /**
     * Define el valor de la propiedad primerApellidoElla.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerApellidoElla(String value) {
        this.primerApellidoElla = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoApellidoEl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoApellidoEl() {
        return segundoApellidoEl;
    }

    /**
     * Define el valor de la propiedad segundoApellidoEl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoApellidoEl(String value) {
        this.segundoApellidoEl = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoApellidoElla.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoApellidoElla() {
        return segundoApellidoElla;
    }

    /**
     * Define el valor de la propiedad segundoApellidoElla.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoApellidoElla(String value) {
        this.segundoApellidoElla = value;
    }

    /**
     * Obtiene el valor de la propiedad sexoEl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexoEl() {
        return sexoEl;
    }

    /**
     * Define el valor de la propiedad sexoEl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexoEl(String value) {
        this.sexoEl = value;
    }

    /**
     * Obtiene el valor de la propiedad sexoElla.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexoElla() {
        return sexoElla;
    }

    /**
     * Define el valor de la propiedad sexoElla.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexoElla(String value) {
        this.sexoElla = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDivorcio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDivorcio() {
        return tipoDivorcio;
    }

    /**
     * Define el valor de la propiedad tipoDivorcio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDivorcio(String value) {
        this.tipoDivorcio = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDivorcioTxt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDivorcioTxt() {
        return tipoDivorcioTxt;
    }

    /**
     * Define el valor de la propiedad tipoDivorcioTxt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDivorcioTxt(String value) {
        this.tipoDivorcioTxt = value;
    }

}
