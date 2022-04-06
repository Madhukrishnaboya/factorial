package factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		//Factorial obj = new Factorial(); 
		fact();

	}
	  public static void fact()
	  {
		  Scanner s = new Scanner(System.in);
		  System.out.println("enter the number");
		  int n = s.nextInt();
		  int x=1;
		  int y=1;
		  
		  int f=0;
		 for(int i=1;i<=n;i++)
		 {
			 System.out.print(f);
			
			 x++;
			 
			 y=x;
		     f=y;
		 }
	  }

}
