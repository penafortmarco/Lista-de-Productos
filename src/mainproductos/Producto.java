package mainproductos;

public class Producto {

    private String nombre;
    private int codigo;
    private int stock;

    public Producto(String nombre, int codigo, int stock) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getStock() {
        return stock;
    }

    public void infoProducto(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Código: "+getCodigo());
        System.out.println("Stock: "+getStock());
        System.out.println("--------------------------------------");
    }
    
    public static void mostrarMenu() {
        System.out.println("1-Cargar producto.");
        System.out.println("2-Mostrar productos. (Solo los que tienen menos de 10 en stock)");
        System.out.println("3-Mostrar todos.");
        System.out.println("4-Salir.");
    }
    public static void espaciar(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

}
