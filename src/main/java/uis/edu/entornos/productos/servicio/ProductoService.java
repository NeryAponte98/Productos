/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uis.edu.entornos.productos.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uis.edu.entornos.productos.modelo.Producto;
import uis.edu.entornos.productos.repositorio.ProductoRepositorio;

/**
 *
 * @author Karolina Aponte
 */
@Service
@Transactional
public class ProductoService implements IProductoService{

    //Atributo del repositorio
    @Autowired
    ProductoRepositorio productoRepositorio;
    
    @Override
    public List<Producto> getProducto() {
        return productoRepositorio.findAll();
    }

    @Override
    public Producto buscarProducto(Long id) {
        Producto producto = null;
        producto = productoRepositorio.findById(id).orElse(null);
        if (producto == null) {
            return null;
        }
        return producto;
    }

    @Override
    public Producto nuevoProducto(Producto producto) {
        return productoRepositorio.save(producto);
    }

    @Override
    public int borrarProducto(Long id) {
        productoRepositorio.deleteById(id);
        return 1;
    }
    
}
