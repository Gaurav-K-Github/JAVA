//3. Write a Java program to add (User input) two numbers.

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("First number:");
        int n1=scanner.nextInt();
        System.out.print("Second number:");
        int n2=scanner.nextInt();

        System.out.println("Sum="+(n1+n2));
    }
}
