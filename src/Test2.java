import java.*;
import java.util.Scanner;

public class Test2 {
    public static void main(String []args){
         int A=0 ,B=0;
         int Iteration = 0;

        Scanner scanner = new Scanner(System.in);
        Iteration = scanner.nextInt();
        A = scanner.nextInt();
        B = scanner.nextInt();

        String S1="";
        String S2="";

        S1 =Integer.toBinaryString(A);
        S2 = Integer.toBinaryString(B);

        String MainString ="";
        MainString = S1.concat(S2);

        while(Iteration-- !=0){
            char[] Array = new char[MainString.length()];
            char arr = '0';
            for (int i =0 ; i<MainString.length(); i++){
             arr = MainString.charAt(i);
                if(arr == '1'){
                    arr = '+';
                }else if (arr == '0'){
                    arr = '-';
                }
                Array[i] = arr;

            }



            for (int i = 0 ; i< MainString.length() ; i++) {
                System.out.print("" + Array[i]);
            }





        }
    }
}
