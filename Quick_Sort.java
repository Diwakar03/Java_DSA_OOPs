public class Quick_Sort {
    public static int partitioner(int arr[],int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for (int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot; //arr[high]
        arr[high] = temp;
        return i;
    }
    public static void quicksort(int arr[],int low, int high){

        if (low < high){
            int pidx = partitioner(arr,low,high);
            quicksort(arr,low,pidx-1);
            quicksort(arr,pidx+1,high);
        }
    }
    public static void main(String args[]){
        int arr[] = {3,2,1,4,6,2,11,10};
        //int low = 0;
        int high = arr.length-1;
        quicksort(arr,0,high);
        for(int num:arr){
            System.out.print(num + " ");
        }
    }
}
