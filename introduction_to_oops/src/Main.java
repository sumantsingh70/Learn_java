public class Main {


    public static void main(String[] args) {
        System.out.println("This is our custom class.");
        Employee Sumant = new Employee();
        Employee Abhay = new Employee();

        Sumant.id= 123;
        Sumant.name="sumant";
        Abhay.id=1234;
        Abhay.name="Abhay Nehra";


//        System.out.println(Sumant.name);
//        System.out.println(Sumant.id);
        Sumant.printdetails();
        Abhay.printdetails();

    }
}

class Employee{
    int id;
    String name;
    public void printdetails(){
        System.out.println("My id is:"+ id);
        System.out.println("My name is:" +name);
    }
}