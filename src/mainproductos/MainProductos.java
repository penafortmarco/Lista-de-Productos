package mainproductos;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProductos {

    public static void main(String[] args) {

        String nombre;
        int codigo;
        int stock;
        int opciones = 0;

        ArrayList<Producto> ListaProductos = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        do {
            try {
                do {
                    Producto.mostrarMenu();
                    opciones = in.nextInt();
                } while (opciones < 1 || opciones > 4);
            } catch (Exception e) {
                System.out.println("No ingresó un tipo de dato válido.");
            }
            Producto.espaciar();
            switch (opciones) {
                case 1:try {
                    System.out.println("Ingrese el nombre del producto.");
                    nombre = in.next();
                    System.out.println("Ingrese el código del producto.");
                    codigo = in.nextInt();
                    System.out.println("Ingrese el stock del producto.");
                    stock = in.nextInt();
                    ListaProductos.add(new Producto(nombre, codigo, stock));
                } catch (Exception e) {
                    System.out.println("No ingresó un tipo de dato válido.");
                }
                Producto.espaciar();
                break;
                case 2:
                    System.out.println("--------------------------------------");
                    for (Producto i : ListaProductos) {
                        if (i.getStock() < 10) {
                            i.infoProducto();
                        }
                    }
                    break;
                case 3:
                    System.out.println("--------------------------------------");
                    for (Producto i : ListaProductos) {
                        i.infoProducto();
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("No es una opción válida.");
                    break;
            }
        } while (opciones != 4);
    }
}
