/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uis.edu.entornos.productos.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uis.edu.entornos.productos.modelo.Proveedor;
import uis.edu.entornos.productos.servicio.ProveedorService;

/**
 *
 * @author Karolina Aponte
 */
@RestController
@RequestMapping("/api/proveedor")
public class ProveedorControlador {
    
    @Autowired
    ProveedorService proveedorService;
    
    
    @GetMapping("/List")
    public List<Proveedor> cargarProveedor(){
        return proveedorService.getProveedor();
    }
    
    @GetMapping("/List/{id}")
    public Proveedor buscarPorId(@PathVariable Long id){
        return proveedorService.buscarProveedor(id); 
    }
    
    @PostMapping("/")
    public ResponseEntity<Proveedor> agregar(@RequestBody Proveedor proveedor){
        Proveedor obj = proveedorService.nuevoProveedor(proveedor);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    //Actualizar 
    @PutMapping("/{id}")
    public ResponseEntity<Proveedor> editar(@PathVariable Long id, @RequestBody Proveedor proveedor){
        Proveedor obj = proveedorService.buscarProveedor(id);
        if (obj != null) {
            //obj.setId(proveedor.getId());
            obj.setCiudad(proveedor.getCiudad());
            obj.setDireccion(proveedor.getDireccion());
            obj.setNombre(proveedor.getNombre());
            obj.setTelefono(proveedor.getTelefono());
            obj.setNit(proveedor.getNit());
            
            Proveedor proveedorActualizado = proveedorService.editarProveedor(obj);
            return new ResponseEntity<>(proveedorActualizado, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    //Eliminar usuario
    @DeleteMapping("/{id}")
    public ResponseEntity<Proveedor> eliminar(@PathVariable Long id){
        Proveedor obj = proveedorService.buscarProveedor(id);
        if (obj!=null) {
            proveedorService.borrarProveedor(id);
        } else {
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
}
