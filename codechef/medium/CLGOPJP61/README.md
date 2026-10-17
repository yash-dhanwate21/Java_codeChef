# CLGOPJP61

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Scanner Methods

You have already seen how to read a `String`. Let's see how to read the other `datatype` values:

- nextInt(): Reads integer values.
- nextFloat(): Reads float value.
- nextDouble(): Reads double value.
- nextBoolean(): Reads boolean value.
- nextLine(): Reads string value until newline character ('\n') is encountered.
- next(): Reads string value until space or newline character is encountered.
### Task

 **Write a program for the following** :

- Declare an integer variable num.
- Read the value from the user.
- Print it's square.
### Sample 1:
Input
Output

```
4
```

```
16
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-17T13:55:52.253Z  

```java
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		// update your code below this line
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num * num);
		sc.close();
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP61)