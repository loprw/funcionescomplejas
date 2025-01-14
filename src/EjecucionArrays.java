import java.util.Scanner;

public class EjecucionArrays {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Vamos a crear una serie de números, y luego a dar la suma de todos ellos.");
        System.out.println("Indica la cantidad de números que quieres sumar:");
        String entrada = scan.nextLine();
        int num = Integer.parseInt(entrada);

        int[] numeros = new int[num];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Indica el número " + (i + 1) + ":");
            entrada = scan.nextLine();
            numeros[i] = Integer.parseInt(entrada);
        }

        int resultado = JuegoArrays.sumarNumerosArray(numeros);
        System.out.println(resultado);


        scan.close();
    }
}
