# CLGOPJP97

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Mismatched Parenthesis

There should be one closing bracket for each opening bracket and the closing bracket should also be of the same type, like (),{},[]

If we try to use different opening and closing brackets, it can give you a `syntax error`.

```
int a  = (5+7 } ;     // incorrect due to the usage of mismatched parenthesis

```

### Task

We have given a program to check whether a given number is odd or even.
Debug the code the solve the problem.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-27T04:29:31.105Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef {
    public static void main(String[] args) {
        int n;
        n = 5;
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
         }   // correct the closing bracket
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP97)