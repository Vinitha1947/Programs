public class EnglishDatePrinter {
    public static void main(String[] args){
        int day = 30;
        int month = 4;
        int year = 1956;
        String englishDate = getEnglishDate(day, month, year);
        System.out.println("English Date: " + englishDate);
    }
    public static String getEnglishDate(int day, int month, int year){
        String[] months = {
                "", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
        };
        String suffix = getDaySuffix(day);
        return months[month] + " " + day + suffix + ", " + year;
    }
    public static String getDaySuffix(int day){
        if(day >= 11 && day <= 13){
            return "th";
        }
        switch(day % 10){
            case 1: return "st";
            case 2: return "nd";
            case 3: return "rd";
            default: return "th";
        }
    }
}
