class worker
{
String name;
worker(String n)
{
    name=n;
}
void show()
{
System.out.println("Employee name : "+name);
}
}
class dailyworker extends worker
{
int rate;
dailyworker(String n,int r)
{
super(n);
rate=r;
}
void compay(int h)
{
show();
System.out.println("Salary : "+rate*h);
}
}
class salariedworker extends worker
{
int rate;
salariedworker(String n,int r)
{
super(n);
rate=r;
}
int hour=40;
void compay()
{
show();
System.out.println("Salary : "+rate*hour);
}
}
class MainWorker
{
public static void main(String args[])
{
dailyworker obj1=new dailyworker("Harsh",85);
salariedworker obj2=new salariedworker("Ranjan",90);
obj1.compay(50);
obj2.compay();
}
}