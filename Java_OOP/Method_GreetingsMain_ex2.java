package Java_OOP;

public class Method_GreetingsMain_ex2 {
    public static void main(String[] args) {
    Methods_Greetings_ex2 gr = new Methods_Greetings_ex2();
    gr.m1(); //1
        String s =gr.m2(); //2
        System.out.println(s);
        gr.m3("Christine");//3
        int k = gr.m4(7);//4 so return value => make a store to capture it
        System.out.println(k);
    }
}
