package homeworks;
import java.util.*;

public class LinkedListTasks {
    public static void main(String[] args) {

        // 1. Define LinkedList of Strings
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("a", "b", "c", "b", "a"));
        System.out.println("Original LinkedList: " + linkedList);

        // 2. Reverse a LinkedList
        LinkedList<String> reversedList = new LinkedList<>(linkedList);
        Collections.reverse(reversedList);
        System.out.println("Reversed LinkedList: " + reversedList);

        // 3. Find the middle node
        int middleIndex = linkedList.size() / 2;
        String middleNode = linkedList.get(middleIndex);
        System.out.println("Middle node: " + middleNode);

        // 4. Palindrome check
        LinkedList<String> temp = new LinkedList<>(linkedList);
        LinkedList<String> tempReversed = new LinkedList<>(temp);
        Collections.reverse(tempReversed);
        boolean isPalindrome = temp.equals(tempReversed);
        System.out.println("Is Palindrome? " + isPalindrome);

        // 5. Remove duplicates
        LinkedHashSet<String> set = new LinkedHashSet<>(linkedList);
        linkedList.clear();
        linkedList.addAll(set);
        System.out.println("After removing duplicates: " + linkedList);
    }
}
