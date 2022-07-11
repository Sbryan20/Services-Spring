/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.m5a.ProyectoM5A0150919751.repository;


import com.m5a.ProyectoM5A0150919751.modelo.Equipogps;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author bryte
 */
public interface EquipoGpsRepository extends JpaRepository<Equipogps, Integer>{
    
    @Query(value = "Select * from equipogps e where e.imei = :imei",nativeQuery=true)
    public Equipogps BuscarCodigo(String imei);
}
