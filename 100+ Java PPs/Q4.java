//4. Write a Java program to find the largest of three numbers.

public class Q4 {
    public static void main(String[] args){
        int a=13;
        int b=13;
        int c=13;

        if(a==b&&b==c){
            System.out.println("All are equal!");
        }else if ((a>b)&&(a>c)){
            System.out.println(a+" is greatest!");
        } else if ((b>a)&&(b>c)) {
            System.out.println(b+" is greatest!");
        }else{
            System.out.println(c+" is greatest!");
        }

    }
}
