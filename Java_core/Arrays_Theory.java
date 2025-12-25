package Java_core;

public class Arrays_Theory {
    public static void main(String[] args) {
        //1. Declare an array
        //Approach 1: store the space and then assign the values into its
//        int a[] = new int[5];
//        a[1] = 100;
//        a[2] = 200;
//        a[3]= 300;
//        a[4]= 400;
//        a[0]= 500;
        //Approach directly if you don't know how many data you need to store
//        int b[] ={100,200,300,400,500};
        //find length of an array
//        System.out.println("length of an array : "+a.length);
        //read single value fin an array
//        System.out.println(a[4]);
        // read all elements using loop
        //normal for loop
//        for ( int i =0;i <=b.length-1;i++){
//            System.out.println(a[i]);}
//
        //for each loop: most use for array hashmap...
//
        /// /////////////////////////////////////////
        //2 dimensional arrays
        //Aproach 1:
//        int a[][]= new int[3][2];
//        a[0][0]= 100;
//        a[0][1] = 200;
//        a[1][0] = 300;
//        a[1][1] = 400;
//        a[2][0]= 500;
//        a[2][1]= 600;
//        //aproach 2
//        int a[][] = {{100,200},{300,400},{500,600}};
//        //find size of an array
//        System.out.println("length of rows "+a.length );
//        System.out.println("column of rows "+ a[0].length);
//        //read single value from an array
//        System.out.println(a[2][1]);
        //read all normal  form
//        for ( int r = 0; r <= a.length -1; r++){ //outer for loop
//            for(int c =0; c<=a[r].length-1; c++){ //inner for loop
//                System.out.print(" "+ a[r][c]);
//            }
//            System.out.println();
//        }
        //read all with enhanced for loop
//        for ( int arr[]:a){
//            for(int x:arr){
//                System.out.print(x + "  ");
//            }
//            System.out.println();
//        }
        /// ////////////////////////////////
//        Object a[] = {100, 10.5,'A',"Wekcome", true};
//        for (Object x: a){
//            System.out.println(x);
//        }
        /// //////////////////////////
        // Find Sum of elements in Array
//        int a[] = {1,2,3,4,5};
//        int sum = 0;
//        for ( int x: a){
//            sum+=x;
//        }
//        System.out.println(sum);
        ///////////////////////////////////////
//Print even and odd numbers from array
        int a[]={1,2,3,4,5,6};
        int even = 0;
        int odd = 0;
        for (int x: a){
            if(x%2==0){
                even+=1;
            }else{
                odd+=1;
            }
        }
        System.out.println("even : "+ even+ "; odd : "+odd);

    }

}
