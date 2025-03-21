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
import java.math.BigDecimal;

/**
 *
 * @author Karolina Aponte
 */
@Entity
@Table(name = Producto.TABLE_NAME)
public class Producto {
    public static final String TABLE_NAME = "producto";
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    //Relacion de muchos a uno entre usuario y tipodocumento 
    @ManyToOne
    @JoinColumn(name = "idProveedor")
    private Proveedor idProveedor;
    
    @Column(name = "ivaCompra")
    private BigDecimal ivaCompra;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "precioCompra")
    private BigDecimal precioCompra;
    @Column(name = "precioVenta")
    private BigDecimal precioVenta;

    public Producto() {
    }

    public Producto(Long id, Proveedor idProveedor, BigDecimal ivaCompra, String nombre, BigDecimal precioCompra, BigDecimal precioVenta) {
        this.id = id;
        this.idProveedor = idProveedor;
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

    public Proveedor getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Proveedor idProveedor) {
        this.idProveedor = idProveedor;
    }

    public BigDecimal getIvaCompra() {
        return ivaCompra;
    }

    public void setIvaCompra(BigDecimal ivaCompra) {
        this.ivaCompra = ivaCompra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(BigDecimal precioCompra) {
        this.precioCompra = precioCompra;
    }

    public BigDecimal getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    


}
