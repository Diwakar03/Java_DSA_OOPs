import java.util.ArrayList;
import java.util.List;

public class Subset_Sum {
    public static void subs(int arr[], int idx, int sum, int n,ArrayList<Integer> ls){
        if(idx == n){
            ls.add(sum);
            return;
        }
        subs(arr,idx+1, sum + arr[idx],n, ls);
        subs(arr,idx + 1,sum,n,ls);
    }
    public static void main(String[] args){
        int arr[] = {1,2,3};
        int sum = 0;
        int n = arr.length;
        ArrayList<Integer> ls = new ArrayList<>();
        subs(arr,0,0,n,ls);
        System.out.print(ls);
    }
}
