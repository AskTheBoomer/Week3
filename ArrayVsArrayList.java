// Demonstrating the differences between Arrays and ArrayLists
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        
        // Array Example: Fixed-size collection
        int[] arrayNumbers = {10, 20, 30, 40, 50};
        System.out.println("Array Example:");
        System.out.println("First element: " + arrayNumbers[0]);
        System.out.println("Array Length: " + arrayNumbers.length);
        
        // Cannot dynamically add elements to an array
        // arrayNumbers[5] = 60; // This will cause an error because arrays are fixed-size
        
        // ArrayList Example: Dynamic-size collection
        ArrayList<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(10);
        listNumbers.add(20);
        listNumbers.add(30);
        System.out.println("\nArrayList Example:");
        System.out.println("First element: " + listNumbers.get(0));
        System.out.println("ArrayList Size: " + listNumbers.size());
        
        // Adding more elements dynamically
        listNumbers.add(40);
        listNumbers.add(50);
        listNumbers.add(60);
        System.out.println("Updated ArrayList: " + listNumbers);
        
        // Removing an element
        listNumbers.remove(2);  // Removes element at index 2
        System.out.println("After removing index 2: " + listNumbers);
        
        // Key Differences
        System.out.println("\n🔹 Arrays have a fixed size, whereas ArrayLists can grow/shrink dynamically.");
        System.out.println("🔹 Arrays store primitives efficiently, whereas ArrayLists store objects (Integer).");
        System.out.println("🔹 ArrayLists provide built-in methods like add(), remove(), and contains().");
    }
}
