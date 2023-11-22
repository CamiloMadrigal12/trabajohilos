package com.iudigital.trabajo2hilos;

import java.util.ArrayList;
import java.util.List;

class Cajera extends Thread {
    String nombre;
    Cliente cliente;

    public Cajera(String nombre, Cliente cliente) {
        this.nombre = nombre;
        this.cliente = cliente;
    }

    @Override
    public void run() {
        cobrar(cliente);
    }

    public void cobrar(Cliente cliente) {
        System.out.println("Cajera " + nombre + " está cobrando a " + cliente.nombre);

        long tiempoInicio = System.currentTimeMillis();

        for (Producto producto : cliente.productos) {
            System.out.println("Procesando producto: " + producto.nombre);
           
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long tiempoFin = System.currentTimeMillis();
        long tiempoTotal = tiempoFin - tiempoInicio;

        System.out.println("Cobro completado para " + cliente.nombre + ". Tiempo total: " + tiempoTotal + " ms\n");
    }
}
