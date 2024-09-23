public class CorrectDate {
    public static void main(String[] args) {
        // Example date: February 29, 2024 (leap year)
        int day = 29;
        int month = 2;
        int year = 2024;

        if (isValidDate(day, month, year)) {
            System.out.println("The date " + day + "/" + month + "/" + year + " is valid.");
        } else {
            System.out.println("The date " + day + "/" + month + "/" + year + " is not valid.");
        }
    }

    public static boolean isValidDate(int day, int month, int year) {
        // Check if year is within valid range
        if (year < 1) {
            return false;
        }

        // Check if month is within valid range
        if (month < 1 || month > 12) {
            return false;
        }

        // Check if day is within valid range for the given month and year
        int maxDays = getMaxDaysInMonth(month, year);
        if (day < 1 || day > maxDays) {
            return false;
        }

        return true;
    }

    public static int getMaxDaysInMonth(int month, int year) {
        // Array to store the maximum number of days in each month
        int[] maxDays = {31, 28 + (isLeapYear(year) ? 1 : 0), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        return maxDays[month - 1]; // Month index starts from 0
    }

    public static boolean isLeapYear(int year) {
        // Leap year is divisible by 4 but not by 100, or it is divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
