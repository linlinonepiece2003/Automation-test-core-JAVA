package Java_core;

public class String_Assignments {
    public static void main(String[] args) {
        //EX1: Check String s = "MADAM" is a palindrome or not
        /// WAY 1 - String - for loop -charAt(i) -equalso
        String s1 = "MADAM";
        String rev ="";
        for( int i = s1.length()-1; i>=0; i--){
            rev = rev + s1.charAt(i);
        }
        if (rev.equals(s1)){
            System.out.println("It is a panlidrome number");
        }else{
            System.out.println("NO");
        }
        /// WAY 2: String buffer
        StringBuilder s2 = new StringBuilder("COLLOC");
        StringBuilder s3 = s2;

        if(s3.equals(s2.reverse())){
            System.out.println("It is palidrome number");
        }else{
            System.out.println("no");
        }

        //EX2: Remove junk or special Characters in String: ,.we$m/?...
        String a = " gho$$ &,*,)?/  latin 017738283";
        a = a.replaceAll("[^a-zA-Z0-9]","");
        // ^ = not // a-z = lowercase // A-Z = upperCase// 0-9 = digit
        System.out.println(a);
        
        //EX3: How to remove white spaces in a string
        String k = "Looop   mop  cay";
        k = k.replaceAll("\\s", "");
        System.out.println(k);


        //EX4: Count Occurrences of a character in a String
       //Way1:
        String n = " jjkdjfhkkjsjsk hjs";
        char origin = 'j';
        int count = 0;
        for ( int i = 0; i< n.length(); i++){
            if( n.charAt(i)== origin){
                count++;
            }
        }
        System.out.println(count);
        //Way2:
        String n2 = "cua do an cua do";
        int Length = n2.length();
        int L_afterremove = n2.replace("a","").length();
        int count2 = Length -L_afterremove;
        System.out.println(count2);

        //EX5: Count words in a string
        String m = " Welcome too";
        System.out.println(m.replaceAll(" ", "").length());
        //EX6: Reverse a number by String buffer

    }
}
