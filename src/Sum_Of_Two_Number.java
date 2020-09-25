public class Sum_Of_Two_Number {
    public static void main(String []args){

        int[] Nums = new int[]{7,2,15,18};
        int Target = 9;
        int[] Sum = new int[Nums.length];

        twoSum(Nums,Target,Sum);


    }
    public static int[] twoSum(int[] nums, int target, int[] sum) {
        int Size = nums.length;
        int i ,j=0;

        for( i=0 ; i<Size ; i++ ){
            for ( j = i+1 ; j<Size-1 ; j++ ){
                sum[i]= nums[i] + nums[j] ;
                if(sum[i] == target){

                    System.out.print("["+i+","+j+"]");
                }
            }
        }

        return sum;

    }
}
