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

**1423. Maximum Points You Can Obtain from Cards**
- Start by taking the first k cards from the left and sum them.
- Gradually move cards from left to right (swap one left card for one right each time), updating the score.
- Track the maximum score seen in this process.
- Return that maximum.

**3. Longest Substring Without Repeating Characters**
- Initialize two pointers (l and r) to mark the window.
- Use a fixed-size array or map to store last seen indexes for characters.
- Iterate r over the string:
  - If character at r index is already in window (hash[s[r]] >= l), move l to hash[s[r]] + 1.
  - Always update hash[s[r]] to r.Always update hash[s[r]] to r.
  - Always update hash[s[r]] to r.
- Continue until r reaches the string end.
- Return the maximum length found.

<!---LeetCode Topics Start-->
# LeetCode Topics
## Array
|  |
| ------- |
| [0001-two-sum](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0001-two-sum) |
| [0011-container-with-most-water](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0011-container-with-most-water) |
| [0014-longest-common-prefix](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0014-longest-common-prefix) |
| [0015-3sum](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0015-3sum) |
| [0042-trapping-rain-water](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0042-trapping-rain-water) |
| [0053-maximum-subarray](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0053-maximum-subarray) |
| [0088-merge-sorted-array](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0088-merge-sorted-array) |
| [0152-maximum-product-subarray](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0152-maximum-product-subarray) |
| [0167-two-sum-ii-input-array-is-sorted](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0167-two-sum-ii-input-array-is-sorted) |
| [0189-rotate-array](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0189-rotate-array) |
| [0209-minimum-size-subarray-sum](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0209-minimum-size-subarray-sum) |
| [0238-product-of-array-except-self](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0238-product-of-array-except-self) |
| [0283-move-zeroes](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0283-move-zeroes) |
| [0485-max-consecutive-ones](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0485-max-consecutive-ones) |
| [0523-continuous-subarray-sum](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0523-continuous-subarray-sum) |
| [0560-subarray-sum-equals-k](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0560-subarray-sum-equals-k) |
| [0713-subarray-product-less-than-k](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0713-subarray-product-less-than-k) |
| [0724-find-pivot-index](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0724-find-pivot-index) |
| [0904-fruit-into-baskets](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0904-fruit-into-baskets) |
| [0940-fruit-into-baskets](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0940-fruit-into-baskets) |
| [0974-subarray-sums-divisible-by-k](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0974-subarray-sums-divisible-by-k) |
| [0992-subarrays-with-k-different-integers](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0992-subarrays-with-k-different-integers) |
| [1004-max-consecutive-ones-iii](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/1004-max-consecutive-ones-iii) |
| [1046-max-consecutive-ones-iii](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/1046-max-consecutive-ones-iii) |
| [1314-matrix-block-sum](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/1314-matrix-block-sum) |
| [1538-maximum-points-you-can-obtain-from-cards](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/1538-maximum-points-you-can-obtain-from-cards) |
## Sliding Window
|  |
| ------- |
| [0209-minimum-size-subarray-sum](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0209-minimum-size-subarray-sum) |
| [0713-subarray-product-less-than-k](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0713-subarray-product-less-than-k) |
| [0904-fruit-into-baskets](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0904-fruit-into-baskets) |
| [0940-fruit-into-baskets](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0940-fruit-into-baskets) |
| [0992-subarrays-with-k-different-integers](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0992-subarrays-with-k-different-integers) |
| [1004-max-consecutive-ones-iii](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/1004-max-consecutive-ones-iii) |
| [1046-max-consecutive-ones-iii](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/1046-max-consecutive-ones-iii) |
| [1538-maximum-points-you-can-obtain-from-cards](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/1538-maximum-points-you-can-obtain-from-cards) |
## Prefix Sum
|  |
| ------- |
| [0209-minimum-size-subarray-sum](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0209-minimum-size-subarray-sum) |
| [0238-product-of-array-except-self](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0238-product-of-array-except-self) |
| [0523-continuous-subarray-sum](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0523-continuous-subarray-sum) |
| [0560-subarray-sum-equals-k](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0560-subarray-sum-equals-k) |
| [0713-subarray-product-less-than-k](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0713-subarray-product-less-than-k) |
| [0724-find-pivot-index](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0724-find-pivot-index) |
| [0974-subarray-sums-divisible-by-k](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0974-subarray-sums-divisible-by-k) |
| [1004-max-consecutive-ones-iii](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/1004-max-consecutive-ones-iii) |
| [1046-max-consecutive-ones-iii](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/1046-max-consecutive-ones-iii) |
| [1314-matrix-block-sum](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/1314-matrix-block-sum) |
| [1538-maximum-points-you-can-obtain-from-cards](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/1538-maximum-points-you-can-obtain-from-cards) |
## Binary Search
|  |
| ------- |
| [0167-two-sum-ii-input-array-is-sorted](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0167-two-sum-ii-input-array-is-sorted) |
| [0209-minimum-size-subarray-sum](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0209-minimum-size-subarray-sum) |
| [0713-subarray-product-less-than-k](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0713-subarray-product-less-than-k) |
| [1004-max-consecutive-ones-iii](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/1004-max-consecutive-ones-iii) |
| [1046-max-consecutive-ones-iii](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/1046-max-consecutive-ones-iii) |
## Hash Table
|  |
| ------- |
| [0001-two-sum](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0001-two-sum) |
| [0523-continuous-subarray-sum](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0523-continuous-subarray-sum) |
| [0560-subarray-sum-equals-k](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0560-subarray-sum-equals-k) |
| [0904-fruit-into-baskets](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0904-fruit-into-baskets) |
| [0940-fruit-into-baskets](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0940-fruit-into-baskets) |
| [0974-subarray-sums-divisible-by-k](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0974-subarray-sums-divisible-by-k) |
| [0992-subarrays-with-k-different-integers](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0992-subarrays-with-k-different-integers) |
## String
|  |
| ------- |
| [0005-longest-palindromic-substring](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0005-longest-palindromic-substring) |
| [0014-longest-common-prefix](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0014-longest-common-prefix) |
| [0058-length-of-last-word](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0058-length-of-last-word) |
| [0125-valid-palindrome](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0125-valid-palindrome) |
| [0151-reverse-words-in-a-string](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0151-reverse-words-in-a-string) |
| [0344-reverse-string](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0344-reverse-string) |
| [0680-valid-palindrome-ii](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0680-valid-palindrome-ii) |
| [1021-remove-outermost-parentheses](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/1021-remove-outermost-parentheses) |
| [1903-largest-odd-number-in-string](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/1903-largest-odd-number-in-string) |
## Stack
|  |
| ------- |
| [0042-trapping-rain-water](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0042-trapping-rain-water) |
| [1021-remove-outermost-parentheses](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/1021-remove-outermost-parentheses) |
## Two Pointers
|  |
| ------- |
| [0005-longest-palindromic-substring](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0005-longest-palindromic-substring) |
| [0011-container-with-most-water](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0011-container-with-most-water) |
| [0015-3sum](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0015-3sum) |
| [0042-trapping-rain-water](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0042-trapping-rain-water) |
| [0088-merge-sorted-array](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0088-merge-sorted-array) |
| [0125-valid-palindrome](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0125-valid-palindrome) |
| [0151-reverse-words-in-a-string](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0151-reverse-words-in-a-string) |
| [0167-two-sum-ii-input-array-is-sorted](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0167-two-sum-ii-input-array-is-sorted) |
| [0189-rotate-array](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0189-rotate-array) |
| [0283-move-zeroes](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0283-move-zeroes) |
| [0344-reverse-string](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0344-reverse-string) |
| [0680-valid-palindrome-ii](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0680-valid-palindrome-ii) |
## Math
|  |
| ------- |
| [0189-rotate-array](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0189-rotate-array) |
| [0523-continuous-subarray-sum](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0523-continuous-subarray-sum) |
| [1903-largest-odd-number-in-string](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/1903-largest-odd-number-in-string) |
## Greedy
|  |
| ------- |
| [0011-container-with-most-water](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0011-container-with-most-water) |
| [0680-valid-palindrome-ii](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0680-valid-palindrome-ii) |
| [1903-largest-odd-number-in-string](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/1903-largest-odd-number-in-string) |
## Trie
|  |
| ------- |
| [0014-longest-common-prefix](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0014-longest-common-prefix) |
## Sorting
|  |
| ------- |
| [0015-3sum](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0015-3sum) |
| [0088-merge-sorted-array](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0088-merge-sorted-array) |
## Database
|  |
| ------- |
| [0176-second-highest-salary](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0176-second-highest-salary) |
| [0178-rank-scores](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0178-rank-scores) |
| [0180-consecutive-numbers](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0180-consecutive-numbers) |
| [0570-managers-with-at-least-5-direct-reports](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0570-managers-with-at-least-5-direct-reports) |
| [0577-employee-bonus](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0577-employee-bonus) |
| [1280-students-and-examinations](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/1280-students-and-examinations) |
## Divide and Conquer
|  |
| ------- |
| [0053-maximum-subarray](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0053-maximum-subarray) |
## Dynamic Programming
|  |
| ------- |
| [0005-longest-palindromic-substring](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0005-longest-palindromic-substring) |
| [0042-trapping-rain-water](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0042-trapping-rain-water) |
| [0053-maximum-subarray](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0053-maximum-subarray) |
| [0152-maximum-product-subarray](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0152-maximum-product-subarray) |
## Monotonic Stack
|  |
| ------- |
| [0042-trapping-rain-water](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0042-trapping-rain-water) |
## Counting
|  |
| ------- |
| [0992-subarrays-with-k-different-integers](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/0992-subarrays-with-k-different-integers) |
## Matrix
|  |
| ------- |
| [1314-matrix-block-sum](https://github.com/Ram-reddy-2004/Two-pointers-Pattern/tree/master/1314-matrix-block-sum) |
<!---LeetCode Topics End-->