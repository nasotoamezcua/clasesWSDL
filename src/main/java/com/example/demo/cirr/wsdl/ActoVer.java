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
 * <p>Clase Java para actoVer complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actoVer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actaBis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="anioRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cadena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curpAux1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curpAux2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curpMADRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curpPADRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estadoNac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estadoNacNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estadoNacReg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estadoNacRegNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estadoReg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estadoRegNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="foja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="folio" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="libro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="madre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="municipio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="municipioNac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="municipioNacNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="municipioNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="municipioReg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="municipioRegNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nacMADRE" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nacPADRE" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nacionalidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nacionalidadAux1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nacionalidadAux1Txt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nacionalidadAux2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nacionalidadAux2Txt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nacionalidadTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noActa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombrePrimeraPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreSegundaPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="notasMarginales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroActa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oficialia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oficialiaNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="padre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="paisTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="primerApellidoPrimeraPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="primerApellidoSegundaPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="segundoApellidoPrimeraPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="segundoApellidoSegundaPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sello" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ssa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoNumActa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tomo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transcripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actoVer", propOrder = {
    "actaBis",
    "anioRegistro",
    "cadena",
    "curp",
    "curpAux1",
    "curpAux2",
    "curpMADRE",
    "curpPADRE",
    "estadoNac",
    "estadoNacNombre",
    "estadoNacReg",
    "estadoNacRegNombre",
    "estadoReg",
    "estadoRegNombre",
    "fechaNacimiento",
    "fechaRegistro",
    "foja",
    "folio",
    "libro",
    "localidad",
    "madre",
    "municipio",
    "municipioNac",
    "municipioNacNombre",
    "municipioNombre",
    "municipioReg",
    "municipioRegNombre",
    "nacMADRE",
    "nacPADRE",
    "nacionalidad",
    "nacionalidadAux1",
    "nacionalidadAux1Txt",
    "nacionalidadAux2",
    "nacionalidadAux2Txt",
    "nacionalidadTxt",
    "noActa",
    "nombre",
    "nombrePrimeraPersona",
    "nombreSegundaPersona",
    "notasMarginales",
    "numeroActa",
    "oficialia",
    "oficialiaNombre",
    "padre",
    "pais",
    "paisTxt",
    "primerApellido",
    "primerApellidoPrimeraPersona",
    "primerApellidoSegundaPersona",
    "segundoApellido",
    "segundoApellidoPrimeraPersona",
    "segundoApellidoSegundaPersona",
    "sello",
    "sexo",
    "ssa",
    "tipoNumActa",
    "tipoPersona",
    "tomo",
    "transcripcion"
})
@XmlSeeAlso({
    AdopcionVerActo.class,
    DefuncionVerActo.class,
    DivorcioVerActo.class,
    MatrimonioVerActo.class,
    NacimientoVerActo.class,
    ReconocimientoVerActo.class
})
public abstract class ActoVer {

    protected String actaBis;
    protected String anioRegistro;
    protected String cadena;
    protected String curp;
    protected String curpAux1;
    protected String curpAux2;
    protected String curpMADRE;
    protected String curpPADRE;
    protected String estadoNac;
    protected String estadoNacNombre;
    protected String estadoNacReg;
    protected String estadoNacRegNombre;
    protected String estadoReg;
    protected String estadoRegNombre;
    protected String fechaNacimiento;
    protected String fechaRegistro;
    protected String foja;
    protected long folio;
    protected String libro;
    protected String localidad;
    protected String madre;
    protected String municipio;
    protected String municipioNac;
    protected String municipioNacNombre;
    protected String municipioNombre;
    protected String municipioReg;
    protected String municipioRegNombre;
    protected int nacMADRE;
    protected int nacPADRE;
    protected int nacionalidad;
    protected int nacionalidadAux1;
    protected String nacionalidadAux1Txt;
    protected int nacionalidadAux2;
    protected String nacionalidadAux2Txt;
    protected String nacionalidadTxt;
    protected String noActa;
    protected String nombre;
    protected String nombrePrimeraPersona;
    protected String nombreSegundaPersona;
    protected String notasMarginales;
    protected String numeroActa;
    protected String oficialia;
    protected String oficialiaNombre;
    protected String padre;
    protected int pais;
    protected String paisTxt;
    protected String primerApellido;
    protected String primerApellidoPrimeraPersona;
    protected String primerApellidoSegundaPersona;
    protected String segundoApellido;
    protected String segundoApellidoPrimeraPersona;
    protected String segundoApellidoSegundaPersona;
    protected String sello;
    protected String sexo;
    protected String ssa;
    protected String tipoNumActa;
    protected String tipoPersona;
    protected String tomo;
    protected String transcripcion;

    /**
     * Obtiene el valor de la propiedad actaBis.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActaBis() {
        return actaBis;
    }

    /**
     * Define el valor de la propiedad actaBis.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActaBis(String value) {
        this.actaBis = value;
    }

    /**
     * Obtiene el valor de la propiedad anioRegistro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnioRegistro() {
        return anioRegistro;
    }

    /**
     * Define el valor de la propiedad anioRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnioRegistro(String value) {
        this.anioRegistro = value;
    }

    /**
     * Obtiene el valor de la propiedad cadena.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCadena() {
        return cadena;
    }

    /**
     * Define el valor de la propiedad cadena.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCadena(String value) {
        this.cadena = value;
    }

    /**
     * Obtiene el valor de la propiedad curp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurp() {
        return curp;
    }

    /**
     * Define el valor de la propiedad curp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurp(String value) {
        this.curp = value;
    }

    /**
     * Obtiene el valor de la propiedad curpAux1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurpAux1() {
        return curpAux1;
    }

    /**
     * Define el valor de la propiedad curpAux1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurpAux1(String value) {
        this.curpAux1 = value;
    }

    /**
     * Obtiene el valor de la propiedad curpAux2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurpAux2() {
        return curpAux2;
    }

    /**
     * Define el valor de la propiedad curpAux2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurpAux2(String value) {
        this.curpAux2 = value;
    }

    /**
     * Obtiene el valor de la propiedad curpMADRE.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurpMADRE() {
        return curpMADRE;
    }

    /**
     * Define el valor de la propiedad curpMADRE.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurpMADRE(String value) {
        this.curpMADRE = value;
    }

    /**
     * Obtiene el valor de la propiedad curpPADRE.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurpPADRE() {
        return curpPADRE;
    }

    /**
     * Define el valor de la propiedad curpPADRE.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurpPADRE(String value) {
        this.curpPADRE = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoNac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoNac() {
        return estadoNac;
    }

    /**
     * Define el valor de la propiedad estadoNac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoNac(String value) {
        this.estadoNac = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoNacNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoNacNombre() {
        return estadoNacNombre;
    }

    /**
     * Define el valor de la propiedad estadoNacNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoNacNombre(String value) {
        this.estadoNacNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoNacReg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoNacReg() {
        return estadoNacReg;
    }

    /**
     * Define el valor de la propiedad estadoNacReg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoNacReg(String value) {
        this.estadoNacReg = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoNacRegNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoNacRegNombre() {
        return estadoNacRegNombre;
    }

    /**
     * Define el valor de la propiedad estadoNacRegNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoNacRegNombre(String value) {
        this.estadoNacRegNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoReg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoReg() {
        return estadoReg;
    }

    /**
     * Define el valor de la propiedad estadoReg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoReg(String value) {
        this.estadoReg = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoRegNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoRegNombre() {
        return estadoRegNombre;
    }

    /**
     * Define el valor de la propiedad estadoRegNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoRegNombre(String value) {
        this.estadoRegNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Define el valor de la propiedad fechaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacimiento(String value) {
        this.fechaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRegistro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * Define el valor de la propiedad fechaRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaRegistro(String value) {
        this.fechaRegistro = value;
    }

    /**
     * Obtiene el valor de la propiedad foja.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoja() {
        return foja;
    }

    /**
     * Define el valor de la propiedad foja.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoja(String value) {
        this.foja = value;
    }

    /**
     * Obtiene el valor de la propiedad folio.
     * 
     */
    public long getFolio() {
        return folio;
    }

    /**
     * Define el valor de la propiedad folio.
     * 
     */
    public void setFolio(long value) {
        this.folio = value;
    }

    /**
     * Obtiene el valor de la propiedad libro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibro() {
        return libro;
    }

    /**
     * Define el valor de la propiedad libro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibro(String value) {
        this.libro = value;
    }

    /**
     * Obtiene el valor de la propiedad localidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * Define el valor de la propiedad localidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalidad(String value) {
        this.localidad = value;
    }

    /**
     * Obtiene el valor de la propiedad madre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMadre() {
        return madre;
    }

    /**
     * Define el valor de la propiedad madre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMadre(String value) {
        this.madre = value;
    }

    /**
     * Obtiene el valor de la propiedad municipio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * Define el valor de la propiedad municipio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipio(String value) {
        this.municipio = value;
    }

    /**
     * Obtiene el valor de la propiedad municipioNac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipioNac() {
        return municipioNac;
    }

    /**
     * Define el valor de la propiedad municipioNac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipioNac(String value) {
        this.municipioNac = value;
    }

    /**
     * Obtiene el valor de la propiedad municipioNacNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipioNacNombre() {
        return municipioNacNombre;
    }

    /**
     * Define el valor de la propiedad municipioNacNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipioNacNombre(String value) {
        this.municipioNacNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad municipioNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipioNombre() {
        return municipioNombre;
    }

    /**
     * Define el valor de la propiedad municipioNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipioNombre(String value) {
        this.municipioNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad municipioReg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipioReg() {
        return municipioReg;
    }

    /**
     * Define el valor de la propiedad municipioReg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipioReg(String value) {
        this.municipioReg = value;
    }

    /**
     * Obtiene el valor de la propiedad municipioRegNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipioRegNombre() {
        return municipioRegNombre;
    }

    /**
     * Define el valor de la propiedad municipioRegNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipioRegNombre(String value) {
        this.municipioRegNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad nacMADRE.
     * 
     */
    public int getNacMADRE() {
        return nacMADRE;
    }

    /**
     * Define el valor de la propiedad nacMADRE.
     * 
     */
    public void setNacMADRE(int value) {
        this.nacMADRE = value;
    }

    /**
     * Obtiene el valor de la propiedad nacPADRE.
     * 
     */
    public int getNacPADRE() {
        return nacPADRE;
    }

    /**
     * Define el valor de la propiedad nacPADRE.
     * 
     */
    public void setNacPADRE(int value) {
        this.nacPADRE = value;
    }

    /**
     * Obtiene el valor de la propiedad nacionalidad.
     * 
     */
    public int getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Define el valor de la propiedad nacionalidad.
     * 
     */
    public void setNacionalidad(int value) {
        this.nacionalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad nacionalidadAux1.
     * 
     */
    public int getNacionalidadAux1() {
        return nacionalidadAux1;
    }

    /**
     * Define el valor de la propiedad nacionalidadAux1.
     * 
     */
    public void setNacionalidadAux1(int value) {
        this.nacionalidadAux1 = value;
    }

    /**
     * Obtiene el valor de la propiedad nacionalidadAux1Txt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacionalidadAux1Txt() {
        return nacionalidadAux1Txt;
    }

    /**
     * Define el valor de la propiedad nacionalidadAux1Txt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacionalidadAux1Txt(String value) {
        this.nacionalidadAux1Txt = value;
    }

    /**
     * Obtiene el valor de la propiedad nacionalidadAux2.
     * 
     */
    public int getNacionalidadAux2() {
        return nacionalidadAux2;
    }

    /**
     * Define el valor de la propiedad nacionalidadAux2.
     * 
     */
    public void setNacionalidadAux2(int value) {
        this.nacionalidadAux2 = value;
    }

    /**
     * Obtiene el valor de la propiedad nacionalidadAux2Txt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacionalidadAux2Txt() {
        return nacionalidadAux2Txt;
    }

    /**
     * Define el valor de la propiedad nacionalidadAux2Txt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacionalidadAux2Txt(String value) {
        this.nacionalidadAux2Txt = value;
    }

    /**
     * Obtiene el valor de la propiedad nacionalidadTxt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacionalidadTxt() {
        return nacionalidadTxt;
    }

    /**
     * Define el valor de la propiedad nacionalidadTxt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacionalidadTxt(String value) {
        this.nacionalidadTxt = value;
    }

    /**
     * Obtiene el valor de la propiedad noActa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoActa() {
        return noActa;
    }

    /**
     * Define el valor de la propiedad noActa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoActa(String value) {
        this.noActa = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePrimeraPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePrimeraPersona() {
        return nombrePrimeraPersona;
    }

    /**
     * Define el valor de la propiedad nombrePrimeraPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePrimeraPersona(String value) {
        this.nombrePrimeraPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreSegundaPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreSegundaPersona() {
        return nombreSegundaPersona;
    }

    /**
     * Define el valor de la propiedad nombreSegundaPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreSegundaPersona(String value) {
        this.nombreSegundaPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad notasMarginales.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotasMarginales() {
        return notasMarginales;
    }

    /**
     * Define el valor de la propiedad notasMarginales.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotasMarginales(String value) {
        this.notasMarginales = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroActa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroActa() {
        return numeroActa;
    }

    /**
     * Define el valor de la propiedad numeroActa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroActa(String value) {
        this.numeroActa = value;
    }

    /**
     * Obtiene el valor de la propiedad oficialia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOficialia() {
        return oficialia;
    }

    /**
     * Define el valor de la propiedad oficialia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOficialia(String value) {
        this.oficialia = value;
    }

    /**
     * Obtiene el valor de la propiedad oficialiaNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOficialiaNombre() {
        return oficialiaNombre;
    }

    /**
     * Define el valor de la propiedad oficialiaNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOficialiaNombre(String value) {
        this.oficialiaNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad padre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPadre() {
        return padre;
    }

    /**
     * Define el valor de la propiedad padre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPadre(String value) {
        this.padre = value;
    }

    /**
     * Obtiene el valor de la propiedad pais.
     * 
     */
    public int getPais() {
        return pais;
    }

    /**
     * Define el valor de la propiedad pais.
     * 
     */
    public void setPais(int value) {
        this.pais = value;
    }

    /**
     * Obtiene el valor de la propiedad paisTxt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisTxt() {
        return paisTxt;
    }

    /**
     * Define el valor de la propiedad paisTxt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisTxt(String value) {
        this.paisTxt = value;
    }

    /**
     * Obtiene el valor de la propiedad primerApellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * Define el valor de la propiedad primerApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerApellido(String value) {
        this.primerApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad primerApellidoPrimeraPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerApellidoPrimeraPersona() {
        return primerApellidoPrimeraPersona;
    }

    /**
     * Define el valor de la propiedad primerApellidoPrimeraPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerApellidoPrimeraPersona(String value) {
        this.primerApellidoPrimeraPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad primerApellidoSegundaPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerApellidoSegundaPersona() {
        return primerApellidoSegundaPersona;
    }

    /**
     * Define el valor de la propiedad primerApellidoSegundaPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerApellidoSegundaPersona(String value) {
        this.primerApellidoSegundaPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoApellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoApellido() {
        return segundoApellido;
    }

    /**
     * Define el valor de la propiedad segundoApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoApellido(String value) {
        this.segundoApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoApellidoPrimeraPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoApellidoPrimeraPersona() {
        return segundoApellidoPrimeraPersona;
    }

    /**
     * Define el valor de la propiedad segundoApellidoPrimeraPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoApellidoPrimeraPersona(String value) {
        this.segundoApellidoPrimeraPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoApellidoSegundaPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoApellidoSegundaPersona() {
        return segundoApellidoSegundaPersona;
    }

    /**
     * Define el valor de la propiedad segundoApellidoSegundaPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoApellidoSegundaPersona(String value) {
        this.segundoApellidoSegundaPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad sello.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSello() {
        return sello;
    }

    /**
     * Define el valor de la propiedad sello.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSello(String value) {
        this.sello = value;
    }

    /**
     * Obtiene el valor de la propiedad sexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Define el valor de la propiedad sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexo(String value) {
        this.sexo = value;
    }

    /**
     * Obtiene el valor de la propiedad ssa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsa() {
        return ssa;
    }

    /**
     * Define el valor de la propiedad ssa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsa(String value) {
        this.ssa = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoNumActa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoNumActa() {
        return tipoNumActa;
    }

    /**
     * Define el valor de la propiedad tipoNumActa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoNumActa(String value) {
        this.tipoNumActa = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPersona() {
        return tipoPersona;
    }

    /**
     * Define el valor de la propiedad tipoPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPersona(String value) {
        this.tipoPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad tomo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTomo() {
        return tomo;
    }

    /**
     * Define el valor de la propiedad tomo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTomo(String value) {
        this.tomo = value;
    }

    /**
     * Obtiene el valor de la propiedad transcripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranscripcion() {
        return transcripcion;
    }

    /**
     * Define el valor de la propiedad transcripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranscripcion(String value) {
        this.transcripcion = value;
    }

}
