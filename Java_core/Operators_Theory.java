package Java_core;

public class Operators_Theory {
    public static void main(String[] args) {
        // 1) Arithmetic operators + - */ %
//        int a = 20, b = 10;
//        int result = a+b;
//        System.out.println("Sum of a and b is :" + result);
//        System.out.println("Sum of a and b is :" + (a - b));
//        System.out.println("Sum of a and b is :" + (a * b));
//        System.out.println("Sum of a and b is :" + (a/b));
//        System.out.println("Sum of a and b is :" + (a%b));
        // 2) Relational/Comparison operators > >= < <= != ==
        // returns boolean value - true/false
//        System.out.println(a>b); //true
//        System.out.println(a<b); //false
//        System.out.println(a>=b); // true
//        System.out.println(a<=b);// false
//        b = 20;
//        System.out.println(a<=b); // true
//        System.out.println(a>=b);// false
//
//        System.out.println(a!=b); // false
//        System.out.println(a==b);// true
///// //
//        boolean res= a>b;
//        System.out.println(res);
//        /// ///////////////////////////////
//// 3) Logical operators && || !
//        // return boolean value - true/false
//        // works between 2 boolean values
//        boolean x = true;
//        boolean y = false;
//        System.out.println(x && y);//false
//        System.out.println(x || y);//True
//        System.out.println(!x);//false
//        System.out.println(!y);//true
///// /////////////////////////////////////////////////
//        boolean b1 = 10 > 20;
//        System.out.println(b1);//false
//
//        boolean b2 = 20 > 10;
//        System.out.println(b2);//true
//
//        System.out.println(b1 && b2);//false
//        System.out.println(b1 || b2);//true
//        System.out.println(!b1);//true
//        System.out.println(!b2);//false
//
//        System.out.println((10<20) && (20>10));//false
//        System.out.println("//////////////////////");
        /// //////////////////////////////////////
//4) Increment & Decrement operators ++ --
        //  ++ is called increment operator
        //case 1
//        int a =10;
//        System.out.println(a);
//
//        a++;  //a = a + 1;
//        System.out.println(a);// 11

        //case2 - post-increment
//        int a = 10;
//        int res = a++; //post-increment
//        System.out.println(res); //10
//        System.out.println(a);

        //case3 - pre-increment
//        int a =10;
//        int res = ++a;
//        System.out.println(res);
//        System.out.println(a);


// -- is called decrement
        //case 1
//        int a = 10;
//        a--;
//        System.out.println(a);//9
//        //case 2
//        int a = 10;
//        int res = a--;
//        System.out.println(res);//10
//        System.out.println(a);//9
        //case 3
//        int a = 10;
//        int res = --a;
//        System.out.println(res);
//        System.out.println(a);
        /// //////////////////////////////////////
//5, AssigmentOperators
        //Assignment    =   +=   -=    *= /=  %=
        //ex1 +=  -=
//        int a = 10;
//        a+=5; // a = a+ 5;
//        a-=5; // a = a-1;
//        System.out.println(a);
//        //ex2 *= /= %=
//        int a = 10;
//        a*=2;   // a = a*2;
//        System.out.println(a);//20
//        a/=2;
//        System.out.println(a);//10
//        a%=10;
//        System.out.println(a);//0

        /// ///////////////////////////////
// Different between == ( compare)  and  = ( assign)
        /// ///////////////////////////////
//Ternary operators
//var = exp? result1 : result2
        //Example 1
//        int a = 100, b =200;
//        int x = (a<b)? a:b;
//        System.out.println(x);
        //Example 2
//        int x =(1==2)? 100:200;
//        System.out.println(x);
        //Example 3
//        int person_age = 10;
//        String res = (person_age >= 18)? "permit":"not permit";
//        System.out.println(res);

        /// //////////////////////////////////


    }

}
