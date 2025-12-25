package Java_OOP;

public class Staticdemo_theory {
    static int a = 10; //static variables
    int b = 20; //non-static variable
    static void m1(){
        System.out.println("This is m1 static method...");
    }
    void m2() //non static method
    {
        System.out.println("This is m2 non-static method...");
    }
    void m(){ //non static
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }
// static method main can directly access the static variable and static methods without object

}
