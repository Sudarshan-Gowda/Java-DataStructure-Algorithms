https://www.geeksforgeeks.org/binary-search/

Time Complexity:
The time complexity of Binary Search can be written as

T(n) = T(n/2) + c 
The above recurrence can be solved either using Recurrence T ree method or Master method. 
	It falls in case II of Master Method and solution of the recurrence is Theta(Logn).

Auxiliary Space: O(1) in case of iterative implementation. In case of recursive implementation, 
	O(Logn) recursion call stack space.