package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.quick_sort.service;

public class QuickSortService {
    private static int particion(String arreglo[], int izquierda, int derecha) {
        String pivote = arreglo[izquierda];
        while (true) {
            while (arreglo[izquierda].compareTo(pivote) < 0) {
                izquierda++;
            }
            while (arreglo[derecha].compareTo(pivote) > 0) {
                derecha--;
            }
            if (izquierda >= derecha) {
                return derecha;
            } else {
                String temporal = arreglo[izquierda];
                arreglo[izquierda] = arreglo[derecha];
                arreglo[derecha] = temporal;
                izquierda++;
                derecha--;
            }
        }
    }

    public  void quicksort(String arreglo[], int izquierda, int derecha) {
        if (izquierda < derecha) {
            int indiceParticion = particion(arreglo, izquierda, derecha);
            quicksort(arreglo, izquierda, indiceParticion);
            quicksort(arreglo, indiceParticion + 1, derecha);
        }
    }
    public void printArray(String arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
