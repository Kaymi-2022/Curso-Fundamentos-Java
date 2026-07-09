import java.util.Scanner;

/*
==============================
      Ejercicios
==============================
 */

public class sistemitas {


    Scanner scanner = new Scanner(System.in);

    public void calcularPromedios() {

        System.out.println("\n===== PROMEDIO DE CALIFICACIONES =====");


        System.out.println("Ingrese su codigo de matricula");
        String codigo = scanner.next();

        System.out.println("Ingrese la cantidad de calificaciones a promediar");
        int cantidad = scanner.nextInt();

        double suma = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese la calificacion " + (i + 1));
            suma += scanner.nextDouble();
        }

        double promedio = suma / 3;

          System.out.printf("\nEstudiante: %s%n", codigo);
        System.out.printf("Promedio: %.2f%n", promedio);

    }

    public void calculoSalario(){

        System.out.println("\n===== CÁLCULO DE SALARIO =====");


        System.out.print("Nombre del trabajador: ");
        String nombre = scanner.nextLine();

        System.out.print("Valor por hora: ");
        double valorHora = scanner.nextDouble();

        System.out.print("Horas trabajadas: ");
        int horas = scanner.nextInt();

        double salario = valorHora * horas;

        System.out.printf("\nTrabajador: %s%n", nombre);
        System.out.printf("Salario: S/. %.2f%n", salario);

    }

    //menu principal
    public static void main(String[] args) {

        sistemitas sistema = new sistemitas();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Calcular promedio de calificaciones");
            System.out.println("2. Calcular salario de trabajador");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    sistema.calcularPromedios();
                    break;
                case 2:
                    sistema.calculoSalario();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}