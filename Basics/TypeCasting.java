package GIT_projects.src;

public class Typecasting {
    public static void main(String[] args){
        int no=9;
        double no2 =(int) no;//Manual (Narrowing casting)
        System.out.println(no2);

        System.out.println(no*no2);//Automatic (Widening casting)
    }
}
