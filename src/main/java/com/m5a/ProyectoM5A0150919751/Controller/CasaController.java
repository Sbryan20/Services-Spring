/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.m5a.ProyectoM5A0150919751.Controller;


import com.m5a.ProyectoM5A0150919751.modelo.Casa;
import com.m5a.ProyectoM5A0150919751.service.CasaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("/api/casa")
public class CasaController {
    
    @Autowired
    private CasaService Casaservice;
    
    //crear
    @PostMapping("/create")
    @ResponseStatus (HttpStatus.CREATED)
    public Casa create(@RequestBody Casa c){
        return Casaservice.save(c);
    }
    
    //busca id
    @GetMapping("/search/{id}")
    public Casa Search(@PathVariable int id){
        Casa casa=new Casa();
        casa=Casaservice.findById(id);
        float costototal=casa.getArea()*80;
        casa.setCostoTotal(costototal);
        return casa;
    }
    
     //lista
    @GetMapping("/list")
    public List<Casa>list(){
        List<Casa> recibe=Casaservice.findByAll();
        List<Casa> envia=new ArrayList<>();
        for (Casa casa : recibe) {
            float costototal=casa.getArea()*80;
            casa.setCostoTotal(costototal);
            envia.add(casa);
        }
        return envia;
    }
    
    //eliminar
    @DeleteMapping("/delet/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        Casaservice.delete(id);
    }
    
    //editar
    @PutMapping("edit/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Casa update(@RequestBody Casa c, @PathVariable int id){
        Casa ca=Casaservice.findById(id);
        ca.setPropietario(c.getPropietario());
        ca.setArea(c.getArea());
        ca.setTipoTerreno(c.getTipoTerreno());
        ca.setCodigo(c.getCodigo());
        return Casaservice.save(ca);
        
    }
    
    //busca codigo
    @GetMapping("/searchCo/{codigo}")
    public Casa buscarcodigo(@PathVariable String codigo){
        Casa casa=new Casa();
        casa=Casaservice.BuscarCodigo(codigo);
        float costototal=casa.getArea()*80;
        casa.setCostoTotal(costototal);
        return casa;
    }
    
    
}
