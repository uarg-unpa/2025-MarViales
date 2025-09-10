package practica;
public class Jardinería {
public static void main (String [] args) {

Planta p1 = new Planta("Aloe Vera", "interior", 70, 15.5);
Planta p2 = new Planta("Jazmin", "exterior", 11, 65.9);

p1.crecer(2.0);
System.out.println(p1);


System.out.println(p2);
                }
}