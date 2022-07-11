/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.m5a.ProyectoM5A0150919751.service;


import com.m5a.ProyectoM5A0150919751.modelo.Pantalon;
import java.util.List;

/**
 *
 * @author bryte
 */
public interface PantalonService {

    public Pantalon save(Pantalon p);

    public Pantalon findById(int id);

    public List<Pantalon> findByAll();

    public void delete(int id);
    
    public Pantalon BuscarCodigo(String codigo);
}
