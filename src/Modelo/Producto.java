/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author juanch0x
 */
public class Producto {
    
private long codigo;
private String nombre;
private float precio_v;
private float precio_c;
private int id_producto;
private int cantidad;
private int id_categoria;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio_v() {
        return precio_v;
    }

    public void setPrecio_v(float precio_v) {
        this.precio_v = precio_v;
    }

    public float getPrecio_c() {
        return precio_c;
    }

    public void setPrecio_c(float precio_c) {
        this.precio_c = precio_c;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }


}