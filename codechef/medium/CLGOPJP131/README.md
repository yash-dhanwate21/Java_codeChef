# CLGOPJP131

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T09:13:10.429Z  

```java
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
```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP131)