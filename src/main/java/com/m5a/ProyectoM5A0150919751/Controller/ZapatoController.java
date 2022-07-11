/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.m5a.ProyectoM5A0150919751.Controller;


import com.m5a.ProyectoM5A0150919751.modelo.Zapato;
import com.m5a.ProyectoM5A0150919751.service.ZapatoService;
import java.util.ArrayList;
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
@RequestMapping("/api/zapato")
public class ZapatoController {
    
    @Autowired
    private ZapatoService Zapatoservice;
    //crear
    @PostMapping("/create")
    @ResponseStatus (HttpStatus.CREATED)
    public Zapato create(@RequestBody Zapato c){
        return Zapatoservice.save(c);
    }
    
    //busca id
    @GetMapping("/search/{id}")
    public Zapato Search(@PathVariable int id){
        Zapato zapato=new Zapato();
        zapato=Zapatoservice.findById(id);
        float costototal=zapato.getCosto()*zapato.getCantidad();
        zapato.setCostoTotal(costototal);
        return zapato;
    }
    
     //lista
    @GetMapping("/list")
    public List<Zapato>list(){
        List<Zapato> recibe=Zapatoservice.findByAll();
        List<Zapato> envia=new ArrayList<>();
        for (Zapato zapato : recibe) {
            float costototal=zapato.getCantidad()*zapato.getCosto();
            zapato.setCostoTotal(costototal);
            envia.add(zapato);
        }
        return envia;
    }
    
    //eliminar
    @DeleteMapping("/delet/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        Zapatoservice.delete(id);
    }
    
    //editar
    @PutMapping("edit/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Zapato update(@RequestBody Zapato z, @PathVariable int id){
        Zapato za=Zapatoservice.findById(id);
        za.setMarca(z.getMarca());
        za.setCodigo(z.getCodigo());
        za.setCosto(z.getCosto());
        za.setCantidad(z.getCantidad());
        za.setTipoZapato(z.getTipoZapato());
        return Zapatoservice.save(za);
        
    }
    
    //busca codigo
    @GetMapping("/searchCo/{codigo}")
    public Zapato buscarcodigo(@PathVariable String codigo){
        Zapato zapato=new Zapato();
        zapato=Zapatoservice.BuscarCodigo(codigo);
        float costototal=zapato.getCosto()*zapato.getCantidad();
        zapato.setCostoTotal(costototal);
        return zapato;
    }
}
