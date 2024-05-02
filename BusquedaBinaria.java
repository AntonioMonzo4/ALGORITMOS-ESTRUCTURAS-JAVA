public class BusquedaBinaria {

    public static int busquedaBinaria(int[] arr, int objetivo) {
        int bajo = 0;
        int alto = arr.length - 1;

        while (bajo <= alto) {
            int medio = bajo + (alto - bajo) / 2;

            if (arr[medio] == objetivo) {

                return medio;
            } else if (arr[medio] < objetivo) {
                bajo = medio + 1;

            } else {
                alto = medio - 1;
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        int[] ejemploArrayOrdenado = { 2, 4, 5, 12, 15, 22, 34, 42, 48, 58, 99 };
        int objetivo = 42;

        int resultado = busquedaBinaria(ejemploArrayOrdenado, objetivo);
        if (resultado != -1) {
            System.out.println("Se ha encontrado el número en el índice: " + resultado);

        } else {
            System.out.println("Número no encontrado");
        }
    }

}
