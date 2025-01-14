public class HerramientasNumeros {

    public static void mostrarCollatz(int numero) {

        while (numero != 1) {

            // String mensaje = getMensajeCollantz(numero);
            // System.out.println(mensaje);

            int num = getNumeroCollantz(numero);
            numero = num;
            System.out.println(num);
        }

    }

    // private static String getMensajeCollantz(int numero) {

    //     String mensaje = "";
    //     if (numero % 2 == 0) {
    //         mensaje = "Par: " + numero;
    //     } else {
    //         mensaje = "Impar: " + numero;
    //     }

    //     return mensaje;
    // }

    private static int getNumeroCollantz(int numero) {

        if (numero % 2 == 0) {
            numero /= 2;
        } else {
            numero = numero * 3 + 1;
        }

        return numero;
    }
}
