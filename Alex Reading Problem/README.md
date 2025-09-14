# Alex’s Reading Problem

## Problem Statement
Alex is a high school student who loves reading and has a summer break coming up.  
He has a list of books he wants to read, with each book’s estimated reading time stored in an array **A**.  
Alex has **N** hours available during the break for reading.  

👉 Your task is to help Alex determine the **maximum number of books** he can read without exceeding his total available reading hours.

---

## Input Specification
- **input1:** An integer array **A**, where each element represents the estimated time to read each book.
- **input2:** An integer **N**, representing the total number of hours Alex has available for reading.
- **input3:** An integer **size**, representing the size of the array **A**.

---

## Output Specification
Return an integer value representing the **maximum number of books Alex can read** without exceeding his total available reading hours.

---

## Example 1:
**Input**  
input1: [4, 2, 3, 1]

input2: 5

input3: 4


**Output**  
2



**Explanation**  
- Alex has 4 books with reading times {4, 2, 3, 1}.  
- Total available hours = 5.  
- The optimal way: read the books requiring **2 hours** and **1 hour** → total = 3 hours ≤ 5.  
- If he tries reading any book with 3 or 4 hours, he cannot fit more books within the time.  

Hence, the maximum number of books = **2**.
