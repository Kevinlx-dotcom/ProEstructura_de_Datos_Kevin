import java.util.Arrays;

public class Comparacion_Burbuja {//Comparación burbuja normal

    public static void ordenamientoBurbuja(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
    }

   /* public static void ordenamientoBurbujaMejorado(int[] arreglo) {//Comparación burbuja mejorado
        for (int i = 0; i < arreglo.length - 1; i++) {
            boolean intercambio = false;

            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    intercambio = true;
                }
            }//Aqui8 se rompe la bandera
            if (!intercambio) {
                break;
            }
        }
    }*/

    public static void main(String[] args) {
        int[] arreglo = {5, 3, 8, 1, 2};

        ordenamientoBurbuja(arreglo);
        System.out.println(Arrays.toString(arreglo));

        //int[] arreglo2 = {5, 3, 8, 1, 2};

        //ordenamientoBurbujaMejorado(arreglo2);
        //System.out.println(Arrays.toString(arreglo2));
    }
}
