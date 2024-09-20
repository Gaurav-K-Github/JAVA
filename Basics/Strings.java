package GIT_projects.src;

public class Strings {
    public static void main(String[] args){
        String st="AbcDe";
        System.out.println(st.toUpperCase());//uppercase conversion method
        System.out.println(st.toLowerCase());//lowercase conversion method
        System.out.println(st.length());//string length method

        String s1="Hello";
        String s2="there!!";
        System.out.println(s1+ " " +s2);//Concatenation using (+) operator
        System.out.println(s1.concat(" "+s2));//Concatenation using inbuilt method
    }
}
