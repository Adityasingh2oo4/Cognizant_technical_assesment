# Magical Library (Prime Coding – 18 Sep 2024)

## Problem Statement
In a magical library, each bookshelf is represented by a two-dimensional array **A**, where each row of the 2D array **A[i]** represents the series value of a book.

 A row is considered *magical* if the **sum of the odd values** of the series of a book is **even**.

Your task is to find and return an integer value representing the **number of magical rows**.

---

## Input Specification
- **input1:** An integer value representing the number of rows in the 2D array.
- **input2:** An integer value representing the number of columns in the 2D array.
- **input3:** A 2D integer array where each row represents a series of books.

---

## Output Specification
Return an integer value representing the **number of magical rows**.

---

## Examples

### Example 1:
**Input**  
input1: 3
input2: 3
input3: {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}



**Output**  
2



**Explanation**  
- Row 1 → {1, 2, 3} → odd numbers = {1, 3}, sum = 4 (even ✅) → magical  
- Row 2 → {4, 5, 6} → odd numbers = {5}, sum = 5 (odd ❌) → not magical  
- Row 3 → {7, 8, 9} → odd numbers = {7, 9}, sum = 16 (even ✅) → magical  

Hence, there are **2 magical rows**.

---

### Example 2:
**Input**  
input1: 3
input2: 2
input3: {{2, 4}, {0, 0}, {11, 11}}



**Output**  
1



**Explanation**  
- Row 1 → {2, 4} → no odd numbers → sum = 0 (even ✅) → magical  
- Row 2 → {0, 0} → no odd numbers → sum = 0 (even ✅) → magical  
- Row 3 → {11, 11} → odd numbers = {11, 11}, sum = 22 (even ✅) → magical  

Therefore, there is **1 magical row**.
