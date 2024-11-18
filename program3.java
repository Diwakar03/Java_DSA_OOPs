//import jdk.incubator.vector.VectorOperators;

public class program3 {
    public static void main(String[] args){
        test t1 = new test(10,20);
        test t2 = new test(30,40);
        System.out.println(t1);
        System.out.println(t2);

    }
}
class test{
    private int a,b;
    public test(int a, int b){
        this.a = a;
        this.b = b;
    }
    public String toString(){

        return this.a + " , " + this.b;
    }

}