public class Recursion_String_palin {
    public static boolean check_palin(char[] arr, int i,int n){
        if( i>=arr.length/2){
            return true;
        }
        if(arr[i]!=arr[n-i-1]){
            return false;
        }
        return check_palin(arr,i+1,n);
    }
    public static void main(String args[]){
        String s = "OMADAMO";
        char[] ch = s.toCharArray();
        int n = ch.length;
        System.out.println(check_palin(ch, 0,n));
    }
}
