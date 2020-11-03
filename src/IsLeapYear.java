import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter year: ");
        year= sc.nextInt();
        boolean isLeapYear = false;

        boolean isDivide4 = year%4 ==0;
        if(isDivide4){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            } else {
                isLeapYear = true;
            }
        }
        if(isLeapYear) {
            System.out.printf("%d is leap year",year);
        } else {
            System.out.printf("%d is not leap year", year);
        }
    }
}
