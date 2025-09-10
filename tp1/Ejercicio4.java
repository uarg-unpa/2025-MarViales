package tp1;
import java.util.Scanner;
public class Ejercicio4 {
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 3 numeros enteros distintos");

        int nro1 = scanner.nextInt();
        int nro2 = scanner.nextInt();
        int nro3 = scanner.nextInt();


        int mayor;

        if(nro1 > nro2 && nro1 > nro3){
                mayor = nro1;
        } else if (nro2 > nro1 && nro2 > nro3){
                mayor = nro2;
        } else {
                mayor = nro3;
        }
        
        System.out.println("El numero entero mayor es: "+mayor);

        scanner.close();
        
        }
}