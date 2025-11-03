## 11. Container With Most Water
- Place pointers at both ends of the array.
- Calculate water area as width × min(height at both ends).
- Move the pointer with the shorter height inward.
- Repeat until pointers meet; keep track of the max area found.

## 167. Two Sum II - Input Array Is Sorted
- Put one pointer at each end of the array.
- Calculate the area between them.
- Move the pointer at the shorter line inward.
- Keep track of the biggest area seen.
- Stop when the pointers meet.
