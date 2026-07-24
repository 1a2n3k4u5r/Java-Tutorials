// Print  Numbers from 5 to 1.

// public class Recursion1 {
//     public static void printNumb(int n){
//         if(n == 0){ // Base
//             return;
//         }
//         System.out.println(n); // print
//         printNumb(n-1); // recursion
//     }

//     public static void main(String args[]){
//         int n = 5;
//         printNumb(n); // n=5
//     }
// }

// jab bhi recursion ho rhi hoti hai memory ka andar to sari ki sari function call jo ho rhi hoti stacks ka form ma save ho rhi hoti hai.


// print Number from 1 to 5

// public class Recursion1 {

//     public static void printNumb (int n){
//         if(n == 6){
//             return;

//         }
//         System.out.println(n);
//         printNumb(n+1);
//     }

//     public static void main(String args[]) {
//         int n =1;
//         printNumb(n); // n=1
//         }
// }


//print the sum of n natural numbers.

// public class Recursion1 {
//     public static void printSum(int i, int n, int sum){
//         if(i == n){
//             sum += i;
//             System.out.println(sum);
//             return; //?
//         }
//         sum += i;
//         printSum(i+1, n, sum);
//         System.out.println(i);

//     }
//     public static void main(String args[]){
//         printSum(1, 5, 0);
//     }
// }


// printSum ka andar three parameter are there 1) which explian that which no. we are
// 2) explain that what are the base  condition  ani final value n ki kya hogi.
// 3) explain the value of the sum and store the value.


// Print factorial of a number n.
// info => n = 5;
// kaam -> 1) (n-1)!
// 2) n * (n-1)!
// 3) Base Case -> (n == 1) return 1;


// public class Recursion1 {
//     public static int calcfactorial(int n){
//          if(n == 1 || n == 0){
//             return 1;
//          }
//         int fact_nm1 = calcfactorial(n-1);
//         int fact_n = n * fact_nm1;
//         return fact_n;
            
//     }
//     public static void main(String args[]){
//        int n = 5;
//        int ans = calcfactorial(n);
//        System.out.println(ans);
//     }
// }   // output = 120



// print the fibonacci sequence til nth term*
// 1) given => 1st = 0, 2nd = 1;
// 2) "kaam" => create the next term.
// 3) Base case = nth term


public class Recursion1 {
    public static void printFib(int a, int b, int n){
        if(n == 0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFib(b, c, n-1);
    }

    public static void main(String args[]){
      int a =0, b = 1;
      System.out.println(a);
      System.out.println(b);
      int n = 7;
      printFib(a, b, n-2);
    }
}  // output = 0,1,1,2,3,5,8


// print x^n(stack height = n)