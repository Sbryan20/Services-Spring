/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.m5a.ProyectoM5A0150919751.service;


import com.m5a.ProyectoM5A0150919751.modelo.Casa;
import java.util.List;

/**
 *
 * @author bryte
 */
public interface CasaService {

    public Casa save(Casa c);

    public Casa findById(int id);

    public List<Casa> findByAll();

    public void delete(int id);

    public Casa BuscarCodigo(String codigo);
    
   
}
