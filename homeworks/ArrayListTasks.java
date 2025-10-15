package homeworks;
import java.util.*;

public class ArrayListTasks {
    public static void main(String[] args) {

        // 1. Define an ArrayList of numbers
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 5, 58, 0, 58, 75));
        System.out.println("Original list: " + list);

        // 2. Copy list values into another
        ArrayList<Integer> copyList = new ArrayList<>(list);
        System.out.println("Copied list: " + copyList);

        // 3. Reverse elements in the list
        Collections.reverse(list);
        System.out.println("Reversed list: " + list);

        // 4. Swap two elements in the list
        Collections.swap(list, 0, 1);  // swap elements at index 0 and 1
        System.out.println("After swap(0,1): " + list);

        // 5. Iterate and print list elements
        System.out.print("List elements: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 6. Sort list elements
        Collections.sort(list);
        System.out.println("Sorted list: " + list);

        // 7. Remove duplicates
        ArrayList<Integer> noDuplicates = new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println("Without duplicates: " + noDuplicates);

        // 8. Find common elements with another list
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(58, 100, 75, 0));
        ArrayList<Integer> common = new ArrayList<>(list);
        common.retainAll(list2);  // keep only common elements
        System.out.println("Common elements: " + common);

        // 9. Find the largest number
        int max = Collections.max(list);
        System.out.println("Largest number: " + max);

        // 10. Combine two lists
        ArrayList<Integer> combined = new ArrayList<>(list);
        combined.addAll(list2);
        System.out.println("Combined list: " + combined);

        // 11. Find the second largest element
        TreeSet<Integer> sortedUnique = new TreeSet<>(combined); // sorts and removes duplicates
        ArrayList<Integer> sortedList = new ArrayList<>(sortedUnique);
        int secondLargest = sortedList.get(sortedList.size() - 2);
        System.out.println("Second largest number: " + secondLargest);
    }
}
