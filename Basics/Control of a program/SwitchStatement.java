package GIT_projects.src;

public class SwitchStatement {
    public static void main(String[] args){

        int day=2;
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;

            case 2:
                System.out.println("Monday");
                break;

            case 3:
                System.out.println("Tuesday");
                break;

            default:
                System.out.println("Invalid day");
        }
    }
}
