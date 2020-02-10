package Maven;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		char c;
		cal c1=new cal();
		System.out.println("Enter the no a and d is:");
		 a=sc.nextInt();//Example a =5,b=7 test by using junit case
		b=sc.nextInt();
		System.out.println("Enter the which operator you want");
		 c=sc.next().charAt(0);
		
		switch(c)
		{
		case '+': System.out.println("addition is:"+c1.add(a,b));
		          break;
		case '-':System.out.println("Substration is:"+c1.sub(a,b));
		         break;
		case '*':System.out.println("Multiplicationc is:"+c1.mul(a,b));
		          break;
		case '/':System.out.println("Division is:"+c1.mul(a,b));
		         break;
		default:System.out.println("Enter the correct input");
		}	
	}

}
