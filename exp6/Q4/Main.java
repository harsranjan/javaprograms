interface Maths
{
    int division(int a,int b);
    int modules(int a,int b);
}

class Class1 implements Maths
{
    public  int division(int a,int b)
    {
        return a/b;
    }
    public int modules(int a,int b)
    {
        return a%b;
    }
    
}


class Class2 implements Maths
{
    public  int division(int a,int b)
    {
        return a/b;
    }
    public int modules(int a,int b)
    {
        return a%b;
    }
    
}


class Main
{
    public static void main(String args[])
    {
        Class1 obj = new Class1();
        Class2 obj1 = new Class2();
        Maths a;
        a=obj;
        System.out.println(a.division(10,5));
        System.out.println(a.modules(5,2));
        
        Maths b;
        b=obj1;
        System.out.println(b.division(15,5));
        System.out.println(b.modules(9,5));
        
        
    }
}