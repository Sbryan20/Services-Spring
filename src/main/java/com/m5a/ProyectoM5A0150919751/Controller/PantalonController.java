/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.m5a.ProyectoM5A0150919751.Controller;


import com.m5a.ProyectoM5A0150919751.modelo.Pantalon;
import com.m5a.ProyectoM5A0150919751.service.PantalonService;
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
@RequestMapping("/api/pantalon")
public class PantalonController {
    
    @Autowired
    private PantalonService Pantalonservice;
     
    //crear
    @PostMapping("/create")
    @ResponseStatus (HttpStatus.CREATED)
    public Pantalon create(@RequestBody Pantalon p){
        return Pantalonservice.save(p);
    }
    
    //busca id
    @GetMapping("/search/{id}")
    public Pantalon Search(@PathVariable int id){
        Pantalon pantalon=new Pantalon();
        pantalon=Pantalonservice.findById(id);
        float costototal=pantalon.getCosto()*pantalon.getCantidad();
        pantalon.setCostoTotal(costototal);
        return pantalon;
    }
    
     //lista
    @GetMapping("/list")
    public List<Pantalon>list(){
        List<Pantalon> recibe=Pantalonservice.findByAll();
        List<Pantalon> envia=new ArrayList<>();
        for (Pantalon pantalon : recibe) {
            float costototal=pantalon.getCantidad()*pantalon.getCosto();
            pantalon.setCostoTotal(costototal);
            envia.add(pantalon);
        }
        return envia;
    }
    
    //eliminar
    @DeleteMapping("/delet/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        Pantalonservice.delete(id);
    }
    
    //editar
    @PutMapping("edit/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Pantalon update(@RequestBody Pantalon p, @PathVariable int id){
        Pantalon pa=Pantalonservice.findById(id);
        pa.setModelo(p.getModelo());
        pa.setMarca(p.getMarca());
        pa.setFabricante(p.getFabricante());
        pa.setCodigo(p.getCodigo());
        pa.setCosto(p.getCosto());
        pa.setCantidad(p.getCantidad());
        pa.setOrigen(p.getOrigen());
        return Pantalonservice.save(pa);
        
    }
    
    //busca codigo
    @GetMapping("/searchCo/{codigo}")
    public Pantalon buscarcodigo(@PathVariable String codigo){
        Pantalon pantalon=new Pantalon();
        pantalon=Pantalonservice.BuscarCodigo(codigo);
        float costototal=pantalon.getCantidad()*pantalon.getCosto();
        pantalon.setCostoTotal(costototal);
        return pantalon;
    }
}
