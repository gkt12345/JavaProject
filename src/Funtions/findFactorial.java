package Funtions;

import java.util.Scanner;

public class findFactorial {
    public static void printFactorial(int n){
        if(n <= 0){
            System.out.println("invalid no");
            return;
        }
        int factorial = 1;
        for(int i=n; 1<=i; i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFactorial(n);
    }
}
