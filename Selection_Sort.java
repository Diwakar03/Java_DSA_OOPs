public class Selection_Sort {
    public static void main(String[] args){
        int arr[] = {12,5,3,2,13,33};
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            int small = i;
            for(int j = i+1; j<n; j++){
                if(arr[small]>arr[j]){
                    small = j;
                }
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
        for(int num:arr){
            System.out.print(num + " ");
        }
    }
}
