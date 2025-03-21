/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package uis.edu.entornos.productos.servicio;

import java.util.List;
import uis.edu.entornos.productos.modelo.Producto;

/**
 *
 * @author Karolina Aponte
 */
public interface IProductoService {
    //Listar Todos
    List<Producto> getProducto();
    
    //buscar por llaves 
    Producto buscarProducto(Long id);
    
    //Crear registro u objeto
    Producto nuevoProducto(Producto producto);
    
    //Actualizar registro u objeto
    Producto editarProducto(Producto producto);
    
    //Eliminar un objeto
    int borrarProducto(Long id);
}
