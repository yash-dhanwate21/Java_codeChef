# CLGOPJP113

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-17T04:48:38.863Z  

```java
// Debug the code
import java.util.*;
class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();

        float p = a - c;
        float q = b - d; // Cast b to float to ensure correct division
        if (p < q) {
            System.out.println("First");
        } else if (p > q) {
            System.out.println("Second");
        } else {
            System.out.println("Any");
        }

        // Close the Scanner
        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP113)