
// Arrays- List of items of the same type
// Syntax of Array - type[]arrayName = new type[size];
// examples = int[] marks = new int[3];

// import java.util.*;

// public class Arrays {
    
//     public static void main(String args[]){
//         // int[] marks = new int[3];
//         int marks[] = new int[3];
//         marks[0] = 97; //phy
//         marks[1] = 98; // chem
//         marks[2] = 95; //eng
//         // System.out.println(marks[0]);
//         // System.out.println(marks[1]);
//         // System.out.println(marks[2]);

//         for(int i=0; i<3; i++) {
//             System.out.println(marks[i]);
//         }
//     }
// }

// import java.util.*;

//  public class Array{

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int numbers[] = new int[size];
       
        
//         for(int i=0; i<size; i++){
//             System.out.println(numbers[i]);
//         }
//     }
// }


// // Defining an array(2)
// type[]arrayName = {1,2,3,4,5,6};

import java.util.*;

public class Arrays {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }

        //output
        for(int i=0; i<size; i++){
            System.out.println(numbers[i]);
        }
    }
}

