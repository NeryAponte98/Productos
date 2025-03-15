/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uis.edu.entornos.productos.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uis.edu.entornos.productos.modelo.Proveedor;
import uis.edu.entornos.productos.repositorio.ProveedorRepositorio;

/**
 *
 * @author Karolina Aponte
 */
@Service
@Transactional
public class ProveedorService implements IProveedorService{
    
    //Atributo del repositorio
    @Autowired
   ProveedorRepositorio proveedorRepositorio;

    @Override
    public List<Proveedor> getProveedor() {
        return proveedorRepositorio.findAll();
    }

    @Override
    public Proveedor buscarProveedor(Long id) {
        Proveedor proveedor = null;
        proveedor = proveedorRepositorio.findById(id).orElse(null);
        if (proveedor == null) {
            return null;
        }
        return proveedor;
    }

    @Override
    public Proveedor nuevoProveedor(Proveedor proveedor) {
        return proveedorRepositorio.save(proveedor);
    }

    @Override
    public int borrarProveedor(Long id) {
        proveedorRepositorio.deleteById(id);
        return 1;
    }
    
}
