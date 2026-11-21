# CLGOPJP132

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T09:20:24.506Z  

```java
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

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP132)