package Calculator;

import Mathematics.*;

class Main
{
    public static void main(String args[])
    {
        Addition obj = new Addition();
        int a= obj.add(5,2);
        System.out.println("Addition of two numbers are: "+a);
    }
}