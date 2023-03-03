import java.util.*;
public class Combinations
{
  public static void main (String[]args)
  {
    Scanner Sc = new Scanner (System.in);
    int arr[] = new int[3];
      System.out.println ("Enter 3 numbers :");
    for (int i = 0; i < 3; i++)
      {
	arr[i] = Sc.nextInt ();
      }
    for (int i = 0; i < 3; i++)
      {
	for (int j = 0; j < 3; j++)
	  {
	    for (int k = 0; k < 3; k++)
	      {
		if (arr[k] != arr[j] && arr[j] != arr[i] && arr[i] != arr[k])
		  {
		    System.out.println ((arr[i] * 100) + (arr[j] * 10) +
					(arr[k]));
		  }
	      }
	  }
      }
  }
}
