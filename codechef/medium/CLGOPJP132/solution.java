import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
	    Scanner scanner = new Scanner(System.in);

        int N, prev = 0, current = 1;
        N = scanner.nextInt();
        // Update your code below this line.
        for(int i = 0; i<N;i++)
        {
            System.out.println(prev + " ");
            int next = prev + current;
            prev = current;
            current = next;
        }
	}
}
