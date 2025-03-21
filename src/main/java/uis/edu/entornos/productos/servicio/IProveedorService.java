/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package uis.edu.entornos.productos.servicio;

import java.util.List;
import uis.edu.entornos.productos.modelo.Proveedor;

/**
 *
 * @author Karolina Aponte
 */
public interface IProveedorService {
    
    //Listar Todos
    List<Proveedor> getProveedor();
    
    //buscar por llaves 
    Proveedor buscarProveedor(Long id);
    
    //Crear registro u objeto
    Proveedor nuevoProveedor(Proveedor proveedor);
    
    //Actualizar registro u objeto
    Proveedor editarProveedor(Proveedor proveedor);
    
    //Eliminar un objeto
    int borrarProveedor(Long id);
    
}
