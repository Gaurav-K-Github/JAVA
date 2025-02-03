package GIT_projects.src;

public class Loops {
    public static void main(String[] args){

        //1.Looping with for loop
        for(int i=20;i>=5;i--){
            System.out.println("Count:"+ i);
        }



        

        
        System.out.println("\n");



        //2.Looping with while loop
        int i=0;
        while(i<5) {
            System.out.println("Count:" + i);
            i++;
        }


            System.out.println("\n");



        //3.Looping with Do while loop
        int j=1;
        do{
            System.out.println("3*"+j+"="+j*3);
            j++;
        }while(j!=11);


    }
}
