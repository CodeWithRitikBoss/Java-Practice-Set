public class CollectionFrameWorkPracticeSet15 {
    public static void main(String[] args) {
        System.out.println("Collection Framework Practice Set - 15");

        // Topics of Java Collection Framework:
        // 1. Introduction to Collections
        // 2. Collection Interface
        // 3. List Interface
        // 4. ArrayList
        // 5. LinkedList
        // 6. Vector
        // 7. Stack
        // 8. Queue Interface
        // 9. PriorityQueue
        // 10. Deque Interface
        // 11. ArrayDeque
        // 12. Set Interface
        // 13. HashSet
        // 14. LinkedHashSet
        // 15. TreeSet
        // 16. Map Interface
        // 17. HashMap
        // 18. LinkedHashMap
        // 19. TreeMap
        // 20. Hashtable
        // 21. Collections Utility Class
        // 22. Comparable Interface
        // 23. Comparator Interface
        // 24. Synchronization in Collections
        // 25. Iterators (Iterator, ListIterator)
        // 26. Stream API and Collections
        // 27. Concurrent Collections
        // 28. Custom Implementations of Collections

        // // 1. ArrayList Practice Set.
        // // ArrayList in Java is a part of the java.util package and implements the List interface.
        // // It is a resizable array that can grow or shrink in size as needed.
        // // ArrayList is not synchronized, which means it is not thread-safe by default.
        // // It allows duplicate elements and maintains the insertion order.
        // // ArrayList can be used to store a collection of objects of the same type or different types.
        // // ArrayList is dynamic, meaning it can change its size during runtime.
        // // It is mutable, allowing modification of elements after creation.
        // // ArrayList is indexed, meaning elements can be accessed using their index.
        // // It is ordered, meaning elements are stored in the order they are added.
        // // ArrayList is a collection, meaning it can store multiple elements.
        // // It is a list, meaning it allows duplicate elements and maintains insertion order.
        // // ArrayList is not a set, meaning it allows duplicate elements.
        // // Write a code to demonstrate the use of ArrayList in Java.
        // // Create an ArrayList of integers
        // java.util.ArrayList<Integer> numbers = new java.util.ArrayList<>();
        // // Add elements to the ArrayList
        // numbers.add(10);
        // numbers.add(20);
        // numbers.add(30);
        // // Print the ArrayList
        // System.out.println("ArrayList: " + numbers);
        // // Access elements from the ArrayList
        // System.out.println("First element: " + numbers.get(0));
        // // Remove an element from the ArrayList
        // numbers.remove(1); // Remove the element at index 1 (20)
        // // Print the ArrayList after removal
        // System.out.println("ArrayList after removal: " + numbers);
        // // Check if the ArrayList contains a specific element
        // boolean contains30 = numbers.contains(30);
        // System.out.println("ArrayList contains 30: " + contains30);
        // // Get the size of the ArrayList
        // int size = numbers.size();
        // System.out.println("Size of ArrayList: " + size);
        // // Clear the ArrayList
        // numbers.clear();
        // // Print the ArrayList after clearing
        // System.out.println("ArrayList after clearing: " + numbers);
        // // Check if the ArrayList is empty
        // boolean isEmpty = numbers.isEmpty();
        // System.out.println("ArrayList is empty: " + isEmpty);
        // // Add elements to the ArrayList again
        // numbers.add(50);
        // numbers.add(40);
        // // Print the ArrayList after adding elements again
        // System.out.println("ArrayList after adding elements again: " + numbers);
        // // Sort the ArrayList
        // java.util.Collections.sort(numbers);
        // // Print the sorted ArrayList
        // System.out.println("Sorted ArrayList: " + numbers);
        // // Reverse the ArrayList
        // java.util.Collections.reverse(numbers);
        // // Print the reversed ArrayList
        // System.out.println("Reversed ArrayList: " + numbers);
        // // Convert the ArrayList to an array
        // Integer[] array = new Integer[numbers.size()];
        // numbers.toArray(array);
        // // Print the array
        // System.out.print("Array from ArrayList: ");
        // for (Integer num : array) {
        //     System.out.print(num + " ");
        // }
        // System.out.println();
        // // Iterate through the ArrayList using a for-each loop
        // System.out.println("Iterating through ArrayList using for-each loop:");
        // for (Integer num : numbers) {
        //     System.out.print(num + " ");
        // }
        // System.out.println();
        // // Iterate through the ArrayList using a for loop
        // System.out.println("Iterating through ArrayList using for loop:");
        // for (int i = 0; i < numbers.size(); i++) {
        //     System.out.print(numbers.get(i) + " ");
        // }
        // System.out.println();
        // // Iterate through the ArrayList using an iterator
        // System.out.println("Iterating through ArrayList using iterator:");
        // java.util.Iterator<Integer> iterator = numbers.iterator();
        // while (iterator.hasNext()) {
        //     System.out.print(iterator.next() + " ");
        // }
        // System.out.println();
        // // Check if the ArrayList is synchronized (thread-safe)
        // boolean isSynchronized = java.util.Collections.synchronizedList(numbers) != null;
        // System.out.println("ArrayList is synchronized: " + isSynchronized);
        // // Check if the ArrayList is thread-safe
        // boolean isThreadSafe = java.util.Collections.synchronizedList(numbers) != null;
        // System.out.println("ArrayList is thread-safe: " + isThreadSafe);
        // // Check if the ArrayList is resizable
        // boolean isResizable = numbers instanceof java.util.ArrayList;
        // System.out.println("ArrayList is resizable: " + isResizable);
        // // Check if the ArrayList is dynamic
        // boolean isDynamic = numbers instanceof java.util.ArrayList;
        // System.out.println("ArrayList is dynamic: " + isDynamic);
        // // Check if the ArrayList is mutable
        // boolean isMutable = numbers instanceof java.util.ArrayList;
        // System.out.println("ArrayList is mutable: " + isMutable);
        // // Check if the ArrayList is immutable
        // boolean isImmutable = !(numbers instanceof java.util.ArrayList);
        // System.out.println("ArrayList is immutable: " + isImmutable);
        // // Check if the ArrayList is ordered
        // boolean isOrdered = numbers instanceof java.util.ArrayList;
        // System.out.println("ArrayList is ordered: " + isOrdered);
        // // Check if the ArrayList is indexed
        // boolean isIndexed = numbers instanceof java.util.ArrayList;
        // System.out.println("ArrayList is indexed: " + isIndexed);
        // // Check if the ArrayList is a collection
        // boolean isCollection = numbers instanceof java.util.Collection;
        // System.out.println("ArrayList is a collection: " + isCollection);
        // // Check if the ArrayList is a list
        // boolean isList = numbers instanceof java.util.List;
        // System.out.println("ArrayList is a list: " + isList);
        // // Check if the ArrayList is a set
        // boolean isSet = numbers instanceof java.util.Set;
        // System.out.println("ArrayList is a set: " + isSet);
        // // Check if the ArrayList is a map
        // boolean isMap = numbers instanceof java.util.Map;
        // System.out.println("ArrayList is a map: " + isMap);
        // // Check if the ArrayList is a queue
        // boolean isQueue = numbers instanceof java.util.Queue;
        // System.out.println("ArrayList is a queue: " + isQueue);
        // // Check if the ArrayList is a stack

        // // 2. LinkedList Practice Set.
        // // LinkedList in Java is a part of the java.util package and implements the List interface.
        // // It is a doubly linked list that allows for efficient insertion and deletion of elements.
        // // LinkedList is not synchronized, which means it is not thread-safe by default.
        // // It allows duplicate elements and maintains the insertion order.
        // // LinkedList can be used as a list, stack, or queue.
        // // // Write a code to demonstrate the use of LinkedList in Java.
        // // // Create a LinkedList of strings
        // java.util.LinkedList<String> linkedList = new java.util.LinkedList<>();
        // // // Add elements to the LinkedList
        // linkedList.add("Apple");
        // linkedList.add("Banana");
        // linkedList.add("Cherry");
        // // // Print the LinkedList
        // System.out.println("LinkedList: " + linkedList);
        // // // Access elements from the LinkedList
        // System.out.println("First element: " + linkedList.get(0));
        // // // Remove an element from the LinkedList
        // linkedList.remove(1); // Remove the element at index 1 (Banana)
        // // // Print the LinkedList after removal
        // System.out.println("LinkedList after removal: " + linkedList);
        // // // Check if the LinkedList contains a specific element
        // boolean containsCherry = linkedList.contains("Cherry");
        // System.out.println("LinkedList contains Cherry: " + containsCherry);
        // // // Get the size of the LinkedList
        // int linkedListSize = linkedList.size();
        // System.out.println("Size of LinkedList: " + linkedListSize);
        // // // Clear the LinkedList
        // linkedList.clear();
        // // // Print the LinkedList after clearing
        // System.out.println("LinkedList after clearing: " + linkedList);
        // // // Check if the LinkedList is empty
        // boolean isLinkedListEmpty = linkedList.isEmpty();
        // System.out.println("LinkedList is empty: " + isLinkedListEmpty);
        // // // Add elements to the LinkedList again
        // linkedList.add("Mango");
        // linkedList.add("Orange");
        // // // Print the LinkedList after adding elements again
        // System.out.println("LinkedList after adding elements again: " + linkedList);
        // // // Sort the LinkedList
        // java.util.Collections.sort(linkedList);
        // // // Print the sorted LinkedList
        // System.out.println("Sorted LinkedList: " + linkedList);
        // // // Reverse the LinkedList
        // java.util.Collections.reverse(linkedList);
        // // // Print the reversed LinkedList
        // System.out.println("Reversed LinkedList: " + linkedList);
        // // // Convert the LinkedList to an array
        // String[] linkedListArray = new String[linkedList.size()];
        // linkedList.toArray(linkedListArray);
        // // // Print the array
        // System.out.print("Array from LinkedList: ");
        // for (String fruit : linkedListArray) {
        //     System.out.print(fruit + " ");
        // }
        // System.out.println();
        // // // Iterate through the LinkedList using a for-each loop
        // System.out.println("Iterating through LinkedList using for-each loop:");
        // for (String fruit : linkedList) {
        //     System.out.print(fruit + " ");
        // }
        // System.out.println();
        // // // Iterate through the LinkedList using a for loop
        // System.out.println("Iterating through LinkedList using for loop:");
        // for (int i = 0; i < linkedList.size(); i++) {
        //     System.out.print(linkedList.get(i) + " ");
        // }
        // System.out.println();
        // // // Iterate through the LinkedList using an iterator
        // System.out.println("Iterating through LinkedList using iterator:");
        // java.util.Iterator<String> linkedListIterator = linkedList.iterator();
        // while (linkedListIterator.hasNext()) {
        //     System.out.print(linkedListIterator.next() + " ");
        // }
        // System.out.println();
        // // // Check if the LinkedList is synchronized (thread-safe)
        // boolean isLinkedListSynchronized = java.util.Collections.synchronizedList(linkedList) != null;
        // System.out.println("LinkedList is synchronized: " + isLinkedListSynchronized);
        // // // Check if the LinkedList is thread-safe
        // boolean isLinkedListThreadSafe = java.util.Collections.synchronizedList(linkedList) != null;
        // System.out.println("LinkedList is thread-safe: " + isLinkedListThreadSafe);
        // // // Check if the LinkedList is resizable
        // boolean isLinkedListResizable = linkedList instanceof java.util.LinkedList;
        // System.out.println("LinkedList is resizable: " + isLinkedListResizable);
        // // // Check if the LinkedList is dynamic
        // boolean isLinkedListDynamic = linkedList instanceof java.util.LinkedList;
        // System.out.println("LinkedList is dynamic: " + isLinkedListDynamic);
        // // // Check if the LinkedList is mutable
        // boolean isLinkedListMutable = linkedList instanceof java.util.LinkedList;
        // System.out.println("LinkedList is mutable: " + isLinkedListMutable);
        // // // Check if the LinkedList is immutable
        // boolean isLinkedListImmutable = !(linkedList instanceof java.util.LinkedList);
        // System.out.println("LinkedList is immutable: " + isLinkedListImmutable);
        // // // Check if the LinkedList is ordered
        // boolean isLinkedListOrdered = linkedList instanceof java.util.LinkedList;
        // System.out.println("LinkedList is ordered: " + isLinkedListOrdered);
        // // // Check if the LinkedList is indexed
        // boolean isLinkedListIndexed = linkedList instanceof java.util.LinkedList;
        // System.out.println("LinkedList is indexed: " + isLinkedListIndexed);
        // // // Check if the LinkedList is a collection
        // boolean isLinkedListCollection = linkedList instanceof java.util.Collection;
        // System.out.println("LinkedList is a collection: " + isLinkedListCollection);
        // // // Check if the LinkedList is a list
        // boolean isLinkedListList = linkedList instanceof java.util.List;
        // System.out.println("LinkedList is a list: " + isLinkedListList);
        // // // Check if the LinkedList is a set
        // boolean isLinkedListSet = linkedList instanceof java.util.Set;
        // System.out.println("LinkedList is a set: " + isLinkedListSet);
        // // // Check if the LinkedList is a map
        // boolean isLinkedListMap = linkedList instanceof java.util.Map;
        // System.out.println("LinkedList is a map: " + isLinkedListMap);
        // // // Check if the LinkedList is a queue
        // boolean isLinkedListQueue = linkedList instanceof java.util.Queue;
        // System.out.println("LinkedList is a queue: " + isLinkedListQueue);
        // // // Check if the LinkedList is a stack

        // // 3. Vector Practice Set.
        // Vector in Java is a part of the java.util package and implements the List interface.
        // It is a dynamic array that can grow or shrink in size as needed.
        // Vector is synchronized, which makes it thread-safe, but it may have performance overhead compared to non-synchronized collections like ArrayList.
        // It allows duplicate elements and maintains the insertion order.
        // // // Write a code to demonstrate the use of Vector in Java.
        // // // Create a Vector of strings
        // java.util.Vector<String> vector = new java.util.Vector<>();
        // // // Add elements to the Vector
        // vector.add("Red");
        // vector.add("Green");
        // vector.add("Blue");
        // // // Print the Vector
        // System.out.println("Vector: " + vector);
        // // // Access elements from the Vector
        // System.out.println("First element: " + vector.get(0));
        // // // Remove an element from the Vector
        // vector.remove(1); // Remove the element at index 1 (Green)
        // // // Print the Vector after removal
        // System.out.println("Vector after removal: " + vector);
        // // // Check if the Vector contains a specific element
        // boolean containsBlue = vector.contains("Blue");
        // System.out.println("Vector contains Blue: " + containsBlue);
        // // // Get the size of the Vector
        // int vectorSize = vector.size();
        // System.out.println("Size of Vector: " + vectorSize);
        // // // Clear the Vector
        // vector.clear();
        // // // Print the Vector after clearing
        // System.out.println("Vector after clearing: " + vector);
        // // // Check if the Vector is empty
        // boolean isVectorEmpty = vector.isEmpty();
        // System.out.println("Vector is empty: " + isVectorEmpty);
        // // // Add elements to the Vector again
        // vector.add("Yellow");
        // vector.add("Purple");
        // // // Print the Vector after adding elements again
        // System.out.println("Vector after adding elements again: " + vector);
        // // // Sort the Vector
        // java.util.Collections.sort(vector);
        // // // Print the sorted Vector
        // System.out.println("Sorted Vector: " + vector);
        // // // Reverse the Vector
        // java.util.Collections.reverse(vector);
        // // // Print the reversed Vector
        // System.out.println("Reversed Vector: " + vector);
        // // // Convert the Vector to an array
        // String[] vectorArray = new String[vector.size()];
        // vector.toArray(vectorArray);
        // // // Print the array
        // System.out.print("Array from Vector: ");
        // for (String color : vectorArray) {
        //     System.out.print(color + " ");
        // }
        // System.out.println();
        // // // Iterate through the Vector using a for-each loop
        // System.out.println("Iterating through Vector using for-each loop:");
        // for (String color : vector) {
        //     System.out.print(color + " ");
        // }
        // System.out.println();
        // // // Iterate through the Vector using a for loop
        // System.out.println("Iterating through Vector using for loop:");
        // for (int i = 0; i < vector.size(); i++) {
        //     System.out.print(vector.get(i) + " ");
        // }
        // System.out.println();
        // // // Iterate through the Vector using an iterator
        // System.out.println("Iterating through Vector using iterator:");
        // java.util.Iterator<String> vectorIterator = vector.iterator();
        // while (vectorIterator.hasNext()) {
        //     System.out.print(vectorIterator.next() + " ");
        // }
        // System.out.println();
        // // // Check if the Vector is synchronized (thread-safe)
        // boolean isVectorSynchronized = java.util.Collections.synchronizedList(vector) != null;
        // System.out.println("Vector is synchronized: " + isVectorSynchronized);
        // // // Check if the Vector is thread-safe
        // boolean isVectorThreadSafe = java.util.Collections.synchronizedList(vector) != null;
        // System.out.println("Vector is thread-safe: " + isVectorThreadSafe);
        // // // Check if the Vector is resizable
        // boolean isVectorResizable = vector instanceof java.util.Vector;
        // System.out.println("Vector is resizable: " + isVectorResizable);
        // // // Check if the Vector is dynamic
        // boolean isVectorDynamic = vector instanceof java.util.Vector;
        // System.out.println("Vector is dynamic: " + isVectorDynamic);
        // // // Check if the Vector is mutable
        // boolean isVectorMutable = vector instanceof java.util.Vector;
        // System.out.println("Vector is mutable: " + isVectorMutable);
        // // // Check if the Vector is immutable
        // boolean isVectorImmutable = !(vector instanceof java.util.Vector);
        // System.out.println("Vector is immutable: " + isVectorImmutable);
        // // // Check if the Vector is ordered
        // boolean isVectorOrdered = vector instanceof java.util.Vector;
        // System.out.println("Vector is ordered: " + isVectorOrdered);
        // // // Check if the Vector is indexed
        // boolean isVectorIndexed = vector instanceof java.util.Vector;
        // System.out.println("Vector is indexed: " + isVectorIndexed);
        // // // Check if the Vector is a collection
        // boolean isVectorCollection = vector instanceof java.util.Collection;
        // System.out.println("Vector is a collection: " + isVectorCollection);
        // // // Check if the Vector is a list
        // boolean isVectorList = vector instanceof java.util.List;
        // System.out.println("Vector is a list: " + isVectorList);
        // // // Check if the Vector is a set
        // boolean isVectorSet = vector instanceof java.util.Set;
        // System.out.println("Vector is a set: " + isVectorSet);
        // // // Check if the Vector is a map
        // boolean isVectorMap = vector instanceof java.util.Map;
        // System.out.println("Vector is a map: " + isVectorMap);
        // // // Check if the Vector is a queue
        // boolean isVectorQueue = vector instanceof java.util.Queue;
        // System.out.println("Vector is a queue: " + isVectorQueue);
        // // // Check if the Vector is a stack
        // boolean isVectorStack = vector instanceof java.util.Stack;
        // System.out.println("Vector is a stack: " + isVectorStack);
        // // // Check if the Vector is a deque
        // boolean isVectorDeque = vector instanceof java.util.Deque;
        // System.out.println("Vector is a deque: " + isVectorDeque);
        // // // Check if the Vector is a priority queue

        // // 3. Stack Practice Set.
        // // Stack in Java is a part of the java.util package and extends the Vector class.
        // // It represents a last-in-first-out (LIFO) data structure, where the last element added is the first one to be removed.
        // // Stack is synchronized, which makes it thread-safe, but it may have performance overhead compared to non-synchronized collections like ArrayList.
        // // It allows duplicate elements and maintains the insertion order.
        // // Write a code to demonstrate the use of Stack in Java.
        // // Create a Stack of integers
        // java.util.Stack<Integer> stack = new java.util.Stack<>();
        // // Add elements to the Stack
        // stack.push(1);
        // stack.push(2);
        // stack.push(3);
        // // Print the Stack
        // System.out.println("Stack: " + stack);
        // // Access the top element of the Stack
        // System.out.println("Top element: " + stack.peek());
        // // Remove an element from the Stack
        // stack.pop(); // Remove the top element (3)
        // // Print the Stack after removal
        // System.out.println("Stack after removal: " + stack);
        // // Check if the Stack contains a specific element
        // boolean contains2 = stack.contains(2);
        // System.out.println("Stack contains 2: " + contains2);
        // // Get the size of the Stack
        // int stackSize = stack.size();
        // System.out.println("Size of Stack: " + stackSize);
        // // Clear the Stack
        // stack.clear();
        // // Print the Stack after clearing
        // System.out.println("Stack after clearing: " + stack);
        // // Check if the Stack is empty
        // boolean isStackEmpty = stack.isEmpty();
        // System.out.println("Stack is empty: " + isStackEmpty);
        // // Add elements to the Stack again
        // stack.push(4);
        // stack.push(5);
        // // Print the Stack after adding elements again
        // System.out.println("Stack after adding elements again: " + stack);
        // // Sort the Stack (Note: Stack does not have a built-in sort method, so we need to convert it to a List first)
        // java.util.Collections.sort(stack);
        // // Print the sorted Stack
        // System.out.println("Sorted Stack: " + stack);
        // // Reverse the Stack (Note: Stack does not have a built-in reverse method, so we need to convert it to a List first)
        // java.util.Collections.reverse(stack);
        // // Print the reversed Stack
        // System.out.println("Reversed Stack: " + stack);
        // // Convert the Stack to an array
        // Integer[] stackArray = new Integer[stack.size()];
        // stack.toArray(stackArray);
        // // Print the array
        // System.out.print("Array from Stack: ");
        // for (Integer num : stackArray) {
        //     System.out.print(num + " ");
        // }
        // System.out.println();
        // // Iterate through the Stack using a for-each loop
        // System.out.println("Iterating through Stack using for-each loop:");
        // for (Integer num : stack) {
        //     System.out.print(num + " ");
        // }
        // System.out.println();
        // // Iterate through the Stack using a for loop
        // System.out.println("Iterating through Stack using for loop:");
        // for (int i = 0; i < stack.size(); i++) {
        //     System.out.print(stack.get(i) + " ");
        // }
        // System.out.println();
        // // Iterate through the Stack using an iterator
        // System.out.println("Iterating through Stack using iterator:");
        // java.util.Iterator<Integer> stackIterator = stack.iterator();
        // while (stackIterator.hasNext()) {
        //     System.out.print(stackIterator.next() + " ");
        // }
        // System.out.println();
        // // Check if the Stack is synchronized (thread-safe)
        // boolean isStackSynchronized = java.util.Collections.synchronizedList(stack) != null;
        // System.out.println("Stack is synchronized: " + isStackSynchronized);
        // // Check if the Stack is thread-safe
        // boolean isStackThreadSafe = java.util.Collections.synchronizedList(stack) != null;
        // System.out.println("Stack is thread-safe: " + isStackThreadSafe);
        // // Check if the Stack is resizable
        // boolean isStackResizable = stack instanceof java.util.Stack;
        // System.out.println("Stack is resizable: " + isStackResizable);
        // // Check if the Stack is dynamic
        // boolean isStackDynamic = stack instanceof java.util.Stack;
        // System.out.println("Stack is dynamic: " + isStackDynamic);
        // // Check if the Stack is mutable
        // boolean isStackMutable = stack instanceof java.util.Stack;
        // System.out.println("Stack is mutable: " + isStackMutable);
        // // Check if the Stack is immutable
        // boolean isStackImmutable = !(stack instanceof java.util.Stack);
        // System.out.println("Stack is immutable: " + isStackImmutable);
        // // Check if the Stack is ordered
        // boolean isStackOrdered = stack instanceof java.util.Stack;
        // System.out.println("Stack is ordered: " + isStackOrdered);
        // // Check if the Stack is indexed
        // boolean isStackIndexed = stack instanceof java.util.Stack;
        // System.out.println("Stack is indexed: " + isStackIndexed);
        // // Check if the Stack is a collection
        // boolean isStackCollection = stack instanceof java.util.Collection;
        // System.out.println("Stack is a collection: " + isStackCollection);
        // // Check if the Stack is a list
        // boolean isStackList = stack instanceof java.util.List;
        // System.out.println("Stack is a list: " + isStackList);
        // // Check if the Stack is a set
        // boolean isStackSet = stack instanceof java.util.Set;
        // System.out.println("Stack is a set: " + isStackSet);
        // // Check if the Stack is a map
        // boolean isStackMap = stack instanceof java.util.Map;
        // System.out.println("Stack is a map: " + isStackMap);
        // // Check if the Stack is a queue
        // boolean isStackQueue = stack instanceof java.util.Queue;
        // System.out.println("Stack is a queue: " + isStackQueue);
        // // Check if the Stack is a stack
        // boolean isStackStack = stack instanceof java.util.Stack;
        // System.out.println("Stack is a stack: " + isStackStack);
        // // Check if the Stack is a deque
        // boolean isStackDeque = stack instanceof java.util.Deque;
        // System.out.println("Stack is a deque: " + isStackDeque);
        // // Check if the Stack is a priority queue

        // // 4. Queue Practice Set.
        // // Queue in Java is a part of the java.util package and represents a first-in-first-out (FIFO) data structure.
        // // It allows duplicate elements and maintains the insertion order.
        // // Queue is not synchronized, which means it is not thread-safe by default.
        // // It is used to store elements in a linear order and provides methods for adding, removing, and inspecting elements.
        // // Write a code to demonstrate the use of Queue in Java.
        // // Create a Queue of strings
        // java.util.Queue<String> queue = new java.util.LinkedList<>();
        // // Add elements to the Queue
        // queue.add("A");
        // queue.add("B");
        // queue.add("C");
        // // Print the Queue
        // System.out.println("Queue: " + queue);
        // // Access the front element of the Queue
        // System.out.println("Front element: " + queue.peek());
        // // Remove an element from the Queue
        // queue.remove(); // Remove the front element (A)
        // // Print the Queue after removal
        // System.out.println("Queue after removal: " + queue);
        // // Check if the Queue contains a specific element
        // boolean containsB = queue.contains("B");
        // System.out.println("Queue contains B: " + containsB);
        // // Get the size of the Queue
        // int queueSize = queue.size();
        // System.out.println("Size of Queue: " + queueSize);
        // // Clear the Queue
        // queue.clear();
        // // Print the Queue after clearing
        // System.out.println("Queue after clearing: " + queue);
        // // Check if the Queue is empty
        // boolean isQueueEmpty = queue.isEmpty();
        // System.out.println("Queue is empty: " + isQueueEmpty);
        // // Add elements to the Queue again
        // queue.add("D");
        // queue.add("E");
        // // Print the Queue after adding elements again
        // System.out.println("Queue after adding elements again: " + queue);
        // // Sort the Queue (Note: Queue does not have a built-in sort method, so we need to convert it to a List first)
        // java.util.List<String> queueList = new java.util.ArrayList<>(queue);
        // java.util.Collections.sort(queueList);
        // // Print the sorted Queue
        // System.out.println("Sorted Queue: " + queueList);
        // // Reverse the Queue (Note: Queue does not have a built-in reverse method, so we need to convert it to a List first)
        // java.util.Collections.reverse(queueList);
        // // Print the reversed Queue
        // System.out.println("Reversed Queue: " + queueList);
        // // Convert the Queue to an array
        // String[] queueArray = new String[queue.size()];
        // queue.toArray(queueArray);
        // // Print the array
        // System.out.print("Array from Queue: ");
        // for (String element : queueArray) {
        //     System.out.print(element + " ");
        // }
        // System.out.println();
        // // Iterate through the Queue using a for-each loop
        // System.out.println("Iterating through Queue using for-each loop:");
        // for (String element : queue) {
        //     System.out.print(element + " ");
        // }
        // System.out.println();
        // // Iterate through the Queue using a for loop
        // System.out.println("Iterating through Queue using for loop:");
        // for (int i = 0; i < queue.size(); i++) {
        //     System.out.print(queue.toArray()[i] + " ");
        // }
        // System.out.println();
        // // Iterate through the Queue using an iterator
        // System.out.println("Iterating through Queue using iterator:");
        // java.util.Iterator<String> queueIterator = queue.iterator();
        // while (queueIterator.hasNext()) {
        //     System.out.print(queueIterator.next() + " ");
        // }
        // System.out.println();
        // // Check if the Queue is synchronized (thread-safe)
        // boolean isQueueSynchronized = java.util.Collections.synchronizedCollection(queue) != null;
        // System.out.println("Queue is synchronized: " + isQueueSynchronized);
        // // Check if the Queue is thread-safe
        // boolean isQueueThreadSafe = java.util.Collections.synchronizedCollection(queue) != null;
        // System.out.println("Queue is thread-safe: " + isQueueThreadSafe);
        // // Check if the Queue is resizable
        // boolean isQueueResizable = queue instanceof java.util.LinkedList;
        // System.out.println("Queue is resizable: " + isQueueResizable);
        // // Check if the Queue is dynamic
        // boolean isQueueDynamic = queue instanceof java.util.LinkedList;
        // System.out.println("Queue is dynamic: " + isQueueDynamic);
        // // Check if the Queue is mutable
        // boolean isQueueMutable = queue instanceof java.util.LinkedList;
        // System.out.println("Queue is mutable: " + isQueueMutable);
        // // Check if the Queue is immutable
        // boolean isQueueImmutable = !(queue instanceof java.util.LinkedList);
        // System.out.println("Queue is immutable: " + isQueueImmutable);
        // // Check if the Queue is ordered
        // boolean isQueueOrdered = queue instanceof java.util.LinkedList;
        // System.out.println("Queue is ordered: " + isQueueOrdered);
        // // Check if the Queue is indexed
        // boolean isQueueIndexed = queue instanceof java.util.LinkedList;
        // System.out.println("Queue is indexed: " + isQueueIndexed);
        // // Check if the Queue is a collection
        // boolean isQueueCollection = queue instanceof java.util.Collection;
        // System.out.println("Queue is a collection: " + isQueueCollection);
        // // Check if the Queue is a list
        // boolean isQueueList = queue instanceof java.util.List;
        // System.out.println("Queue is a list: " + isQueueList);
        // // Check if the Queue is a set
        // boolean isQueueSet = queue instanceof java.util.Set;
        // System.out.println("Queue is a set: " + isQueueSet);
        // // Check if the Queue is a map
        // boolean isQueueMap = queue instanceof java.util.Map;
        // System.out.println("Queue is a map: " + isQueueMap);
        // // Check if the Queue is a queue
        // boolean isQueueQueue = queue instanceof java.util.Queue;
        // System.out.println("Queue is a queue: " + isQueueQueue);
        // // Check if the Queue is a stack
        // boolean isQueueStack = queue instanceof java.util.Stack;
        // System.out.println("Queue is a stack: " + isQueueStack);
        // // Check if the Queue is a deque
        // boolean isQueueDeque = queue instanceof java.util.Deque;
        // System.out.println("Queue is a deque: " + isQueueDeque);
        // // Check if the Queue is a priority queue
        // boolean isQueuePriorityQueue = queue instanceof java.util.PriorityQueue;
        // System.out.println("Queue is a priority queue: " + isQueuePriorityQueue);
        // // // Check if the Queue is a blocking queue
        // boolean isQueueBlockingQueue = queue instanceof java.util.concurrent.BlockingQueue;
        // System.out.println("Queue is a blocking queue: " + isQueueBlockingQueue);
        // // // Check if the Queue is a concurrent queue
        // boolean isQueueConcurrentQueue = queue instanceof java.util.concurrent.ConcurrentLinkedQueue;
        // System.out.println("Queue is a concurrent queue: " + isQueueConcurrentQueue);
        // // // Check if the Queue is a transfer queue
        // boolean isQueueTransferQueue = queue instanceof java.util.concurrent.LinkedTransferQueue;
        // System.out.println("Queue is a transfer queue: " + isQueueTransferQueue);
        // // // Check if the Queue is a delay queue
        // boolean isQueueDelayQueue = queue instanceof java.util.concurrent.DelayQueue;
        // System.out.println("Queue is a delay queue: " + isQueueDelayQueue);
        // // // Check if the Queue is a synchronous queue
        // boolean isQueueSynchronousQueue = queue instanceof java.util.concurrent.SynchronousQueue;
        // System.out.println("Queue is a synchronous queue: " + isQueueSynchronousQueue);
        // // // Check if the Queue is a priority blocking queue
        // boolean isQueuePriorityBlockingQueue = queue instanceof java.util.concurrent.PriorityBlockingQueue;
        // System.out.println("Queue is a priority blocking queue: " + isQueuePriorityBlockingQueue);
        // // // Check if the Queue is a linked blocking queue
        // boolean isQueueLinkedBlockingQueue = queue instanceof java.util.concurrent.LinkedBlockingQueue;
        // System.out.println("Queue is a linked blocking queue: " + isQueueLinkedBlockingQueue);
        // // // Check if the Queue is a linked blocking deque
        // boolean isQueueLinkedBlockingDeque = queue instanceof java.util.concurrent.LinkedBlockingDeque;
        // System.out.println("Queue is a linked blocking deque: " + isQueueLinkedBlockingDeque);
        // // // Check if the Queue is a linked transfer queue
        // boolean isQueueLinkedTransferQueue = queue instanceof java.util.concurrent.LinkedTransferQueue;
        // System.out.println("Queue is a linked transfer queue: " + isQueueLinkedTransferQueue);
        // // // Check if the Queue is a linked delay queue
        // boolean isQueueLinkedDelayQueue = queue instanceof java.util.concurrent.LinkedBlockingDeque;
        // System.out.println("Queue is a linked delay queue: " + isQueueLinkedDelayQueue);
        // // // Check if the Queue is a linked synchronous queue
        // boolean isQueueLinkedSynchronousQueue = queue instanceof java.util.concurrent.LinkedBlockingDeque;
        // System.out.println("Queue is a linked synchronous queue: " + isQueueLinkedSynchronousQueue);
        // // // Check if the Queue is a linked priority blocking queue
        // boolean isQueueLinkedPriorityBlockingQueue = queue instanceof java.util.concurrent.LinkedBlockingDeque;
        // System.out.println("Queue is a linked priority blocking queue: " + isQueueLinkedPriorityBlockingQueue);

        // // 5. Deque Practice Set.
        // // Deque in Java is a part of the java.util package and represents a double-ended queue.
        // // It allows elements to be added or removed from both ends (front and back).
        // // Deque is not synchronized, which means it is not thread-safe by default.
        // // It allows duplicate elements and maintains the insertion order.
        // // Write a code to demonstrate the use of Deque in Java.
        // // Create a Deque of strings
        // java.util.Deque<String> deque = new java.util.LinkedList<>();
        // // Add elements to the Deque
        // deque.addFirst("X");
        // deque.addLast("Y");
        // deque.addFirst("Z");
        // // Print the Deque
        // System.out.println("Deque: " + deque);
        // // Access the front and back elements of the Deque
        // System.out.println("Front element: " + deque.getFirst());
        // System.out.println("Back element: " + deque.getLast());
        // // Remove an element from the Deque
        // deque.removeFirst(); // Remove the front element (Z)
        // // Print the Deque after removal
        // System.out.println("Deque after removal: " + deque);
        // // Check if the Deque contains a specific element
        // boolean containsY = deque.contains("Y");
        // System.out.println("Deque contains Y: " + containsY);
        // // Get the size of the Deque
        // int dequeSize = deque.size();
        // System.out.println("Size of Deque: " + dequeSize);
        // // Clear the Deque
        // deque.clear();
        // // Print the Deque after clearing
        // System.out.println("Deque after clearing: " + deque);
        // // Check if the Deque is empty
        // boolean isDequeEmpty = deque.isEmpty();
        // System.out.println("Deque is empty: " + isDequeEmpty);
        // // Add elements to the Deque again
        // deque.addFirst("A");
        // deque.addLast("B");
        // // Print the Deque after adding elements again
        // System.out.println("Deque after adding elements again: " + deque);
        // // Sort the Deque (Note: Deque does not have a built-in sort method, so we need to convert it to a List first)
        // java.util.List<String> dequeList = new java.util.ArrayList<>(deque);
        // java.util.Collections.sort(dequeList);
        // // Print the sorted Deque
        // System.out.println("Sorted Deque: " + dequeList);
        // // Reverse the Deque (Note: Deque does not have a built-in reverse method, so we need to convert it to a List first)
        // java.util.Collections.reverse(dequeList);
        // // Print the reversed Deque
        // System.out.println("Reversed Deque: " + dequeList);
        // // Convert the Deque to an array
        // String[] dequeArray = new String[deque.size()];
        // deque.toArray(dequeArray);
        // // Print the array
        // System.out.print("Array from Deque: ");
        // for (String element : dequeArray) {
        //     System.out.print(element + " ");
        // }
        // System.out.println();
        // // Iterate through the Deque using a for-each loop
        // System.out.println("Iterating through Deque using for-each loop:");
        // for (String element : deque) {
        //     System.out.print(element + " ");
        // }
        // System.out.println();
        // // Iterate through the Deque using a for loop
        // System.out.println("Iterating through Deque using for loop:");
        // for (int i = 0; i < deque.size(); i++) {
        //     System.out.print(deque.toArray()[i] + " ");
        // }
        // System.out.println();
        // // Iterate through the Deque using an iterator
        // System.out.println("Iterating through Deque using iterator:");
        // java.util.Iterator<String> dequeIterator = deque.iterator();
        // while (dequeIterator.hasNext()) {
        //     System.out.print(dequeIterator.next() + " ");
        // }
        // System.out.println();
        // // Check if the Deque is synchronized (thread-safe)
        // boolean isDequeSynchronized = java.util.Collections.synchronizedCollection(deque) != null;
        // System.out.println("Deque is synchronized: " + isDequeSynchronized);
        // // Check if the Deque is thread-safe
        // boolean isDequeThreadSafe = java.util.Collections.synchronizedCollection(deque) != null;
        // System.out.println("Deque is thread-safe: " + isDequeThreadSafe);
        // // Check if the Deque is resizable
        // boolean isDequeResizable = deque instanceof java.util.LinkedList;
        // System.out.println("Deque is resizable: " + isDequeResizable);
        // // Check if the Deque is dynamic
        // boolean isDequeDynamic = deque instanceof java.util.LinkedList;
        // System.out.println("Deque is dynamic: " + isDequeDynamic);
        // // Check if the Deque is mutable
        // boolean isDequeMutable = deque instanceof java.util.LinkedList;
        // System.out.println("Deque is mutable: " + isDequeMutable);
        // // Check if the Deque is immutable
        // boolean isDequeImmutable = !(deque instanceof java.util.LinkedList);
        // System.out.println("Deque is immutable: " + isDequeImmutable);
        // // Check if the Deque is ordered
        // boolean isDequeOrdered = deque instanceof java.util.LinkedList;
        // System.out.println("Deque is ordered: " + isDequeOrdered);
        // // Check if the Deque is indexed
        // boolean isDequeIndexed = deque instanceof java.util.LinkedList;
        // System.out.println("Deque is indexed: " + isDequeIndexed);
        // // Check if the Deque is a collection
        // boolean isDequeCollection = deque instanceof java.util.Collection;
        // System.out.println("Deque is a collection: " + isDequeCollection);
        // // Check if the Deque is a list
        // boolean isDequeList = deque instanceof java.util.List;
        // System.out.println("Deque is a list: " + isDequeList);
        // // Check if the Deque is a set
        // boolean isDequeSet = deque instanceof java.util.Set;
        // System.out.println("Deque is a set: " + isDequeSet);
        // // Check if the Deque is a map
        // boolean isDequeMap = deque instanceof java.util.Map;
        // System.out.println("Deque is a map: " + isDequeMap);
        // // Check if the Deque is a queue
        // boolean isDequeQueue = deque instanceof java.util.Queue;
        // System.out.println("Deque is a queue: " + isDequeQueue);
        // // Check if the Deque is a stack
        // boolean isDequeStack = deque instanceof java.util.Stack;
        // System.out.println("Deque is a stack: " + isDequeStack);
        // // Check if the Deque is a deque
        // boolean isDequeDeque = deque instanceof java.util.Deque;
        // System.out.println("Deque is a deque: " + isDequeDeque);
        // // Check if the Deque is a priority queue
        // boolean isDequePriorityQueue = deque instanceof java.util.PriorityQueue;
        // System.out.println("Deque is a priority queue: " + isDequePriorityQueue);
        // // Check if the Deque is a blocking queue
        // boolean isDequeBlockingQueue = deque instanceof java.util.concurrent.BlockingQueue;
        // System.out.println("Deque is a blocking queue: " + isDequeBlockingQueue);
        // // Check if the Deque is a concurrent queue
        // boolean isDequeConcurrentQueue = deque instanceof java.util.concurrent.ConcurrentLinkedQueue;
        // System.out.println("Deque is a concurrent queue: " + isDequeConcurrentQueue);
        // // Check if the Deque is a transfer queue
        // boolean isDequeTransferQueue = deque instanceof java.util.concurrent.LinkedTransferQueue;
        // System.out.println("Deque is a transfer queue: " + isDequeTransferQueue);
        // // Check if the Deque is a delay queue
        // boolean isDequeDelayQueue = deque instanceof java.util.concurrent.DelayQueue;
        // System.out.println("Deque is a delay queue: " + isDequeDelayQueue);
        // // Check if the Deque is a synchronous queue
        // boolean isDequeSynchronousQueue = deque instanceof java.util.concurrent.SynchronousQueue;
        // System.out.println("Deque is a synchronous queue: " + isDequeSynchronousQueue);
        // // Check if the Deque is a priority blocking queue
        // boolean isDequePriorityBlockingQueue = deque instanceof java.util.concurrent.PriorityBlockingQueue;
        // System.out.println("Deque is a priority blocking queue: " + isDequePriorityBlockingQueue);
        // // Check if the Deque is a linked blocking queue
        // boolean isDequeLinkedBlockingQueue = deque instanceof java.util.concurrent.LinkedBlockingQueue;
        // System.out.println("Deque is a linked blocking queue: " + isDequeLinkedBlockingQueue);
        // // Check if the Deque is a linked blocking deque
        // boolean isDequeLinkedBlockingDeque = deque instanceof java.util.concurrent.LinkedBlockingDeque;
        // System.out.println("Deque is a linked blocking deque: " + isDequeLinkedBlockingDeque);
        // // Check if the Deque is a linked transfer queue
        // boolean isDequeLinkedTransferQueue = deque instanceof java.util.concurrent.LinkedTransferQueue;
        // System.out.println("Deque is a linked transfer queue: " + isDequeLinkedTransferQueue);
        // // Check if the Deque is a linked delay queue
        // boolean isDequeLinkedDelayQueue = deque instanceof java.util.concurrent.LinkedBlockingDeque;
        // System.out.println("Deque is a linked delay queue: " + isDequeLinkedDelayQueue);
        // // Check if the Deque is a linked synchronous queue
        // boolean isDequeLinkedSynchronousQueue = deque instanceof java.util.concurrent.LinkedBlockingDeque;
        // System.out.println("Deque is a linked synchronous queue: " + isDequeLinkedSynchronousQueue);
        // // Check if the Deque is a linked priority blocking queue
        // boolean isDequeLinkedPriorityBlockingQueue = deque instanceof java.util.concurrent.LinkedBlockingDeque;
        // System.out.println("Deque is a linked priority blocking queue: " + isDequeLinkedPriorityBlockingQueue);

        // // 6. Priority Queue Practice Set.
        // // Priority Queue in Java is a part of the java.util package and represents a queue where elements are processed based on their priority.
        // // It allows duplicate elements and does not guarantee the order of elements with the same priority.
        // // Priority Queue is not synchronized, which means it is not thread-safe by default.
        // // It is used to store elements in a priority order and provides methods for adding, removing, and inspecting elements.
        // // Write a code to demonstrate the use of Priority Queue in Java.
        // // Create a Priority Queue of integers
        // java.util.PriorityQueue<Integer> priorityQueue = new java.util.PriorityQueue<>();
        // // Add elements to the Priority Queue
        // priorityQueue.add(5);
        // priorityQueue.add(2);
        // priorityQueue.add(8);
        // // Print the Priority Queue
        // System.out.println("Priority Queue: " + priorityQueue);
        // // Access the front element of the Priority Queue
        // System.out.println("Front element: " + priorityQueue.peek());
        // // Remove an element from the Priority Queue
        // priorityQueue.remove(); // Remove the front element (2)
        // // Print the Priority Queue after removal
        // System.out.println("Priority Queue after removal: " + priorityQueue);
        // // Check if the Priority Queue contains a specific element
        // boolean contains5 = priorityQueue.contains(5);
        // System.out.println("Priority Queue contains 5: " + contains5);
        // // Get the size of the Priority Queue
        // int priorityQueueSize = priorityQueue.size();
        // System.out.println("Size of Priority Queue: " + priorityQueueSize);
        // // Clear the Priority Queue
        // priorityQueue.clear();
        // // Print the Priority Queue after clearing
        // System.out.println("Priority Queue after clearing: " + priorityQueue);
        // // Check if the Priority Queue is empty
        // boolean isPriorityQueueEmpty = priorityQueue.isEmpty();
        // System.out.println("Priority Queue is empty: " + isPriorityQueueEmpty);
        // // Add elements to the Priority Queue again
        // priorityQueue.add(3);
        // priorityQueue.add(1);
        // // Print the Priority Queue after adding elements again
        // System.out.println("Priority Queue after adding elements again: " + priorityQueue);
        // // Sort the Priority Queue (Note: Priority Queue does not have a built-in sort method, so we need to convert it to a List first)
        // java.util.List<Integer> priorityQueueList = new java.util.ArrayList<>(priorityQueue);
        // java.util.Collections.sort(priorityQueueList);
        // // Print the sorted Priority Queue
        // System.out.println("Sorted Priority Queue: " + priorityQueueList);
        // // Reverse the Priority Queue (Note: Priority Queue does not have a built-in reverse method, so we need to convert it to a List first)
        // java.util.Collections.reverse(priorityQueueList);
        // // Print the reversed Priority Queue
        // System.out.println("Reversed Priority Queue: " + priorityQueueList);
        // // Convert the Priority Queue to an array
        // Integer[] priorityQueueArray = new Integer[priorityQueue.size()];
        // priorityQueue.toArray(priorityQueueArray);
        // // Print the array
        // System.out.print("Array from Priority Queue: ");
        // for (Integer element : priorityQueueArray) {
        //     System.out.print(element + " ");
        // }
        // System.out.println();
        // // Iterate through the Priority Queue using a for-each loop
        // System.out.println("Iterating through Priority Queue using for-each loop:");
        // for (Integer element : priorityQueue) {
        //     System.out.print(element + " ");
        // }
        // System.out.println();
        // // Iterate through the Priority Queue using a for loop
        // System.out.println("Iterating through Priority Queue using for loop:");
        // for (int i = 0; i < priorityQueue.size(); i++) {
        //     System.out.print(priorityQueue.toArray()[i] + " ");
        // }
        // System.out.println();
        // // Iterate through the Priority Queue using an iterator
        // System.out.println("Iterating through Priority Queue using iterator:");
        // java.util.Iterator<Integer> priorityQueueIterator = priorityQueue.iterator();
        // while (priorityQueueIterator.hasNext()) {
        //     System.out.print(priorityQueueIterator.next() + " ");
        // }
        // System.out.println();
        // // Check if the Priority Queue is synchronized (thread-safe)
        // boolean isPriorityQueueSynchronized = java.util.Collections.synchronizedCollection(priorityQueue) != null;
        // System.out.println("Priority Queue is synchronized: " + isPriorityQueueSynchronized);
        // // Check if the Priority Queue is thread-safe
        // boolean isPriorityQueueThreadSafe = java.util.Collections.synchronizedCollection(priorityQueue) != null;
        // System.out.println("Priority Queue is thread-safe: " + isPriorityQueueThreadSafe);
        // // Check if the Priority Queue is resizable
        // boolean isPriorityQueueResizable = priorityQueue instanceof java.util.PriorityQueue;
        // System.out.println("Priority Queue is resizable: " + isPriorityQueueResizable);
        // // Check if the Priority Queue is dynamic
        // boolean isPriorityQueueDynamic = priorityQueue instanceof java.util.PriorityQueue;
        // System.out.println("Priority Queue is dynamic: " + isPriorityQueueDynamic);
        // // Check if the Priority Queue is mutable
        // boolean isPriorityQueueMutable = priorityQueue instanceof java.util.PriorityQueue;
        // System.out.println("Priority Queue is mutable: " + isPriorityQueueMutable);
        // // Check if the Priority Queue is immutable
        // boolean isPriorityQueueImmutable = !(priorityQueue instanceof java.util.PriorityQueue);
        // System.out.println("Priority Queue is immutable: " + isPriorityQueueImmutable);
        // // Check if the Priority Queue is ordered
        // boolean isPriorityQueueOrdered = priorityQueue instanceof java.util.PriorityQueue;
        // System.out.println("Priority Queue is ordered: " + isPriorityQueueOrdered);
        // // Check if the Priority Queue is indexed
        // boolean isPriorityQueueIndexed = priorityQueue instanceof java.util.PriorityQueue;
        // System.out.println("Priority Queue is indexed: " + isPriorityQueueIndexed);
        // // Check if the Priority Queue is a collection
        // boolean isPriorityQueueCollection = priorityQueue instanceof java.util.Collection;
        // System.out.println("Priority Queue is a collection: " + isPriorityQueueCollection);
        // // Check if the Priority Queue is a list
        // boolean isPriorityQueueList = priorityQueue instanceof java.util.List;
        // System.out.println("Priority Queue is a list: " + isPriorityQueueList);
        // // Check if the Priority Queue is a set
        // boolean isPriorityQueueSet = priorityQueue instanceof java.util.Set;
        // System.out.println("Priority Queue is a set: " + isPriorityQueueSet);
        // // Check if the Priority Queue is a map
        // boolean isPriorityQueueMap = priorityQueue instanceof java.util.Map;
        // System.out.println("Priority Queue is a map: " + isPriorityQueueMap);
        // // Check if the Priority Queue is a queue
        // boolean isPriorityQueueQueue = priorityQueue instanceof java.util.Queue;
        // System.out.println("Priority Queue is a queue: " + isPriorityQueueQueue);
        // // Check if the Priority Queue is a deque
        // boolean isPriorityQueueDeque = priorityQueue instanceof java.util.Deque;
        // System.out.println("Priority Queue is a deque: " + isPriorityQueueDeque);
        // // Check if the Priority Queue is a priority queue
        // boolean isPriorityQueuePriorityQueue = priorityQueue instanceof java.util.PriorityQueue;
        // System.out.println("Priority Queue is a priority queue: " + isPriorityQueuePriorityQueue);
        // // Check if the Priority Queue is a blocking queue
        // boolean isPriorityQueueBlockingQueue = priorityQueue instanceof java.util.concurrent.BlockingQueue;
        // System.out.println("Priority Queue is a blocking queue: " + isPriorityQueueBlockingQueue);

        // // 7. Blocking Queue Practice Set.
        // // // Blocking Queue in Java is a part of the java.util.concurrent package and represents a thread-safe queue that supports blocking operations.
        // // BlockingQueue in Java is a part of the java.util.concurrent package and represents a thread-safe queue that supports blocking operations.
        // // Write a code to demonstrate the use of BlockingQueue in Java.
        // // Create a BlockingQueue of integers
        // java.util.concurrent.BlockingQueue<Integer> blockingQueue = new java.util.concurrent.ArrayBlockingQueue<>(5);

        // // Add elements to the BlockingQueue
        // try {
        //     blockingQueue.put(1);
        //     blockingQueue.put(2);
        //     blockingQueue.put(3);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        // // Print the BlockingQueue
        // System.out.println("BlockingQueue: " + blockingQueue);

        // // Access the front element of the BlockingQueue
        // System.out.println("Front element: " + blockingQueue.peek());

        // // Remove an element from the BlockingQueue
        // try {
        //     blockingQueue.take(); // Remove the front element (1)
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        // // Print the BlockingQueue after removal
        // System.out.println("BlockingQueue after removal: " + blockingQueue);

        // // Check if the BlockingQueue contains a specific element
        // boolean contains2 = blockingQueue.contains(2);
        // System.out.println("BlockingQueue contains 2: " + contains2);

        // // Get the size of the BlockingQueue
        // int blockingQueueSize = blockingQueue.size();
        // System.out.println("Size of BlockingQueue: " + blockingQueueSize);

        // // Clear the BlockingQueue
        // blockingQueue.clear();

        // // Print the BlockingQueue after clearing
        // System.out.println("BlockingQueue after clearing: " + blockingQueue);

        // // Check if the BlockingQueue is empty
        // boolean isBlockingQueueEmpty = blockingQueue.isEmpty();
        // System.out.println("BlockingQueue is empty: " + isBlockingQueueEmpty);

        // // Add elements to the BlockingQueue again
        // try {
        //     blockingQueue.put(4);
        //     blockingQueue.put(5);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        // // Print the BlockingQueue after adding elements again
        // System.out.println("BlockingQueue after adding elements again: " + blockingQueue);

        // // Iterate through the BlockingQueue using a for-each loop
        // System.out.println("Iterating through BlockingQueue using for-each loop:");
        // for (Integer element : blockingQueue) {
        //     System.out.print(element + " ");
        // }
        // System.out.println();

        // // Iterate through the BlockingQueue using an iterator
        // System.out.println("Iterating through BlockingQueue using iterator:");
        // java.util.Iterator<Integer> blockingQueueIterator = blockingQueue.iterator();
        // while (blockingQueueIterator.hasNext()) {
        //     System.out.print(blockingQueueIterator.next() + " ");
        // }
        // System.out.println();
        // // Check if the BlockingQueue is synchronized (thread-safe)
        // boolean isBlockingQueueSynchronized = blockingQueue instanceof java.util.concurrent.BlockingQueue;
        // System.out.println("BlockingQueue is synchronized: " + isBlockingQueueSynchronized);
        // // Check if the BlockingQueue is thread-safe
        // boolean isBlockingQueueThreadSafe = blockingQueue instanceof java.util.concurrent.BlockingQueue;
        // System.out.println("BlockingQueue is thread-safe: " + isBlockingQueueThreadSafe);
        // // Check if the BlockingQueue is resizable
        // boolean isBlockingQueueResizable = blockingQueue instanceof java.util.concurrent.ArrayBlockingQueue;
        // System.out.println("BlockingQueue is resizable: " + isBlockingQueueResizable);
        // // Check if the BlockingQueue is dynamic
        // boolean isBlockingQueueDynamic = blockingQueue instanceof java.util.concurrent.ArrayBlockingQueue;
        // System.out.println("BlockingQueue is dynamic: " + isBlockingQueueDynamic);
        // // Check if the BlockingQueue is mutable
        // boolean isBlockingQueueMutable = blockingQueue instanceof java.util.concurrent.ArrayBlockingQueue;
        // System.out.println("BlockingQueue is mutable: " + isBlockingQueueMutable);
        // // Check if the BlockingQueue is immutable
        // boolean isBlockingQueueImmutable = !(blockingQueue instanceof java.util.concurrent.ArrayBlockingQueue);
        // System.out.println("BlockingQueue is immutable: " + isBlockingQueueImmutable);
        // // Check if the BlockingQueue is ordered
        // boolean isBlockingQueueOrdered = blockingQueue instanceof java.util.concurrent.ArrayBlockingQueue;
        // System.out.println("BlockingQueue is ordered: " + isBlockingQueueOrdered);
        // // Check if the BlockingQueue is indexed
        // boolean isBlockingQueueIndexed = blockingQueue instanceof java.util.concurrent.ArrayBlockingQueue;
        // System.out.println("BlockingQueue is indexed: " + isBlockingQueueIndexed);
        // // Check if the BlockingQueue is a collection
        // boolean isBlockingQueueCollection = blockingQueue instanceof java.util.Collection;
        // System.out.println("BlockingQueue is a collection: " + isBlockingQueueCollection);
        // // Check if the BlockingQueue is a list
        // boolean isBlockingQueueList = blockingQueue instanceof java.util.List;
        // System.out.println("BlockingQueue is a list: " + isBlockingQueueList);
        // // Check if the BlockingQueue is a set
        // boolean isBlockingQueueSet = blockingQueue instanceof java.util.Set;
        // System.out.println("BlockingQueue is a set: " + isBlockingQueueSet);
        // // Check if the BlockingQueue is a map
        // boolean isBlockingQueueMap = blockingQueue instanceof java.util.Map;
        // System.out.println("BlockingQueue is a map: " + isBlockingQueueMap);
        // // Check if the BlockingQueue is a queue
        // boolean isBlockingQueueQueue = blockingQueue instanceof java.util.Queue;
        // System.out.println("BlockingQueue is a queue: " + isBlockingQueueQueue);
        // // Check if the BlockingQueue is a deque
        // boolean isBlockingQueueDeque = blockingQueue instanceof java.util.Deque;
        // System.out.println("BlockingQueue is a deque: " + isBlockingQueueDeque);
        // // Check if the BlockingQueue is a priority queue
        // boolean isBlockingQueuePriorityQueue = blockingQueue instanceof java.util.PriorityQueue;
        // System.out.println("BlockingQueue is a priority queue: " + isBlockingQueuePriorityQueue);
        // // Check if the BlockingQueue is a blocking queue
        // boolean isBlockingQueueBlockingQueue = blockingQueue instanceof java.util.concurrent.BlockingQueue;
        // System.out.println("BlockingQueue is a blocking queue: " + isBlockingQueueBlockingQueue);
        // // Check if the BlockingQueue is a concurrent queue
        // boolean isBlockingQueueConcurrentQueue = blockingQueue instanceof java.util.concurrent.ConcurrentLinkedQueue;
        // System.out.println("BlockingQueue is a concurrent queue: " + isBlockingQueueConcurrentQueue);
        // // Check if the BlockingQueue is a transfer queue
        // boolean isBlockingQueueTransferQueue = blockingQueue instanceof java.util.concurrent.LinkedTransferQueue;
        // System.out.println("BlockingQueue is a transfer queue: " + isBlockingQueueTransferQueue);
        // // Check if the BlockingQueue is a delay queue
        // boolean isBlockingQueueDelayQueue = blockingQueue instanceof java.util.concurrent.DelayQueue;
        // System.out.println("BlockingQueue is a delay queue: " + isBlockingQueueDelayQueue);
        // // Check if the BlockingQueue is a synchronous queue
        // boolean isBlockingQueueSynchronousQueue = blockingQueue instanceof java.util.concurrent.SynchronousQueue;
        // System.out.println("BlockingQueue is a synchronous queue: " + isBlockingQueueSynchronousQueue);
        // // Check if the BlockingQueue is a priority blocking queue
        // boolean isBlockingQueuePriorityBlockingQueue = blockingQueue instanceof java.util.concurrent.PriorityBlockingQueue;
        // System.out.println("BlockingQueue is a priority blocking queue: " + isBlockingQueuePriorityBlockingQueue);
        // // Check if the BlockingQueue is a linked blocking queue
        // boolean isBlockingQueueLinkedBlockingQueue = blockingQueue instanceof java.util.concurrent.LinkedBlockingQueue;
        // System.out.println("BlockingQueue is a linked blocking queue: " + isBlockingQueueLinkedBlockingQueue);
        // // Check if the BlockingQueue is a linked blocking deque
        // boolean isBlockingQueueLinkedBlockingDeque = blockingQueue instanceof java.util.concurrent.LinkedBlockingDeque;
        // System.out.println("BlockingQueue is a linked blocking deque: " + isBlockingQueueLinkedBlockingDeque);
        // // Check if the BlockingQueue is a linked transfer queue
        // boolean isBlockingQueueLinkedTransferQueue = blockingQueue instanceof java.util.concurrent.LinkedTransferQueue;
        // System.out.println("BlockingQueue is a linked transfer queue: " + isBlockingQueueLinkedTransferQueue);
        // // Check if the BlockingQueue is a linked delay queue
        // boolean isBlockingQueueLinkedDelayQueue = blockingQueue instanceof java.util.concurrent.LinkedBlockingDeque;
        // System.out.println("BlockingQueue is a linked delay queue: " + isBlockingQueueLinkedDelayQueue);
        // // Check if the BlockingQueue is a linked synchronous queue
        // boolean isBlockingQueueLinkedSynchronousQueue = blockingQueue instanceof java.util.concurrent.LinkedBlockingDeque;
        // System.out.println("BlockingQueue is a linked synchronous queue: " + isBlockingQueueLinkedSynchronousQueue);
        // // Check if the BlockingQueue is a linked priority blocking queue
        // boolean isBlockingQueueLinkedPriorityBlockingQueue = blockingQueue instanceof java.util.concurrent.LinkedBlockingDeque;
        // System.out.println("BlockingQueue is a linked priority blocking queue: " + isBlockingQueueLinkedPriorityBlockingQueue);

        // // 8. Concurrent Queue Practice Set.
        // // Concurrent Queue in Java is a part of the java.util.concurrent package and represents a thread-safe queue that supports concurrent operations.
        // // Write a code to demonstrate the use of ConcurrentLinkedQueue in Java.
        // // Create a ConcurrentLinkedQueue of strings
        // java.util.concurrent.ConcurrentLinkedQueue<String> concurrentQueue = new java.util.concurrent.ConcurrentLinkedQueue<>();

        // // Add elements to the ConcurrentLinkedQueue
        // concurrentQueue.add("Alpha");
        // concurrentQueue.add("Beta");
        // concurrentQueue.add("Gamma");

        // // Print the ConcurrentLinkedQueue
        // System.out.println("ConcurrentLinkedQueue: " + concurrentQueue);

        // // Access the front element of the ConcurrentLinkedQueue
        // System.out.println("Front element: " + concurrentQueue.peek());

        // // Remove an element from the ConcurrentLinkedQueue
        // concurrentQueue.poll(); // Remove the front element (Alpha)

        // // Print the ConcurrentLinkedQueue after removal
        // System.out.println("ConcurrentLinkedQueue after removal: " + concurrentQueue);

        // // Check if the ConcurrentLinkedQueue contains a specific element
        // boolean containsBeta = concurrentQueue.contains("Beta");
        // System.out.println("ConcurrentLinkedQueue contains Beta: " + containsBeta);

        // // Get the size of the ConcurrentLinkedQueue
        // int concurrentQueueSize = concurrentQueue.size();
        // System.out.println("Size of ConcurrentLinkedQueue: " + concurrentQueueSize);

        // // Clear the ConcurrentLinkedQueue
        // concurrentQueue.clear();

        // // Print the ConcurrentLinkedQueue after clearing
        // System.out.println("ConcurrentLinkedQueue after clearing: " + concurrentQueue);

        // // Check if the ConcurrentLinkedQueue is empty
        // boolean isConcurrentQueueEmpty = concurrentQueue.isEmpty();
        // System.out.println("ConcurrentLinkedQueue is empty: " + isConcurrentQueueEmpty);

        // // Add elements to the ConcurrentLinkedQueue again
        // concurrentQueue.add("Delta");
        // concurrentQueue.add("Epsilon");

        // // Print the ConcurrentLinkedQueue after adding elements again
        // System.out.println("ConcurrentLinkedQueue after adding elements again: " + concurrentQueue);

        // // Iterate through the ConcurrentLinkedQueue using a for-each loop
        // System.out.println("Iterating through ConcurrentLinkedQueue using for-each loop:");
        // for (String element : concurrentQueue) {
        //     System.out.print(element + " ");
        // }
        // System.out.println();

        // // Iterate through the ConcurrentLinkedQueue using an iterator
        // System.out.println("Iterating through ConcurrentLinkedQueue using iterator:");
        // java.util.Iterator<String> concurrentQueueIterator = concurrentQueue.iterator();
        // while (concurrentQueueIterator.hasNext()) {
        //     System.out.print(concurrentQueueIterator.next() + " ");
        // }
        // System.out.println();

        // // Check if the ConcurrentLinkedQueue is synchronized (thread-safe)
        // boolean isConcurrentQueueSynchronized = concurrentQueue instanceof java.util.concurrent.ConcurrentLinkedQueue;
        // System.out.println("ConcurrentLinkedQueue is synchronized: " + isConcurrentQueueSynchronized);

        // // Check if the ConcurrentLinkedQueue is thread-safe
        // boolean isConcurrentQueueThreadSafe = concurrentQueue instanceof java.util.concurrent.ConcurrentLinkedQueue;
        // System.out.println("ConcurrentLinkedQueue is thread-safe: " + isConcurrentQueueThreadSafe);

        // // Check if the ConcurrentLinkedQueue is resizable
        // boolean isConcurrentQueueResizable = concurrentQueue instanceof java.util.concurrent.ConcurrentLinkedQueue;
        // System.out.println("ConcurrentLinkedQueue is resizable: " + isConcurrentQueueResizable);

        // // Check if the ConcurrentLinkedQueue is dynamic
        // boolean isConcurrentQueueDynamic = concurrentQueue instanceof java.util.concurrent.ConcurrentLinkedQueue;
        // System.out.println("ConcurrentLinkedQueue is dynamic: " + isConcurrentQueueDynamic);

        // // Check if the ConcurrentLinkedQueue is mutable
        // boolean isConcurrentQueueMutable = concurrentQueue instanceof java.util.concurrent.ConcurrentLinkedQueue;
        // System.out.println("ConcurrentLinkedQueue is mutable: " + isConcurrentQueueMutable);

        // // Check if the ConcurrentLinkedQueue is immutable
        // boolean isConcurrentQueueImmutable = !(concurrentQueue instanceof java.util.concurrent.ConcurrentLinkedQueue);
        // System.out.println("ConcurrentLinkedQueue is immutable: " + isConcurrentQueueImmutable);

        // // Check if the ConcurrentLinkedQueue is ordered
        // boolean isConcurrentQueueOrdered = concurrentQueue instanceof java.util.concurrent.ConcurrentLinkedQueue;
        // System.out.println("ConcurrentLinkedQueue is ordered: " + isConcurrentQueueOrdered);

        // // Check if the ConcurrentLinkedQueue is indexed
        // boolean isConcurrentQueueIndexed = concurrentQueue instanceof java.util.concurrent.ConcurrentLinkedQueue;
        // System.out.println("ConcurrentLinkedQueue is indexed: " + isConcurrentQueueIndexed);

        // // Check if the ConcurrentLinkedQueue is a collection
        // boolean isConcurrentQueueCollection = concurrentQueue instanceof java.util.Collection;
        // System.out.println("ConcurrentLinkedQueue is a collection: " + isConcurrentQueueCollection);

        // // Check if the ConcurrentLinkedQueue is a list
        // boolean isConcurrentQueueList = concurrentQueue instanceof java.util.List;
        // System.out.println("ConcurrentLinkedQueue is a list: " + isConcurrentQueueList);

        // // Check if the ConcurrentLinkedQueue is a set
        // boolean isConcurrentQueueSet = concurrentQueue instanceof java.util.Set;
        // System.out.println("ConcurrentLinkedQueue is a set: " + isConcurrentQueueSet);

        // // Check if the ConcurrentLinkedQueue is a map
        // boolean isConcurrentQueueMap = concurrentQueue instanceof java.util.Map;
        // System.out.println("ConcurrentLinkedQueue is a map: " + isConcurrentQueueMap);

        // // Check if the ConcurrentLinkedQueue is a queue
        // boolean isConcurrentQueueQueue = concurrentQueue instanceof java.util.Queue;
        // System.out.println("ConcurrentLinkedQueue is a queue: " + isConcurrentQueueQueue);

        // // Check if the ConcurrentLinkedQueue is a deque
        // boolean isConcurrentQueueDeque = concurrentQueue instanceof java.util.Deque;
        // System.out.println("ConcurrentLinkedQueue is a deque: " + isConcurrentQueueDeque);

        // // 9. Linked Transfer Queue Practice Set.
        // // Linked Transfer Queue in Java is a part of the java.util.concurrent package and represents a thread-safe queue that supports transfer operations.
        // // Write a code to demonstrate the use of LinkedTransferQueue in Java.
        // // Create a LinkedTransferQueue of strings
        // java.util.concurrent.LinkedTransferQueue<String> linkedTransferQueue = new java.util.concurrent.LinkedTransferQueue<>();

        // // Add elements to the LinkedTransferQueue
        // linkedTransferQueue.add("One");
        // linkedTransferQueue.add("Two");
        // linkedTransferQueue.add("Three");

        // // Print the LinkedTransferQueue
        // System.out.println("LinkedTransferQueue: " + linkedTransferQueue);

        // // Access the front element of the LinkedTransferQueue
        // System.out.println("Front element: " + linkedTransferQueue.peek());

        // // Remove an element from the LinkedTransferQueue
        // linkedTransferQueue.poll(); // Remove the front element (One)

        // // Print the LinkedTransferQueue after removal
        // System.out.println("LinkedTransferQueue after removal: " + linkedTransferQueue);

        // // Check if the LinkedTransferQueue contains a specific element
        // boolean containsTwo = linkedTransferQueue.contains("Two");
        // System.out.println("LinkedTransferQueue contains Two: " + containsTwo);

        // // Get the size of the LinkedTransferQueue
        // int linkedTransferQueueSize = linkedTransferQueue.size();
        // System.out.println("Size of LinkedTransferQueue: " + linkedTransferQueueSize);

        // // Clear the LinkedTransferQueue
        // linkedTransferQueue.clear();

        // // Print the LinkedTransferQueue after clearing
        // System.out.println("LinkedTransferQueue after clearing: " + linkedTransferQueue);

        // // Check if the LinkedTransferQueue is empty
        // boolean isLinkedTransferQueueEmpty = linkedTransferQueue.isEmpty();
        // System.out.println("LinkedTransferQueue is empty: " + isLinkedTransferQueueEmpty);

        // // Add elements to the LinkedTransferQueue again
        // linkedTransferQueue.add("Four");
        // linkedTransferQueue.add("Five");

        // // Print the LinkedTransferQueue after adding elements again
        // System.out.println("LinkedTransferQueue after adding elements again: " + linkedTransferQueue);

        // // Iterate through the LinkedTransferQueue using a for-each loop
        // System.out.println("Iterating through LinkedTransferQueue using for-each loop:");
        // for (String element : linkedTransferQueue) {
        //     System.out.print(element + " ");
        // }
        // System.out.println();

        // // Iterate through the LinkedTransferQueue using an iterator
        // System.out.println("Iterating through LinkedTransferQueue using iterator:");
        // java.util.Iterator<String> linkedTransferQueueIterator = linkedTransferQueue.iterator();
        // while (linkedTransferQueueIterator.hasNext()) {
        //     System.out.print(linkedTransferQueueIterator.next() + " ");
        // }
        // System.out.println();

        // // Check if the LinkedTransferQueue is synchronized (thread-safe)
        // boolean isLinkedTransferQueueSynchronized = linkedTransferQueue instanceof java.util.concurrent.LinkedTransferQueue;
        // System.out.println("LinkedTransferQueue is synchronized: " + isLinkedTransferQueueSynchronized);

        // // Check if the LinkedTransferQueue is thread-safe
        // boolean isLinkedTransferQueueThreadSafe = linkedTransferQueue instanceof java.util.concurrent.LinkedTransferQueue;
        // System.out.println("LinkedTransferQueue is thread-safe: " + isLinkedTransferQueueThreadSafe);

        // // Check if the LinkedTransferQueue is resizable
        // boolean isLinkedTransferQueueResizable = linkedTransferQueue instanceof java.util.concurrent.LinkedTransferQueue;
        // System.out.println("LinkedTransferQueue is resizable: " + isLinkedTransferQueueResizable);

        // // Check if the LinkedTransferQueue is dynamic
        // boolean isLinkedTransferQueueDynamic = linkedTransferQueue instanceof java.util.concurrent.LinkedTransferQueue;
        // System.out.println("LinkedTransferQueue is dynamic: " + isLinkedTransferQueueDynamic);

        // // Check if the LinkedTransferQueue is mutable
        // boolean isLinkedTransferQueueMutable = linkedTransferQueue instanceof java.util.concurrent.LinkedTransferQueue;
        // System.out.println("LinkedTransferQueue is mutable: " + isLinkedTransferQueueMutable);

        // // Check if the LinkedTransferQueue is immutable
        // boolean isLinkedTransferQueueImmutable = !(linkedTransferQueue instanceof java.util.concurrent.LinkedTransferQueue);
        // System.out.println("LinkedTransferQueue is immutable: " + isLinkedTransferQueueImmutable);

        // // Check if the LinkedTransferQueue is ordered
        // boolean isLinkedTransferQueueOrdered = linkedTransferQueue instanceof java.util.concurrent.LinkedTransferQueue;
        // System.out.println("LinkedTransferQueue is ordered: " + isLinkedTransferQueueOrdered);

        // // Check if the LinkedTransferQueue is indexed
        // boolean isLinkedTransferQueueIndexed = linkedTransferQueue instanceof java.util.concurrent.LinkedTransferQueue;
        // System.out.println("LinkedTransferQueue is indexed: " + isLinkedTransferQueueIndexed);

        // // Check if the LinkedTransferQueue is a collection
        // boolean isLinkedTransferQueueCollection = linkedTransferQueue instanceof java.util.Collection;
        // System.out.println("LinkedTransferQueue is a collection: " + isLinkedTransferQueueCollection);

        // // Check if the LinkedTransferQueue is a list
        // boolean isLinkedTransferQueueList = linkedTransferQueue instanceof java.util.List;
        // System.out.println("LinkedTransferQueue is a list: " + isLinkedTransferQueueList);

        // // Check if the LinkedTransferQueue is a set
        // boolean isLinkedTransferQueueSet = linkedTransferQueue instanceof java.util.Set;
        // System.out.println("LinkedTransferQueue is a set: " + isLinkedTransferQueueSet);

        // // Check if the LinkedTransferQueue is a map
        // boolean isLinkedTransferQueueMap = linkedTransferQueue instanceof java.util.Map;
        // System.out.println("LinkedTransferQueue is a map: " + isLinkedTransferQueueMap);

        // // Check if the LinkedTransferQueue is a queue
        // boolean isLinkedTransferQueueQueue = linkedTransferQueue instanceof java.util.Queue;
        // System.out.println("LinkedTransferQueue is a queue: " + isLinkedTransferQueueQueue);

        // // Check if the LinkedTransferQueue is a deque
        // boolean isLinkedTransferQueueDeque = linkedTransferQueue instanceof java.util.Deque;
        // System.out.println("LinkedTransferQueue is a deque: " + isLinkedTransferQueueDeque);

        // // 10. Linked Blocking Queue Practice Set.
        // // Linked Blocking Queue in Java is a part of the java.util.concurrent package and represents a thread-safe queue that supports blocking operations.
        // // Write a code to demonstrate the use of LinkedBlockingQueue in Java.
        // // Create a LinkedBlockingQueue of integers
        // java.util.concurrent.LinkedBlockingQueue<Integer> linkedBlockingQueue = new java.util.concurrent.LinkedBlockingQueue<>(5);

        // // Add elements to the LinkedBlockingQueue
        // try {
        //     linkedBlockingQueue.put(10);
        //     linkedBlockingQueue.put(20);
        //     linkedBlockingQueue.put(30);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        // // Print the LinkedBlockingQueue
        // System.out.println("LinkedBlockingQueue: " + linkedBlockingQueue);

        // // Access the front element of the LinkedBlockingQueue
        // System.out.println("Front element: " + linkedBlockingQueue.peek());

        // // Remove an element from the LinkedBlockingQueue
        // try {
        //     linkedBlockingQueue.take(); // Remove the front element (10)
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        // // Print the LinkedBlockingQueue after removal
        // System.out.println("LinkedBlockingQueue after removal: " + linkedBlockingQueue);

        // // Check if the LinkedBlockingQueue contains a specific element
        // boolean contains20 = linkedBlockingQueue.contains(20);
        // System.out.println("LinkedBlockingQueue contains 20: " + contains20);

        // // Get the size of the LinkedBlockingQueue
        // int linkedBlockingQueueSize = linkedBlockingQueue.size();
        // System.out.println("Size of LinkedBlockingQueue: " + linkedBlockingQueueSize);

        // // Clear the LinkedBlockingQueue
        // linkedBlockingQueue.clear();

        // // Print the LinkedBlockingQueue after clearing
        // System.out.println("LinkedBlockingQueue after clearing: " + linkedBlockingQueue);

        // // Check if the LinkedBlockingQueue is empty
        // boolean isLinkedBlockingQueueEmpty = linkedBlockingQueue.isEmpty();
        // System.out.println("LinkedBlockingQueue is empty: " + isLinkedBlockingQueueEmpty);

        // // Add elements to the LinkedBlockingQueue again
        // try {
        //     linkedBlockingQueue.put(40);
        //     linkedBlockingQueue.put(50);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        // // Print the LinkedBlockingQueue after adding elements again
        // System.out.println("LinkedBlockingQueue after adding elements again: " + linkedBlockingQueue);

        // // Iterate through the LinkedBlockingQueue using a for-each loop
        // System.out.println("Iterating through LinkedBlockingQueue using for-each loop:");
        // for (Integer element : linkedBlockingQueue) {
        //     System.out.print(element + " ");
        // }
        // System.out.println();

        // // Iterate through the LinkedBlockingQueue using an iterator
        // System.out.println("Iterating through LinkedBlockingQueue using iterator:");
        // java.util.Iterator<Integer> linkedBlockingQueueIterator = linkedBlockingQueue.iterator();
        // while (linkedBlockingQueueIterator.hasNext()) {
        //     System.out.print(linkedBlockingQueueIterator.next() + " ");
        // }
        // System.out.println();

        // // Check if the LinkedBlockingQueue is synchronized (thread-safe)
        // boolean isLinkedBlockingQueueSynchronized = linkedBlockingQueue instanceof java.util.concurrent.LinkedBlockingQueue;
        // System.out.println("LinkedBlockingQueue is synchronized: " + isLinkedBlockingQueueSynchronized);

        // // Check if the LinkedBlockingQueue is thread-safe
        // boolean isLinkedBlockingQueueThreadSafe = linkedBlockingQueue instanceof java.util.concurrent.LinkedBlockingQueue;
        // System.out.println("LinkedBlockingQueue is thread-safe: " + isLinkedBlockingQueueThreadSafe);

        // // Check if the LinkedBlockingQueue is resizable
        // boolean isLinkedBlockingQueueResizable = linkedBlockingQueue instanceof java.util.concurrent.LinkedBlockingQueue;
        // System.out.println("LinkedBlockingQueue is resizable: " + isLinkedBlockingQueueResizable);

        // // Check if the LinkedBlockingQueue is dynamic
        // boolean isLinkedBlockingQueueDynamic = linkedBlockingQueue instanceof java.util.concurrent.LinkedBlockingQueue;
        // System.out.println("LinkedBlockingQueue is dynamic: " + isLinkedBlockingQueueDynamic);

        // // Check if the LinkedBlockingQueue is mutable
        // boolean isLinkedBlockingQueueMutable = linkedBlockingQueue instanceof java.util.concurrent.LinkedBlockingQueue;
        // System.out.println("LinkedBlockingQueue is mutable: " + isLinkedBlockingQueueMutable);

        // // Check if the LinkedBlockingQueue is immutable
        // boolean isLinkedBlockingQueueImmutable = !(linkedBlockingQueue instanceof java.util.concurrent.LinkedBlockingQueue);
        // System.out.println("LinkedBlockingQueue is immutable: " + isLinkedBlockingQueueImmutable);

        // // Check if the LinkedBlockingQueue is ordered
        // boolean isLinkedBlockingQueueOrdered = linkedBlockingQueue instanceof java.util.concurrent.LinkedBlockingQueue;
        // System.out.println("LinkedBlockingQueue is ordered: " + isLinkedBlockingQueueOrdered);

        // // Check if the LinkedBlockingQueue is indexed
        // boolean isLinkedBlockingQueueIndexed = linkedBlockingQueue instanceof java.util.concurrent.LinkedBlockingQueue;
        // System.out.println("LinkedBlockingQueue is indexed: " + isLinkedBlockingQueueIndexed);

        // // Check if the LinkedBlockingQueue is a collection
        // boolean isLinkedBlockingQueueCollection = linkedBlockingQueue instanceof java.util.Collection;
        // System.out.println("LinkedBlockingQueue is a collection: " + isLinkedBlockingQueueCollection);

        // // Check if the LinkedBlockingQueue is a queue
        // boolean isLinkedBlockingQueueQueue = linkedBlockingQueue instanceof java.util.Queue;
        // System.out.println("LinkedBlockingQueue is a queue: " + isLinkedBlockingQueueQueue);

        // // 11. Linked Blocking Deque Practice Set.
        // // Linked Blocking Deque in Java is a part of the java.util.concurrent package and represents a thread-safe deque that supports blocking operations.
        // // Write a code to demonstrate the use of LinkedBlockingDeque in Java.
        // // Create a LinkedBlockingDeque of strings
        // java.util.concurrent.LinkedBlockingDeque<String> linkedBlockingDeque = new java.util.concurrent.LinkedBlockingDeque<>(5);

        // // Add elements to the LinkedBlockingDeque
        // try {
        //     linkedBlockingDeque.putFirst("First");
        //     linkedBlockingDeque.putLast("Last");
        //     linkedBlockingDeque.putFirst("New First");
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        // // Print the LinkedBlockingDeque
        // System.out.println("LinkedBlockingDeque: " + linkedBlockingDeque);

        // // Access the front and back elements of the LinkedBlockingDeque
        // System.out.println("Front element: " + linkedBlockingDeque.peekFirst());
        // System.out.println("Back element: " + linkedBlockingDeque.peekLast());

        // // Remove elements from the LinkedBlockingDeque
        // try {
        //     linkedBlockingDeque.takeFirst(); // Remove the front element
        //     linkedBlockingDeque.takeLast();  // Remove the back element
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        // // Print the LinkedBlockingDeque after removal
        // System.out.println("LinkedBlockingDeque after removal: " + linkedBlockingDeque);

        // // Check if the LinkedBlockingDeque contains a specific element
        // boolean containsLast = linkedBlockingDeque.contains("Last");
        // System.out.println("LinkedBlockingDeque contains 'Last': " + containsLast);

        // // Get the size of the LinkedBlockingDeque
        // int linkedBlockingDequeSize = linkedBlockingDeque.size();
        // System.out.println("Size of LinkedBlockingDeque: " + linkedBlockingDequeSize);

        // // Clear the LinkedBlockingDeque
        // linkedBlockingDeque.clear();

        // // Print the LinkedBlockingDeque after clearing
        // System.out.println("LinkedBlockingDeque after clearing: " + linkedBlockingDeque);

        // // Check if the LinkedBlockingDeque is empty
        // boolean isLinkedBlockingDequeEmpty = linkedBlockingDeque.isEmpty();
        // System.out.println("LinkedBlockingDeque is empty: " + isLinkedBlockingDequeEmpty);

        // // Add elements to the LinkedBlockingDeque again
        // try {
        //     linkedBlockingDeque.putFirst("Alpha");
        //     linkedBlockingDeque.putLast("Beta");
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        // // Print the LinkedBlockingDeque after adding elements again
        // System.out.println("LinkedBlockingDeque after adding elements again: " + linkedBlockingDeque);

        // // Iterate through the LinkedBlockingDeque using a for-each loop
        // System.out.println("Iterating through LinkedBlockingDeque using for-each loop:");
        // for (String element : linkedBlockingDeque) {
        //     System.out.print(element + " ");
        // }
        // System.out.println();

        // // Iterate through the LinkedBlockingDeque using an iterator
        // System.out.println("Iterating through LinkedBlockingDeque using iterator:");
        // java.util.Iterator<String> linkedBlockingDequeIterator = linkedBlockingDeque.iterator();
        // while (linkedBlockingDequeIterator.hasNext()) {
        //     System.out.print(linkedBlockingDequeIterator.next() + " ");
        // }
        // System.out.println();

        // // Check if the LinkedBlockingDeque is synchronized (thread-safe)
        // boolean isLinkedBlockingDequeSynchronized = linkedBlockingDeque instanceof java.util.concurrent.LinkedBlockingDeque;
        // System.out.println("LinkedBlockingDeque is synchronized: " + isLinkedBlockingDequeSynchronized);

        // // Check if the LinkedBlockingDeque is thread-safe
        // boolean isLinkedBlockingDequeThreadSafe = linkedBlockingDeque instanceof java.util.concurrent.LinkedBlockingDeque;
        // System.out.println("LinkedBlockingDeque is thread-safe: " + isLinkedBlockingDequeThreadSafe);

        // // Check if the LinkedBlockingDeque is resizable
        // boolean isLinkedBlockingDequeResizable = linkedBlockingDeque instanceof java.util.concurrent.LinkedBlockingDeque;
        // System.out.println("LinkedBlockingDeque is resizable: " + isLinkedBlockingDequeResizable);

        // // Check if the LinkedBlockingDeque is dynamic
        // boolean isLinkedBlockingDequeDynamic = linkedBlockingDeque instanceof java.util.concurrent.LinkedBlockingDeque;
        // System.out.println("LinkedBlockingDeque is dynamic: " + isLinkedBlockingDequeDynamic);

        // // Check if the LinkedBlockingDeque is mutable
        // boolean isLinkedBlockingDequeMutable = linkedBlockingDeque instanceof java.util.concurrent.LinkedBlockingDeque;
        // System.out.println("LinkedBlockingDeque is mutable: " + isLinkedBlockingDequeMutable);

        // // Check if the LinkedBlockingDeque is immutable
        // boolean isLinkedBlockingDequeImmutable = !(linkedBlockingDeque instanceof java.util.concurrent.LinkedBlockingDeque);
        // System.out.println("LinkedBlockingDeque is immutable: " + isLinkedBlockingDequeImmutable);

        // // Check if the LinkedBlockingDeque is ordered
        // boolean isLinkedBlockingDequeOrdered = linkedBlockingDeque instanceof java.util.concurrent.LinkedBlockingDeque;
        // System.out.println("LinkedBlockingDeque is ordered: " + isLinkedBlockingDequeOrdered);

        // // Check if the LinkedBlockingDeque is indexed
        // boolean isLinkedBlockingDequeIndexed = linkedBlockingDeque instanceof java.util.concurrent.LinkedBlockingDeque;
        // System.out.println("LinkedBlockingDeque is indexed: " + isLinkedBlockingDequeIndexed);

        // // Check if the LinkedBlockingDeque is a collection
        // boolean isLinkedBlockingDequeCollection = linkedBlockingDeque instanceof java.util.Collection;
        // System.out.println("LinkedBlockingDeque is a collection: " + isLinkedBlockingDequeCollection);

        // // Check if the LinkedBlockingDeque is a deque
        // boolean isLinkedBlockingDequeDeque = linkedBlockingDeque instanceof java.util.Deque;
        // System.out.println("LinkedBlockingDeque is a deque: " + isLinkedBlockingDequeDeque);

        // // 11. Delay Queue Practice Set.
        // // Delay Queue in Java is a part of the java.util.concurrent package and represents a thread-safe queue that supports delayed elements.
        // // Write a code to demonstrate the use of DelayQueue in Java.
        // // Create a DelayQueue of Delayed elements
        // java.util.concurrent.DelayQueue<java.util.concurrent.Delayed> delayQueue = new java.util.concurrent.DelayQueue<>();

        // // Add elements to the DelayQueue
        // delayQueue.add(new java.util.concurrent.Delayed() {
        //     private final long delayTime = System.currentTimeMillis() + 5000; // 5 seconds delay

        //     @Override
        //     public long getDelay(java.util.concurrent.TimeUnit unit) {
        //         return unit.convert(delayTime - System.currentTimeMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
        //     }

        //     @Override
        //     public int compareTo(java.util.concurrent.Delayed o) {
        //         return Long.compare(this.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS), o.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS));
        //     }

        //     @Override
        //     public String toString() {
        //         return "Delayed Element 1";
        //     }
        // });

        // delayQueue.add(new java.util.concurrent.Delayed() {
        //     private final long delayTime = System.currentTimeMillis() + 10000; // 10 seconds delay

        //     @Override
        //     public long getDelay(java.util.concurrent.TimeUnit unit) {
        //         return unit.convert(delayTime - System.currentTimeMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
        //     }

        //     @Override
        //     public int compareTo(java.util.concurrent.Delayed o) {
        //         return Long.compare(this.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS), o.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS));
        //     }

        //     @Override
        //     public String toString() {
        //         return "Delayed Element 2";
        //     }
        // });

        // // Print the DelayQueue
        // System.out.println("DelayQueue: " + delayQueue);

        // // Access and remove elements from the DelayQueue
        // try {
        //     System.out.println("Taking elements from DelayQueue:");
        //     while (!delayQueue.isEmpty()) {
        //         java.util.concurrent.Delayed element = delayQueue.take(); // Blocks until an element is available
        //         System.out.println("Taken: " + element);
        //     }
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        // // Check if the DelayQueue is empty
        // boolean isDelayQueueEmpty = delayQueue.isEmpty();
        // System.out.println("DelayQueue is empty: " + isDelayQueueEmpty);

        // // 12. Priority Blocking Queue Practice Set.
        // // Priority Blocking Queue in Java is a part of the java.util.concurrent package and represents a thread-safe queue that supports priority-based blocking operations.
        // // Write a code to demonstrate the use of PriorityBlockingQueue in Java.
        // // Create a PriorityBlockingQueue of integers
        // java.util.concurrent.PriorityBlockingQueue<Integer> priorityBlockingQueue = new java.util.concurrent.PriorityBlockingQueue<>();

        // // Add elements to the PriorityBlockingQueue
        // priorityBlockingQueue.add(15);
        // priorityBlockingQueue.add(5);
        // priorityBlockingQueue.add(25);

        // // Print the PriorityBlockingQueue
        // System.out.println("PriorityBlockingQueue: " + priorityBlockingQueue);

        // // Access the front element of the PriorityBlockingQueue
        // System.out.println("Front element: " + priorityBlockingQueue.peek());

        // // Remove an element from the PriorityBlockingQueue
        // priorityBlockingQueue.poll(); // Remove the front element (5)

        // // Print the PriorityBlockingQueue after removal
        // System.out.println("PriorityBlockingQueue after removal: " + priorityBlockingQueue);

        // // Check if the PriorityBlockingQueue contains a specific element
        // boolean contains15 = priorityBlockingQueue.contains(15);
        // System.out.println("PriorityBlockingQueue contains 15: " + contains15);

        // // Get the size of the PriorityBlockingQueue
        // int priorityBlockingQueueSize = priorityBlockingQueue.size();
        // System.out.println("Size of PriorityBlockingQueue: " + priorityBlockingQueueSize);

        // // Clear the PriorityBlockingQueue
        // priorityBlockingQueue.clear();

        // // Print the PriorityBlockingQueue after clearing
        // System.out.println("PriorityBlockingQueue after clearing: " + priorityBlockingQueue);

        // // Check if the PriorityBlockingQueue is empty
        // boolean isPriorityBlockingQueueEmpty = priorityBlockingQueue.isEmpty();
        // System.out.println("PriorityBlockingQueue is empty: " + isPriorityBlockingQueueEmpty);

        // // Add elements to the PriorityBlockingQueue again
        // priorityBlockingQueue.add(35);
        // priorityBlockingQueue.add(10);

        // // Print the PriorityBlockingQueue after adding elements again
        // System.out.println("PriorityBlockingQueue after adding elements again: " + priorityBlockingQueue);

        // // Iterate through the PriorityBlockingQueue using a for-each loop
        // System.out.println("Iterating through PriorityBlockingQueue using for-each loop:");
        // for (Integer element : priorityBlockingQueue) {
        //     System.out.print(element + " ");
        // }
        // System.out.println();

        // // Iterate through the PriorityBlockingQueue using an iterator
        // System.out.println("Iterating through PriorityBlockingQueue using iterator:");
        // java.util.Iterator<Integer> priorityBlockingQueueIterator = priorityBlockingQueue.iterator();
        // while (priorityBlockingQueueIterator.hasNext()) {
        //     System.out.print(priorityBlockingQueueIterator.next() + " ");
        // }
        // System.out.println();

        // // Check if the PriorityBlockingQueue is synchronized (thread-safe)
        // boolean isPriorityBlockingQueueSynchronized = priorityBlockingQueue instanceof java.util.concurrent.PriorityBlockingQueue;
        // System.out.println("PriorityBlockingQueue is synchronized: " + isPriorityBlockingQueueSynchronized);

        // // Check if the PriorityBlockingQueue is thread-safe
        // boolean isPriorityBlockingQueueThreadSafe = priorityBlockingQueue instanceof java.util.concurrent.PriorityBlockingQueue;
        // System.out.println("PriorityBlockingQueue is thread-safe: " + isPriorityBlockingQueueThreadSafe);

        // // Check if the PriorityBlockingQueue is resizable
        // boolean isPriorityBlockingQueueResizable = priorityBlockingQueue instanceof java.util.concurrent.PriorityBlockingQueue;
        // System.out.println("PriorityBlockingQueue is resizable: " + isPriorityBlockingQueueResizable);

        // // Check if the PriorityBlockingQueue is dynamic
        // boolean isPriorityBlockingQueueDynamic = priorityBlockingQueue instanceof java.util.concurrent.PriorityBlockingQueue;
        // System.out.println("PriorityBlockingQueue is dynamic: " + isPriorityBlockingQueueDynamic);

        // // Check if the PriorityBlockingQueue is mutable
        // boolean isPriorityBlockingQueueMutable = priorityBlockingQueue instanceof java.util.concurrent.PriorityBlockingQueue;
        // System.out.println("PriorityBlockingQueue is mutable: " + isPriorityBlockingQueueMutable);

        // // Check if the PriorityBlockingQueue is immutable
        // boolean isPriorityBlockingQueueImmutable = !(priorityBlockingQueue instanceof java.util.concurrent.PriorityBlockingQueue);
        // System.out.println("PriorityBlockingQueue is immutable: " + isPriorityBlockingQueueImmutable);

        // // Check if the PriorityBlockingQueue is ordered
        // boolean isPriorityBlockingQueueOrdered = priorityBlockingQueue instanceof java.util.concurrent.PriorityBlockingQueue;
        // System.out.println("PriorityBlockingQueue is ordered: " + isPriorityBlockingQueueOrdered);

        // // Check if the PriorityBlockingQueue is indexed
        // boolean isPriorityBlockingQueueIndexed = priorityBlockingQueue instanceof java.util.concurrent.PriorityBlockingQueue;
        // System.out.println("PriorityBlockingQueue is indexed: " + isPriorityBlockingQueueIndexed);

        // // Check if the PriorityBlockingQueue is a collection
        // boolean isPriorityBlockingQueueCollection = priorityBlockingQueue instanceof java.util.Collection;
        // System.out.println("PriorityBlockingQueue is a collection: " + isPriorityBlockingQueueCollection);

        // // Check if the PriorityBlockingQueue is a queue
        // boolean isPriorityBlockingQueueQueue = priorityBlockingQueue instanceof java.util.Queue;
        // System.out.println("PriorityBlockingQueue is a queue: " + isPriorityBlockingQueueQueue);

        // // 13. Synchronous Queue Practice Set.
        // // Synchronous Queue in Java is a part of the java.util.concurrent package and represents a thread-safe queue that supports synchronous operations.
        // // Write a code to demonstrate the use of SynchronousQueue in Java.
        // // Create a SynchronousQueue of strings
        // java.util.concurrent.SynchronousQueue<String> synchronousQueue = new java.util.concurrent.SynchronousQueue<>();

        // // Create a producer thread
        // Thread producer = new Thread(() -> {
        //     try {
        //         synchronousQueue.put("Item 1");
        //         System.out.println("Producer: Added Item 1");
        //         synchronousQueue.put("Item 2");
        //         System.out.println("Producer: Added Item 2");
        //     } catch (InterruptedException e) {
        //         e.printStackTrace();
        //     }
        // });

        // // Create a consumer thread
        // Thread consumer = new Thread(() -> {
        //     try {
        //         System.out.println("Consumer: Took " + synchronousQueue.take());
        //         System.out.println("Consumer: Took " + synchronousQueue.take());
        //     } catch (InterruptedException e) {
        //         e.printStackTrace();
        //     }
        // });

        // // Start the producer and consumer threads
        // producer.start();
        // consumer.start();

        // // Wait for the threads to finish
        // try {
        //     producer.join();
        //     consumer.join();
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        // // Check if the SynchronousQueue is empty
        // boolean isSynchronousQueueEmpty = synchronousQueue.isEmpty();
        // System.out.println("SynchronousQueue is empty: " + isSynchronousQueueEmpty);

        // // 14. Exchanger Practice Set.
        // // Exchanger in Java is a part of the java.util.concurrent package and represents a synchronization point where two threads can exchange objects.
        // // Write a code to demonstrate the use of Exchanger in Java.
        // // Create an Exchanger of strings
        // java.util.concurrent.Exchanger<String> exchanger = new java.util.concurrent.Exchanger<>();

        // // Create a producer thread
        // Thread producer = new Thread(() -> {
        //     try {
        //         String data = "Data from Producer";
        //         System.out.println("Producer: Sending data - " + data);
        //         String receivedData = exchanger.exchange(data);
        //         System.out.println("Producer: Received data - " + receivedData);
        //     } catch (InterruptedException e) {
        //         e.printStackTrace();
        //     }
        // });

        // // Create a consumer thread
        // Thread consumer = new Thread(() -> {
        //     try {
        //         String data = "Data from Consumer";
        //         System.out.println("Consumer: Sending data - " + data);
        //         String receivedData = exchanger.exchange(data);
        //         System.out.println("Consumer: Received data - " + receivedData);
        //     } catch (InterruptedException e) {
        //         e.printStackTrace();
        //     }
        // });

        // // Start the producer and consumer threads
        // producer.start();
        // consumer.start();

        // // Wait for the threads to finish
        // try {
        //     producer.join();
        //     consumer.join();
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        // // 15. Phaser Practice Set.
        // // Phaser in Java is a part of the java.util.concurrent package and represents a synchronization mechanism that allows threads to wait for each other at a common barrier point.
        // // Write a code to demonstrate the use of Phaser in Java.
        // // Create a Phaser with 1 registered party (main thread)
        // java.util.concurrent.Phaser phaser = new java.util.concurrent.Phaser(1);

        // // Create worker threads
        // Thread worker1 = new Thread(() -> {
        //     System.out.println("Worker 1: Arrived at phase " + phaser.getPhase());
        //     phaser.arriveAndAwaitAdvance();
        //     System.out.println("Worker 1: Completed phase " + phaser.getPhase());
        // });

        // Thread worker2 = new Thread(() -> {
        //     System.out.println("Worker 2: Arrived at phase " + phaser.getPhase());
        //     phaser.arriveAndAwaitAdvance();
        //     System.out.println("Worker 2: Completed phase " + phaser.getPhase());
        // });

        // // Register the worker threads
        // phaser.register();
        // phaser.register();

        // // Start the worker threads
        // worker1.start();
        // worker2.start();

        // // Main thread arrives at the phase
        // System.out.println("Main thread: Arrived at phase " + phaser.getPhase());
        // phaser.arriveAndAwaitAdvance();
        // System.out.println("Main thread: Completed phase " + phaser.getPhase());

        // // Deregister the main thread
        // phaser.arriveAndDeregister();

        // // Wait for the worker threads to finish
        // try {
        //     worker1.join();
        //     worker2.join();
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        // // Check if the Phaser is terminated
        // boolean isPhaserTerminated = phaser.isTerminated();
        // System.out.println("Phaser is terminated: " + isPhaserTerminated);



        // ........


        // // 16. ArrayDeque Practice Set.
        // // ArrayDeque in Java is a part of the java.util package and represents a resizable array-based implementation of the Deque interface.
        // // It allows elements to be added or removed from both ends (front and back).
        // // ArrayDeque is not synchronized, which means it is not thread-safe by default.
        // // It allows duplicate elements and maintains the insertion order.
        // // Write a code to demonstrate the use of ArrayDeque in Java.

        // // Create an ArrayDeque of strings
        // java.util.ArrayDeque<String> arrayDeque = new java.util.ArrayDeque<>();

        // // Add elements to the ArrayDeque
        // arrayDeque.addFirst("First");
        // arrayDeque.addLast("Last");
        // arrayDeque.addFirst("New First");

        // // Print the ArrayDeque
        // System.out.println("ArrayDeque: " + arrayDeque);

        // // Access the front and back elements of the ArrayDeque
        // System.out.println("Front element: " + arrayDeque.getFirst());
        // System.out.println("Back element: " + arrayDeque.getLast());

        // // Remove elements from the ArrayDeque
        // arrayDeque.removeFirst(); // Remove the front element
        // arrayDeque.removeLast();  // Remove the back element

        // // Print the ArrayDeque after removal
        // System.out.println("ArrayDeque after removal: " + arrayDeque);

        // // Check if the ArrayDeque contains a specific element
        // boolean containsLast = arrayDeque.contains("Last");
        // System.out.println("ArrayDeque contains 'Last': " + containsLast);

        // // Get the size of the ArrayDeque
        // int arrayDequeSize = arrayDeque.size();
        // System.out.println("Size of ArrayDeque: " + arrayDequeSize);

        // // Clear the ArrayDeque
        // arrayDeque.clear();

        // // Print the ArrayDeque after clearing
        // System.out.println("ArrayDeque after clearing: " + arrayDeque);

        // // Check if the ArrayDeque is empty
        // boolean isArrayDequeEmpty = arrayDeque.isEmpty();
        // System.out.println("ArrayDeque is empty: " + isArrayDequeEmpty);

        // // Add elements to the ArrayDeque again
        // arrayDeque.addFirst("Alpha");
        // arrayDeque.addLast("Beta");

        // // Print the ArrayDeque after adding elements again
        // System.out.println("ArrayDeque after adding elements again: " + arrayDeque);

        // // Iterate through the ArrayDeque using a for-each loop
        // System.out.println("Iterating through ArrayDeque using for-each loop:");
        // for (String element : arrayDeque) {
        //     System.out.print(element + " ");
        // }
        // System.out.println();

        // // Iterate through the ArrayDeque using an iterator
        // System.out.println("Iterating through ArrayDeque using iterator:");
        // java.util.Iterator<String> arrayDequeIterator = arrayDeque.iterator();
        // while (arrayDequeIterator.hasNext()) {
        //     System.out.print(arrayDequeIterator.next() + " ");
        // }
        // System.out.println();

        // // Check if the ArrayDeque is synchronized (thread-safe)
        // boolean isArrayDequeSynchronized = arrayDeque instanceof java.util.ArrayDeque;
        // System.out.println("ArrayDeque is synchronized: " + isArrayDequeSynchronized);

        // // Check if the ArrayDeque is thread-safe
        // boolean isArrayDequeThreadSafe = arrayDeque instanceof java.util.ArrayDeque;
        // System.out.println("ArrayDeque is thread-safe: " + isArrayDequeThreadSafe);

        // // Check if the ArrayDeque is resizable
        // boolean isArrayDequeResizable = arrayDeque instanceof java.util.ArrayDeque;
        // System.out.println("ArrayDeque is resizable: " + isArrayDequeResizable);

        // // Check if the ArrayDeque is dynamic
        // boolean isArrayDequeDynamic = arrayDeque instanceof java.util.ArrayDeque;
        // System.out.println("ArrayDeque is dynamic: " + isArrayDequeDynamic);

        // // Check if the ArrayDeque is mutable
        // boolean isArrayDequeMutable = arrayDeque instanceof java.util.ArrayDeque;
        // System.out.println("ArrayDeque is mutable: " + isArrayDequeMutable);

        // // Check if the ArrayDeque is immutable
        // boolean isArrayDequeImmutable = !(arrayDeque instanceof java.util.ArrayDeque);
        // System.out.println("ArrayDeque is immutable: " + isArrayDequeImmutable);

        // // Check if the ArrayDeque is ordered
        // boolean isArrayDequeOrdered = arrayDeque instanceof java.util.ArrayDeque;
        // System.out.println("ArrayDeque is ordered: " + isArrayDequeOrdered);

        // // Check if the ArrayDeque is indexed
        // boolean isArrayDequeIndexed = arrayDeque instanceof java.util.ArrayDeque;
        // System.out.println("ArrayDeque is indexed: " + isArrayDequeIndexed);

        // // Check if the ArrayDeque is a collection
        // boolean isArrayDequeCollection = arrayDeque instanceof java.util.Collection;
        // System.out.println("ArrayDeque is a collection: " + isArrayDequeCollection);

        // // Check if the ArrayDeque is a deque
        // boolean isArrayDequeDeque = arrayDeque instanceof java.util.Deque;
        // System.out.println("ArrayDeque is a deque: " + isArrayDequeDeque);

        // // 17. Set Interface Practice Set.
        // // Set Interface in Java is a part of the java.util package and represents a collection that does not allow duplicate elements.
        // // It is an unordered collection and does not maintain the insertion order.
        // // Write a code to demonstrate the use of Set Interface in Java.

        // // Create a HashSet of integers
        // java.util.Set<Integer> hashSet = new java.util.HashSet<>();

        // // Add elements to the HashSet
        // hashSet.add(10);
        // hashSet.add(20);
        // hashSet.add(30);

        // // Print the HashSet
        // System.out.println("HashSet: " + hashSet);

        // // Check if the HashSet contains a specific element
        // boolean contains20 = hashSet.contains(20);
        // System.out.println("HashSet contains 20: " + contains20);

        // // Remove an element from the HashSet
        // hashSet.remove(20);

        // // Print the HashSet after removal
        // System.out.println("HashSet after removal: " + hashSet);

        // // Get the size of the HashSet
        // int hashSetSize = hashSet.size();
        // System.out.println("Size of HashSet: " + hashSetSize);

        // // Clear the HashSet
        // hashSet.clear();

        // // Print the HashSet after clearing
        // System.out.println("HashSet after clearing: " + hashSet);

        // // Check if the HashSet is empty
        // boolean isHashSetEmpty = hashSet.isEmpty();
        // System.out.println("HashSet is empty: " + isHashSetEmpty);

        // // Add elements to the HashSet again
        // hashSet.add(40);
        // hashSet.add(50);

        // // Print the HashSet after adding elements again
        // System.out.println("HashSet after adding elements again: " + hashSet);

        // // Iterate through the HashSet using a for-each loop
        // System.out.println("Iterating through HashSet using for-each loop:");
        // for (Integer element : hashSet) {
        //     System.out.print(element + " ");
        // }
        // System.out.println();

        // // Create a LinkedHashSet of strings
        // java.util.Set<String> linkedHashSet = new java.util.LinkedHashSet<>();

        // // Add elements to the LinkedHashSet
        // linkedHashSet.add("Apple");
        // linkedHashSet.add("Banana");
        // linkedHashSet.add("Cherry");

        // // Print the LinkedHashSet
        // System.out.println("LinkedHashSet: " + linkedHashSet);

        // // Check if the LinkedHashSet contains a specific element
        // boolean containsBanana = linkedHashSet.contains("Banana");
        // System.out.println("LinkedHashSet contains Banana: " + containsBanana);

        // // Remove an element from the LinkedHashSet
        // linkedHashSet.remove("Banana");

        // // Print the LinkedHashSet after removal
        // System.out.println("LinkedHashSet after removal: " + linkedHashSet);

        // // Get the size of the LinkedHashSet
        // int linkedHashSetSize = linkedHashSet.size();
        // System.out.println("Size of LinkedHashSet: " + linkedHashSetSize);

        // // Clear the LinkedHashSet
        // linkedHashSet.clear();

        // // Print the LinkedHashSet after clearing
        // System.out.println("LinkedHashSet after clearing: " + linkedHashSet);

        // // Check if the LinkedHashSet is empty
        // boolean isLinkedHashSetEmpty = linkedHashSet.isEmpty();
        // System.out.println("LinkedHashSet is empty: " + isLinkedHashSetEmpty);

        // // Add elements to the LinkedHashSet again
        // linkedHashSet.add("Mango");
        // linkedHashSet.add("Orange");

        // // Print the LinkedHashSet after adding elements again
        // System.out.println("LinkedHashSet after adding elements again: " + linkedHashSet);

        // // Iterate through the LinkedHashSet using a for-each loop
        // System.out.println("Iterating through LinkedHashSet using for-each loop:");
        // for (String element : linkedHashSet) {
        //     System.out.print(element + " ");
        // }
        // System.out.println();

        // // Create a TreeSet of integers
        // java.util.Set<Integer> treeSet = new java.util.TreeSet<>();

        // // Add elements to the TreeSet
        // treeSet.add(15);
        // treeSet.add(5);
        // treeSet.add(25);

        // // Print the TreeSet
        // System.out.println("TreeSet: " + treeSet);

        // // Check if the TreeSet contains a specific element
        // boolean contains5 = treeSet.contains(5);
        // System.out.println("TreeSet contains 5: " + contains5);

        // // Remove an element from the TreeSet
        // treeSet.remove(5);

        // // Print the TreeSet after removal
        // System.out.println("TreeSet after removal: " + treeSet);

        // // Get the size of the TreeSet
        // int treeSetSize = treeSet.size();
        // System.out.println("Size of TreeSet: " + treeSetSize);

        // // Clear the TreeSet
        // treeSet.clear();

        // // Print the TreeSet after clearing
        // System.out.println("TreeSet after clearing: " + treeSet);

        // // Check if the TreeSet is empty
        // boolean isTreeSetEmpty = treeSet.isEmpty();
        // System.out.println("TreeSet is empty: " + isTreeSetEmpty);

        // // Add elements to the TreeSet again
        // treeSet.add(35);
        // treeSet.add(10);

        // // Print the TreeSet after adding elements again
        // System.out.println("TreeSet after adding elements again: " + treeSet);

        // // Iterate through the TreeSet using a for-each loop
        // System.out.println("Iterating through TreeSet using for-each loop:");
        // for (Integer element : treeSet) {
        //     System.out.print(element + " ");
        // }
        // System.out.println();

        // // 18. Map Interface Practice Set.
        // // Map Interface in Java is a part of the java.util package and represents a collection of key-value pairs.
        // // It does not allow duplicate keys but allows duplicate values.
        // // Write a code to demonstrate the use of Map Interface in Java.

        // // Create a HashMap of integers and strings
        // java.util.Map<Integer, String> hashMap = new java.util.HashMap<>();

        // // Add key-value pairs to the HashMap
        // hashMap.put(1, "One");
        // hashMap.put(2, "Two");
        // hashMap.put(3, "Three");

        // // Print the HashMap
        // System.out.println("HashMap: " + hashMap);

        // // Access a value from the HashMap using a key
        // System.out.println("Value for key 2: " + hashMap.get(2));

        // // Remove a key-value pair from the HashMap
        // hashMap.remove(2);

        // // Print the HashMap after removal
        // System.out.println("HashMap after removal: " + hashMap);

        // // Check if the HashMap contains a specific key
        // boolean containsKey1 = hashMap.containsKey(1);
        // System.out.println("HashMap contains key 1: " + containsKey1);

        // // Check if the HashMap contains a specific value
        // boolean containsValueThree = hashMap.containsValue("Three");
        // System.out.println("HashMap contains value 'Three': " + containsValueThree);

        // // Get the size of the HashMap
        // int hashMapSize = hashMap.size();
        // System.out.println("Size of HashMap: " + hashMapSize);

        // // Clear the HashMap
        // hashMap.clear();

        // // Print the HashMap after clearing
        // System.out.println("HashMap after clearing: " + hashMap);

        // // Check if the HashMap is empty
        // boolean isHashMapEmpty = hashMap.isEmpty();
        // System.out.println("HashMap is empty: " + isHashMapEmpty);

        // // Add key-value pairs to the HashMap again
        // hashMap.put(4, "Four");
        // hashMap.put(5, "Five");

        // // Print the HashMap after adding key-value pairs again
        // System.out.println("HashMap after adding key-value pairs again: " + hashMap);

        // // Iterate through the HashMap using a for-each loop
        // System.out.println("Iterating through HashMap using for-each loop:");
        // for (java.util.Map.Entry<Integer, String> entry : hashMap.entrySet()) {
        //     System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        // }

        // // Create a LinkedHashMap of strings and integers
        // java.util.Map<String, Integer> linkedHashMap = new java.util.LinkedHashMap<>();

        // // Add key-value pairs to the LinkedHashMap
        // linkedHashMap.put("A", 10);
        // linkedHashMap.put("B", 20);
        // linkedHashMap.put("C", 30);

        // // Print the LinkedHashMap
        // System.out.println("LinkedHashMap: " + linkedHashMap);

        // // Check if the LinkedHashMap contains a specific key
        // boolean containsKeyA = linkedHashMap.containsKey("A");
        // System.out.println("LinkedHashMap contains key 'A': " + containsKeyA);

        // // Remove a key-value pair from the LinkedHashMap
        // linkedHashMap.remove("B");

        // // Print the LinkedHashMap after removal
        // System.out.println("LinkedHashMap after removal: " + linkedHashMap);

        // // Iterate through the LinkedHashMap using a for-each loop
        // System.out.println("Iterating through LinkedHashMap using for-each loop:");
        // for (java.util.Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
        //     System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        // }

        // // Create a TreeMap of strings and doubles
        // java.util.Map<String, Double> treeMap = new java.util.TreeMap<>();

        // // Add key-value pairs to the TreeMap
        // treeMap.put("X", 1.1);
        // treeMap.put("Y", 2.2);
        // treeMap.put("Z", 3.3);

        // // Print the TreeMap
        // System.out.println("TreeMap: " + treeMap);

        // // Access a value from the TreeMap using a key
        // System.out.println("Value for key 'Y': " + treeMap.get("Y"));

        // // Remove a key-value pair from the TreeMap
        // treeMap.remove("X");

        // // Print the TreeMap after removal
        // System.out.println("TreeMap after removal: " + treeMap);

        // // Iterate through the TreeMap using a for-each loop
        // System.out.println("Iterating through TreeMap using for-each loop:");
        // for (java.util.Map.Entry<String, Double> entry : treeMap.entrySet()) {
        //     System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        // }

        // // Create a Hashtable of characters and booleans
        // java.util.Map<Character, Boolean> hashtable = new java.util.Hashtable<>();

        // // Add key-value pairs to the Hashtable
        // hashtable.put('A', true);
        // hashtable.put('B', false);
        // hashtable.put('C', true);

        // // Print the Hashtable
        // System.out.println("Hashtable: " + hashtable);

        // // Check if the Hashtable contains a specific key
        // boolean containsKeyB = hashtable.containsKey('B');
        // System.out.println("Hashtable contains key 'B': " + containsKeyB);

        // // Remove a key-value pair from the Hashtable
        // hashtable.remove('A');

        // // Print the Hashtable after removal
        // System.out.println("Hashtable after removal: " + hashtable);

        // // Iterate through the Hashtable using a for-each loop
        // System.out.println("Iterating through Hashtable using for-each loop:");
        // for (java.util.Map.Entry<Character, Boolean> entry : hashtable.entrySet()) {
        //     System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        // }

        // // 19. Collections Utility Class Practice Set.
        // // Collections Utility Class in Java is a part of the java.util package and provides utility methods for working with collections.
        // // Write a code to demonstrate the use of Collections Utility Class in Java.

        // // Create a list of integers
        // java.util.List<Integer> list = new java.util.ArrayList<>();
        // list.add(5);
        // list.add(2);
        // list.add(8);
        // list.add(1);

        // // Print the original list
        // System.out.println("Original List: " + list);

        // // Sort the list in ascending order
        // java.util.Collections.sort(list);
        // System.out.println("Sorted List: " + list);

        // // Sort the list in descending order
        // java.util.Collections.sort(list, java.util.Collections.reverseOrder());
        // System.out.println("List in Descending Order: " + list);

        // // Find the maximum element in the list
        // int maxElement = java.util.Collections.max(list);
        // System.out.println("Maximum Element: " + maxElement);

        // // Find the minimum element in the list
        // int minElement = java.util.Collections.min(list);
        // System.out.println("Minimum Element: " + minElement);

        // // Shuffle the list
        // java.util.Collections.shuffle(list);
        // System.out.println("Shuffled List: " + list);

        // // Rotate the list by 2 positions
        // java.util.Collections.rotate(list, 2);
        // System.out.println("Rotated List: " + list);

        // // Replace all occurrences of an element in the list
        // java.util.Collections.replaceAll(list, 8, 10);
        // System.out.println("List after replacing 8 with 10: " + list);

        // // Copy one list into another
        // java.util.List<Integer> copyList = new java.util.ArrayList<>(java.util.Collections.nCopies(list.size(), 0));
        // java.util.Collections.copy(copyList, list);
        // System.out.println("Copied List: " + copyList);

        // // Check the frequency of an element in the list
        // int frequency = java.util.Collections.frequency(list, 10);
        // System.out.println("Frequency of 10: " + frequency);

        // // Make the list unmodifiable
        // java.util.List<Integer> unmodifiableList = java.util.Collections.unmodifiableList(list);
        // System.out.println("Unmodifiable List: " + unmodifiableList);

        // // Binary search in a sorted list
        // java.util.Collections.sort(list);
        // int index = java.util.Collections.binarySearch(list, 5);
        // System.out.println("Index of 5 in the sorted list: " + index);

        // // 20. Comparable and Comparator Practice Set.
        // // Comparable Interface in Java is used to define the natural ordering of objects.
        // // Comparator Interface in Java is used to define custom ordering of objects.
        // // Write a code to demonstrate the use of Comparable and Comparator in Java.

        // // Create a class that implements Comparable
        // class Student implements Comparable<Student> {
        //     private String name;
        //     private int age;

        //     public Student(String name, int age) {
        //         this.name = name;
        //         this.age = age;
        //     }

        //     public String getName() {
        //         return name;
        //     }

        //     public int getAge() {
        //         return age;
        //     }

        //     @Override
        //     public int compareTo(Student other) {
        //         return this.age - other.age; // Natural ordering by age
        //     }

        //     @Override
        //     public String toString() {
        //         return "Student{name='" + name + "', age=" + age + "}";
        //     }
        // }

        // // Create a Comparator for custom ordering
        // class NameComparator implements java.util.Comparator<Student> {
        //     @Override
        //     public int compare(Student s1, Student s2) {
        //         return s1.getName().compareTo(s2.getName()); // Custom ordering by name
        //     }
        // }

        // // Demonstrate Comparable and Comparator
        // java.util.List<Student> students = new java.util.ArrayList<>();
        // students.add(new Student("Alice", 22));
        // students.add(new Student("Bob", 20));
        // students.add(new Student("Charlie", 21));

        // // Sort using Comparable (natural ordering by age)
        // java.util.Collections.sort(students);
        // System.out.println("Students sorted by age (natural ordering): " + students);

        // // Sort using Comparator (custom ordering by name)
        // java.util.Collections.sort(students, new NameComparator());
        // System.out.println("Students sorted by name (custom ordering): " + students);

        // // 21. Synchronized in Collections Practice Set.
        // // Synchronized in Collections Practice Set.
        // // Collections.synchronizedList, Collections.synchronizedSet, and Collections.synchronizedMap are used to make collections thread-safe.

        // // Create a synchronized list
        // java.util.List<Integer> synchronizedList = java.util.Collections.synchronizedList(new java.util.ArrayList<>());

        // // Add elements to the synchronized list
        // synchronizedList.add(1);
        // synchronizedList.add(2);
        // synchronizedList.add(3);

        // // Iterate through the synchronized list
        // System.out.println("Synchronized List:");
        // synchronized (synchronizedList) {
        //     for (Integer element : synchronizedList) {
        //         System.out.print(element + " ");
        //     }
        // }
        // System.out.println();

        // // Create a synchronized set
        // java.util.Set<String> synchronizedSet = java.util.Collections.synchronizedSet(new java.util.HashSet<>());

        // // Add elements to the synchronized set
        // synchronizedSet.add("A");
        // synchronizedSet.add("B");
        // synchronizedSet.add("C");

        // // Iterate through the synchronized set
        // System.out.println("Synchronized Set:");
        // synchronized (synchronizedSet) {
        //     for (String element : synchronizedSet) {
        //         System.out.print(element + " ");
        //     }
        // }
        // System.out.println();

        // // Create a synchronized map
        // java.util.Map<Integer, String> synchronizedMap = java.util.Collections.synchronizedMap(new java.util.HashMap<>());

        // // Add key-value pairs to the synchronized map
        // synchronizedMap.put(1, "One");
        // synchronizedMap.put(2, "Two");
        // synchronizedMap.put(3, "Three");

        // // Iterate through the synchronized map
        // System.out.println("Synchronized Map:");
        // synchronized (synchronizedMap) {
        //     for (java.util.Map.Entry<Integer, String> entry : synchronizedMap.entrySet()) {
        //         System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        //     }
        // }

        // // 22. Iterator and ListIterator Practice Set.
        // // Iterator and ListIterator Practice Set.
        // // Iterator and ListIterator are used to traverse collections in Java.

        // // Create a list of integers
        // java.util.List<Integer> integerList = new java.util.ArrayList<>();
        // integerList.add(10);
        // integerList.add(20);
        // integerList.add(30);

        // // Use an Iterator to traverse the list
        // System.out.println("Using Iterator to traverse the list:");
        // java.util.Iterator<Integer> iterator = integerList.iterator();
        // while (iterator.hasNext()) {
        //     System.out.print(iterator.next() + " ");
        // }
        // System.out.println();

        // // Use a ListIterator to traverse the list in both directions
        // System.out.println("Using ListIterator to traverse the list:");
        // java.util.ListIterator<Integer> listIterator = integerList.listIterator();

        // // Forward traversal
        // System.out.println("Forward traversal:");
        // while (listIterator.hasNext()) {
        //     System.out.print(listIterator.next() + " ");
        // }
        // System.out.println();

        // // Backward traversal
        // System.out.println("Backward traversal:");
        // while (listIterator.hasPrevious()) {
        //     System.out.print(listIterator.previous() + " ");
        // }
        // System.out.println();

        // // Modify elements using ListIterator
        // System.out.println("Modifying elements using ListIterator:");
        // listIterator = integerList.listIterator();
        // while (listIterator.hasNext()) {
        //     int value = listIterator.next();
        //     listIterator.set(value * 2); // Double each element
        // }
        // System.out.println("Modified list: " + integerList);

        // // 23. Streams API Collection Practice Set.
        // // Streams API Collection Practice Set.
        // // Streams API in Java is a part of the java.util.stream package and provides a functional approach to process collections.
        // // Write a code to demonstrate the use of Streams API in Java.

        // // Create a list of integers
        // java.util.List<Integer> numbers = java.util.Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // // Filter even numbers and collect them into a new list
        // java.util.List<Integer> evenNumbers = numbers.stream()
        //     .filter(n -> n % 2 == 0)
        //     .collect(java.util.stream.Collectors.toList());
        // System.out.println("Even Numbers: " + evenNumbers);

        // // Map each number to its square and collect them into a new list
        // java.util.List<Integer> squaredNumbers = numbers.stream()
        //     .map(n -> n * n)
        //     .collect(java.util.stream.Collectors.toList());
        // System.out.println("Squared Numbers: " + squaredNumbers);

        // // Find the sum of all numbers using reduce
        // int sum = numbers.stream()
        //     .reduce(0, Integer::sum);
        // System.out.println("Sum of Numbers: " + sum);

        // // Find the maximum number in the list
        // int maxNumber = numbers.stream()
        //     .max(Integer::compareTo)
        //     .orElseThrow(() -> new RuntimeException("List is empty"));
        // System.out.println("Maximum Number: " + maxNumber);

        // // Find the minimum number in the list
        // int minNumber = numbers.stream()
        //     .min(Integer::compareTo)
        //     .orElseThrow(() -> new RuntimeException("List is empty"));
        // System.out.println("Minimum Number: " + minNumber);

        // // Count the number of elements in the list
        // long count = numbers.stream().count();
        // System.out.println("Count of Numbers: " + count);

        // // Sort the numbers in ascending order
        // java.util.List<Integer> sortedNumbers = numbers.stream()
        //     .sorted()
        //     .collect(java.util.stream.Collectors.toList());
        // System.out.println("Sorted Numbers: " + sortedNumbers);

        // // Sort the numbers in descending order
        // java.util.List<Integer> sortedDescending = numbers.stream()
        //     .sorted(java.util.Collections.reverseOrder())
        //     .collect(java.util.stream.Collectors.toList());
        // System.out.println("Numbers in Descending Order: " + sortedDescending);

        // // Check if all numbers are positive
        // boolean allPositive = numbers.stream().allMatch(n -> n > 0);
        // System.out.println("All Numbers are Positive: " + allPositive);

        // // Check if any number is greater than 5
        // boolean anyGreaterThanFive = numbers.stream().anyMatch(n -> n > 5);
        // System.out.println("Any Number Greater Than 5: " + anyGreaterThanFive);

        // // Check if no number is negative
        // boolean noneNegative = numbers.stream().noneMatch(n -> n < 0);
        // System.out.println("No Numbers are Negative: " + noneNegative);

        // // Convert the list of numbers to a comma-separated string
        // String commaSeparated = numbers.stream()
        //     .map(String::valueOf)
        //     .collect(java.util.stream.Collectors.joining(", "));
        // System.out.println("Comma-Separated Numbers: " + commaSeparated);

        // // Group numbers by even and odd
        // java.util.Map<Boolean, java.util.List<Integer>> groupedByEvenOdd = numbers.stream()
        //     .collect(java.util.stream.Collectors.partitioningBy(n -> n % 2 == 0));
        // System.out.println("Grouped by Even and Odd: " + groupedByEvenOdd);

        // // Find the first number greater than 5
        // int firstGreaterThanFive = numbers.stream()
        //     .filter(n -> n > 5)
        //     .findFirst()
        //     .orElseThrow(() -> new RuntimeException("No number greater than 5 found"));
        // System.out.println("First Number Greater Than 5: " + firstGreaterThanFive);

        // // 24. Concurrent Collections Practice Set.
        // // Concurrent Collections Practice Set.
        // // Concurrent Collections in Java are part of the java.util.concurrent package and provide thread-safe collections for concurrent access.
        // // Write a code to demonstrate the use of ConcurrentHashMap in Java.

        // // Create a ConcurrentHashMap of strings and integers
        // java.util.concurrent.ConcurrentHashMap<String, Integer> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<>();

        // // Add key-value pairs to the ConcurrentHashMap
        // concurrentHashMap.put("One", 1);
        // concurrentHashMap.put("Two", 2);
        // concurrentHashMap.put("Three", 3);

        // // Print the ConcurrentHashMap
        // System.out.println("ConcurrentHashMap: " + concurrentHashMap);

        // // Access a value from the ConcurrentHashMap using a key
        // System.out.println("Value for key 'Two': " + concurrentHashMap.get("Two"));

        // // Remove a key-value pair from the ConcurrentHashMap
        // concurrentHashMap.remove("Two");

        // // Print the ConcurrentHashMap after removal
        // System.out.println("ConcurrentHashMap after removal: " + concurrentHashMap);

        // // Check if the ConcurrentHashMap contains a specific key
        // boolean containsKeyOne = concurrentHashMap.containsKey("One");
        // System.out.println("ConcurrentHashMap contains key 'One': " + containsKeyOne);

        // // Check if the ConcurrentHashMap contains a specific value
        // boolean containsValueThree = concurrentHashMap.containsValue(3);
        // System.out.println("ConcurrentHashMap contains value 3: " + containsValueThree);

        // // Iterate through the ConcurrentHashMap using a for-each loop
        // System.out.println("Iterating through ConcurrentHashMap using for-each loop:");
        // for (java.util.Map.Entry<String, Integer> entry : concurrentHashMap.entrySet()) {
        //     System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        // }

        // // Demonstrate thread-safe operations
        // Thread thread1 = new Thread(() -> {
        //     concurrentHashMap.put("Four", 4);
        //     System.out.println("Thread 1 added key 'Four'");
        // });

        // Thread thread2 = new Thread(() -> {
        //     concurrentHashMap.put("Five", 5);
        //     System.out.println("Thread 2 added key 'Five'");
        // });

        // thread1.start();
        // thread2.start();

        // try {
        //     thread1.join();
        //     thread2.join();
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        // // Print the ConcurrentHashMap after thread-safe operations
        // System.out.println("ConcurrentHashMap after thread-safe operations: " + concurrentHashMap);

        // // 25. Custom Implementation of Collection Practice Set.
        // // Custom Implementation of a Collection (Custom ArrayList)
        // class CustomArrayList<T> {
        //     private Object[] elements;
        //     private int size;

        //     public CustomArrayList() {
        //         elements = new Object[10];
        //         size = 0;
        //     }

        //     public void add(T element) {
        //         if (size == elements.length) {
        //             resize();
        //         }
        //         elements[size++] = element;
        //     }

        //     public T get(int index) {
        //         if (index < 0 || index >= size) {
        //             throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        //         }
        //         return (T) elements[index];
        //     }

        //     public void remove(int index) {
        //         if (index < 0 || index >= size) {
        //             throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        //         }
        //         for (int i = index; i < size - 1; i++) {
        //             elements[i] = elements[i + 1];
        //         }
        //         elements[--size] = null;
        //     }

        //     public int size() {
        //         return size;
        //     }

        //     private void resize() {
        //         Object[] newElements = new Object[elements.length * 2];
        //         System.arraycopy(elements, 0, newElements, 0, elements.length);
        //         elements = newElements;
        //     }

        //     @Override
        //     public String toString() {
        //         StringBuilder sb = new StringBuilder("[");
        //         for (int i = 0; i < size; i++) {
        //             sb.append(elements[i]);
        //             if (i < size - 1) {
        //                 sb.append(", ");
        //             }
        //         }
        //         sb.append("]");
        //         return sb.toString();
        //     }
        // }

        // // Demonstrate the use of CustomArrayList
        // CustomArrayList<String> customList = new CustomArrayList<>();
        // customList.add("Hello");
        // customList.add("World");
        // customList.add("Java");
        // System.out.println("CustomArrayList: " + customList);
        // System.out.println("Element at index 1: " + customList.get(1));
        // customList.remove(1);
        // System.out.println("CustomArrayList after removal: " + customList);
        // System.out.println("Size of CustomArrayList: " + customList.size());

    }
}
