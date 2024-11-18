import java.util.ArrayList;
import java.util.List;

public class Merge_Sort {
    public static void Merge(int[] arr, int low, int mid, int high){
        int left = low;
        int right = mid + 1;
        List<Integer> ls = new ArrayList<>();
        while(left<=mid && right <=high){
            if (arr[left]<=arr[right]){
                ls.add(arr[left]);
                left++;
            }
            else {
                ls.add(arr[right]);
                right++;
            }
        }
        while (left<=mid){
            ls.add(arr[left]);
            left++;
        }
        while (right<=high){
            ls.add(arr[right]);
            right++;
        }
        int idx = 0;
        for(int i = 0; i<ls.size(); i++){
            arr[low+i] = ls.get(i);
        }
       // System.out.println(ls);
    }
    public static void Divide(int[] arr,int low, int high){
        if (low >= high){
            return;
        }
        int mid = (low + high)/2;
        Divide(arr,low,mid);
        Divide(arr,mid+1,high);
        Merge(arr,low,mid,high);
    }
    public static void main(String[] args){
        int arr[] = {16,7,2,3,6,9,10};
        Divide(arr,0,arr.length-1);
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
