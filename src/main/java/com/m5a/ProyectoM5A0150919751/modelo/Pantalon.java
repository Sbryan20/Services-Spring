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
import javax.transaction.Transactional;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;

/**
 *
 * @author bryte
 */
@Entity
@Table(name = "pantalon")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pantalon.findAll", query = "SELECT p FROM Pantalon p"),
    @NamedQuery(name = "Pantalon.findByIdPantalon", query = "SELECT p FROM Pantalon p WHERE p.idPantalon = :idPantalon"),
    @NamedQuery(name = "Pantalon.findByMarca", query = "SELECT p FROM Pantalon p WHERE p.marca = :marca"),
    @NamedQuery(name = "Pantalon.findByModelo", query = "SELECT p FROM Pantalon p WHERE p.modelo = :modelo"),
    @NamedQuery(name = "Pantalon.findByFabricante", query = "SELECT p FROM Pantalon p WHERE p.fabricante = :fabricante"),
    @NamedQuery(name = "Pantalon.findByCodigo", query = "SELECT p FROM Pantalon p WHERE p.codigo = :codigo"),
    @NamedQuery(name = "Pantalon.findByCosto", query = "SELECT p FROM Pantalon p WHERE p.costo = :costo"),
    @NamedQuery(name = "Pantalon.findByCantidad", query = "SELECT p FROM Pantalon p WHERE p.cantidad = :cantidad"),
    @NamedQuery(name = "Pantalon.findByCostoTotal", query = "SELECT p FROM Pantalon p WHERE p.costoTotal = :costoTotal"),
    @NamedQuery(name = "Pantalon.findByOrigen", query = "SELECT p FROM Pantalon p WHERE p.origen = :origen")})
public class Pantalon implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pantalon")
    private Integer idPantalon;
    @Size(max = 40)
    @Column(name = "marca")
    private String marca;
    @Size(max = 40)
    @Column(name = "modelo")
    private String modelo;
    @Size(max = 40)
    @Column(name = "fabricante")
    private String fabricante;
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
    @Column(name = "origen")
    private String origen;

    public Pantalon() {
    }

    public Pantalon(Integer idPantalon) {
        this.idPantalon = idPantalon;
    }

    public Integer getIdPantalon() {
        return idPantalon;
    }

    public void setIdPantalon(Integer idPantalon) {
        this.idPantalon = idPantalon;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
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

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPantalon != null ? idPantalon.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pantalon)) {
            return false;
        }
        Pantalon other = (Pantalon) object;
        if ((this.idPantalon == null && other.idPantalon != null) || (this.idPantalon != null && !this.idPantalon.equals(other.idPantalon))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.m5a.ProyectoM5A0150919751.modelo.Pantalon[ idPantalon=" + idPantalon + " ]";
    }
    
}
