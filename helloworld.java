import java.util.Scanner;

public class helloworld {
    public static void main(String[] args){
        System.out.println("Main");
        Say s = new Say();
        //s.hiToAll();
        Clear c = new Clear();
        c.everyOne();
        s.hiToAll();
        //Person.canVote(18);
        System.out.println("Enter char");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        Check.isAlphabet(ch);


        //oracle 11 g

    }

}
class Say{
    void hiToAll(){
        System.out.println("hi to all");
    }
}
class Clear{
    void everyOne(){
        System.out.println("clear all");
    }
}

class Check{
    static void isAlphabet(char ch){
        if ((ch >= 'A' && ch <='Z') || (ch>='a' && ch<='z')){
            System.out.println("is char");
        }
        else {
            System.out.println("not char");
        }
    }
}