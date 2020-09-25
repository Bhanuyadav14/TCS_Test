import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String []args){
        int Size=0,i=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Size Of Array: ");
        Size =scanner.nextInt();

        int[] Array = new int[Size];
        System.out.println("Enter The Element Of Array: ");
        for (i = 0 ; i < Size ; i++){

             Array[i] = scanner.nextInt();

        }

        BubbleSort(Array,Size);

        for(i=0;i<Array.length;i++) {
            System.out.println("" + Array[i]);
        }
    }

    public static void BubbleSort(int[] array, int size){

        int i = 0, j = 0, temp = 0;
        for (i =0 ; i < array.length; i++){
            for (j = 1 ; j < (size - i) ; j++){
                if(array[j - 1] > array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
