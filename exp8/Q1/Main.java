import java.util.*;
class Main
{
public static void main(String[]args)
{
int n1,n2,last=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string in which you want to search:");
String s1=sc.nextLine();
System.out.println("Enter the string you want to search in the entered string:");
String s2=sc.nextLine();
n1=s1.length();
n2=s2.length();
for(int i=0;i<=(n1-n2);i++)
{
if(s1.substring(i,n2+i).equals(s2))
{
if(last==0)
System.out.println("first occured at :"+(i+1));
last=i+1;
}
}
if(last!=0)
System.out.println("last occured at :"+last);
else
System.out.println("the string is not found");
}
}