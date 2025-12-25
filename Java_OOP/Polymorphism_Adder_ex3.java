package Java_OOP;

public class Polymorphism_Adder_ex3 {
    int a = 10, b = 20;
    //1
    void sum(){
        System.out.println(a+ b);
    }
    //2
    void sum(int x, int y){
        System.out.println(x+y);
    }
    //3
    void sum(int x, double y){
        System.out.println(x+y);
    }
    //4
    void sum(double x, int y){
        System.out.println(x+ y);
    }
    //5
    void sum ( int x, int y, int z){
        System.out.println(x+y+z);
    }

    public static void main(String[] args) {
    Polymorphism_Adder_ex3 po1 = new Polymorphism_Adder_ex3();
    po1.sum();
    po1.sum(6,7);
    po1.sum(8, 8.9);
    po1.sum(7.8, 2);
    po1.sum(2,5,9);
    }
}
