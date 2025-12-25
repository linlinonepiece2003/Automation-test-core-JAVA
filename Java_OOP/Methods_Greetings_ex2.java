package Java_OOP;

public class Methods_Greetings_ex2 {
    //1) No params    No return value
    void m1(){
        System.out.println("Hello...");
    }

    //2) No params   Return value
    String m2(){
        return("Hello how are you ?");}

    //3) Take params  No return value
    void m3(String name){
            System.out.println("Hello "+ name);
        }
    //4) Take params   Return value
    int m4(int age){
        return age +1;
    }
}
