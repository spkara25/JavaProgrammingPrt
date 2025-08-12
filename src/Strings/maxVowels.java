package Strings;
import java.util.*;

public class maxVowels {
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        String s,max="",w="";
        int i,c=0,f=0,l=0;
        char x;
        System.out.print("Enter a sentence:");
        s=sc.nextLine();
        s=s.trim();
        s=s+" ";
        for(i=0;i<s.length();i++)
        {
            x=s.charAt(i);
            if(x!=' ')
            {
                w=w+x;
                if(x=='a' || x=='A' || x=='e' || x=='E' || x=='i' ||
                        x=='I' || x=='o' || x=='O' || x=='u' || x=='U')
                    c++;
            }
            else
            {
                if(f==0)
                {
                    max=w;
                    l=c;
                    f=1;
                }
                else
                {
                    if(c>l)
                    {
                        l=c;
                        max=w;
                    }
                }
                w="";
                c=0;
            }
        }
        System.out.println("Word having maximum number of vowels:"+max);
    }
}

