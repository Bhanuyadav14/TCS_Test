import javax.xml.transform.Result;
import java.io.*;
import java.util.Scanner;

public class Ternary_Search {
    public static void main(String []args){
        int Size , i , high = 0 ,low = 0 , Data = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size Of Array: ");
        Size = scanner.nextInt();
        int[] array = new int[Size];

        System.out.println("Enter The Element Of Array: ");
        for (i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter The Data To Search: ");
        Data = scanner.nextInt();

        Ternary_Search ternary_search = new Ternary_Search();
        int Result=ternary_search.TernarySearch(array,low,high,Data);

        System.out.println("Element Found At "+Result);
    }
    public int TernarySearch(int[] array, int low, int high, int data){
        int Mid1 = low + (high-1)/3;
        int Mid2 = low - (high-1)/3;

        do {
            if(array[Mid1]==data){//this Check If  Dats is Middle It Self
                return Mid1;
            }else if (array[Mid2]== data){//this Check If  Data is Middle It Self
                return Mid2;
            }else if (array[Mid1]>data){//This Check data is Present To it's Left Side
                return TernarySearch(array,low,Mid1-1,data);
            }else if(array[Mid2] < data){//This Check data Is Present to It's Right Side
                return TernarySearch(array,Mid2+1,high,data);
            }else{
                return TernarySearch(array,Mid1+1,Mid2-1,data);
            }
        }while (high>=low);


    }
}
