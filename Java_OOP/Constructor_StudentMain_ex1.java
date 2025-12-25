package Java_OOP;

public class Constructor_StudentMain_ex1 {
    public static void main(String[] args) {
        //Student_ex1 stud1 = new Student_ex1();
    // 1) Using object reference variables
//        stud1.sid = 12;
////        stud1.sname = "Hung";
//        stud1.grad ='A';
//        stud1.printData();
//        Student_ex1 stud2 = new Student_ex1();
//        stud2.sid =13;
//        stud2.sname = "Hai";
//        stud2.grad = 'A';
//        stud2.printData();
    // 2) Using methods
//        stud1.setStudentData(1,"David",'B');
//        stud1.printData();
    // 3) Using constructors - most of the time -> not use for operate => pass params when call it
        Construcyor_Student_ex1 stu = new Construcyor_Student_ex1( 101, "David", 'D');
        stu.printData();


    }
}
