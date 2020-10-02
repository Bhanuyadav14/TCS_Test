/*You are given a stack of N integers. In one operation, you can either pop an element from the
        stack or push any popped element into the stack. You need to maximize the top element of the
        stack after performing exactly K operations. If the stack becomes empty after performing K operations
        and there is no other way for the stack to be non-empty, print -1.



        Input format :

        The first line of input consists of two space-separated integers N and K.
        The second line of input consists N space-separated integers denoting the elements of the stack.
        The first element represents the top of the stack and the last element represents the bottom of the stack.

        Output format :

        Print the maximum possible top element of the stack after performing exactly K operations.


Sample INPUT:
        6 4
        1 2 4 3 3 5

Sample OUTPUT:
        4*/
import java.util.Scanner;
import java.util.Stack;

public class Stack_Operation2 {
    public static void main(String []args){
        int Number_of_Operation = 0;
        int[] Array;
        int Size = 0;

        Scanner sc = new Scanner(System.in);
        Size = sc.nextInt();
        Number_of_Operation = sc.nextInt();

        Array = new int[Size];
        for(int i=0 ; i<Size ; i++){
            Array[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        //boolean isempty = true ;

        //inserting Element in Stack
        for(int i=Array.length-1 ; i>=0 ; i--){
            stack.push(Array[i]);
        }
        System.out.println(""+stack);


             Stacks_operation(stack,Array,Number_of_Operation);

             



    }

    private static void Stacks_operation(Stack<Integer> stack, int[] array, int number_of_operation) {

        int i = 0 ;

        if(stack.isEmpty()== false){
           for (i=0 ; i< number_of_operation-1 ; i++){
               array[i]=stack.pop();
           }
        }
        /*stack.push(array[i]);*/
        System.out.print("This Is Stack "+stack);

    }
}
