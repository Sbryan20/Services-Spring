/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.m5a.ProyectoM5A0150919751.service;


import com.m5a.ProyectoM5A0150919751.modelo.Zapato;
import java.util.List;

/**
 *
 * @author bryte
 */
public interface ZapatoService {

    public Zapato save(Zapato z);

    public Zapato findById(int id);

    public List<Zapato> findByAll();

    public void delete(int id);
    
    public Zapato BuscarCodigo(String codigo);
}
