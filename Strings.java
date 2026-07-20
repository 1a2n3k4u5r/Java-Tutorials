// import java.util.*;
// public class Strings {
    
//     public static void main(String args[]) {
//         //compare
//         String sentence = "My name is Ankur";
//         String name = sentence.substring(11, sentence.length());
//         System.out.println(name);


        // Scanner sc = new Scanner(System.in);
        //  String name = sc.nextLine();
        //  System.out.print("Your name is : "+ name);


        //String Declaration

        // String name = "Tony";
        // String fullName = "Tony Stark";
        // String sentence = "My name is Tony Stark.";

        // concatenation
        // String firstName = "ankur";
        // String lastName = "yadav";
        // String fullName = firstName + "@" + lastName; // ankur@yadav
        // System.out.println(fullName.length());

        // //charAt
        // for(int i=0; i<fullName.length(); i++) {
        //     System.out.println(fullName.charAt(i));
        // }

        //compare
        // String name1 = "ankur";
        // String name2 = "ankur";

        //1) s1 > s2 : +ve value
        // 2) s1 == s2 : 0
        // 3) s1 < s2 : -ve value

        // hello cello
        // if(name1.compareTo(name2) == 0) {
        //    System.out.println("Strings are not equal");
        // }else {
        //     System.out.println("Strings are not equal");
        // }

        //  if(name1 == name2) {
        //    System.out.println("Strings are equal");
        // }else {
        //     System.out.println("Strings are not equal");
        // }

        // if(new String("Ankur") == new String("Ankur")) {
        //     System.out.println("Strings are equal");
        // }else {
        //     System.out.println("Strings are not equal");
        // }

        //Strings in java are Immutable
//   }
//  }

// import java.util.*;

// public class Strings {
//         public static void main(String args[]){
//                 StringBuilder sb = new StringBuilder("Tony");
//                 System.out.println(sb);

//         //char at index 0
//         System.out.println(sb.charAt(0));

//         //set char at index 0
//         System.out.println(sb);
//         sb.setCharAt(0,'P');
//         }
// }

// import java.util.*;

// public class Strings {

// public static void main(String args[]) {
// // StringBuilder sb = new StringBuilder("Tony");
// // System.out.println(sb);

// // sb.insert(2, 'n');
// // System.out.println(sb);

// // // delete the extra 'n'
// // sb.delete(2, 3);
// // System.out.println(sb);

// StringBuilder sb = new StringBuilder("h");
// sb.append("e");
// sb.append("l");
// sb.append("l");
// sb.append("o");
// // System.out.println(sb);
// System.out.println(sb.length());
//   }
// }


import java.util.*;
public class Strings{
public static void main(String args[]){
        StringBuilder sb = new StringBuilder("hello");
  for(int i=0; i<sb.length()/2; i++){
       int front = 1;
       int back = sb.length() -1 - i;  // 5-1-0 = > 4

       char frontChar = sb.charAt(front);
       char backChar = sb.charAt(back);

       sb.setCharAt(front, backChar);
       sb.setCharAt(back, frontChar);
   }

   System.out.println(sb);
 }    
}