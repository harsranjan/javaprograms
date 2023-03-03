interface Test
{
    void square(int a);
}




class Arithmetic implements Test
{
    public void square(int a)
    {
        System.out.println("Square of"+" "+a+" is: "+a*a);
    }
}


class ToTestInt
{
    public static void main (String args[])
    {
        Arithmetic obj = new Arithmetic();
        Test t;
        t=obj;
        t.square(5);
    }
}