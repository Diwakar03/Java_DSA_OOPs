public class Acc_bulb {
    public static void main(String[] args){
        int n = 3;

        int arr[] = new int[9];

        if(arr.length==1){
            System.out.println(1);;
        }

        for(int i = 0; i<n; i++){
            arr[i] = 1;
        }
        for(int i = 0; i<n; i++){
            arr[i]+=-1;
        }
        int c = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] == 1){
                c++;
            }
        }
        System.out.println(c);
    }
}
