/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package uis.edu.entornos.productos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import uis.edu.entornos.productos.modelo.Producto;

/**
 *
 * @author Karolina Aponte
 */
public interface ProductoRepositorio extends JpaRepository<Producto, Long>{
    
}
