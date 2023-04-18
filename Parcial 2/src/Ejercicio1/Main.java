package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        ServicioPeluqueria corte = ServicioPeluqueria.CORTE;
        ServicioPeluqueria unas = ServicioPeluqueria.UNAS;
        ServicioPeluqueria tinte = ServicioPeluqueria.TINTE;

        System.out.println(corte.getNombre() + ": " + corte.getDescripcion());
        System.out.println("Precio: $" + corte.getPrecio());

        System.out.println(unas.getNombre() + ": " + unas.getDescripcion());
        System.out.println("Precio: $" + unas.getPrecio());

        System.out.println(tinte.getNombre() + ": " + tinte.getDescripcion());
        System.out.println("Precio: $" + tinte.getPrecio());
    }
}