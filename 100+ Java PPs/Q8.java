//8. Write a Java program to print the multiplication table of a number.


import java.util.*;

public class Q8 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Which table:");
        int n=scan.nextInt();

        for(int i=1;i<11;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
}
