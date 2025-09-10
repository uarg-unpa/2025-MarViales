package tp1;
public class Ejercicio3 {
    public static void main(String[] args) {
        int A = 1;
        int B = 2;
        int C = 3;

            System.out.println("Valores originales");
                System.out.println("A="+A+",B="+B+",C="+C);

                // variable auxiliar
                int auxiliar;
                auxiliar = C;
                B = A;
                C = A;
                A = auxiliar;

                //Mostrar valores cambiados
                    System.out.println("Valores cambiados");
                    System.out.println("A="+A+",B="+B+",C="+C);

    }
}
