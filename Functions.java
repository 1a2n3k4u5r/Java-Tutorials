 // Function is a block of code which can take a input and perform such a opeartion and produce output.

 // Syntax of a function - returnType fucnctionName(type arg1,type arg2..){
 // opeartions
 // }


 // Print a given name in a function.

//  import java.util.*;

//  public class Functions {
//     public static void printMyName(String name){
//         System.out.println(name);

//     }

//     public static void main(String args[]){
//       Scanner sc = new Scanner(System.in);
//       String name = sc.next();

//       printMyName(name); //call kiya function ko
//     }
//  }


 // Make a function to add 2 numbes and return the sum.

// import java.util.*;

// public class Functions {
//     public static int calculateSum(int a, int b){
//         int sum = a + b;
//         return sum;
//     }

//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int sum = calculateSum(a,b);
//         System.out.println("Sum of 2 numbers is : "+ sum);
//     }
// }



// Make a function to calculate the Product of 2 numbers and return there value.


// import java.util.*;

// public class Functions {
//     public static int calculateProduct(int a, int b) {
//         return a * b;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         System.out.println("Product of 2 numbers is : "+ calculateProduct(a,b));
//     }
// }



// Find the factorial of number.

import java.util.*;

public class Functions {
    public static void printFactorial(int n) {
        //loop
        if(n < 0) {
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;

        for(int i=n; i>=1; i--){
            factorial = factorial * i;
        }

        System.out.println(factorial);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFactorial(n);
    }
 }



 // Difference between functions and methods are - 
 // Methods ko hum call karta hai class ka object ke through.
 // Function ko hum call karta hai directly.
