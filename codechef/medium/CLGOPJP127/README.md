# CLGOPJP127

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Prime Number

You need to write a code which checks if a given number is prime.

- You are given a whole number N.
- Your task is to determine if N is a prime number or not and print "Yes" if it is prime, or "No" if it is not.
### Input Format

A single whole number N

### Output Format

The output should contain a single line in the following format:

- Print Yes if it is a Prime Number else print No
### Sample 1:
Input
Output

```
14635
```

```
No
```

### Sample 2:
Input
Output

```
13
```

```
Yes
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T09:07:15.101Z  

```java
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

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP127)