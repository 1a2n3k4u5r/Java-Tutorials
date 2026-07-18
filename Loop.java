
// Loops syntax are -
// for(initialisation;condition;updation) {} where initialisation are int counter = 0, and condition is counter < 100, and updation is counter = counter + 1.

// Loops type are - 
// for Loop, While Loop, do while Loop.


// public class Loops {

//     public static void main(String args[]) {
//         for(int counter = 0; counter < 100; counter = counter + 1) {
//      System.out.println("Hello World");
//         }
        
//     }
// }


// print the no. from 1 to 10.

// public class Loop {
   
//     public static void main(String args[]) {
//         // for(int counter = 0; counter < 11; counter++) 
//         for(int i = 0; i < 11; i++ ){
//             // System.out.println(counter);
//              System.out.print(i);
//         }
//     }
// }



// while(condition){
// do something
// }

// public class Loop {

//     public static void main(String args[]) {

//     int i = 0;
//     while(i < 11);
// {
//         System.out.println(i);
//         i = i + 1; // i++; 
//     } 
// }
// }




// do{
 //do something
// }while(condition);

// public class Loop {

//     public static void main(String args[]) {

//     int i = 0;
//     do {
//         System.out.println(i);
//         i = i + 1; // i++; 
//     } while(i < 11);
// }
// }

// print the sum of first n Natural no.

// import java.util.*;

// public class Loop{
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int sum = 0;
//         for(int i=0; i<=n; i++){
//             sum = sum + i;
//         }
//         System.out.println(sum);
//     }
// }



// Print the table of a number input by the user.

import java.util.*;

public class Loop{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

   
        for(int i=1; i<=11; i++){
        System.out.println(i*n);
    }
}
}