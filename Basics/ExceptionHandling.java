package GIT_projects.src;

import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args){
        //a.Try-Catch & Finally
        try {
            int res = 10 / 0;//throws ArithmeticException
        }catch(ArithmeticException e){
            System.out.println("Not possible to divide!!");

        }finally{
            System.out.println("Always got this one executing!");
        }

        
        //b.Throw
        int age=0;
        if (age==0){
            throw new IllegalArgumentException("Age 18+");
        }

    }
    //c.Throws clause
    public void riskymethod() throws IOException{
        //might throw an IO Exception
    }
}
