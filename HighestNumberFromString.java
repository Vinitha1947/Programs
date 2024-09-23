public class HighestNumberFromString {
    public static void main(String[] args) {
        String input = "123,456";
        String highestNumber = findHighestNumber(input);
        System.out.println("Highest number: " + highestNumber);
    }

    public static String findHighestNumber(String input) {
        // Split the input string by comma to extract the two numbers
        String[] numbers = input.split(",");

        // Convert the numbers to integers
        int number1 = Integer.parseInt(numbers[0]);
        int number2 = Integer.parseInt(numbers[1]);

        // Compare the numbers and return the higher one
        if (number1 > number2) {
            return String.valueOf(number1);
        } else {
            return String.valueOf(number2);
        }
    }
}
