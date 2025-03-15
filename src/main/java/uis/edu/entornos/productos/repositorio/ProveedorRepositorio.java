/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package uis.edu.entornos.productos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import uis.edu.entornos.productos.modelo.Proveedor;

/**
 *
 * @author Karolina Aponte
 */
public interface ProveedorRepositorio extends JpaRepository<Proveedor, Long>{
    
}
