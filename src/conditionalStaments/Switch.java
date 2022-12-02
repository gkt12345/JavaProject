package conditionalStaments;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please press 1st no.");
        int a = sc.nextInt();
        System.out.println("please press 2nd no.");
        int b = sc.nextInt();
        System.out.println("please press 1 for addition, 2 for subtraction, 3 for multiply, 4 for divide, 5 for moduler.");
        int operator = sc.nextInt();


        switch (operator){
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
            case 5:
                System.out.println(a % b);
                break;
            default:
                System.out.println("wrong operator");
                break;
        }
    }
}
