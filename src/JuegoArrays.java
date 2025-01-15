public class JuegoArrays {

    public static int sumarNumerosArray(int[] numeros) {

        int suma = 0;

        for (int num: numeros) {
            suma += num;
        }

        return suma;
    }

    public static int[] getArrayRandom(int elementos) {

        //en vez de crear el array en main, lo creamos aquí
        int[] numeros = new int[elementos];

        //y le asignamos valores aleatorios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100);
        }

        return numeros;
    }
}
