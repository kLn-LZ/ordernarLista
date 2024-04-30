package Model;

public class QuickSort {


    public QuickSort() {
        super();
    }




    public int[] quickSort(int v[], int inicio, int fim) {

        if (inicio < fim) {

            int fixedPivotPosition = divide(v, inicio, fim);
            quickSort(v, inicio, fixedPivotPosition - 1);
            quickSort(v, fixedPivotPosition + 1, fim);

        }

        return v;
    }

    public int divide(int v[], int inicio, int fim) {

        int esq = inicio + 1;
        int dir = fim;
        int pivot = v[inicio];


        while (esq <= dir) {

            while (esq <= dir && v[esq] <= pivot) {
                esq++;
            }
            while (esq <= dir && v[dir] > pivot) {
                dir--;

            }

            if (esq < dir) {
                swapArray(v, esq, dir);
                esq++;
                dir--;
            }


        }

        swapArray(v, dir, inicio);
        return dir;



    }


    private void swapArray(int v[], int i, int j) {


            int aux = v[i];
            v[i] = v[j];
            v[j] = aux;

    }

}


