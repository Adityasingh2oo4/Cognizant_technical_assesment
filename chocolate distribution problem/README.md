# Chocolate Distribution Problem 

## Problem Statement
You are organizing a charity event in a village, where you distribute chocolates to children sitting in a circle.  

The distribution of chocolates follows these rules based on each child’s position in the circle:  
- The *i-th child* receives **i chocolates**.  
- If a child’s position is **adjacent to a multiple of 5**, they receive **an additional 2 chocolates**.  

Given the number of children in a circle, your task is to calculate and return the **total number of chocolates distributed**.  

> **Note:** Return the result modulo **1e9+7** to handle overflow.

---

## Input Specification
- **input1:** An integer value **N**, representing the number of children.

---

## Output Specification
Return an integer value representing the **total number of chocolates distributed**.

---

## Example 1:
**Input**  
input1: 5



**Output**  
19



**Explanation**  
For N = 5, chocolates distribution is:  
- Child 1 → 1 (base) + 2 (adjacent to child 5, multiple of 5) = 3  
- Child 2 → 2  
- Child 3 → 3  
- Child 4 → 4 (base) + 2 (adjacent to child 5, multiple of 5) = 6  
- Child 5 → 5  

Total = 3 + 2 + 3 + 6 + 5 = **19**

---

## Example 2:
**Input**  
input1: 3



**Output**  
6



**Explanation**  
For N = 3:  
- Child 1 → 1  
- Child 2 → 2  
- Child 3 → 3  

No multiples of 5 exist, so no extra chocolates.  
Total = 1 + 2 + 3 = **6**
