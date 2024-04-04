import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre, apellido, cedula, correo, respuesta;
        String contrase;
        boolean continuar = true;

        while (continuar) {
            // Introducción por teclado
            System.out.println("\n\n\tIntroducción De Datos Personales");
            System.out.println("\n\tIngrese su nombre: ");
            nombre = scanner.next();
            if (!ValidadorContra.validarNombre(nombre)) {
                System.out.println("\tNombre inválido. Debe tener letras y espacios");
                apellido = scanner.next();
                continue;
            }

            System.out.println("\n\tIngrese su apellido: ");
            apellido = scanner.next();
            if (!ValidadorContra.validarApellido(apellido)) {
                System.out.println("\tApellido inválido. Solo debe tener letras y espacios");
                scanner.nextLine();
                continue;
            }

            System.out.println("\n\tIngrese su cédula: ");
            cedula = scanner.next();
            if (!ValidadorContra.validarCedula(cedula)) {
                System.out.println("\tCédula inválida. Debe contener 10 números");
                scanner.nextLine();
                continue;
            }

            System.out.println("\n\tIngrese su correo electrónico: ");
            correo = scanner.next();
            if (!ValidadorContra.validarCorreo(correo)) {
                System.out.println("\tCorreo electrónico inválido");
                scanner.nextLine();
                continue;
            }

            System.out.println("\n\tIngrese su contraseña: ");
            contrase = scanner.next();
            if (!ValidadorContra.validarContraseña(contrase)) {
                System.out.println("\tContraseña incorrecta. Debe tener al menos 8 caracteres y contener al menos una letra y un número");
                scanner.nextLine();
                continue;
            }

            // Crear un usuario solo si la información es válida
            System.out.println("\t\tRegistro exitoso. ¡Bienvenido, " + nombre + "!");

            System.out.println("\n\t\t¿Quiere introducir más información? (Si/No)");
            respuesta = scanner.next();
            continuar = respuesta.equalsIgnoreCase("S");
        }
        scanner.close();
    }
}
