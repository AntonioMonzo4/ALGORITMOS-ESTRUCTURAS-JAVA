import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la longitud del array");

        n = sc.nextInt();

        int arrayN[] = new int[n];

        for (int i = 0; i < arrayN.length; i++) {
            System.out.println("Introduce el número de la posición " + i + ": ");
            arrayN[i] = sc.nextInt();
        }

        mostrarArray(arrayN);
        System.out.println();
        ordenarBurbuja(arrayN);
        mostrarArray(arrayN);

    }

    public static void ordenarBurbuja(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {

                if (array[j] > array[j + 1]) {
                    int x = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = x;
                }

            }
        }
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
