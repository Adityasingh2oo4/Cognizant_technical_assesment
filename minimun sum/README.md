# Minimum Sum

## Problem Statement
You are given two integer arrays **A** and **B** of length **N** on which you have to perform the following operation:

 In one operation, you can swap any two elements of **A** or any two elements of **B**.

Your task is to find and return an integer value representing the **minimum possible sum** of A[i] * B[i] after performing the above operation any number of times.  

> *Note: The operation can also be performed 0 times if no swap is needed.*

---

## Input Specification
- **input1:** An integer value **N** representing the size of arrays.
- **input2:** An integer array **A**
- **input3:** An integer array **B**

---

## Output Specification
Return an integer value representing the **minimum possible sum** of \(A[i] \times B[i]\) after performing the operation any number of times.

---

## Examples

### Example 1:
**Input**  
input1: 4
input2: {1,4,3,2}
input3: {1,4,3,4}



**Output**  
25




**Explanation**  
Here, A = {1,4,3,2} and B = {1,4,3,4}.  
To minimize the sum, we can swap the first two elements of A (i.e., 4 and 1).  
The new A becomes {4,1,3,2}.  
The minimum sum obtained = 25.  
Hence, **25** is returned.

---

### Example 2:
**Input**  
input1: 3
input2: {4,1,6}
input3: {3,1,2}



**Output**  
17



**Explanation**  
Here, A = {4,1,6} and B = {3,1,2}.  
To minimize the sum, we can swap the first two elements of A (i.e., 4 and 1) and the last two elements of B (i.e., 1 and 2).  
The new arrays are:  
- A = {1,4,6}  
- B = {3,2,1}  

The minimum sum obtained = 17.  
Hence, **17** is returned.
