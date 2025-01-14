public class ClaseParesImpares {

    private static void getNumerosPares(int inicio, int fin) {

        //hacemos un bucle de inicio a fin
        for (int i = inicio; i <= fin; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " es un número par.");
            }
        }
    }

    private static void getNumerosImpares(int inicio, int fin) {

        //hacemos un bucle de inicio a fin
        for (int i = inicio; i <= fin; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " es un número impar.");
            }
        }
    }

    //vamos a crear un método que llame a los dos anteriores, según lo que el usuario quiera.
    public static void getRangoNumeros(int inicio, int fin, boolean pares) {
        
        if (pares) {
            getNumerosPares(inicio, fin);
        } else {
            getNumerosImpares(inicio, fin);
        }
    }
}
