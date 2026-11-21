# CLGOPJP125

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T08:58:01.575Z  

```java
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

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP125)