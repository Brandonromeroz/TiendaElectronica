package Brandon.Romero.APP;
import Brandon.Romero.Vistas.CarritoDeCompras;
import Brandon.Romero.Vistas.Menu;
import Brandon.Romero.Vistas.Texto;

import java.util.Scanner;

public class TiendaElectonicaApp {
    public static void main(String[] args) {
        int opcion;
        double precio = 0;
        CarritoDeCompras carrito = new CarritoDeCompras(); // Creamos una instancia de CarritoDeCompras

        do {
            opcion = Menu.getOpcion();
            if (opcion != 10) {
                precio = Menu.seleccionarOpcion(opcion, carrito); // Pasamos el carrito a la función
                if (opcion != 8) {
                    System.out.printf("Precio: %.2f%n", precio);
                }
            }
        } while (opcion != 10);

        carrito.verCarrito(); // Mostrar los productos en el carrito antes de finalizar
        System.out.println(Texto.menuSalir);
}
    }








