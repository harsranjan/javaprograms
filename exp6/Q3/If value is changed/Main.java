interface Area
{
    public static final float PI = 3.14f;
    
    void area();
}


class Circle implements Area
{
    PI = 3.9;
    int radius;
    Circle(int r)
    {
        radius = r;
    }
    
    public void area()
    {
        System.out.println("Area of Circle : "+(PI*radius*radius));
    }
}

class Main
{
    public static void main(String args[])
    {
        Circle obj = new Circle(5);
        Area a;
        a = obj;
        a.area();
    }
}