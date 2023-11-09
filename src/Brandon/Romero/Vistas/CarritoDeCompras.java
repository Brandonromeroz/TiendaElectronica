package Brandon.Romero.Vistas;

import Brandon.Romero.Productos.Productos;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {
    private List<CarritoItem> items;
    private String nombre;

    public CarritoDeCompras() {
        items = new ArrayList<>();
    }

    public void agregarProducto(Productos productos, double precio) {
        items.add(new CarritoItem(nombre, precio,productos));
    }

    public void verCarrito() {
        if (items.isEmpty()) {
            System.out.println("El carrito de compras está vacío.");
        } else {
            System.out.println("Productos en el carrito:");
            for (int i = 0; i < items.size(); i++) {
                CarritoItem item = items.get(i);
                System.out.printf("%d) %s - %.2f%n", i + 1, item.getNombre(), item.getPrecio());
            }
        }
    }

    public void eliminarProducto(int indice) {
        if (indice >= 0 && indice < items.size()) {
            items.remove(indice);
            System.out.println("Producto eliminado del carrito.");
        } else {
            System.out.println("Índice de producto no válido. No se eliminó ningún producto.");
        }
    }




    private static class CarritoItem {
        private String nombre;
        private double precio;

        public CarritoItem(String nombre, double precio, Productos productos) {
            this.nombre = nombre;
            this.precio = precio;
        }

        public String getNombre() {
            return nombre;
        }

        public double getPrecio() {
            return precio;
        }
    }
}