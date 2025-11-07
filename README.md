##  **What is Two Pointers Pattern?**  
It’s a technique where **two variables (pointers)** are used to traverse a data structure like an array or string **from different directions** or **at different speeds** — instead of using nested loops.  
This helps reduce **time complexity from O(n²) ➡️ O(n)** in many problems! ⚡  

---

##  **How it Works (Example)**  
Let’s take a simple example:  
👉 **Problem:** Check if an array is a palindrome.  

```python
arr = [1, 2, 3, 2, 1]
left, right = 0, len(arr) - 1

while left < right:
    if arr[left] != arr[right]:
        print("Not a Palindrome")
        break
    left += 1
    right -= 1
else:
    print("Palindrome")

```
## 🧠 How it works:

- One pointer starts from the beginning (left), another from the end (right).

- Both move towards the center after each comparison.

- If all elements match, the sequence is a palindrome ✅



---

## 🔹 Where Two Pointers are Used?

You’ll see this pattern in problems like:
- ✅ Finding pairs with a specific sum
- ✅ Merging two sorted arrays
- ✅ Removing duplicates in a sorted array
- ✅ Reversing strings or arrays
- ✅ Linked list cycle detection
- ✅ Container with most water
- ✅ Trapping rainwater

## Leetcode Problems solved with Two pointers Approch

**11. Container With Most Water**
- Place pointers at both ends of the array.
- Calculate water area as width × min(height at both ends).
- Move the pointer with the shorter height inward.
- Repeat until pointers meet; keep track of the max area found.

**167. Two Sum II - Input Array Is Sorted**
- Put one pointer at each end of the array.
- Calculate the area between them.
- Move the pointer at the shorter line inward.
- Keep track of the biggest area seen.
- Stop when the pointers meet.


