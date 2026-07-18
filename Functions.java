 // Function is a block of code which can take a input and perform such a opeartion and produce output.

 // Syntax of a function - returnType fucnctionName(type arg1,type arg2..){
 // opeartions
 // }


 // Print a given name in a function.

 import java.util.*;

 public class Functions {
    public static void printMyName(String name){
        System.out.println(name);

    }

    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      String name = sc.next();

      printMyName(name); //call kiya function ko
    }
 }