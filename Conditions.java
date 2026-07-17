// import java.util.*;

// public class Conditions {
    
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();

//         if(age > 18) {
//             System.out.println("Adult");  
//         } else {
//             System.out.println("Not Adult");
//         }
//      }
// }


// import java.util.*;

// public class Conditions {
    
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();

//         if(x % 2 == 0) {
//             System.out.println("Even");  
//         } else {
//             System.out.println("Odd");
//         }
//      }
// }


// import java.util.*;

// public class Conditions {

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         if(a == b) {
//             System.out.println("Equal");
//         } else if(a > b) {
//             System.out.println("a is greater");
//         }
//         else {
//             System.out.println("a is lesser");
//         }
//     }
// }


// Print the Greeting - Hello,Namaste,Bonjour.

import java.util.*;

public class Conditions {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

    //   if(button == 1) {
    //     System.out.println("Hello");
    // }else if(button == 2){
    //     System.out.println("Namaste");
    // }else if(button == 3){
    //     System.out.println("Bonjour");
    // }else {
    //     System.out.println("Invalid Button");
    // }


    // using switch statement

    switch(button) {
        case 1 : System.out.println("hello");
        break;
        case 2 : System.out.println("namaste");
        break;
        case 3 : System.out.println("bonjour");
        default : System.out.println("Invalid Button");
    }
  }
}