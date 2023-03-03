public class Dayscalc
{
public static void main(String args[])
{
int d=Integer.parseInt(args[0]);
int m=Integer.parseInt(args[1]);
int y=Integer.parseInt(args[2]);

int rd=0;
int rm=0;
int ry=0;

if(y>=1970)
{
ry=(y-1970-1)*365;
rm=(m-1)*30;
rd=d;
System.out.println(ry+rm+rd);
}

else
{
System.out.println("Invalid date");
}
}
}
