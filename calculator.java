// Calculator.java
// provides basic arithmetic operations: addition, subtraction, multiplication, and division.

class Calculator {

    //addition of two integers
    int addition(int num1, int num2) {
        return num1 + num2;  
    }

    //subtraction of two integers
    int subtraction(int num1, int num2) {
        return num1 - num2;  
    }

    // multiplication of two integers
    int multiplication(int num1, int num2) {
        return num1 * num2;  
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

