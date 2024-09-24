package GIT_projects.src;

public class ControlStatement {
    public static void main(String[] args) {

        // Loop demonstrating 'continue'
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Skips printing when i is 3
            }
            System.out.println("Count (continue): " + i);
        }

        // Loop demonstrating 'break'
        for (int i = 1; i <= 5; i++) {
            if (i == 4) {
                break; // Stops the loop when i is 4
            }
            System.out.println("Count (break): " + i);
        }

        // Demonstrating 'return' in a method
        checkNumber(2); // Returns early
        checkNumber(5); // Prints normally
    }

    // Method demonstrating 'return'
    public static void checkNumber(int num) {
        if (num < 4) {
            return; // Exits if number is less than 4
        }
        System.out.println("Number (return): " + num);
    }
}
