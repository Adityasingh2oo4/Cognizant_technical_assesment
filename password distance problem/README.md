# Password Distance Problem 

## Problem Statement
Jim has a password represented by a string **S** consisting of lowercase English letters (`a-z`) and digits (`0-9`).  

👉 The distance between two characters is defined as the **absolute difference** between their indices in the string.  

Your task is to find and return the **maximum distance between two non-similar characters** within the given password **S**.  

> Note: The distance between two adjacent characters is 1.

---

## Input Specification
- **input1:** A string **S** containing lowercase English letters (`a-z`) and digits (`0-9`).

---

## Output Specification
Return an integer representing the **maximum distance between two non-similar characters** within the given password **S**.

---

## Example 1:
**Input**  
abc10

markdown
Copy code

**Output**  
4

markdown
Copy code

**Explanation**  
In the string `"abc10"`, the maximum distances between non-similar characters are:  
1. Between `a` and `0` (indices 0 and 4) → Distance = 4  
2. Between `b` and `0` (indices 1 and 4) → Distance = 3  
3. Between `c` and `0` (indices 2 and 4) → Distance = 2  

The maximum distance = **4**.

---

## Example 2:
**Input**  
bbbb

markdown
Copy code

**Output**  
0

yaml
Copy code

**Explanation**  
In the string `"bbbb"`, all characters are the same.  
Thus, there are no non-similar characters to compare.  
Therefore, the maximum distance = **0**.