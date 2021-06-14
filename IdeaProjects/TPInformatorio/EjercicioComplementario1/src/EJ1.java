import javax.swing.*;
import java.util.Scanner;

public class EJ1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //Se pide por consola el nombre
        System.out.println("Escriba su nombre completo: ");
        //Se guarda el nombre
        String nombre = scan.nextLine();
        //Se imprime con un saludo
        System.out.println("HOLA " + nombre);

        //ej 2

        int a = 4, b = 5;
        int suma = a + b;
        int resta = b - a;
        int mult = a * b;
        int div = b / a;
        int resto = b % a;
        System.out.println("4 + 5 = " + suma);
        System.out.println("5 - 1 = " + resta);
        System.out.println("5 * 4 = " + mult);
        System.out.println("5 / 4 = " + div);
        System.out.println("5 % 4 = " + resto);

        //ej 3
            System.out.println("Escriba una altura: ");
            String texto = scan.nextLine();
            int altura = Integer.parseInt(texto);
            escaleraNum(altura);

    }

    private static void escaleraNum(int altura) {
        for (int numero = 1; numero <= altura; numero++) {
            //Este bucle muestra los numeros en cada fila
            for (int i = 1; i <= numero; i++) {
                System.out.print(i);
            }
            //Saltamos de linea
            System.out.println("");
        }
    }
}