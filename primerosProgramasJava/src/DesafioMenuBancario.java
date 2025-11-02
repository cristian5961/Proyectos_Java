import java.util.Scanner;

public class DesafioMenuBancario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombreCliente = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldoCuenta = 1599.99;
        int opcionCliente = 0;
        double montoRetiro = 0;
        double montoDeposito = 0;

        System.out.println("**********************************************");
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
        System.out.println("Saldo Disponible: " + saldoCuenta);
        System.out.println("**********************************************");
        String menu = """
                *** Escriba el número de la opción deseada ***
                1 - Consultar saldo.
                2 - Retirar.
                3 - Depositar.
                9 - Salir.
                """;

        while (opcionCliente != 9) {
            System.out.println(menu);
            opcionCliente = teclado.nextInt();

            switch (opcionCliente) {
                case 1:
                    System.out.println("El saldo de su cuenta es: $" + saldoCuenta);
                    break;
                case 2:
                    System.out.println("Ingrese el valor a retirar de la cuenta.");
                    montoRetiro = teclado.nextDouble();
                    if (montoRetiro <= saldoCuenta){
                        saldoCuenta -= montoRetiro;
                        System.out.println("Transacción exitosa, su saldo es: $" + saldoCuenta);
                    } else {
                        System.out.println("Fondos insuficientes.");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el monto a depositar.");
                    montoDeposito = teclado.nextDouble();
                    saldoCuenta += montoDeposito;
                    System.out.println("El saldo de su cuenta es: $" + saldoCuenta);
                    break;
                case 9:
                    System.out.println("Gracias por utilizar nuestro servicio. Adios!");
                    break;
                default:
                    System.out.println("Opción no valida, vuelve a intentarlo.");
                    break;
            }
        }
    }
}
