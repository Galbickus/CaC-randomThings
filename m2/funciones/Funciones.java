package m2.funciones;

import java.util.Scanner;

/*Ejercicios Prácticos:
1. Realizar una función, a la que se le pase como parámetro un número N, y muestre por
consola N veces, el siguiente mensaje: “Bienvenidos al curso Full Stack”
2. Diseñar una función que tenga como parámetros dos números, y que calcule el máximo.
3. Crear una función que se llame promedio3, que reciba como parámetro tres valores y
devuelva el promedio de los mismos.
4. Crear una función que lea notas hasta que ingrese -1 y devuelve el promedio de las notas
leídas.
5. Una función que se llame doble, que reciba como parámetro un valor, y devuelva el doble
del número ingresado como parámetro.
6. Una función que se llame cuadrado, que reciba como parámetro un valor, y devuelva el
valor del número ingresado como parámetro elevado al cuadrado.
7. Una función que se denomine imprimirValores que dado un número por parámetro,
imprima cual es el valor siguiente, el doble y el cuadrado.
8.Una función que dado la longitud de un lado de un cuadrado devuelva el perímetro
9. Una función que dado la longitud de un lado de un cuadrado devuelva la superficie.
10.Una función que dado el radio de un círculo devuelva la circunferencia (perímetro del
círculo).
11.Una función que dado el radio de un círculo devuelva el área del círculo.
12.Una función que dado un número de mes y me devuelva la cantidad de días de ese mes
(suponiendo que no es un año bisiesto).*/

public class Funciones {

     private Scanner teclado = new Scanner(System.in);

   public void mostrarMenu(){
    var opcion = -1;
        var menu = """
                    \n
                1 - Realizar una función, a la que se le pase como parámetro un número N, y muestre por consola N veces, el siguiente mensaje: “Bienvenidos al curso Full Stack”
                2 - Diseñar una función que tenga como parámetros dos números, y que calcule el máximo.
                3 - Crear una función que se llame promedio3, que reciba como parámetro tres valores y devuelva el promedio de los mismos.
                4 - Crear una función que lea notas hasta que ingrese -1 y devuelve el promedio de las notas leídas.
                5 - Una función que se llame doble, que reciba como parámetro un valor, y devuelva el doble del número ingresado como parámetro.
                6 - Una función que se llame cuadrado, que reciba como parámetro un valor, y devuelva el valor del número ingresado como parámetro elevado al cuadrado.
                0 - Cerrar programa
                ----------------------------------------------
                Elija una opción:
                """;

        while (opcion != 0) {
            System.out.println(menu);
            try {
                opcion = Integer.valueOf(teclado.nextLine());
                switch (opcion) {
                    case 1:
                        buscarLibroPorTitulo();
                        break;
                    case 2:
                        buscarAutorPorNombre();
                        break;
                    case 3:
                        listarLibrosRegistrados();
                        break;
                    case 4:
                        listarAutoresRegistrados();
                        break;
                    case 5:
                        listarAutoresVivos();
                        break;
                    case 6:
                        listarLibrosPorIdioma();
                        break;
                    case 0:
                        System.out.println("Cerrando aplicación");
                        break;
                    default:
                        System.out.println("Opción no válida!");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Opción no válida: " + e.getMessage());

            }
        }
    }
   }
    

