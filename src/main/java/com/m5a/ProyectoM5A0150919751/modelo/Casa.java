/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.m5a.ProyectoM5A0150919751.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author bryte
 */
@Entity
@Table(name = "casa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Casa.findAll", query = "SELECT c FROM Casa c"),
    @NamedQuery(name = "Casa.findByIdCasa", query = "SELECT c FROM Casa c WHERE c.idCasa = :idCasa"),
    @NamedQuery(name = "Casa.findByPropietario", query = "SELECT c FROM Casa c WHERE c.propietario = :propietario"),
    @NamedQuery(name = "Casa.findByCodigo", query = "SELECT c FROM Casa c WHERE c.codigo = :codigo"),
    @NamedQuery(name = "Casa.findByTipoTerreno", query = "SELECT c FROM Casa c WHERE c.tipoTerreno = :tipoTerreno"),
    @NamedQuery(name = "Casa.findByArea", query = "SELECT c FROM Casa c WHERE c.area = :area"),
    @NamedQuery(name = "Casa.findByCostoTotal", query = "SELECT c FROM Casa c WHERE c.costoTotal = :costoTotal")})
public class Casa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_casa")
    private Integer idCasa;
    @Size(max = 50)
    @Column(name = "propietario")
    private String propietario;
    @Size(max = 10)
    @Column(name = "codigo")
    private String codigo;
    @Size(max = 50)
    @Column(name = "tipo_terreno")
    private String tipoTerreno;
    @Column(name = "area")
    private Integer area;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "costo_total")
    private Float costoTotal;

    public Casa() {
    }

    public Casa(Integer idCasa) {
        this.idCasa = idCasa;
    }

    public Integer getIdCasa() {
        return idCasa;
    }

    public void setIdCasa(Integer idCasa) {
        this.idCasa = idCasa;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipoTerreno() {
        return tipoTerreno;
    }

    public void setTipoTerreno(String tipoTerreno) {
        this.tipoTerreno = tipoTerreno;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Float getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Float costoTotal) {
        this.costoTotal = costoTotal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCasa != null ? idCasa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Casa)) {
            return false;
        }
        Casa other = (Casa) object;
        if ((this.idCasa == null && other.idCasa != null) || (this.idCasa != null && !this.idCasa.equals(other.idCasa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.m5a.ProyectoM5A0150919751.modelo.Casa[ idCasa=" + idCasa + " ]";
    }
    
}
