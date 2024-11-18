public class Kadane_algo {
    public static void main(String[] args){
        int[] arr = {1,5,6,-4,7,11,-7,9,0,6,-1,-2};
        int sum = Integer.MIN_VALUE,max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(sum>max){
                max = sum;
            }
            else if(sum<0){
                sum = 0;
            }
        }
        System.out.println(max);
    }
}
