public class MethodReturnTypes {

    // Method to display a welcome message
    public static void displayWelcomeMessage() {
        System.out.println("Welcome to our program!");
    }

    // Method to calculate the average of two numbers
    public static double calculateAverage(int num1, int num2) {
        return (num1 + num2) / 2.0; // Ensure floating-point division
    }

    public static void main(String[] args) {
        // Displaying welcome message
        displayWelcomeMessage();

        // Declaring values and calculating the average
        int value1 = 20;
        int value2 = 30;
        double result = calculateAverage(value1, value2);

        // Displaying the result
        System.out.println("The average is: " + result);
    }
}
