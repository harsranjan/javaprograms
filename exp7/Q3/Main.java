import java.util.*;
class CustomException extends Exception{
CustomException(String a){
super(a);
}
}
 
class Main{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter any number = ");
int z=sc.nextInt();

try{
 if(z<500){
throw new CustomException("Custom Exception occured");
 }
else{
System.out.print("Exception not occured");
}
}
catch(CustomException ce){
System.out.println(ce.getMessage());
}
}
}