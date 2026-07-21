// Left Shift - N<<i
// right shift - N>>i

// Bit manipulation types are:
// Get,Set,Clear,Update

//Get Bit - get the 3rd bit(position = 2) of a number n.(n = 0101)
// Bit Mask: 1<<i
//Operatiion: AND

// Solution ->  1) 1<< 2 = 0001 << 2 -> 0100
// 2) 0100 AND 0101 -> 0100 which is non-zero because here is 1 at the 3rd position .

// import java.util.*;

// public class Bits {
//     public static void main(String args[]){
//         int n = 5;
//         int pos = 2;
//         int bitMask = 1<<pos;

//         if((bitMask & n) == 0){
//            System.out.println("bit was zero");
//         } else {
//             System.out.println("bit was one");
//         }
//     }
// }


// set Bit
// Set the 2nd bit(position = 1) of a number n. (n = 0101).
// Bit Mask: 1<<i.
// Operation: OR

// 1) 1<<1 -> 0001<<1 -> 0010
// 2) 0010 OR 0101 -> 0111 ->(7)

// import java.util.*;

// public class Bits {
//     public static void main(String args[]) {
//         int n = 5; //0101
//         int pos = 3;
//         int bitMask = 1<<pos;

//         if((bitMask & n) == 0) {
//             System.out.println("bit was zero");
//         } else {
//             System.out.println("bit was one");
//         }
//     }
// }

// import java.util.*;

// public class Bits {
//     public static void main(String args[]) {
//         int n = 5; //0101
//         int pos = 1;
//         int bitMask = 1<<pos;

//         int newNumber = bitMask | n;
//         System.out.println(newNumber);
//     }

// }

// Clear Bit 
// Clear the 3rd bit (position = 2)of a number n.(n = 0101)
// bit Mask: 1 << i
// Operation : AND with NOT
// 1) 1 << 2 => 0001 << 2 -> 0100
// 2) ~(0100) => 1011
// 1011 & 0101 => 0001 => (1)

// import java.util.*;

// public class Bits {
//     public static void main(String args[]){
//         int n = 5; //0101
//         int pos = 2;
//         int bitMask = 1<<pos;
//         int notBitMask = ~(bitMask);

//         int newNumber = notBitMask & n;
//         System.out.println(newNumber);

//     }
// }


// Update Bit = Update the 2nd bit(position = 1) of a number n to 1.(n = 0101)

// for 1 = Bit Mask: 1 << i
// operation: And with Not. it is a clear

// for 0 = Bit Mask: 1 << i
// Operation: OR. it is a set 

import java.util.*;

public class Bits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        // oper=1 : set oper=0: clear
        int n = 5;  //0101-> 0111 -> dec 7

        //set oper
        int bitMask = 1<<pos;
        if(oper ==1){
            //set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            //clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
}