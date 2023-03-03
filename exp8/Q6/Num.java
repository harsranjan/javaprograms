class Num
{ 
public static void main(String args[]) 
{ 
float ff = 3.141f; 
Float fobj= new Float(ff); 
System.out.println("float to Float"+fobj); 
String s= Float.toString(ff); 
System.out.println("float to String"+s); 
float f2= Float.parseFloat(s); 
System.out.println("string to float"+f2); 
} 
}