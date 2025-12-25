package Java_core;

public class StringBuffer_Theory2 {
    public static void main(String[] args) {
        /// Example 1: Reverse a string ( string have length )
        ///Approach 1: length()  , charAt() just reverse by stick it together
//        String s1 = " Welcome";
//        String rev = "";
//        for( int i = s1.length()-1; i >=0; i--){
//            rev = rev + s1.charAt(i);
//        }
//        System.out.println("Reverse string is: "+ rev);
        ///Approach2 - without using string methods use char array ? split it into char
//        String s2 = "welcome";
//        String rev2 ="";
//        char a[] = s2.toCharArray(); //use toCharArray + make it into arrays
//        for(int i = a.length-1; i>=0; i--){
//            rev2 = rev2 + a[i]; // stick the char together by add
//        }
//        System.out.println("Reverse string is: "+ rev2);
        /// Approach 3 using String Buffer class ( with class no need to write logic for think have methods)
        // input "s welcome"
//        StringBuffer s = new StringBuffer("welcome");
//        //output a reverse String
//        System.out.println(s.reverse());
        /// Approach 4 : using stringbuilder
//        StringBuilder s2 = new StringBuilder("moe");
//        System.out.println(s2.reverse());

    }
}
