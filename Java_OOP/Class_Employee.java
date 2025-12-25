package Java_OOP;

public class Class_Employee {
    //Variables
    int eid;
    String ename;
    String job;
    int sal;
    //Methods
    void display(){
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(job);
        System.out.println(sal);

    }

    public static void main(String[] args) {
        //create objects inside the main methods
        //Object 1
        Class_Employee emp1 = new Class_Employee();
        emp1.eid =102;
        emp1.ename = "Hung";
        emp1.job = "Manager";
        emp1.sal = 40000;
        System.out.println(emp1.ename );
        emp1.display(); //this method from class
        //Object 2
        Class_Employee emp2 = new Class_Employee();
        emp2.eid = 103;
        emp2.ename = "Cao";
        emp2.job = "Engineer";
        emp2.sal = 600000;
        emp2.display();
    }
}
