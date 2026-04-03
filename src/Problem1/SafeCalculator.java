package Problem1;

import java.util.Scanner;

public class SafeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a, n; int b, c;
        while (true){
            try {
                System.out.print("Enter first number (or 'exit'): ");
                a = sc.nextLine();
                if (a.equals("exit")) {
                    System.out.println("Goodbye!");
                    break;
                }
                else {b=Integer.parseInt(a);}
                System.out.print("Enter second number (or 'exit'): ");
                n = sc.nextLine();
                if (n.equals("exit")) {
                    System.out.println("Goodbye!");
                    break;
                }
                else {c=Integer.parseInt(n);}
                int result=b/c;
                System.out.print("Result is: "+result);
            }catch (ArithmeticException e){
                System.out.println("Can not divide by zero");
            }catch (NumberFormatException e) {
                System.out.println("Try again");
            }
        }
    }
}
