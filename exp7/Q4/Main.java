import java.util.*;
class Main{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
int y = sc.nextInt();

try{
int div = x/y;
System.out.println("Division = " + " " + div);

}
catch(ArithmeticException e){
System.out.println(e);
}
catch(InputMismatchException ce){
System.out.println(ce);
}

}

}