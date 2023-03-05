import java.util.Scanner;

public class EjemploMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        do {
            System.out.println("Bienvenido al menú:");
            System.out.println("1. Ingresar una letra mayúscula");
            System.out.println("2. Ingresar una letra minúscula");
            System.out.println("3. Ingresar un número");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");
            
            String input = scanner.next();
            if (!input.matches("\\d+")) {
                System.out.println("Debe ingresar un valor numérico.");
                continue;
            }
            
            opcion = Integer.parseInt(input);

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese una letra mayúscula: ");
                    String mayuscula = scanner.next();
                    boolean esMayuscula = Character.isUpperCase(mayuscula.charAt(0));
                    if (esMayuscula) {
                        System.out.println("Ingresaste una letra mayúscula: " + mayuscula);
                    } else {
                        System.out.println("La letra ingresada no es mayúscula.");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese una letra minúscula: ");
                    String minuscula = scanner.next();
                    boolean esMinuscula = Character.isLowerCase(minuscula.charAt(0));
                    if (esMinuscula) {
                        System.out.println("Ingresaste una letra minúscula: " + minuscula);
                    } else {
                        System.out.println("La letra ingresada no es minúscula.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese un número: ");
                    int numero = scanner.nextInt();
                    boolean esNumero10 = numero == 10;
                    if (esNumero10) {
                        System.out.println("Ingresaste el número 10.");
                    } else {
                        System.out.println("El número ingresado no es 10.");
                    }
                    break;
                case 4:
                    System.out.println("Adiós!");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
            System.out.println(); // Imprime una línea en blanco para separar las opciones
        } while (opcion != 4);
        
        scanner.close();
    }
}
