import java.util.*;

public class Main

{

   public static void main(String[] args)

   {

       String str="harsh"; 

       System.out.println("Length of string: "+str.length());

       char c[]=str.toCharArray();

       int count=str.indexOf('a');

       if(count==-1)

             System.out.println("a is not present!");

       else

       {

           for(int i=0;i<c.length;i++)

           { 

               if('a'==c[i])

                    System.out.println("a is present in string at index: "+i);

            }

         }

     }

}
