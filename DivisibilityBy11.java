public class DivisibilityBy11 {
    public static void main(String[] args){
        int number = 121;
        if(isDivisibleBy11(number)){
            System.out.println(number + " is divisible by 11.");
        } else {
            System.out.println(number + " is not divisible by 11.");
        }
    }
    public static boolean isDivisibleBy11(int number){
        String numStr = Integer.toString(number);
        int sum = 0;
        for(int i = numStr.length() - 1; i >= 0; i--){
            int digit = Character.getNumericValue(numStr.charAt(i));
            sum += (i % 2 == 0) ? digit : -digit;
        }
        return sum % 11 == 0;
    }
}
