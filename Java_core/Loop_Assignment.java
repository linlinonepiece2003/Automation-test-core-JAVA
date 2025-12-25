package Java_core;

import java.util.Scanner;

public class Loop_Assignment {
    public static void main(String[] args) {
        /*Ass1: Reverse a number ( % /= operators)
         input 1234 => output 4321 */
        //Way 1: using algorithm
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to reverse!");
        int num = sc.nextInt();//1234
        int reverse = 0;
        while(num != 0){
            reverse = reverse*10 + num % 10;
            num = num/10;
        }
        System.out.println("Your reverse number is:" + reverse); */
      /// ///////////////////////////////////////////////////////
        //Way 2: Using string buffer class
        /// ///////////////////////////////////////////////////
        //Ass2: Palindrome number
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = sc.nextInt();
        int org_num = number; //create a num to store the original value of number
        int rev = 0;
        while(number!=0){
            rev = rev*10 + number%10;
            number = number/10;
        }
        if ( org_num ==rev){
            System.out.println("This is a palindrome number" );
        }else{
        System.out.println("This is not a palindrome number" );}*/
        /// //////////////////////////////////////////////
        //Ass3: Count number of digits in a number : input 423424 => out = 6
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = sc.nextInt();
        int count = 0;
        int org_num = number;
        number = Math.abs(number); // make it positive
        if( org_num ==0){ // special case
            System.out.println("the number of digits is 1");
        }else{
            while(number !=0){
                number =  number/10;
                count += 1;
            }
            System.out.println("the number of digits is:"+ count);
        }*/

        //Ass4: Count number of even and odd digits in a number: input 23456 => out 3 even 2 odd
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = sc.nextInt();
        int even = 0;
        int odd = 0;
        number = Math.abs(number); // make it positive
        //1234
        if(number == 0){
            System.out.println("even = 1");
        }else {
            while (number != 0) {
                int store = number % 10;
                if (store % 2 == 0) {
                    even += 1;
                } else {
                    odd += 1;
                }
                number = number / 10;
            }
            System.out.println("even: " + even + " odd: " + odd);
        }*/
/// ////////////////////////////////////

        //Ass5: Find sum of digits in a number
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = sc.nextInt();
        number = Math.abs(number);
        // make it positive
        if( number ==0){ // special case
            System.out.println("the sum == 0");
        }else{
            int sum = 0;
            while(number !=0){
                sum += number%10;
                number = number/10;
            }
            System.out.println("the sum of digits is:"+ sum);
        }

    }
}
