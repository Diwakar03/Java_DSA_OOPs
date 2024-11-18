import  java.util.*;
public class hash {
    public static void main(String[] args){
        //country-Key, population-Value
        HashMap<String,Integer> map = new HashMap<>();

        //Insertion
        map.put("India",170);
        map.put("USA", 45);
        map.put("China", 160);

        System.out.println(map);

        map.put("China",165);
        System.out.println(map);

        if(map.containsKey("China")){
            System.out.println("YES");
        }
        System.out.println(map.get("India"));
        System.out.println(map.get("Canada"));


        int arr[] = {1,2,4,5,6};
        for (int val: arr){
            System.out.print(val + " ");
        }
        System.out.println();

        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set <String> key = map.keySet();

        for (String a:key){
            System.out.print(a + " " + map.get(key));
        }
        map.remove("India");
        System.out.print(map);
    }
}
