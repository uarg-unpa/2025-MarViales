package tp1;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un dia de la semana (L, M, X, J, V)");
        String dia = scanner.nextLine().toUpperCase();

        switch (dia) {
            case "M":
            case "X":
            case "J":
            System.out.println("Hoy tengo resolucion");
            break;
            case "L":
            case "V":
            System.out.println("Hoy no tengo resolucion");
            break;
        default:
            System.out.println("La letra ingresa no es valida para la semana");
    scanner.close();
        }
    }
}