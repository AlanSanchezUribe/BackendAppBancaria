import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String cliente = "Alan";
        String tipoCuenta = "Corriente";
        Double saldo = 500.0;
        Scanner opcion = new Scanner(System.in);
        Scanner montoRetiro = new Scanner(System.in);
        Scanner montoDeposito = new Scanner(System.in);

        int opcionMenu = 0;

        System.out.println("***********************");
        System.out.println("\nNombre de Cliente: " + cliente);
        System.out.println("Tipo de Cuenta: " + tipoCuenta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n***********************");

        
        System.out.println("\n** Menu de Opciones **");
        
        System.out.println("1. Consultar Saldo");
        System.out.println("2. Retirar");
        System.out.println("3. Depositar");
        System.out.println("9. Salir");

   

    while (opcionMenu != 9) {
        opcionMenu = opcion.nextInt();
        
        
        if (opcionMenu == 1) {
            System.out.println("Tu saldo Actualizado es: " + saldo + " $");
        } else if (opcionMenu == 2) {
            System.out.println("Ingresa la Cantidad a Retirar");
            Double retiro = montoRetiro.nextDouble();
            if (retiro <= saldo) {
                saldo = saldo - retiro;
                System.out.println("Tu nuevo saldo es: " + saldo + " $");
            } else {
                System.out.println("Saldo Insuficiente");
            }
        } else if (opcionMenu == 3) {
            System.out.println("Ingresa la Cantidad a Depositar");
            Double deposito = montoDeposito.nextDouble();
            saldo = saldo + deposito;
            System.out.println("Tu nuevo saldo es: " + saldo + " $");
        } else if (opcionMenu == 9) {
            
            System.out.println("Su sesion ha finalizado con exito");
            break;
        }else {
            System.out.println("Por favor, elige una de las opciones disponibles");
        }
        
        System.out.println("Por favor, elige una de las opciones");
        System.out.println("1. Consultar Saldo");
        System.out.println("2. Retirar");
        System.out.println("3. Depositar");
        System.out.println("9. Salir");

         if (opcionMenu == 9) {
            
        } 
    }
    
} 

}

