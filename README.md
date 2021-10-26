# CPSC50100 - Programming Fundamentals

Lewis University Fall 1, 2020

<br />

### ArrayQ.java
As elements are dequeued the front of the queue moves further into the array, and as elements are enqueued the rear of the queue also moves further into the array. When either end of the queue reaches the end (last index) of the array it wraps around to the front of the array (= Circular Array). All operations accomplished in O(1) time.

<br />

### ArrayStack.java
Stack operates at one end of the collection only, therefore the bottom of the stack is fixed at index 0. All operations accomplished in O(1) time (time to do an operation is independent of how many elements are in the queue).

<br />

### LinkedNode.java
Linear nodes linked together creating a linear collection.

<br />

### LinkedQueue.java
Queue = linear collection, therefore the queue can be implemented as a linked list of LinearNode objects with a front and back end. Enqueue at the back results in constant time and dequeue from the front also results in constant time, O(1).

<br />

### LinkedStack.java
Linked stack where the elements are stored one above the other enabling insertion or deletion only at the top end. Elements move down in position when a new element is added, only the top element can be accessed. O(1) time.

<br />

### Marathon(20201018_231616).java
Program which enables user interaction to enter in participant (runner) names and times. Once finished we can then select to see the fastest or slowest runners ordered as such. 

<br />

### Palindromes.java
Iterate through a sequence checking if it is a palindrome. Palindrome = word, phrase, sentence, or sequence that reads the same backward or forward ('ATATA' or 'racecar').

<br />

### RecursionExamples.java
Examples of recursion problems to help understand the concept of a recursive call. Recursion is where a method calls itself to fulfill its purpose, but all recursive definitions must have a non-recursive base case to ensure infinite recursion does not occur. Base case = solution to the smallest subproblem; Recursive case = solution to a subproblem. Each call sets up a new execution environment, with new parameters and new local variables - when the method completes, control returns to the method that invoked it. Every recursive solution has a corresponding iterative solution, in some cases recursion is more simple (Towers of Hanoi).
