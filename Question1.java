/*1) Write a program to generate Fibonacci series using Constructors
//Fn = Fn-1+Fn-2
//c  = a + b
 */
import java.util.Scanner;

public class Question1 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the upper value of fibonacci term: ");
    int nt = sc.nextInt();
    Fibonacci Fib = new Fibonacci (nt);

    System.out.print(Fib.getFibonacciSeries());
}
}

class Fibonacci {
    
    private int nt;

    public Fibonacci (int n) {
        nt = n;
    }

    public int getFibonacciSeries () {
        int a = 0; 
        int b = 1;
        int c = 0;
        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= nt; ++i) {
            System.out.print(a + ", ");
            c = a + b;
            a = b;
            b = c;
        
        }
        return a;
    }
     
}
