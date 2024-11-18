public class program2 {
    public static void main(String args[]){
        Student.setId(101);
        Student.setName("Diwakar");
        Student.setFee(5000.0); // Setting fee
        System.out.println("ID: " + Student.getId());
        System.out.println("Name: " + Student.getName());
        System.out.println("Fee: " + Student.getFee());
    }
}

class Student{
    private static int id;
    private static String name;
    private static double fee;

    public static void setId(int id){
        Student.id = id;
    }

    public static void setName(String name){
        Student.name = name;
    }

    public static void setFee(double fee){
        Student.fee = fee;
    }

    public static int getId(){
        return id;
    }

    public static String getName(){
        return name;
    }

    public static double getFee(){
        return fee;
    }
}
