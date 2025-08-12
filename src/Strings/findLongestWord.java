package Strings;
import java.util.*;

public class findLongestWord {
    public static String maxNumberOfVowels(String str) {
        char x;
        String w = "", s = "", max = "";
        str = str.trim();
        str = str + " ";
        int i, f = 0, c = 0, longlength = 0;
        for (i = 0; i < str.length(); i++) {
            x = str.charAt(i);
            if (x != ' ') {
                w = w + x;
                if (x == 'a' || x == 'A' || x == 'e' || x == 'E' || x == 'i' || x == 'I' || x == 'o' || x == 'O' || x == 'u' || x == 'U') {
                    c++;
                }
            } else {
                if (f == 0) {
                    max = w;
                    longlength = c;
                    f = 1;
                } else {
                    if (c < longlength) {
                        longlength = c;
                        max = w;
                    }
                }
                w = "";
                c=0;
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        System.out.println();
        System.out.print("The  word is: ");
        String newStr = maxNumberOfVowels(str);
        System.out.println(newStr);
    }
}
