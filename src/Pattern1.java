public class Pattern1 {
    public static void main(String []args){
        int i,j=0;
        for(i=0; i<5 ; i++){
            System.out.print("");
            for(j=0; j<=i ;j++){
                System.out.print(" \b* ");
            }
            System.out.println();
        }
    }
}
