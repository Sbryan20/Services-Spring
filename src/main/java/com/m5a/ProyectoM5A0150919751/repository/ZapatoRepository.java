/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.m5a.ProyectoM5A0150919751.repository;


import com.m5a.ProyectoM5A0150919751.modelo.Zapato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author bryte
 */
public interface ZapatoRepository extends JpaRepository<Zapato, Integer>{
    
    @Query(value = "Select * from zapato c where c.codigo = :codigo",nativeQuery=true)
    public Zapato BuscarCodigo(String codigo);
}
