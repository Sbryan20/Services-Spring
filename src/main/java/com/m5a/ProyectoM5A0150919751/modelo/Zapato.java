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
@Table(name = "zapato")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zapato.findAll", query = "SELECT z FROM Zapato z"),
    @NamedQuery(name = "Zapato.findByIdZapato", query = "SELECT z FROM Zapato z WHERE z.idZapato = :idZapato"),
    @NamedQuery(name = "Zapato.findByMarca", query = "SELECT z FROM Zapato z WHERE z.marca = :marca"),
    @NamedQuery(name = "Zapato.findByCodigo", query = "SELECT z FROM Zapato z WHERE z.codigo = :codigo"),
    @NamedQuery(name = "Zapato.findByCosto", query = "SELECT z FROM Zapato z WHERE z.costo = :costo"),
    @NamedQuery(name = "Zapato.findByCantidad", query = "SELECT z FROM Zapato z WHERE z.cantidad = :cantidad"),
    @NamedQuery(name = "Zapato.findByCostoTotal", query = "SELECT z FROM Zapato z WHERE z.costoTotal = :costoTotal"),
    @NamedQuery(name = "Zapato.findByTipoZapato", query = "SELECT z FROM Zapato z WHERE z.tipoZapato = :tipoZapato")})
public class Zapato implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_zapato")
    private Integer idZapato;
    @Size(max = 40)
    @Column(name = "marca")
    private String marca;
    @Size(max = 10)
    @Column(name = "codigo")
    private String codigo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "costo")
    private Float costo;
    @Column(name = "cantidad")
    private Integer cantidad;
    @Column(name = "costo_total")
    private Float costoTotal;
    @Size(max = 40)
    @Column(name = "tipo_zapato")
    private String tipoZapato;

    public Zapato() {
    }

    public Zapato(Integer idZapato) {
        this.idZapato = idZapato;
    }

    public Integer getIdZapato() {
        return idZapato;
    }

    public void setIdZapato(Integer idZapato) {
        this.idZapato = idZapato;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Float costoTotal) {
        this.costoTotal = costoTotal;
    }

    public String getTipoZapato() {
        return tipoZapato;
    }

    public void setTipoZapato(String tipoZapato) {
        this.tipoZapato = tipoZapato;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idZapato != null ? idZapato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zapato)) {
            return false;
        }
        Zapato other = (Zapato) object;
        if ((this.idZapato == null && other.idZapato != null) || (this.idZapato != null && !this.idZapato.equals(other.idZapato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.m5a.ProyectoM5A0150919751.modelo.Zapato[ idZapato=" + idZapato + " ]";
    }
    
}
