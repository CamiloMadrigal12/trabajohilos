
package com.iudigital.trabajo2hilos;

import java.util.ArrayList;
import java.util.List;

class Cliente {
    String nombre;
    List<Producto> productos;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularCostoTotal() {
        double costoTotal = 0;
        for (Producto producto : productos) {
            costoTotal += producto.precio;
        }
        return costoTotal;
    }
}
