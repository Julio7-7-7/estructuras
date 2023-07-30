package tragaperras;
import java.util.Scanner;
public class TragaPerras {

    public static void main(String[] args) {
        
        Cinta cinta = new Cinta();

        // Crear un objeto Scanner para leer la entrada del jugador
        Scanner scanner = new Scanner(System.in);

        // Mostrar el mensaje de bienvenida
        System.out.println("Bienvenido al Tragaperras LoL");

        // Comenzar el juego con 3 oportunidades de girar
        for (int numGiros = 1; numGiros <= 3; numGiros++) {
            // Inicializar la cinta con caracteres permitidos
            cinta.inicializarCinta();

            System.out.println("\nPresiona 'G' para girar los rodillos (intentos " + numGiros + "/3)");
            String input = scanner.nextLine().toUpperCase();

            if (input.equals("G")) {
                // Mostrar el carácter solitario antes de girar
                cinta.imprimirCaracterSolitario();

                // Girar la cinta y mostrar los últimos 5 caracteres
                cinta.girarCinta();
                System.out.println("Caracteres: " + cinta.ultimos5Caracteres());

                if (cinta.haGanado()) {
                    System.out.println("¡Ganaste!");
                    break; // El juego termina cuando se gana
                }

                if (numGiros == 3) {
                    System.out.println("Se acabaron tus oportunidades. ¡Suerte la próxima vez!");
                }
            } else {
                System.out.println("Opción inválida. Intenta nuevamente.");
            }
        }

        // Cerrar el Scanner
        scanner.close();
    }
}

    

