package Java_core;

import java.util.Scanner;

public class Arrays_Assignment {

public static void main(String[] args) {
    //Ex1: Search on element in array (Linear search)
//    int a[]={10,20,30,40,50,50,50,60};
//    int search_element =50;
//    int time = 0;
//    boolean status = false; //false - not found  true-found
//    for(int i = 0; i<a.length-1;i++){
//        if(a[i]==search_element){
//            System.out.println("Element found");
//            System.out.println(i);
//            status = true;
//            break;
//        }
//
//    }
//    for (int x:a){ // cann't know the position
//        if(x== search_element){
//            System.out.println("Element found");
//            status = true;
//            break;
//        }
//    }
//    if(status =false){
//        System.out.println("Element not found");
//    }
/// //////////////////////////////////////////
    //Ex2: Find number of repetations
//    int a[]={10,10,10,20,30,40,10};
//    int search_element = 10;
//    int count = 0;
////
//    for(int value:a){
//        if(value==search_element){
//            count++;
//        }
//    }
//    System.out.println(count);
    /// ///////////////////////////////////////
//    //Ex3: Sorting element using Arrays Class - built in method.
//    int a[] = {200,300,200,400,600,100};
//    System.out.println("Before sorting........"+ Arrays.toString(a));
//    Arrays.sort(a);
//    System.out.println("After sorting......"+ Arrays.toString(a));
//    /// /
//    String b[]= {"coco", "sa","abc","monnoa","acb"};
//    Arrays.sort(b);
//    System.out.println("Sort b: "+ Arrays.toString(b));
//    /// ////
//    //In a reverse order continue with a
//    for(int i = a.length-1; i>=0; i--){
//        System.out.print(a[i]+ " ");
//    }
    /// /////////////////////// Scanner object
    Scanner sc = new Scanner(System.in);
//    Object tune = sc.next();
//    System.out.println(tune);
/// /////////////////////////// Write data into Arrays from user
//    int a[] = new int[5]; //size is 5
//    for ( int i = 0; i < a.length ;i++){
//        System.out.println("Enter number for " + i + " Position: ");
//        a[i]=sc.nextInt();
//    }
//    System.out.println("We have:...."+ Arrays.toString(a));
    /// ////////////////////// Ass1: Sorting array using for loop
//    int tempvar;
//    for( int i = 0; i < a.length -1; i++){
//        for ( int j = i+1; j<a.length-1; j++){
//            if(a[i] > a[j]){
//                tempvar = a[j];
//                a[j]=a[i];
//                a[i] =tempvar;
//            }
//        }
//    }
//
//    System.out.println("Now is"+ Arrays.toString(a));
    /// /////////////////////Ass2: Find missing in number in array : sort and no duplicate
    int a[] = {1,2,4,5};
    int sum1 = 0;
    for ( int i = 0; i < a.length-1; i++){
        sum1+=a[i];
    }
    System.out.println("Value 1: " + sum1);
    int sum2 = 0;
    for (int i = 0; i<=5;i++){
        sum2 = sum2 +i;
    }
    System.out.println("Value 2: "+ sum2);
    if ( sum2 > sum1){
        System.out.println("=> Missing is: "+ (sum2-sum1));
    }

}
}
