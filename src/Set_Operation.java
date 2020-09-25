import com.sun.glass.ui.Size;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Set_Operation {
    public static void main(String []args){
        int Size1 = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        Size1 =scanner.nextInt();

        int[] Array1 = new int[Size1];
        System.out.println("Enter The Element of First Array: ");
        for (int i=0; i< Size1 ;i++){
            Array1[i] = scanner.nextInt();
        }
        int Size2 = 0;
        System.out.println("Enter the Size Of Array: ");
        Size2 = scanner.nextInt();

        int[] Array2 = new int[Size2];
        System.out.println("Enter the Element Of Array2: ");
        for (int i=0; i<Size2 ; i++){
            Array2[i] = scanner.nextInt();
        }
        Set<Integer> set1 = new HashSet<Integer>();
        set1.addAll(Arrays.asList(new Integer(String.valueOf(Array1)) ));

        for (int i : set1) {
            System.out.println(i);
        }
    }
}
