public class DecimalToBaseConversion {
    public static void main(String[] args){
        int decimalNumber = 17;
        int base = 2;
        String result = convertToBase(decimalNumber, base);
        System.out.println("Result in base " + base + ": " + result);
    }

    public static String convertToBase(int decimalNumber, int base){
        StringBuilder result = new StringBuilder();

        // Handle cases where the decimal number is 0
        if(decimalNumber == 0){
            return "0";
        }

        // Convert the decimal number to the specified base
        while(decimalNumber > 0){
            int remainder = decimalNumber % base;
            result.insert(0, remainder); // Insert the remainder at the beginning of the result
            decimalNumber /= base; // Update the decimal number by dividing it by the base
        }

        return result.toString();
    }
}
