public class JuegoTextos {

    public static int getSumaTexto(String texto) {

        int[] arrayNumeros = getArrayNumerosDesdeString(texto);
        int suma = JuegoArrays.sumarNumerosArray(arrayNumeros);

        return suma;
    }

    private static int[] getArrayNumerosDesdeString(String texto) {

        int[] numeros = new int[texto.length()];
        int numero = 0;

        for (int i = 0; i < texto.length(); i++) {

            numero = Integer.parseInt(String.valueOf(texto.charAt(i)));
            numeros[i] = numero;
        }

        return numeros;
    }

    public static boolean validarISBN(String isbn) {

        int[] arrayISBN = getArrayNumerosDesdeString(isbn);
        int suma = 0;
        boolean resultado;

        for (int i = 0; i < arrayISBN.length; i++) {

            suma += arrayISBN[i] * (i + 1);
        }

        if (suma % 11 == 0) {
            resultado = true;
        } else {
            resultado = false;
        }

        return resultado;
    }

    /*numero narcisista es aquel que cumple que la suma de sus números elevados a la longitud de carácteres del número da igual al propio número:
    /153.
    /Longitud del número = 3.
    / 1 ^ 3 = 1; 5 ^ 3 = 125; 3 ^ 3 = 27. 1 + 125 + 27 = 153.
    /Es un número narcisista.
    */


    public static boolean getEsNarcisista(String texto) {

        boolean resultado;

        int[] arrayNumero = getArrayNumerosDesdeString(texto);
        int longitud = arrayNumero.length;
        int num = 0;
        int suma = 0;
        int valorOriginal = Integer.parseInt(String.valueOf(texto));

        for (int i = 0; i < longitud; i++) {

            num = (int) Math.pow(arrayNumero[i], longitud);
            suma += num;
        }

        if (suma == valorOriginal) {
            resultado = true;
        } else {
            resultado = false;
        }

        return resultado;
    }
}
