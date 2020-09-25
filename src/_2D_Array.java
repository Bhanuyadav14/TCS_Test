import java.util.Scanner;

public class _2D_Array {
    public static void main(String args[] ) throws Exception {


        // Write your code here

        int Size1=0,Size2=0;

        Scanner scanner = new Scanner(System.in);
        Size1=scanner.nextInt();
        Size2=scanner.nextInt();

        int[][] Array = new int[Size1][Size2];
        for(int i=0;i<Size1;i++){

            for(int j=0;j<Size2;j++){
                Array[i][j] = scanner.nextInt();
            }
              System.out.println();
        }

        for(int i =0; i<Size1;i++){
            for(int j=0;j<Size2;j++){
                System.out.print(""+Array[i][j]);
            }
            System.out.println();
        }

       for(int i=0;i<Size2;i++){

           for(int j=0;j<Size1;j++){
               System.out.print(Array[j][i]+" ");
           }
           System.out.println("");
       }

    }
}
