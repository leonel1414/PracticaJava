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

        String ciudades[] = new String[5];
        Double minimas[] = new Double[5];
        Double maximas[] = new Double[5];

        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);

        for (int i = 0; i < ciudades.length; i++) {
            System.out.println("Ingrese el nombre de la ciudad: " + i);
            ciudades[i] = teclado.next();

            System.out.println("Ingrese la temperatura minima: " + i);
            minimas[i] = teclado2.nextDouble();

            System.out.println("Ingrese la temperatura maxima: " + i);
            maximas[i] = teclado2.nextDouble();
        }

        Double min = 9999999.00;
        Double max = -9999999.00;
        int posMin = -1;
        int posMax = -1;

        for (int i = 0; i < ciudades.length; i++) {
            if (minimas[i] < min) {
                min = minimas[i];
                posMin = i;
            } else if (maximas[i] > max) {
                max = maximas[i];
                posMax = i;
            }
        }

        System.out.println("La temperatura minima es de: " + min);
        System.out.println("Se registro en la ciudad de: " + ciudades[posMin]);

        System.out.println("La temperatura maxima es de: " + max);
        System.out.println("Se registro en la ciudad de: " + ciudades[posMax]);
         */

        int vuelos[][] = new int[6][3];
        Scanner teclado = new Scanner(System.in);

        for (int f = 0; f < 6; f++) {
            for (int c = 0; c < 3; c++) {

                System.out.println("Ingrese la cantidad de ASIENTOS para el destino: " + f + " horario: " + c);
                vuelos[f][c] = teclado.nextInt();
            }
        }

        //ventas de asientos
        Scanner teclado2 = new Scanner(System.in);
        String bandera = "";
        int destino, horario, asientos;

        while (!bandera.equalsIgnoreCase("finish")) {
            System.out.println("Ingrese el N° de destino:");
            destino = teclado2.nextInt();

            System.out.println("Ingrese el horario de vuelo:");
            horario = teclado2.nextInt();

            System.out.println("Ingrese el N° de asientos");
            asientos = teclado2.nextInt();

            if (destino >= 0 && destino <= 2) {
                if (horario >= 0 && horario <= 2) {
                    if (vuelos[destino][horario] >= asientos) {
                        System.out.println("Su reserva fue realizada con exito");
                        vuelos[destino][horario] = vuelos[destino][horario] - asientos;
                    } else {
                        System.out.println("No hay asientos disponibles");
                    }
                } else {
                    System.out.println("Horario no existe. Ingese entre 0 y 2");
                }
            } else {
                System.out.println("Destino no existe. Ingrese entre 0 y 5");
            }

            System.out.println(
                    "¿Desea seguir continuar reservando?. Ingrese finish para terminar o cualquier valor para seguir.");
            bandera = teclado2.next();
        }
    }
}
