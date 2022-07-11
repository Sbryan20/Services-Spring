/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.m5a.ProyectoM5A0150919751.service;


import com.m5a.ProyectoM5A0150919751.modelo.Zapato;
import com.m5a.ProyectoM5A0150919751.repository.ZapatoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author bryte
 */

@Service
public class ZapatoServiceImpl implements ZapatoService{
    
    @Autowired
    private ZapatoRepository Zapatorepository;

    //crear
    @Override
    public Zapato save(Zapato z) {
        return Zapatorepository.save(z);
    }

    //buscar id
    @Override
    public Zapato findById(int id) {
        return Zapatorepository.findById(id).orElse(null);
    }

    //lista
    @Override
    public List<Zapato> findByAll() {
        return Zapatorepository.findAll();
    }

    //eliminar
    @Override
    public void delete(int id) {
        Zapatorepository.deleteById(id);
    }

    @Override
    public Zapato BuscarCodigo(String codigo) {
        return Zapatorepository.BuscarCodigo(codigo);
    }
    
    
}
