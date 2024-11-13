package GIT_projects.src;

public class Conditionals {
    public static void main(String[] args){
        int i1=2;
        if (i1!=0){//Simple if condition
            System.out.println("Non zero number!\n");
        };

        
        
        int i2=0;
        if (i2!=0){//If-Else statement
            System.out.println("Non zero number!\n");
        }
        else{
            System.out.println("Zero!\n");
        };



        

        int i3=-2;
        if (i3>0){//Else-if ladder
            System.out.println("A positive number!\n");
        }else if (i3<0){
            System.out.println("A negative number!\n");
        }else{
            System.out.println("Zero!\n");
        }




        
        int day=3;
        switch (day) {//Switch Statement
            case 1:
                System.out.println("Sunday\n");
                break;

            case 2:
                System.out.println("Monday\n");
                break;

            case 3:
                System.out.println("Tuesday\n");
                break;

            default:
                System.out.println("Invalid day\n");
        }
    }
}
