import java.util.*;

class Grades{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
int[]a = new int[10];

for(int i=0;i<10;i++)
{
a[i]=s.nextInt();
}

for(int i=0;i<10;i++)
{
for(int j=1;j<(10-1);j++)
{
if(a[j-1]>a[j])
{
int temp = a[j-1];
a[j-1]=a[j];
a[j]= temp;
}
}
}

System.out.println();
for(int i=0;i<10;i++)
{
if(a[i]>=0 && a[i]<=30)
{
System.out.println(a[i]+" "+"Fail");
}
else if(a[i]>=40 && a[i]<=50)
{
System.out.println(a[i]+" "+"Pass");
}
else if(a[i]>=51 && a[i]<=75)
{
System.out.println(a[i]+" "+"Merit");
}
else 
{
System.out.println(a[i]+" "+"Distinction");
}

}
}
}