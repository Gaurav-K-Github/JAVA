//9. Write a program to find the factorial of a number using loops.


import java.util.*;

public class Q9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter number:");
        int n=scan.nextInt();
        int f=1;

        for (int i=1;i<=n;i++){
            f=f*i;
        }

        System.out.println("Factorial of "+n+" = "+f);
    }
}
