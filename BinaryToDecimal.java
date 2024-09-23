public class BinaryToDecimal {
    public static void main(String[] args) {
        String binaryString = "10101";
        int decimalValue = binaryToDecimal(binaryString);
        System.out.println("Decimal value: " + decimalValue);
    }

    public static int binaryToDecimal(String binaryString) {
        // Using Integer.parseInt() with radix 2 to convert binary string to decimal
        return Integer.parseInt(binaryString, 2);
    }
}
