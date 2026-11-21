import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int i = 2;
        boolean isPrime = true; // Assum n is prime.
        
        if (n <= 1)
        {
            isPrime = false;
        }

        while (i < n) {
            // Update your code below this line.
           if (n % i == 0)
           {
               isPrime = false;
               break;
           }
           i++;
        }
        if (isPrime) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
	}
}
