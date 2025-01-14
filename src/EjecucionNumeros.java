import java.util.Scanner;

public class EjecucionNumeros {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Conjetura de Collatz:\nIntroduce un número:");
        String entrada = scan.nextLine();
        int numero = Integer.parseInt(entrada);

        HerramientasNumeros.mostrarCollatz(numero);

        scan.close();
    }
}
