package Java_core;

public class Loop_Theory {
    public static void main(String[] args) {
        //Loop/Iterative statements
//        ----------------------------

//        while
        //Example 1: print 1 ....10 munbers
       /* int i = 1; //initilization
        while(i<=10) //condition is true
        {
            //statements + dec/inc
            System.out.println((i));
            i++;//inc
        } //ctrl + shift + F10 for run */
        // Example 2: print hello message 10 times
        /* int i = 1;
        while(i<=10)
        {
            System.out.println("Hello");
            i++;
        } */
        //Example3: print even numbers between 1....10
        //Approach 1
        /*int i = 2;
        while( i <=10)
        {
            System.out.println(i);
            i += 2;
        } */
        //Approach 2
        /*int i = 1;
        while ( i <=10)
        {
            if( i%2 == 0){
                System.out.println(i);
            }
            i++;
        }*/
        //example 4: 1...10 odd-even-odd-even
        /*int i = 1;
        while(i<=10)
        {
            if(i % 2 ==1){
                System.out.println(i + " odd");
            }else{
                System.out.println(i + " even");
            }
            i++;
        } */
        //Example 5: print 10----1
        /*int i = 10;
        while ( i>=1)
        {
            System.out.println(i);
            i--;
        }*/
        /*Where to use while loop : uncertain how many times */
//        int i = 1;
//        while(true){
//            System.out.println("Hello");
//            i++;
//            if (i==10){
//                break;
//            }
//        }
        /// ///////////////////////////////////////////////
//        do while
        //Example 1: 1.....10 numbers
//        int i =1;// initilization
//        do{
//          //statements + inc/dec
//            System.out.println(i);
//            i++;
//        }while(i<=10);//condition
        // Example 2: 10, 9, 8,....1
//        int i =10;
//        do{
//            //statements
//            System.out.println(i);
//            i--;
//        }while(i>0);
        /// //////////////////////////////////////////
//        for loop
        //Ex1: 1....10 members
//        for(int i =1; i<10; i++){
//            System.out.println(i);
//        }
        //Ex2: 1......10 even numbers
//        for(int i =2; i <=10; i+=2){
//            System.out.println(i);
//        }
        //Ex3: odd-even
//        for ( int i = 1; i<=10; i++){
//            if ( i % 2 !=0){
//                System.out.println("odd");
//            }else{
//                System.out.println("even");
//            }
//        }
        //Ex4: 10.........1 dec
//        for ( int i = 10; i>0; i--){
//            System.out.println(i);
//        }
        /// ///////////////////////////
//        enhanced for loop
        /// ///////////////////////
// Jumping statements
        //Break jumping out of the program
        //ex1
        /*for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
                //statements here is invalid
            }
            System.out.println(i);
        }*/
        //Continue
//        for (int i = 1; i <= 10; i++) {
//            if (i == 5 || i == 9) {
//                continue;
//                //statements here is invalid
//            }
//            System.out.println(i);
//        }
    }
}
