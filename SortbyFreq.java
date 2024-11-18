import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SortbyFreq {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:");
        String s = sc.nextLine();

        char[] ch = s.toCharArray();

        StringBuilder sb = new StringBuilder();

        HashMap<Character,Integer> map = new HashMap<>();

        for(Character c:ch){
            map.put(c, map.getOrDefault(ch, 0) + 1);
        }

        ArrayList<Character> LS = new ArrayList(map.keySet());

        System.out.println(LS);

        LS.sort((ob1,ob2)-> map.get(ob2) - map.get(ob1));

        for (Character iter : LS){
            for(int i = 0; i<map.get(iter); i++){
                sb.append(ch);
            }
        }
        System.out.println("Answer");
        System.out.println(sb.toString());

    }
}
