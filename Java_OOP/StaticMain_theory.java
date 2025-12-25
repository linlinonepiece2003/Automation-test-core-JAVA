package Java_OOP;

public class StaticMain_theory {
    public static void main(String[] args) {
        System.out.println(Staticdemo_theory.a);
        Staticdemo_theory.m1();// can acces
        // m2() // can not access
        Staticdemo_theory st = new Staticdemo_theory();
        //st.m2();
        // System.out.println(st.b);
        st.m();
    }
}
