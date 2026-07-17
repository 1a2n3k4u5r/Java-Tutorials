// public class Variables {
//     public static void main(String[] args) {
//         // variables
//         int a = 10;
//         int b = 20;

//         int sum = a + b;
//         System.out.print(sum);
//     }
// }

// Java is a typed language is language ma koi bhi variable batna se phala ye batna padta ha ki us variable ka type kya hai

// Data Types are two types -
// 1) Primitive data types: byte,short,char,boolean,int,long,float,double.
// 2) Non-Primitive data type: String,Array,Class,Object,Interface.


// java ka andar input hum ek scanner class ki help se lata hai

import java.util.*;

public class Variables {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        String name = sc.next(); // here next can take only one token at a time. 
        //nextInt()
        //nextFloat()
     // String name = sc.nextLine();  here nextLine is used to print the whole line
       System.out.println(name);
    }
}

// Take 2 variables 'a' & 'b' and print their sum.

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a + b;
//         System.out.println("sum")
//     }
// }