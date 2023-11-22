
package com.iudigital.trabajo2hilos;

import java.util.ArrayList;
import java.util.List;


public class Supermercado {

    public static void main(String[] args) {
        Producto producto1 = new Producto("Leche", 2.5);
        Producto producto2 = new Producto("Pan", 1.0);
        Producto producto3 = new Producto("Huevos", 3.0);

        Cliente cliente1 = new Cliente("Cliente 1");
        cliente1.agregarProducto(producto1);
        cliente1.agregarProducto(producto2);

        Cliente cliente2 = new Cliente("Cliente 2");
        cliente2.agregarProducto(producto2);
        cliente2.agregarProducto(producto3);

        Cajera cajera1 = new Cajera("Cajera 1", cliente1);
        Cajera cajera2 = new Cajera("Cajera 2", cliente2);

        cajera1.start();
        cajera2.start();

        try {
            cajera1.join();
            cajera2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
    

  

