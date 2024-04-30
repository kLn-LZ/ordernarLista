package View;
import Model.*;

public class Main {
    public static void main(String[] args) throws Exception {

        int[] vet = new int[10];
        Lista L = new Lista();
        QuickSort qs = new QuickSort();

        L.add(10, 0);
        L.add(5, 1);
        L.add(8, 2);
        L.add(1, 3);
        L.add(9, 4);
        L.add(2, 5);
        L.add(4, 6);
        L.add(7, 7);
        L.add(3, 8);
        L.add(6, 9);


        for(int i = 0; i < 10; i++) {
            vet[i] = L.get(i);


        }

        vet = qs.quickSort(vet, 0, vet.length - 1);
        while(!L.isEmpty()) {
            L.removeFirst();
        }

        for(int i = 0; i < 10; i++) {
            L.add(vet[i], i);
        }

        int cont = 0;
        int tam = L.size();
        while(cont < tam) {
            System.out.println(L.get(cont));
            cont++;
        }


    }
}
