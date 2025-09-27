package lab5;

import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class lab5 {

    // método swap
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // QuickSort - primeiro elemento como pivô
    public static void quickSortFirstPivot(int[] array, int esq, int dir) {
        int i = esq, j = dir;
        int pivo = array[esq];
        while (i <= j) {
            while (array[i] < pivo)
                i++;
            while (array[j] > pivo)
                j--;
            if (i <= j) {
                swap(array, i, j);
                i++;
                j--;
            }
        }
        if (esq < j)
            quickSortFirstPivot(array, esq, j);
        if (i < dir)
            quickSortFirstPivot(array, i, dir);
    }

    // QuickSort - último elemento como pivô
    public static void quickSortLastPivot(int[] array, int esq, int dir) {
        int i = esq, j = dir;
        int pivo = array[dir];
        while (i <= j) {
            while (array[i] < pivo)
                i++;
            while (array[j] > pivo)
                j--;
            if (i <= j) {
                swap(array, i, j);
                i++;
                j--;
            }
        }
        if (esq < j)
            quickSortLastPivot(array, esq, j);
        if (i < dir)
            quickSortLastPivot(array, i, dir);
    }

    // QuickSort - pivô aleatório
    public static void quickSortRandomPivot(int[] array, int esq, int dir) {
        int i = esq, j = dir;
        int randomIndex = esq + (int) (Math.random() * (dir - esq + 1));
        int pivo = array[randomIndex];
        while (i <= j) {
            while (array[i] < pivo)
                i++;
            while (array[j] > pivo)
                j--;
            if (i <= j) {
                swap(array, i, j);
                i++;
                j--;
            }
        }
        if (esq < j)
            quickSortRandomPivot(array, esq, j);
        if (i < dir)
            quickSortRandomPivot(array, i, dir);
    }

    // QuickSort - mediana de três
    public static void quickSortMedianOfThree(int[] array, int esq, int dir) {
        int i = esq, j = dir;
        int meio = (esq + dir) / 2;

        int a = array[esq];
        int b = array[meio];
        int c = array[dir];

        int pivo = Math.max(Math.min(a, b), Math.min(Math.max(a, b), c));

        while (i <= j) {
            while (array[i] < pivo)
                i++;
            while (array[j] > pivo)
                j--;
            if (i <= j) {
                swap(array, i, j);
                i++;
                j--;
            }
        }
        if (esq < j)
            quickSortMedianOfThree(array, esq, j);
        if (i < dir)
            quickSortMedianOfThree(array, i, dir);
    }

    // gera array com números aleatórios
    private static int[] generateArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100000);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] sizes = { 100, 1000, 10000 };

        try (PrintWriter writer = new PrintWriter(new FileWriter("lab5/resultados_quicksort.txt"))) {

            writer.println("Tamanho;Variação do Pivô;Tempo(ms)");

            for (int size : sizes) {

                int[] arr1 = generateArray(size);
                int[] arr2 = arr1.clone();
                int[] arr3 = arr1.clone();
                int[] arr4 = arr1.clone();

                // Primeiro pivô
                long start = System.nanoTime();
                quickSortFirstPivot(arr1, 0, arr1.length - 1);
                long end = System.nanoTime();
                writer.printf("%d;Primeiro Pivô;%.3f%n", size, (end - start) / 1_000_000.0);

                // Último pivô
                start = System.nanoTime();
                quickSortLastPivot(arr2, 0, arr2.length - 1);
                end = System.nanoTime();
                writer.printf("%d;Último Pivô;%.3f%n", size, (end - start) / 1_000_000.0);

                // Pivô aleatório
                start = System.nanoTime();
                quickSortRandomPivot(arr3, 0, arr3.length - 1);
                end = System.nanoTime();
                writer.printf("%d;Pivô Aleatório;%.3f%n", size, (end - start) / 1_000_000.0);

                // Mediana de três
                start = System.nanoTime();
                quickSortMedianOfThree(arr4, 0, arr4.length - 1);
                end = System.nanoTime();
                writer.printf("%d;Mediana de Três;%.3f%n", size, (end - start) / 1_000_000.0);
            }

            System.out.println("Arquivo 'lab5/resultados_quicksort.txt' gerado com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
