/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.m5a.ProyectoM5A0150919751.service;


import com.m5a.ProyectoM5A0150919751.modelo.Pantalon;
import com.m5a.ProyectoM5A0150919751.repository.PantalonRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author bryte
 */
@Service
public class PantalonServiceImpl implements PantalonService{
    
    @Autowired
    private PantalonRepository Pantalonrepository;

    //crear
    @Override
    public Pantalon save(Pantalon p) {
        return Pantalonrepository.save(p);
    }

    //buscar id
    @Override
    public Pantalon findById(int id) {
        return Pantalonrepository.findById(id).orElse(null);
    }

    //listar
    @Override
    public List<Pantalon> findByAll() {
        return Pantalonrepository.findAll();
    }

    //eliminar
    @Override
    public void delete(int id) {
        Pantalonrepository.deleteById(id);
    }

    @Override
    public Pantalon BuscarCodigo(String codigo) {
        return Pantalonrepository.BuscarCodigo(codigo);
    }
    
}
