import java.util.Scanner;

public class EjecucionTabla {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Indica un numero para sacar su tabla de multiplicar:");
        String entrada = scan.nextLine();
        int numero = Integer.parseInt(entrada);

        HerramientasTabla.mostrarTablaMultiplicar(numero);

        scan.close();
    }
}
