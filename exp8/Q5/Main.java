import java.util.*;
class Main
{ 
public static void main(String args[]) 
{ 
System.out.println("Enter the number : ");
Scanner sc = new Scanner(System.in);
int a= sc.nextInt(); 
Integer b= Integer.valueOf(a); 
System.out.println("int to Integer"+b);
String s= Integer.toString(b);
System.out.println("Integer to String"+s); 
int i =Integer.parseInt(s); 
System.out.println("String to int"+i); 
Integer obj = new Integer(100);
int d= obj.intValue(); 
System.out.println("Integer to int"+d); 
} 
}