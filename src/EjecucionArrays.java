import java.util.Scanner;

public class EjecucionArrays {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Vamos a crear una serie de números, asignarles un valor entre 0 y 100, y luego a dar la suma de todos ellos.");
        System.out.println("Indica la cantidad de números que quieres sumar:");
        String entrada = scan.nextLine();
        int num = Integer.parseInt(entrada);

        // int[] numeros = new int[num];

        // for (int i = 0; i < numeros.length; i++) {
        //     System.out.println("Indica el número " + (i + 1) + ":");
        //     entrada = scan.nextLine();
        //     numeros[i] = Integer.parseInt(entrada);
        // }

        //pedimos a JuegoArrays que nos cree un array con números aleatorios
        int[] array = JuegoArrays.getArrayRandom(num);

        //pedimos a JuegoArrays que nos sume todos los valores del array creado
        int resultado = JuegoArrays.sumarNumerosArray(array);
        System.out.println(resultado);


        scan.close();
    }
}
