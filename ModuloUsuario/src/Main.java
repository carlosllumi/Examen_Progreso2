import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RegistrarUsuario registro = new RegistrarUsuario();

        System.out.println("=== Sistema de Registro de Usuarios ===");
        boolean continuar = true;

        while (continuar) {
            System.out.println("1. Registrar usuario");
            System.out.println("2. Mostrar usuarios registrados");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el nombre del usuario: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingresa el correo del usuario: ");
                    String correo = scanner.nextLine();
                    registro.registrar(nombre, correo);
                    break;

                case 2:
                    System.out.println("Usuarios registrados:");
                    for (ListaUsuarios usuario : registro.getUsuarios()) {
                        System.out.println(usuario);
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del sistema...");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }

        scanner.close();
    }
}

