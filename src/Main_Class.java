import com.sun.org.apache.bcel.internal.generic.NEW;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main_Class {

    public static void main(String[] args) {
        int Lenth_of_Number = 0, i = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Elements: ");
        Lenth_of_Number = sc.nextInt();
        int[] Arrays = new int[Lenth_of_Number];

        System.out.println("Enter the Numbers:");
        for (int C =0 ; C<Lenth_of_Number;C++){
            Arrays[C]= sc.nextInt();
        }

        System.out.println("Enter The Target Number:");
        int TargetNumber = sc.nextInt();

        Main_Class Linear = new Main_Class();

        Linear.Linear_Search(Arrays,TargetNumber);

    }

    public void Linear_Search(int[] Arrays,int TargetNumber) {

    for (int i = 0 ; i< Arrays.length; i++){
        if (Arrays[i]== TargetNumber){
            System.out.println("Element Found At :"+i);
        }else{
            System.out.println("Element Note Found "+"OR RANGE OUT OF BOUND!!!!!!");
        }
    }


    }
}
