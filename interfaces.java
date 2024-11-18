import java.util.*;
interface fir{
    void m1();
    void m2();
}

class sec implements fir{
    public void m1(){
        System.out.println("m1");
    }
    public void m2(){
        System.out.println("m2");
    }
}
class interfaces {
    public static void main (String[] args){
        fir f = new sec();
        f.m1();
        f.m2();
    }
}
