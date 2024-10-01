//5. Write a program to swap two numbers without using a temporary variable.

public class Q5 {
    public static void main(String[] args){
        int a=2,b=8;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a+", b="+b);
    }
}
