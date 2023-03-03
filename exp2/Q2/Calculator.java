class Calculator
{
float result=0;
void add(int a,int b)
{
result=a+b;
System.out.println("Sum="+result);
}
void sub(int a, int b)
{
result=a-b;
System.out.println("Difference="+result);
}
void mul(int a,int b)
{
result=a*b;
System.out.println("Product="+result);
}
void div(int a,int b)
{
result=a/b;
System.out.println("Division="+result);
}

public static void main(String args[])
{
Calculator c= new Calculator();
int a= Integer.parseInt(args[0]);
int b= Integer.parseInt(args[2]);
char d=args[1].charAt(0);
if(d =='+')
{
c.add(a,b);
}
else if(d == '-')
{
c.sub(a,b);
}
else if(d=='x')
{
c.mul(a,b);
}
else
{
c.div(a,b);
}}}

