# CLGOPJP110

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-27T05:21:38.480Z  

```java
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        // Read input values
        a = scanner.nextInt();
        b = scanner.nextInt();

        if (a + b + (a * b) == 111) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP110)