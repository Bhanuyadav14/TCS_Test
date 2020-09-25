import java.util.*;


public class _Stacks {
   public int top = -1;

    public static void main(String[] args) {

        int NumberOfInput = 0;
        Scanner scanner = new Scanner(System.in);
        NumberOfInput = scanner.nextInt();

        String[] input_Sequence = new String[NumberOfInput];
        for (int i = 0; i < NumberOfInput; i++) {
            input_Sequence[i] = scanner.next();
        }


        for (int i = 0; i < NumberOfInput; i++) {
            System.out.print("" + input_Sequence[i]);
        }
         _Stacks stacks = new _Stacks();
       stacks._stack(NumberOfInput, input_Sequence);

    }

    public void _stack(int numberOfInput, String[] input_Sequence) {


        char[] sequence = new char[input_Sequence.length];
        for (int i=0 ; i<input_Sequence.length ; i++){

        }



       /* for (int i = 0 ; i < numberOfInput ; i++){
            for(int j = 1 ; j < numberOfInput ; j++){
                if(sequence[i] == '{' && sequence[j] == '}' || sequence[i] == '(' && sequence[j] == ')' || sequence[i] == '[' && sequence[j] == ']'){
                    if(isEmpty() == true){

                        top = top + 1 ;
                        stack[top]  = sequence[i];
                    }
                } else if(sequence[i] != '{' && sequence[j] != '}' || sequence[i] != '(' && sequence[j] != ')' || sequence[i] !='[' && sequence[j] != ']'){
                    if (isEmpty()){

                    }else {
                        top = top - 1 ;
                    }

                }

            }
        }
*/
        /*if(top == -1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }*/



    }



    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        else{
            return false;
        }



}
}

/* public static void pop(int stack[ ] ,int n )
        {

            if( isEmpty ( ) )
            {

            }
            else
            {
                top = top - 1 ; //Decrementing top’s position will detach last element from stack
            }
        }*/