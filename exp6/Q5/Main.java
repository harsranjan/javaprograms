import java.util.*;

interface StackInterface{
void push(int n); 
int pop(); 
void display();
}
class StackClass implements StackInterface{
int [] ar = new int[5];
int top=-1;

public void push(int n){
if(top==5){
System.out.println("STACK OVERFLOW");
}
else{
top++;
ar[top]=n;
}
}

public int pop(){
if(top==-1){
System.out.println("STACK UNDERFLOW");
}
return ar[top--];
}

public void display(){
for(int i=top;i>=0;i--){
System.out.println(ar[i]);
}
}

}
class Main{
public static void main(String args[]){

StackClass obj =new StackClass();
StackInterface s;
s=obj;

Scanner sl = new Scanner(System.in);

Scanner scan = new Scanner(System.in);

int val=1;

do{
System.out.println("1)  PUSH ");
System.out.println("2)  POP ");
System.out.println("3)  DISPLAY ");

System.out.print("Enter operation ");

int az=sl.nextInt();

switch(az){
	
	case 1: System.out.println("Enter value to push ");int p=scan.nextInt();  s.push(p); System.out.println("Element pushed "+ p);
		 break;

	case 2: int popp=s.pop(); 
		break;

	case 3: s.display(); 
		break;


}
}while(val!=5);
}
}