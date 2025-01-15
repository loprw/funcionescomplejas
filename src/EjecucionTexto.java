import java.util.Scanner;

public class EjecucionTexto {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Indica un texto numérico sin separación:");
        String entrada = scan.nextLine();

        int resultado = JuegoTextos.getSumaTexto(entrada);

        System.out.println("La suma del texto " + entrada + " es: " + resultado + ".");

        boolean isbnValido = JuegoTextos.validarISBN(entrada);

        System.out.println("El ISBN " + entrada + " es " + (isbnValido?"válido.":"no válido."));

        boolean esNarcisista = JuegoTextos.getEsNarcisista(entrada);

        System.out.println("El número " + entrada + (esNarcisista?"":" no") + " es narcisista");

        scan.close();
    }
}
