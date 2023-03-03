import java.util.*;

public class Square
{
    public static void main(String[] args) 
    {
        int sum = 0;
        int g=1;
        int a[]=new int[100];//define array
        Scanner m=new Scanner(System.in);//input that is stored in m
        
        System.out.println("Enter the length of array: ");
        int n =m.nextInt();
	    
            
	    for(int i=0;i<n;i++){
	        System.out.println("Enter the "+ g + " element:");

	        a[i]=m.nextInt();
	        g++;
	    }
        
        
        for(int i=0;i<n;i++)
        {
            a[i] = a[i]*a[i];
        }
        
        System.out.println("Square of each element :");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }    
        System.out.println(" ");
                System.out.println("Sum of the array is: ");

         for(int i=0;i<n;i++)
        {
           sum = sum+a[i];
           
        }
        System.out.print(sum+" ");
        
   }
}