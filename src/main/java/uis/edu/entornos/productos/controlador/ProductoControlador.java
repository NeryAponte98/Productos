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
import uis.edu.entornos.productos.modelo.Producto;
import uis.edu.entornos.productos.servicio.ProductoService;

/**
 *
 * @author Karolina Aponte
 */
@RestController
@RequestMapping("/api/producto")
public class ProductoControlador {
    
    @Autowired
    ProductoService productoService;
    
    @GetMapping("/List")
    public List<Producto> cargarUsuarios(){
        return productoService.getProducto();
    }
    
    @GetMapping("/List/{id}")
    public Producto buscarPorId(@PathVariable Long id){
        return productoService.buscarProducto(id); 
    }
    
    @PostMapping("/")
    public ResponseEntity<Producto> agregar(@RequestBody Producto producto){
        Producto obj = productoService.nuevoProducto(producto);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    //Actualizar usuario
    @PutMapping("/")
    public ResponseEntity<Producto> editar(@RequestBody Producto producto){
        Producto obj = productoService.buscarProducto(producto.getId());
        if (obj != null) {
            obj.setId(producto.getId());
            obj.setProveedor(producto.getProveedor());
            obj.setIvaCompra(producto.getIvaCompra());
            obj.setNombre(producto.getNombre());
            obj.setPrecioCompra(producto.getPrecioCompra());
            obj.setPrecioVenta(producto.getPrecioVenta());
        }else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    //Eliminar usuario
    @DeleteMapping("/{id}")
    public ResponseEntity<Producto> eliminar(@PathVariable Long id){
        Producto obj = productoService.buscarProducto(id);
        if (obj!=null) {
            productoService.borrarProducto(id);
        } else {
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
}
