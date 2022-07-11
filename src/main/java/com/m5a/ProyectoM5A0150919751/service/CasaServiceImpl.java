/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.m5a.ProyectoM5A0150919751.service;


import com.m5a.ProyectoM5A0150919751.modelo.Casa;
import com.m5a.ProyectoM5A0150919751.repository.CasaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author bryte
 */
@Service
public class CasaServiceImpl implements CasaService{
    
    @Autowired
    private CasaRepository Casarepository;

    //crear
    @Override
    public Casa save(Casa c) {
        return Casarepository.save(c);
    }

    //buscar id
    @Override
    public Casa findById(int id) {
        return Casarepository.findById(id).orElse(null);
    }

    //listar
    @Override
    public List<Casa> findByAll() {
        return Casarepository.findAll();
    }

    //eliminar
    @Override
    public void delete(int id) {
        Casarepository.deleteById(id);
    }

    @Override
    public Casa BuscarCodigo(String codigo) {
        return Casarepository.BuscarCodigo(codigo);
    }

    
    
    
}
