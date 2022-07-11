/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.m5a.ProyectoM5A0150919751.service;


import com.m5a.ProyectoM5A0150919751.modelo.Equipogps;
import com.m5a.ProyectoM5A0150919751.repository.EquipoGpsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author bryte
 */
@Service
public class EquipoGpsServiceImpl implements EquipoGpsService{

    @Autowired
    private EquipoGpsRepository Equiposrepository;
    
    //crear
    @Override
    public Equipogps save(Equipogps e) {
        return Equiposrepository.save(e);
    }

    //buscar id
    @Override
    public Equipogps findById(int id) {
        return Equiposrepository.findById(id).orElse(null);
    }

    //listar
    @Override
    public List<Equipogps> findByAll() {
        return Equiposrepository.findAll();
    }

    @Override
    public void delete(int id) {
        Equiposrepository.deleteById(id);
    }

    @Override
    public Equipogps BuscarCodigo(String imei) {
        return Equiposrepository.BuscarCodigo(imei);
    }
    
}
