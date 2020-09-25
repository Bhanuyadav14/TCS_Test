import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) {
        //O(n^2)
        int Size = 0;
        int iteration = 0;

        Scanner scanner = new Scanner(System.in);
        Size = scanner.nextInt();

        iteration = scanner.nextInt();

        int[] Array = new int[Size];
        for (int i = 0; i < Size; i++) {
            Array[i] = scanner.nextInt();
        }

        SelectionSort(Array, Size, iteration);

        for (int i = 0; i < Array.length; i++) {
            System.out.println("" + Array[i]);
        }
    }

    public static void SelectionSort(int[] array, int x, int size) {
        int Minimum = 0;
        int temp = 0;
        while (x-- != 0){
            for (int i = 0; i < size - 1; i++) {
                Minimum = i;
                for (int j = i + 1; j < size; j++) {
                    if (array[j] < array[Minimum]) {
                        temp = array[Minimum];
                        array[Minimum] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
    }
}
