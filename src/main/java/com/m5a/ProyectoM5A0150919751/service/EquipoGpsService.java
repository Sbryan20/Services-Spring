/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.m5a.ProyectoM5A0150919751.service;


import com.m5a.ProyectoM5A0150919751.modelo.Equipogps;
import java.util.List;

/**
 *
 * @author bryte
 */
public interface EquipoGpsService {
    
    public Equipogps save(Equipogps e);
    public Equipogps findById(int id);
    public List<Equipogps> findByAll();
    public void delete (int id);
    
    public Equipogps BuscarCodigo(String imei);
}
