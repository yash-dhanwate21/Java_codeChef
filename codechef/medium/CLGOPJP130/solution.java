import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		int num = read.nextInt();
		//  Write your code here
		int factorial = 1;
		for(int i = 1; i <= num; i++)
		{
		    factorial = factorial * i;
		}
		System.out.println(factorial);
	}
}