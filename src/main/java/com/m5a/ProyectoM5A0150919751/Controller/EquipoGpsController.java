/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.m5a.ProyectoM5A0150919751.Controller;


import com.m5a.ProyectoM5A0150919751.modelo.Equipogps;
import com.m5a.ProyectoM5A0150919751.service.EquipoGpsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bryte
 */
@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api/equipo")
public class EquipoGpsController {
    
    @Autowired
    private EquipoGpsService Equiposervice;
    //crear
    @PostMapping("/create")
    @ResponseStatus (HttpStatus.CREATED)
    public Equipogps create(@RequestBody Equipogps c){
        return Equiposervice.save(c);
    }
    
    //busca id
    @GetMapping("/search/{id}")
    public Equipogps Search(@PathVariable int id){
        return Equiposervice.findById(id);
    }
    
     //lista
    @GetMapping("/list")
    public List<Equipogps>list(){
        return Equiposervice.findByAll();
    }
    
    //eliminar
    @DeleteMapping("/delet/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        Equiposervice.delete(id);
    }
    
    //editar
    @PutMapping("edit/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Equipogps update(@RequestBody Equipogps e, @PathVariable int id){
        Equipogps eq=Equiposervice.findById(id);
        eq.setEquipo(e.getEquipo());
        eq.setImei(e.getImei());
        eq.setNumeroChip(e.getNumeroChip());
        eq.setSerie(e.getSerie());
        eq.setCosto(e.getCosto());
        eq.setObservacion(e.getObservacion());
        return Equiposervice.save(eq);
        
    }
    
    //buscar codigo
    @GetMapping("searchCo/{imei}")
    public Equipogps buscarcodigo(@PathVariable String imei){
        return Equiposervice.BuscarCodigo(imei);
    }
}
