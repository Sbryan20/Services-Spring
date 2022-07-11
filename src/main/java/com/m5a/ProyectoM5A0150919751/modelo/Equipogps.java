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
@Table(name = "equipogps")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equipogps.findAll", query = "SELECT e FROM Equipogps e"),
    @NamedQuery(name = "Equipogps.findByIdGps", query = "SELECT e FROM Equipogps e WHERE e.idGps = :idGps"),
    @NamedQuery(name = "Equipogps.findByEquipo", query = "SELECT e FROM Equipogps e WHERE e.equipo = :equipo"),
    @NamedQuery(name = "Equipogps.findByImei", query = "SELECT e FROM Equipogps e WHERE e.imei = :imei"),
    @NamedQuery(name = "Equipogps.findByNumeroChip", query = "SELECT e FROM Equipogps e WHERE e.numeroChip = :numeroChip"),
    @NamedQuery(name = "Equipogps.findBySerie", query = "SELECT e FROM Equipogps e WHERE e.serie = :serie"),
    @NamedQuery(name = "Equipogps.findByCosto", query = "SELECT e FROM Equipogps e WHERE e.costo = :costo"),
    @NamedQuery(name = "Equipogps.findByObservacion", query = "SELECT e FROM Equipogps e WHERE e.observacion = :observacion")})
public class Equipogps implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_gps")
    private Integer idGps;
    @Size(max = 20)
    @Column(name = "equipo")
    private String equipo;
    @Size(max = 20)
    @Column(name = "imei")
    private String imei;
    @Size(max = 10)
    @Column(name = "numero_chip")
    private String numeroChip;
    @Size(max = 10)
    @Column(name = "serie")
    private String serie;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "costo")
    private Float costo;
    @Size(max = 100)
    @Column(name = "observacion")
    private String observacion;

    public Equipogps() {
    }

    public Equipogps(Integer idGps) {
        this.idGps = idGps;
    }

    public Integer getIdGps() {
        return idGps;
    }

    public void setIdGps(Integer idGps) {
        this.idGps = idGps;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getNumeroChip() {
        return numeroChip;
    }

    public void setNumeroChip(String numeroChip) {
        this.numeroChip = numeroChip;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGps != null ? idGps.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipogps)) {
            return false;
        }
        Equipogps other = (Equipogps) object;
        if ((this.idGps == null && other.idGps != null) || (this.idGps != null && !this.idGps.equals(other.idGps))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.m5a.ProyectoM5A0150919751.modelo.Equipogps[ idGps=" + idGps + " ]";
    }
    
}
