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

        // 2. LinkedList Practice Set.
        // // Write a code to demonstrate the use of LinkedList in Java.
        // // Create a LinkedList of strings
        java.util.LinkedList<String> linkedList = new java.util.LinkedList<>();
        // // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        // // Print the LinkedList
        System.out.println("LinkedList: " + linkedList);
        // // Access elements from the LinkedList
        System.out.println("First element: " + linkedList.get(0));
        // // Remove an element from the LinkedList
        linkedList.remove(1); // Remove the element at index 1 (Banana)
        // // Print the LinkedList after removal
        System.out.println("LinkedList after removal: " + linkedList);
        // // Check if the LinkedList contains a specific element
        boolean containsCherry = linkedList.contains("Cherry");
        System.out.println("LinkedList contains Cherry: " + containsCherry);
        // // Get the size of the LinkedList
        int linkedListSize = linkedList.size();
        System.out.println("Size of LinkedList: " + linkedListSize);
        // // Clear the LinkedList
        linkedList.clear();
        // // Print the LinkedList after clearing
        System.out.println("LinkedList after clearing: " + linkedList);
        // // Check if the LinkedList is empty
        boolean isLinkedListEmpty = linkedList.isEmpty();
        System.out.println("LinkedList is empty: " + isLinkedListEmpty);
        // // Add elements to the LinkedList again
        linkedList.add("Mango");
        linkedList.add("Orange");
        // // Print the LinkedList after adding elements again
        System.out.println("LinkedList after adding elements again: " + linkedList);
        // // Sort the LinkedList
        java.util.Collections.sort(linkedList);
        // // Print the sorted LinkedList
        System.out.println("Sorted LinkedList: " + linkedList);
        // // Reverse the LinkedList
        java.util.Collections.reverse(linkedList);
        // // Print the reversed LinkedList
        System.out.println("Reversed LinkedList: " + linkedList);
        // // Convert the LinkedList to an array
        String[] linkedListArray = new String[linkedList.size()];
        linkedList.toArray(linkedListArray);
        // // Print the array
        System.out.print("Array from LinkedList: ");
        for (String fruit : linkedListArray) {
            System.out.print(fruit + " ");
        }
        System.out.println();
        // // Iterate through the LinkedList using a for-each loop
        System.out.println("Iterating through LinkedList using for-each loop:");
        for (String fruit : linkedList) {
            System.out.print(fruit + " ");
        }
        System.out.println();
        // // Iterate through the LinkedList using a for loop
        System.out.println("Iterating through LinkedList using for loop:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + " ");
        }
        System.out.println();
        // // Iterate through the LinkedList using an iterator
        System.out.println("Iterating through LinkedList using iterator:");
        java.util.Iterator<String> linkedListIterator = linkedList.iterator();
        while (linkedListIterator.hasNext()) {
            System.out.print(linkedListIterator.next() + " ");
        }
        System.out.println();
        // // Check if the LinkedList is synchronized (thread-safe)
        boolean isLinkedListSynchronized = java.util.Collections.synchronizedList(linkedList) != null;
        System.out.println("LinkedList is synchronized: " + isLinkedListSynchronized);
        // // Check if the LinkedList is thread-safe
        boolean isLinkedListThreadSafe = java.util.Collections.synchronizedList(linkedList) != null;
        System.out.println("LinkedList is thread-safe: " + isLinkedListThreadSafe);
        // // Check if the LinkedList is resizable
        boolean isLinkedListResizable = linkedList instanceof java.util.LinkedList;
        System.out.println("LinkedList is resizable: " + isLinkedListResizable);
        // // Check if the LinkedList is dynamic
        boolean isLinkedListDynamic = linkedList instanceof java.util.LinkedList;
        System.out.println("LinkedList is dynamic: " + isLinkedListDynamic);
        // // Check if the LinkedList is mutable
        boolean isLinkedListMutable = linkedList instanceof java.util.LinkedList;
        System.out.println("LinkedList is mutable: " + isLinkedListMutable);
        // // Check if the LinkedList is immutable
        boolean isLinkedListImmutable = !(linkedList instanceof java.util.LinkedList);
        System.out.println("LinkedList is immutable: " + isLinkedListImmutable);
        // // Check if the LinkedList is ordered
        boolean isLinkedListOrdered = linkedList instanceof java.util.LinkedList;
        System.out.println("LinkedList is ordered: " + isLinkedListOrdered);
        // // Check if the LinkedList is indexed
        boolean isLinkedListIndexed = linkedList instanceof java.util.LinkedList;
        System.out.println("LinkedList is indexed: " + isLinkedListIndexed);
        // // Check if the LinkedList is a collection
        boolean isLinkedListCollection = linkedList instanceof java.util.Collection;
        System.out.println("LinkedList is a collection: " + isLinkedListCollection);
        // // Check if the LinkedList is a list
        boolean isLinkedListList = linkedList instanceof java.util.List;
        System.out.println("LinkedList is a list: " + isLinkedListList);
        // // Check if the LinkedList is a set
        boolean isLinkedListSet = linkedList instanceof java.util.Set;
        System.out.println("LinkedList is a set: " + isLinkedListSet);
        // // Check if the LinkedList is a map
        boolean isLinkedListMap = linkedList instanceof java.util.Map;
        System.out.println("LinkedList is a map: " + isLinkedListMap);
        // // Check if the LinkedList is a queue
        boolean isLinkedListQueue = linkedList instanceof java.util.Queue;
        System.out.println("LinkedList is a queue: " + isLinkedListQueue);
        // // Check if the LinkedList is a stack

        // 3. Vector Practice Set.
        // // Write a code to demonstrate the use of Vector in Java.



    }
}
