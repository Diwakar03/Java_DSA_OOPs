import java.math.BigInteger;

public class ACC_2_pointer {
    public static void main(String[] args){
        int arr[] = {1,59,30,30,60,11,23,54,67,80,76,32,1110};
        Integer c = 0;

        for(int i = 0; i<arr.length-1; i++){
            //int sum = 0;
            for(int j = i+1; j< arr.length; j++){
                if(arr[i]+arr[j]==60){
                    c++;
                }
            }
        }
        System.out.println(c%1000000007);
    }
}
