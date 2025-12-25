package Java_core;

public class MutableVSImmutable_Theory3 {
    public static void main(String[] args) {
        /// mutable can change
//        int a[] = {20,34,10,11,23,45};
//        Arrays.sort(a);// mutable
//        System.out.println(Arrays.toString(a));
        /// immutable can not change
//        String s = new String("Boaboa");
//        s.concat("connect new sting");
//        System.out.println(s);  // here no store so that not change
//        System.out.println(s.concat("YOYO"));  //here store so can change
//        String d = s.concat("to Java");
//        System.out.println(d); //--->heheh
        /// String  - immutable
        String s = "welcome";
        s.concat("to Java");
        System.out.println(s);// immutable, cannot change original value of S
        /// StringBuffer - mutable
        StringBuffer s1 = new StringBuffer("welcome");
        s1.append("tojava");
        System.out.println(s1);
        /// StringBuilder - mutable
        StringBuilder d = new StringBuilder("coco");
        d.append("to Java");
        System.out.println(d);

    }
}
