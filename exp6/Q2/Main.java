interface A
{
    void meth1();
    void meth2();
}


class MyClass implements A
{
    public void meth1()
    {
        System.out.println("This is meth1");
    }
    
    public void meth2()
    {
        System.out.println("This is meth2");
    }
}

class Main
{
    public static void main(String args[])
    {
        MyClass obj = new MyClass();
        
        A a;
        a = obj;
        a.meth1();
        a.meth2();
    }
}