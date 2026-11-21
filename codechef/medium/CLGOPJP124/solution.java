// Debug the code below to solve the problem.
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

        int N, sum = 0;
        N = scanner.nextInt();
        
        int i = 1;
        
        while (i <= N) {
            sum += i;
            i++;
        }
        
        System.out.println(sum);
        scanner.close();
	}
}
