public class SumOfAscii {
    public static void main(String[] args){
        String inputString = "Hello";
        int sum = sumOfAscii(inputString);
        System.out.println("Sum of ASCII values: " + sum);
    }

    public static int sumOfAscii(String inputString){
        int sum = 0;

        // Iterate through each character and add its ASCII value to sum
        for(int i = 0; i < inputString.length(); i++){
            char ch = inputString.charAt(i);
            sum += (int) ch;
        }

        return sum;
    }
}
