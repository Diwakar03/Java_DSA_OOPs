abstract class first2{
    void m1(){
        System.out.println("m1");
    }
    abstract void m2();
}
class Second2 extends first2{
    void m2(){
        System.out.println("m2");
    }
}
class program5{
    public static void main(String[] args){
        Second2 s = new Second2();
        s.m2();
        s.m1();
        //s.m1();`
    }
}
