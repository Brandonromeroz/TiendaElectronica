package Brandon.Romero.Vistas;

import Brandon.Romero.Productos.*;

import java.util.Scanner;

public class Menu {
    private  static Scanner scanner = new Scanner(System.in);
    public static  int mostrar(String texto){
        System.out.println(texto);
        System.out.print(":");
        return scanner.nextInt();

    }


    public static int getOpcion() {

        int opcion =0;
        System.out.println(Texto.MenuPrincipal);
        opcion = scanner.nextInt();
        return opcion;


    }

    public static double seleccionarOpcion(int opcion,  CarritoDeCompras carrito ) {
        int marca= 1;
        double precio = 0;
        switch (opcion){
            case 1:

                marca = mostrar(Texto.menucomputadoras);
                Productos laptop = new Laptop(marca);
                precio = laptop.calacularPrecio();
                carrito.agregarProducto(laptop, precio); // Agregamos el producto al carrito
                System.out.printf("Laptop: %.2f%n",precio);
                break;
            case 2:
                marca = mostrar(Texto.menucomputadoras);
                Productos  pc = new PC(marca);
                precio = pc.calacularPrecio();
                carrito.agregarProducto(pc, precio);
                System.out.printf("PC: %.2f%n",precio);

                break;
            case 3:
                marca = mostrar(Texto.menuTabletas);
                Productos  tableta = new Tableta(marca);
                precio = tableta.calacularPrecio();
                System.out.printf("tableta: %.2f%n",precio);

                break;
            case 4:
                marca = mostrar(Texto.menuTelefono);
                Productos  telefono = new Telefono(marca);
                precio = telefono.calacularPrecio();
                System.out.printf("Telefono: %.2f%n",precio);

                break;
            case 5:
                marca = mostrar(Texto.menuNotebooks);
                Productos  noteBooks = new NoteBook(marca);
                precio = noteBooks.calacularPrecio();
                System.out.printf("PC: %.2f%n",precio);

                break;
            case 6:
                marca = mostrar(Texto.menuMemorias);
                Productos  memoria = new Memoria(marca);
                precio = memoria.calacularPrecio();
                System.out.printf("PC: %.2f%n",precio);

                break;

            case  7:
                marca = mostrar(Texto.menuAudifonos);
                Productos  audifonos = new Adufinos(marca);
                precio = audifonos.calacularPrecio();
                System.out.printf("PC: %.2f%n",precio);


                break;
            case 8:
                carrito.verCarrito(); // Mostrar los productos en el carrito

                break;
            default:
                Menu.mostrar(Texto.MenuPrincipal);
        }
        return precio;
    }


}
