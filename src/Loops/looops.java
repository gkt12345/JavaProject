package Loops;

import java.util.Scanner;
public class looops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // for loop
        //print sum of First n natural number
        System.out.print("please enter n: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += i;
        }
        System.out.println("sum of all natural number of "+ n +" is: "+ sum);
        //while loop:-
        //make a table of two.
//        int i = 1;
//        while(i <= 10){
//            System.out.println(2*i);
//            i++;
//        }

        //do while:-
//        int i = 1;
//        do{
//            System.out.println(i);
//            i++;
//        }while (i<=10);




    }
}
