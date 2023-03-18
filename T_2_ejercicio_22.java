
package t_2_ejercicio_22;

import java.util.Scanner;

public class T_2_ejercicio_22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese solo su nombre");
        String NOMBRE = sc.next();
        System.out.println("Ingrese el valor de su salario por hora");
        double SALAR = sc.nextDouble();
        System.out.println("Ingrese las horas que trabajó");
        double HORAS = sc.nextDouble();
        double SALARM = SALAR * HORAS;
        if (SALARM > 450000) {
            System.out.println("Hola " + NOMBRE);
            System.out.println("Su salario es: " + SALARM);
        } else {
            System.out.println(NOMBRE);

        }

    }

}
