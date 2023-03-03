import java.util.*;

import java.lang.Exception;

import java.lang.*;

class NegetiveException extends Exception{

	NegetiveException(String a){
		super(a);
	}
}

class ZeroException extends Exception{

	ZeroException(String b){
		super(b);
	}
}





class Calc{

	public double power(double a, double b) throws NegetiveException , ZeroException {

		if(a<0 || b<0){

			throw new NegetiveException ("NegetiveNumberException:  Entered numbers should not be negetive. ");
		}

		else if(a==0 && b==0){

			throw new ZeroException ("ZeroNumberException:  Entered numbers should not be zero. ");
		}
		
		return Math.pow(a,b);
	}
}


public class Main{

	public static void main(String[] args) {

		Calc cal=new Calc();


		System.out.println("Enter two numbers: ");
			
		Scanner s= new Scanner(System.in);

		double x=s.nextInt();

		double y=s.nextInt();
		
		


		try{

			double res=cal.power(x,y);
			
		    System.out.println(res);
			
		}

		catch (NegetiveException n){

			System.out.println(n.getMessage());
		}

		catch (ZeroException z){

			System.out.println(z.getMessage());
		}
	}

}