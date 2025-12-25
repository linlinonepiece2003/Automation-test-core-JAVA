package Java_OOP;

public class This_Theory {
    // This refer to class variables
    int x, y; //class variabls/ instant variables
    // This sample using a and b waste time for new name and wrong way
//    This_Theory(int a, int b){
//        x= a;
//        x= b;
//    }
    void display(){
        System.out.println(x);
        System.out.println(y);
    }
    //This sample using this refer to class variables and the input is local variables
    //This invoke class
    This_Theory(int x, int y){
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        This_Theory t1 = new This_Theory(100,300);
        t1.display();
    }
}
