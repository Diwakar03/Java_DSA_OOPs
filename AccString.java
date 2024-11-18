import java.util.*;
public class AccString {
    public static String StrCap(String str){
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<str.length(); i++){
            Character ch = str.charAt(i);
            if(ch>='A' && ch<='Z'){
                sb.append(ch);
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String str = sc.nextLine();
        System.out.println(StrCap(str));
    }
}

