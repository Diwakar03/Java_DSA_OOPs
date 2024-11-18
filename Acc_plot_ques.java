import java.util.*;
public class Acc_plot_ques {
    public static void main(String[] args){

        int[] arr = {15,12,40,36,70,81,100,1};
        int c = 0;

        for(int i=0; i<arr.length; i++){
            double a = Math.sqrt(arr[i]);
            double b = Math.floor(a);

            if(a==b){
                c++;
            }

        }
        System.out.println(c);
    }
}
