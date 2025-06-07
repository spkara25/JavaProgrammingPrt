import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        int hour, min,sec;
        System.out.println("Enter time in seconds");
        t= sc.nextInt();
        hour=t/3600;
        min = (t%3600)/60;
        sec=(t%3600)%60;
        System.out.printf("%dh %dm %ds",hour,min,sec);




    }
}