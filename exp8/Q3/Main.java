import java.util.*;
class Main
{
    public String Upper_Case(String str)
    {
        String s="";
        int i=0;
        for(i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch==' ')
            {
                s=s+" ";
            }
            int a=(int)ch;
            int b = a - 32;
            ch=(char)b;
            s=s+ch;
        }
        return s;
  }

    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();
        Main ob = new Main();
        String s=ob.Upper_Case(str);
        System.out.println("The Upper Case String is "+s);
    }
}
