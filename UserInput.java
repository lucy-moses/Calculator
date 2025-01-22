import java.util.*;  // Importing the Scanner class for user input

// Class to handle user input and perform arithmetic operations
class UserInput {

    // Method to take two numbers as input from the user
    int[] userInput() {
        int[] numbers = new int[2];  // Array to store two numbers
        Scanner scan = new Scanner(System.in);  // Scanner object to read input

        // Prompting user to enter first number
        System.out.println("Enter the first number:");
        numbers[0] = scan.nextInt();  // Storing first number in array

        // Prompting user to enter second number
        System.out.println("Enter the second number:");
        numbers[1] = scan.nextInt();  // Storing second number in array

        return numbers;  // Returning the array containing the two numbers
    }

    // Method to display menu and perform arithmetic operations
    void performOperation() {
        Scanner scan = new Scanner(System.in);  // Scanner object to read input
        Calculator calculator = new Calculator();  // Creating an instance of Calculator class
        boolean continueOperations = true;  // Boolean flag to control the loop

        while (continueOperations) {  // Loop until user chooses to exit
            // Displaying operation choices to the user
            System.out.println("Choose an operation to perform:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            int choice = scan.nextInt();  // Reading user's choice

            // Checking if the choice is valid for an arithmetic operation
            if (choice >= 1 && choice <= 4) {
                int[] inputs = userInput(); // Get user input only once before performing operations
                
                // Switch-case to perform the chosen arithmetic operation
                switch (choice) {
                    case 1:
                        System.out.println("Addition Result: " + calculator.addition(inputs[0], inputs[1]));
                        break;
                    case 2:
                        System.out.println("Subtraction Result: " + calculator.subtraction(inputs[0], inputs[1]));
                        break;
                    case 3:
                        System.out.println("Multiplication Result: " + calculator.multiplication(inputs[0], inputs[1]));
                        break;
                    case 4:
                        System.out.println("Division Result: " + calculator.division(inputs[0], inputs[1]));
                        break;
                }
            } 
            // If user selects option 5, exit the loop
            else if (choice == 5) {
                System.out.println("Exiting the program. Goodbye!");
                continueOperations = false;  // Setting flag to false to stop the loop
            } 
            // If user enters an invalid choice, prompt again
            else {
                System.out.println("Invalid choice! Please select a valid option.");
            }
        }
    }
}
