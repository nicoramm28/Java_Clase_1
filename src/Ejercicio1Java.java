import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1Java {

    /* EJERCICIO 1
     Desarrollar un programa para mostrar los primeros n números pares,
     siendo n un valor que el usuario ingresará por consola.
     Recordá que un número es par cuando es divisible por 2.
     */
    public static void primerosNPares(int x) {
        for (int i = 0; i < x; i++) {
            System.out.print(i*2 + " ");
        }
        System.out.print("\n\n\n");
    }

    /*
    Ejercicio 2
    Desarrollar un programa para mostrar los primeros n múltiplos de m,
    siendo n y m valores que el usuario ingresará por consola.
    Recordá que un número a es múltiplo de b si a es divisible por b.
     */
    public static void mostrarMultiplos(int m, int n) {
        int i = 0;
        int multiplo = 1;
        while (i < n) {
            if (m % multiplo == 0) {
                System.out.print(multiplo + " ");
                i++;
            }
            multiplo++;
        }
        System.out.print("\n\n\n");
    }

    /*
    Ejercicio 3
    Desarrollar un programa para informar si un número n es primo o no,
    siendo n un valor que el usuario ingresará por consola.
    Recordá que un número es primo cuando sólo es divisible
     por sí mismo y por 1.
     */
    public static Boolean esPrimoBool(int x) {
        Boolean esPrimo = true;
        for(int i =2; i<x; i++){
            if(x%i == 0){
                return false;
            }
        }
        return true;
    }

    /* EJERCICIO 4
    Desarrollar un programa para mostrar por consola
    los primeros n números primos, siendo n un valor
    que el usuario ingresará por consola.
     */
    public static void primerosNPrimos(int n){
        int primo = 1;
        int i = 0;
        while(i<n){
            if(esPrimoBool(primo)){
                System.out.print(primo + " ");
                i++;
            }
            primo ++;
        }
        System.out.print("\n\n\n");
    }

    /*
    Ejercicio 5
    Desarrollar un programa para mostrar por consola los primeros n
    números naturales que tienen al menos m dígitos d, siendo n, m
    y d valores que el usuario ingresará por consola.
    Por ejemplo: si el usuario ingresa n=5, m=2 y d=3, el programa
    deberá mostrar por consola los primeros 5 números naturales que tienen,
     al menos, 2 dígitos 3. En este caso la salida será: 33, 133, 233, 303, 313.
    Según cómo decidas encarar la solución de este ejercicio, es probable que
    necesites utilizar recursos que aún no hemos estudiado. El desafío consiste
     en googlear cómo utilizar dichos recursos y ¡utilizarlos!
     */

    public static List<Integer> getDigits(int i) {
        List<Integer> digits = new ArrayList<>();
        while(i > 0) {
            digits.add(i % 10);
            i /= 10;
        }
        return digits;
    }

    public static void numeroBuscado(int n, int m, int d){
        int i = 0;
        while(i <n){
            List<Integer> digitsList = getDigits(i);

        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        Boolean salir = true;
        while (salir){
            System.out.println("##### ##### ##### ##### ##### ##### #####");
            System.out.println("Ingrese el ejercicio : ");
            System.out.println("1 - Primeros n pares");
            System.out.println("2 - Primeros n multiplos de m");
            System.out.println("3 - ¿Es primo?");
            System.out.println("4 - Primeros n primos");
            System.out.println("5 - Primeros m numeros que tengan al menos m digitos d");
            System.out.println("6 - Salir");
            System.out.println("##### ##### ##### ##### ##### ##### #####");
            int seleccion = scanner.nextInt();
            switch (seleccion){
                case 1 :
                    System.out.println("Ingrese un entero : ");
                    x = scanner.nextInt();
                    primerosNPares(x);
                    break;
                case 2 :
                    System.out.println("Ingrese un entero : ");
                    int m = scanner.nextInt();
                    System.out.println("Ingrese la cantidad de multiplos : ");
                    int n = scanner.nextInt();
                    mostrarMultiplos(m, n);
                    break;
                case 3 :
                    System.out.println("Ingrese un entero : ");
                    x = scanner.nextInt();
                    if(esPrimoBool(x))
                        System.out.println("Es Primo\n");
                    else
                        System.out.println("No es Primo\n");
                    break;
                case 4 :
                    System.out.println("Ingrese la cantidad de primos : ");
                    x = scanner.nextInt();
                    primerosNPrimos(x);
                    break;
                case 5 :
                    System.out.println("Ingrese la cantidad de numeros buscados : ");
                    n = scanner.nextInt();
                    System.out.println("Ingrese la cantidad de digitos : ");
                    m = scanner.nextInt();
                    System.out.println("Ingrese el digito buscado : ");
                    int d = scanner.nextInt();
                    while(d > 9 || d<0){
                        System.out.println("Ingrese un digito valido (1 - 9) : ");
                        d = scanner.nextInt();
                    }
                    numeroBuscado(n, m, d);
                    break;
                case 6 : System.out.println("Muchas gracias\n\n");
                    salir = false;
                    break;
            }
        }
        scanner.close();
    }
}
