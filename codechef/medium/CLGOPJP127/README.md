# CLGOPJP127

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T09:02:59.518Z  

```java
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        int num, count = 0;
        num = scanner.nextInt();

        while (num != 0) {
            // Update your code below this line.
          count++;
          num = num / 10;
        }
        System.out.println(count);
        scanner.close();
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP127)