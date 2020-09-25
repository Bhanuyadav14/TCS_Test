import java.util.Scanner;

public class Binary_Search {
    public static void main(String []args){

        int Size ,i;
        int low=0,high=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of Array :");
        Size= scanner.nextInt();

        int[] array = new  int[Size];
        System.out.println("Enter The Element Of Array: ");
        for ( i =0 ; i<Size; i++){
            array[i] = scanner.nextInt();
        }

        int Data = 0;
        System.out.println("Enter The Number To Search:");
        Data = scanner.nextInt();

        //Pass Data to Binary Search Method
        Binary_Search binary_search = new Binary_Search();
        int Result = binary_search.Search(array,low,Size-1,Data);

        if(Result != 0 ){
            System.out.println("Data Found At :"+Result);
        }else{
            System.out.println("Data Note Found");
        }
    }

    public int Search(int[] array,int low,int high,int data) {
        int mid = low + (high-1) / 2;

        do {

            if(array[mid] == data){
                return mid;
            }else if (array[mid] > data){
                return Search(array,low,mid - 1,data);
            }else{
                return Search(array,mid + 1,high,data);
            }
        } while (high <= low);

    }
}

