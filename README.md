# Number-of-Subsequences-That-Satisfy-the-Given-Sum-Condition
## Problem Description
The problem asks to find the number of non-empty subsequences of the input array nums that satisfy the condition: 

nums[i] + nums[j] <= target, where 0 <= i <= j < nums.length and target is a given integer.

## Approach
The algorithm to solve the problem follows the following steps:

Sort the given array nums in non-descending order.
Initialize two pointers, start and end, to the first and last elements of the array, respectively.
Initialize a variable result to 0 to keep track of the number of subsequences that satisfy the condition.
Compute an array powof2 of powers of 2 modulo 10^9 + 7, where powof2[i] is 2^i mod (10^9 + 7).
We then use a while loop that starts with start at index 0 and end at the largest index satisfying the condition. 
We increment start until we reach an index j such that nums[j] + nums[end] > target, and then increment end until we reach 
the largest index k satisfying the condition. We then calculate the number of valid subsequences between start and end using 
the formula 2^(k-j), and add it to count. We continue incrementing start and end until start is greater than end.

Finally, we return the count modulo 10^9 + 7.
## Time and Space Complexity
The time complexity of this solution is O(nlogn), where n is the length of the input array nums. This is due to the time required to sort the array.

The space complexity of this solution is O(n), where n is the length of the input array nums. This is due to the space required to store the array powof2.
