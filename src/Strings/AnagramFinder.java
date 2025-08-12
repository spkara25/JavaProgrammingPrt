package Strings;
import java.util.*;
public class AnagramFinder {
    //find all the anagrams u can find in the string
    public static boolean isAnagram(String s1, String s2)
    {
        String clean1 = s1.replaceAll("[^a-zA-z]", "").toLowerCase();
        String clear2 = s2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        if(clean1.length() != clear2.length())
        {
            return false;
        }

        char[] arr1 = new char[clean1.length()];
        char[] arr2 = new char[clear2.length()];

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println("To check if they are anagrams or not");
        boolean result = isAnagram(s1,s2);
        System.out.print(result);
    }
}
