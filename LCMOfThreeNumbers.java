import java.util.Scanner;
public class LCMOfThreeNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int lcm = findLCM(a, b, c);
        System.out.println("LCM of " + a + ", " + b + ", and " + c + ": " + lcm);
        sc.close();
    }
    public static int findGCD(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int findLCM(int a, int b){
        return (a * b) / findGCD(a, b);
    }
    public static int findLCM(int a, int b, int c){
        return findLCM(a, findLCM(b, c));
    }
}
