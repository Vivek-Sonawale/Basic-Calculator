import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        //declaring variables and scanners

        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        char operator;

        //creating while to get input multiple times  and repeatedly solve

        while (true) {
            System.out.println("--------Calculator--------");
            System.out.println("Enter Number 1:");
            num1 = sc.nextInt();
            System.out.println("Enter Number 2:");
            num2 = sc.nextInt();
            System.out.println("Enter Operator/Sign [+,-,*,/,%] EXIT: [C,c] :");
            operator = sc.next().charAt(0);

            //Using Switch Statement here to Check multiple condition

            switch (operator) {
                case '+':
                    System.out.println(num1 + num2);
                    break;
                case '-':
                    System.out.println(num1 - num2);
                    break;
                case '*':
                    System.out.println(num1 * num2);
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Cannot Divide By Zero!!");
                    } else {
                        System.out.println(num1 / num2);
                    }
                    break;
                case '%':
                    System.out.println(num1 % num2);
                    break;
                case 'C':
                    System.out.println("Successfully Exited!! -- Bye Bye👋");
                    System.exit(0);
                    break;
            }
        }
    }
}