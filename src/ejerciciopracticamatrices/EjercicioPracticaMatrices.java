package ejerciciopracticamatrices;

import java.util.Scanner;

public class EjercicioPracticaMatrices {

    public static void main(String[] args) {
        // TODO code application logic here
        int vector[] = new int[15];

        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 15; i++) {
            System.out.println("Ingrese un numero para el vector");
            vector[i] = teclado.nextInt();
        }

        int contador = 0;
        for (int i = 0; i < 15; i++) {
            if (vector[i] == 3) {
                contador = contador + 1;
            }
        }
        System.out.println("La cantidad de 3 que ahi dentro del vector es: "+ contador);
    }
}
