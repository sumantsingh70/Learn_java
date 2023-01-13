public class practice_set {
static class Employee{
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String n){
        name=n;
    }
}
class cellphone{
    public void ringing{
        System.out.println("ringing...");
    }
    public void vibrating{
        System.out.println("vibrating...");
    }
}

    public static void main(String[] args) {
        Employee Sumant = new Employee();
        Sumant.setName("Sumant Singh");
        System.out.println(Sumant.getName());
        Sumant.salary=5000000;
        System.out.println(Sumant.getsalary());

    }
}
