/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uis.edu.entornos.productos.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *
 * @author Karolina Aponte
 */
@Entity
@Table(name = Producto.TABLE_NAME)
public class Producto {
    public static final String TABLE_NAME = "productos";
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    //Relacion de muchos a uno entre usuario y tipodocumento 
    @ManyToOne
    @JoinColumn(name = "idProveedor")
    private Proveedor proveedor;
    
    @Column(name = "ivaCompra")
    private Double ivaCompra;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "precioCompra")
    private Double precioCompra;
    @Column(name = "precioVenta")
    private Double precioVenta;

    public Producto() {
    }

    public Producto(Long id, Proveedor proveedor, Double ivaCompra, String nombre, Double precioCompra, Double precioVenta) {
        this.id = id;
        this.proveedor = proveedor;
        this.ivaCompra = ivaCompra;
        this.nombre = nombre;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Double getIvaCompra() {
        return ivaCompra;
    }

    public void setIvaCompra(Double ivaCompra) {
        this.ivaCompra = ivaCompra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    
    
    
}
