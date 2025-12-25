package Java_OOP;

public class Construcyor_Student_ex1 {
    int sid;
    String sname ="QQ";
    char grad;
    void printData(){
        System.out.println(sid +"  "+sname+"  "+grad);

    }
    //method to store data but not print it
    // input local variables and temporarily store it with class variables
    void setStudentData(int id, String name, char gr){
        sid = id;
        sname = name;
        grad = gr;
    }
    /// CONSTRUCTORS just for initialize data
    /// diff1: can just be write like this
    Construcyor_Student_ex1(int id, String name, char gr){
        sid = id;
        sname = name;
        grad = gr;
    }
}
