import java.util.Scanner;

public class EjecucionParesImpares {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Indica un número de inicio:");
        String entrada = scan.nextLine();
        int inicio = Integer.parseInt(entrada);

        System.out.println("Indica un número de fin:");
        entrada = scan.nextLine();
        int fin = Integer.parseInt(entrada);

        //darían error por son métodos private.
        // ClaseParesImpares.getNumerosPares(inicio, fin);
        // ClaseParesImpares.getNumerosImpares(inicio, fin);

        ClaseParesImpares.getRangoNumeros(inicio, fin, false);
        ClaseParesImpares.getRangoNumeros(inicio, fin, true);

        scan.close();
    }
}
