package Loops;

public class patteerns {
    public static void main(String[] args) {
        //print pattern butterfly :-
//            *        *
//            **      **
//            ***    ***
//            ****  ****
//            **********
//            **********
//            ****  ****
//            ***    ***
//            **      **
//            *        *

//        int n = 5;
//        //Upper half
//        for(int i=0; i<n; i++) {
//            //first part
//            for (int j=0; j<=i; j++) {
//                System.out.print("* ");
//            }
//            //spaces
//            int spaces=2*(n-1-i);
//
//            for (int j=0; j<spaces; j++) {
//                System.out.print("  ");
//            }
//
////            2nd part
//            for(int j=0; j<=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        //Lower half
//        for(int i=n; i>0; i--) {
//            //first part
//            for (int j=0; j<i; j++) {
//                System.out.print("* ");
//            }
////            spaces
//            int spaces=2*(n-i);
//
//            for (int j=0; j<spaces; j++) {
//                System.out.print("  ");
//            }
//
////            2nd part
//            for(int j=0; j<i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        //print pattern :-
//                ****
//               ****
//              *****
//             *****
//            *****

//    int n = 5;
//
//    for(int i=0; i<n; i++){
//        for(int j=0; j<n-i-1; j++){
//            System.out.print("  ");
//        }
//        for(int j=0; j<n; j++){
//            System.out.print("* ");
//        }
//        System.out.println();
//    }

        //print number pattern :-
//        1
//       2 2
//      3 3 3
//     4 4 4 4
//    5 5 5 5 5


    int n = 5;

    for(int i=1; i<=n; i++){
        for(int j=i; j<=n-1; j++) {
            System.out.print(" ");
        }
        for(int j=0; j<i; j++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }




    }
}
