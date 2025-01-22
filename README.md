

Java-based Calculator application. It provides basic arithmetic operations, Fibonacci sequence calculation, and statistical functions like finding the mode and mean of an array. The project is modular, following clean coding principles with separate classes for input handling and calculations


# Features
Arithmetic Operations: Addition, Subtraction, Multiplication,
Division (handles division by zero).

Fibonacci Sequence: Computes the Fibonacci number for a given position.

Statistical Functions: Calculates the mode and mean of an array.

User-Friendly Input: Menu-driven interface for easy navigation.

# Functions

Calculator.java


  add(double, double): Returns the sum of two numbers.
  
  subtract(double, double): Returns the difference of two numbers.
  
  multiply(double, double): Returns the product of two numbers.
  
  divide(double, double): Returns the quotient; handles division by zero.
  
  fibonacci(int): Returns the Fibonacci number at a specific position.
  
  findMode(int[]): Returns the most frequent number in an array.
  
  findMean(int[]): Returns the average of an array.

#CODE:

// Calculator.java
// provides basic arithmetic operations: addition, subtraction, multiplication, and division.

class Calculator {

    //addition of two integers
    int addition(int num1, int num2) {
        return num1 + num2;  // Returns the sum of num1 and num2
    }

    //subtraction of two integers
    int subtraction(int num1, int num2) {
        return num1 - num2;  // Returns the difference of num1 and num2
    }

    // multiplication of two integers
    int multiplication(int num1, int num2) {
        return num1 * num2;  // Returns the product of num1 and num2
    }

    //division of two integers
    float division(int num1, int num2) {
        // Check if the divisor (num2) is zero to prevent division by zero error
        if (num2 == 0) {
            System.out.println("Division by zero is invalid!"); // Display an error message
            return 0.0f; // Return 0.0 as a fallback value
        } else {
            return (float) num1 / num2;  // Perform division and return result as a float
        }
    }
}


  

UserInput.java
  
  getOperationChoice()`: Captures user's choice of operation.
 
  getNumbers()`: Accepts two numbers from the user.
  
  getFibonacciInput()`: Accepts input for the Fibonacci sequence.
  
  getArrayInput()`: Accepts array size and elements for calculations.

  #CODE:
  
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



#GitHub Repository
[Calculator Project](https://github.com/your-username/calculator)



