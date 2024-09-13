import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empleado empleado = new Empleado();
        System.out.println("Los datos son: ");
        // Solo sueldo base
        System.out.println("Sueldo base: ");
        System.out.println( empleado.calcularSalario(1850));

        // Sueldo base y bonificación
        System.out.println("Sueldo base + bonificacion: ");
        System.out.println(empleado.calcularSalario(1850, 230));

        // Sueldo base, bonificación y horas extras
        System.out.println("Sueldo base + bonificacion + horas extras: ");
        System.out.println(empleado.calcularSalario(1850, 230, 50));

    }
}
