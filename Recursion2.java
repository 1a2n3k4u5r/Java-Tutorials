// Tower of Hanoi.
// Rules - 1) Only one disk transferred in 1 step.
// 2) Smaller disks are always kept on top of larger disks.

// public class Recursion2 {
//     public static void towerOfHanoi(int n, String src, String helper, String dest){
//         if(n ==1){
//             System.out.println("transfer disk"+ n + " from "+src+" to "+dest);
//             return;
//         }
//         towerOfHanoi(n-1, src, dest, helper);
//         System.out.println("transfer disk "+ n + " from "+src+" to "+dest);
//         towerOfHanoi(n-1, helper, src, dest);
//     }

//     public static void main(String args[]){
//         int n = 1;
//         towerOfHanoi(n, "s", "H", "D");
//     }
// }
// // complexity = O(2^n).



// print the reverse of 'abcd'
public class Recursion2 {
    public static void printRev(String str, int idx){
        if(idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
 
        System.out.println(str.charAt(idx));
        printRev(str, idx-1);
    }
     public static void main(String args[]){
        String str = "abcd";
        printRev(str, str.length()-1);
     }

}
// Time complexity = O(n)