package Java_OOP;

public class ConstructorDemo {
    int x, y;
    //Default CONStructor no params
    ConstructorDemo(){
        x= 100;
        y = 100;
    }
    //CONstructor with params
    ConstructorDemo(int a, int b){
        x =a;
        y =b;
    }
    void sum(){
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        ConstructorDemo cst = new ConstructorDemo(); // invoke default constructor
        cst.sum();
        ConstructorDemo cst2 = new ConstructorDemo(200,400);// invoke constructor with paramsv
        cst2.sum();
    }

}
