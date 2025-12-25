package Java_core;

public class Conditional_Theory {
    public static void main(String[] args) {
          int person_age = 15;
//          if(person_age >= 18){
//              System.out.println("eligible for vote"); //if condition is true, it will print this
//          }
//if else
        ///   //////////////////
        //Check person_age
        /*if(person_age >= 18){
            System.out.println("eligible for vote");
        }
        else {
            System.out.println("Not eligible for vote");
        }*/
        /// ////////////////////
        //Example 1
        //Check even or odd number
//        int num = 10;
//        if(num%2==0){
//            System.out.println("Even number");
//        }else{
//            System.out.println("Odd number");
//        }
        /// /////////////////////////////
        //Example 2
        //Check positive number or negative number or zero
//        int num = -2;
//        if(num > 0){
//            System.out.println("positive number");
//        }else if(num < 0){
//            System.out.println( "negative number");
//
//        }else{
//            System.out.println("it's zero");
//        }
        /// ///////////////////////////////
        //Example 3
        // Check the largest number in 3 numbers
//        int a =10, b =40, c =30;
//        if(a>b && a>c){
//            System.out.println("a is the largest number"+a);
//        }else if(b>c){
//            System.out.println("b is the largest number"+b);
//        }else{
//            System.out.println("c is the largest number"+c);
//        }
        /// ////////////////////////////
// nest if else
        //Example 1
//        if(false){
//            if(false){
//                System.out.println("abc");
//            }else{
//                System.out.println("Xyz");
//            }
//        }else{
//            System.out.println("123");
//        }
        /// /////////////////////////////////
        //Example 2: Check the name of the week
//        int week = 10;
//        if(week == 1){
//            System.out.println("Sunday");
//        }else if(week ==2){
//            System.out.println("Monday");
//        }else if(week ==3){
//            System.out.println("Tuesday");
//        }else if(week ==4){
//            System.out.println("Thursday");
//        }else if(week == 5){
//            System.out.println("Friday");
//        }else if(week==6){
//            System.out.println("Saturday");
//        }else{
//            System.out.println("Invalid week");
//        }
/// ///////////////////////////////////////////////////////////////////
//Switch case ( reduced code of if else)
        int weekno = 8;
        switch(weekno){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid number");
        }
    }
}
