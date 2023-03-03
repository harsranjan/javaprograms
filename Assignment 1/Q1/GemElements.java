import java.util.*;

public class GemElements
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number of Rock: ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        System.out.println("Enter the symbol of elements of all rocks:");
        String[] arr = new String[length];
        for(int i=0; i<length;i++)
        {
            arr[i]=sc.next();
        }
        
        int count=0;
        for(int i=97;i<122;i++)
        {
            char ch = (char)(i);
            for(int j=0;j<length;j++)
            {
                if(arr[j].indexOf(ch)==-1)
                {
                    break;
                }
                else if(j==length-1 & arr[j].indexOf(ch)!= -1)
                {
                    count++;
                }
            }
        }
        System.out.println("The number of gemelements are:"+" "+count);
    }
}