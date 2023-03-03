package P;

import java.lang.*;

public class A
{
   private void msg1()
   {
       System.out.println("This is Private method");
   }
   
   void msg2()
   {
       System.out.println("This is Default method");
   }
   
   protected void msg3()
   {
       System.out.println("This is Protected method");
   }
   
   public void msg4()
   {
       System.out.println("This is public method");
   }
}