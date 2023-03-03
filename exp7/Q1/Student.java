import java .util.*;

class Student
{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int ar[] = new int[10];
System.out.println("Enter roll no.");
for(int i=0;i<10;i++){
ar[i]=sc.nextInt();
}
Scanner s = new Scanner(System.in);
String arr[] = new String[10];
System.out.println("Enter  names");
for(int i=0;i<10;i++){
arr[i]=s.nextLine();
}
try{
System.out.println(arr[10]);
}
catch( ArrayIndexOutOfBoundsException e){
System.out.println(e);
}
}

}