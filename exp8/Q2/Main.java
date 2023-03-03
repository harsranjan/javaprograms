import java.util.*;
public class Main 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();
        int i=0;
        String s="";
        StringBuffer st = new StringBuffer(s);
        for(i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch==' ')
            {
                st.append(" ");
            }
            int a=(int)ch;
            int b = a - 32;
            ch=(char)b;
            st.append(ch);
        }
        System.out.println(st);
    }
}
