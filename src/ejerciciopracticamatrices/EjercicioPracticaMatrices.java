package ejerciciopracticamatrices;

import java.util.Scanner;

public class EjercicioPracticaMatrices {

    public static void main(String[] args) {
        // TODO code application logic here
        /*
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
         */
     
        Double matriz[][] = new Double[4][4];
        Double suma = 0.0;
        Scanner teclado = new Scanner(System.in);

        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 3; c++) {

                System.out.println("Ingre el alumno n°: " + f);
                matriz[f][c] = teclado.nextDouble();
                suma = suma + matriz[f][c];

            }
            matriz[f][3] = suma / 3;
            suma = 0.0;
        }

        for (int f = 0; f < 4; f++) {
            System.out.println("La notas del alumno N°: " + f);
            for (int c = 0; c < 3; c++) {
                System.out.println("Nota N° " + c + " " + matriz[f][c]);

            }
            System.out.println("El promedio de las notas es: " + matriz[f][3]);
        }
    }
}
