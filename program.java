public class program {
    public static void main(String args[]){
        Emp.setId(101);
        Emp.setName("Diwakar");
        Emp.setSalary(65675);
        System.out.println(Emp.getName());
    }
}
//class Student{
//    public static int num;
//        private static String name;
//        private static String course;
//        private static double fee;
//    public static void setId(int id){
//        Student.id = id;
//    }
//}

class Emp{
    private static int id;
    private static String name;
    private static double salary;



    public static void setId(int id){
        Emp.id = id;
    }
    public static void setName(String name){
        Emp.name = name;
    }
    public static void setSalary(double salary){
        Emp.salary = salary;
    }
    public static String getName(){
        return name;
    }
}

