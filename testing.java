
import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        // Test case 1: Valid age
        Scanner sc = new Scanner(System.in);


        int age = sc.nextInt();

        if (age >= 18 && age <= 60) {
            System.out.println("Test case 1 passed: Valid age");
        } else {
            System.out.println("Test case 1 failed: Invalid age");
    

        //test case 2 : 
        String password = sc.nextLine();
        if (password.length() >= 6 && password.length() <= 12) {
            System.out.println("Test case 3 passed: Valid password");
        } else {
            System.out.println("Test case 3 failed: Invalid password");
        }

        

        // Test case 3: Valid course type
        String courseType = sc.nextLine();
        if (courseType.equalsIgnoreCase("java")) {
            System.out.println("Test case 5 passed: Valid course type");
        } else {
            System.out.println("Test case 5 failed: Invalid course type");
        }

        // Test case 4: Scholarship applied
        boolean scholarshipApplied = true;
        if (scholarshipApplied) {
            System.out.println("Test case 7 passed: Scholarship applied");
        } else {
            System.out.println("Test case 7 failed: Scholarship not applied");
        }
    }
}

}