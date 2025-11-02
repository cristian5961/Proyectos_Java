import java.util.Random;
import java.util.Scanner;

public class JuegoDeAdivinacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroAleatorio = new Random().nextInt(10) + 1;
        int intentosUsuario = 0;
        int numeroUsuario = 0;
        int numeroIntentos = 5;
        int intentosRestantes = 0;
        System.out.println("ADIVINA EL NÚMERO SECRETO DEL 1 AL 10.");

        while (intentosUsuario < numeroIntentos){
            System.out.println("Ingresa un número:");
            numeroUsuario = teclado.nextInt();

            if (numeroUsuario > 0 && numeroUsuario <=10){
                intentosUsuario++;
                intentosRestantes = numeroIntentos - intentosUsuario;

                if (numeroUsuario == numeroAleatorio){
                    System.out.println("Felicidades adivinaste el número es: " + numeroAleatorio);
                    break;
                } else if (numeroUsuario > numeroAleatorio){
                    System.out.printf("El número es menor, tienes %d intentos%n", intentosRestantes);
                } else {
                    System.out.printf("El número es mayor, tienes %d intentos%n", intentosRestantes);
                }
                if (intentosUsuario == numeroIntentos){
                    System.out.println("Game Over. El número era: " + numeroAleatorio);
                }
            } else {
                System.out.println("Ingresa un número entre 1 y 10.");
            }

        }

    }
}
