import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorColores gestorColores = new GestorColores();
        GestorEmpleados gestorEmpleados = new GestorEmpleados();
        GestorEstudiantes gestorEstudiantes = new GestorEstudiantes();
        GestorNumeros gestorNumeros = new GestorNumeros();
        GestorPersonas gestorPersonas = new GestorPersonas();

        Scanner scanner = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("¿Qué acción quieres realizar?");
            System.out.println("1. Agregar color");
            System.out.println("2. Consultar color");
            System.out.println("3. Agregar empleado");
            System.out.println("4. Consultar empleado");
            System.out.println("5. Agregar estudiante");
            System.out.println("6. Consultar estudiante");
            System.out.println("7. Agregar número");
            System.out.println("8. Consultar suma de números");
            System.out.println("9. Agregar persona");
            System.out.println("10. Consultar persona");
            System.out.println("11. Salir");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                System.out.println("Introduce el color:");
                String color = scanner.nextLine();
                gestorColores.agregarColor(color);
                    break;
                case "2":
                    System.out.println("Introduce el color a consultar:");
                    String colorConsulta = scanner.nextLine();
                    if (gestorColores.existeColor(colorConsulta)) {
                        System.out.println("El color " + colorConsulta + " existe.");
                    } else {
                        System.out.println("El color " + colorConsulta + " no existe.");
                    }
                    break;
                case "3":
                System.out.println("Introduce el nombre del empleado:");
                String nombreEmpleado = scanner.nextLine();
                System.out.println("Introduce el salario del empleado:");
                double salario = scanner.nextDouble();
                scanner.nextLine(); // consume newline left-over
                gestorEmpleados.agregarEmpleado(nombreEmpleado, salario);
                    break;
                case "4":
                    System.out.println("Introduce el nombre del empleado a consultar:");
                    String nombreEmpleadoConsulta = scanner.nextLine();
                    if (gestorEmpleados.existeEmpleado(nombreEmpleadoConsulta)) {
                        System.out.println("El empleado " + nombreEmpleadoConsulta + " existe.");
                    } else {
                        System.out.println("El empleado " + nombreEmpleadoConsulta + " no existe.");
                    }
                    break;
                case "5":
                System.out.println("Introduce el nombre del estudiante:");
                String nombreEstudiante = scanner.nextLine();
                System.out.println("Introduce el ID del estudiante:");
                int id = scanner.nextInt();
                scanner.nextLine(); // consume newline left-over
                gestorEstudiantes.agregarEstudiante(nombreEstudiante, id);
                    break;
                case "6":
                    System.out.println("Introduce el nombre del estudiante a consultar:");
                    String nombreEstudianteConsulta = scanner.nextLine();
                    System.out.println("Introduce el ID del estudiante a consultar:");
                    int idConsulta = scanner.nextInt();
                    scanner.nextLine(); // consume newline left-over
                    if (gestorEstudiantes.existeEstudiante(nombreEstudianteConsulta, idConsulta)) {
                        System.out.println("El estudiante " + nombreEstudianteConsulta + " con ID " + idConsulta + " existe.");
                    } else {
                        System.out.println("El estudiante " + nombreEstudianteConsulta + " con ID " + idConsulta + " no existe.");
                    }
                    break;
                case "7":
                System.out.println("Introduce un número:");
                int numero = scanner.nextInt();
                scanner.nextLine(); // consume newline left-over
                gestorNumeros.agregarNumero(numero);
                    break;
                case "8":
                    System.out.println("La suma de los números es: " + gestorNumeros.calcularSuma());
                    break;
                case "9":
                System.out.println("Introduce el nombre de la persona:");
                String nombrePersona = scanner.nextLine();
                System.out.println("Introduce la edad de la persona:");
                int edad = scanner.nextInt();
                scanner.nextLine(); // consume newline left-over
                gestorPersonas.agregarPersona(nombrePersona, edad);
                    break;
                case "10":
                    System.out.println("Introduce el nombre de la persona a consultar:");
                    String nombrePersonaConsulta = scanner.nextLine();
                    if (gestorPersonas.existePersona(nombrePersonaConsulta)) {
                        System.out.println(gestorPersonas.mostrarPersona(nombrePersonaConsulta));
                    } else {
                        System.out.println("La persona " + nombrePersonaConsulta + " no existe.");
                    }
                    break;
                case "11":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no reconocida. Por favor, intenta de nuevo.");
            }
        } while (!opcion.equals("11"));

        scanner.close();
    }
}
