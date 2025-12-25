package Java_core;

public class StringMT_Theory1 {
    public static void main(String[] args) {
        //String s = "Welcome";
//        String s = new String("welcome");
        /// //Length() - length of of a string ( no inside)
//        System.out.println(s.length());
//        System.out.println("mamacallme".length());
        /// /concat() - joining strings
//        String s1 = "bubu";
//        String s2 = "lala";
//        String s3 = "automation";
//        System.out.println(s1+s2 + s3 +" or "+ s1.concat(s2).concat(s3));
//        System.out.println("lulu".concat("shocking"));
        /// /trim() - remove space right ad left sides
        //String s = "  welcome ";
//        s.trim();
//        System.out.println(s.trim());
        /// /charAt() - returns a character from a string based on index
        //System.out.println(s.charAt(3));
        /// /contains() - contains part of the string true or not
        //System.out.println(s.contains("we"));
        ////equals() , equalsIgnoreCase() - compare strings
//        System.out.println(s.equals("welcome"));
//        System.out.println(s.equalsIgnoreCase("Welcome"));
        /// replace() - replace single/multiple (sequance) of characters in a string
//        s = "welcome to selenium java selenium python selenium c#";
//        System.out.println(s.replace('e','x')); e => x
//        System.out.println(s.replace("selenium", "playwright"));;
        ////substring() - extract substring from the main string
//        System.out.println(s.substring(0,4)); //from index to index
        /// /toUpperCase()  toLowerCase()
//        s ="Welcome";
//        System.out.println(s.toLowerCase());
//        System.out.println(s.toUpperCase());
        /// /split() - split the string into multiple parts based on delimeter
//        s ="abccdf@gmail.com";
//        System.out.println(s.substring(0,3));//abc
//        String a[]=s.split("@");
//        System.out.println(a[0]);
//        System.out.println(a[1]);
//        System.out.println(Arrays.toString(a));
        /// ex1
//        String amount ="$15,20,55";
//        System.out.println(amount.replace("$","").replace(",",""));/////exp 152055
        /// ex2 - need to store value in a array after split then print by Array.tóString()
//        String s = "abc,123@xyz";
//        String a[] =s.split(",");
//        System.out.println(Arrays.toString(a));
//        String a1[]=a[1].split("@");
//        System.out.println(Arrays.toString(a1));
//        System.out.println(a[0]);
//        System.out.println(a1[0]);
//        System.out.println(a1[1]);
        /// /ex3
//        String name = "John Kenedy";
//        System.out.println(name.contains("john"));
//        System.out.println(name.toLowerCase().contains("john"));
        /// /////////////////////////////
        //CASE 2 remember String s1 ="knk" s1 is not an object
        //CASE 1
        /// String comparison with object s1,s2 and value
      String s1 = new String("locloc");
       String s2 = new String("locloc");
       System.out.println(s1);
       System.out.println(s2);
        System.out.println(s1==s2); //compare the objects
      System.out.println(s1.equals(s2));//compare the value of the object
        //CASE 3
//        String s1 = "abc";
//        String s2 = new String ("abc");
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));
        /// /=> USING EQUALS() when compare value of the object








    }
}
