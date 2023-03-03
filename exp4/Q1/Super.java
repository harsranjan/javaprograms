class Super
{
private int a=40;
 private void msg()
{
  System.out.println(a);
}
}


class Sub
{
public static void main(String agrs[])
{
Super obj = new Super();
obj.msg();
}
}