// 1. Beginning

package chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArraysBasics1 {
    // 1. Declaration
    int[] array1;
    float[] array2;
    String[] names;
    int[][] multidim;

    public ArraysBasics1() {
        // Initialization
        array1 = new int[]{23, 4, 56, 11};
        array2 = new float[]{12.3f, 45.0f, 99.3f};
        names = new String[8];
        names[0] = "Peter";
        multidim = new int[][]{
                {1, 2},
                {3, 4},
                {5, 6}
        };

        // OR
        // multidim = new int[3][2];
        // multidim[0] = new int[] {1, 2};
        // multidim[1] = new int[] {3, 4};
        // multidim[2] = new int[] {5, 6};
    }

    int[] reverseArray(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        ArraysBasics1 obj = new ArraysBasics1();
        // 1. Traversing an Array
        for (float flt : obj.array2) {
            System.out.println(flt);
        }

        // Passing an array
        int[] res = obj.reverseArray(obj.array1);
        System.out.println("Reversed Array: " + Arrays.toString(res));

        // List sorting
        List<Double> marks = new ArrayList<>(Arrays.asList(23.4, 67.77, 86.45, 62.34));
        Collections.sort(marks);
        System.out.println(marks); // [23.4, 62.34, 67.77, 86.45]
    }
}

// 2. Varargs

// Syntax:

// returnType methodName(parameterType... parameterName) {
//     // method body
// }

// The three periods (...) after the parameter type indicate that the method can accept zero or more arguments of that type.

// Ex1:
public static void printNumbers(int... numbers) {
    for (int num : numbers) {
        System.out.print(num + " ");
    }
    System.out.println();
}

// Ex2:
void printInfo(String name, int... scores) {
    System.out.println(name + " scored: ");

    for (int score : scores) {
        System.out.print(score + " ");
    }
    System.out.println();
}

// Important Notes:
// - Varargs must be the last parameter: If a method has a varargs parameter, it must be the last parameter in the method signature.
// - Only one varargs parameter allowed: A method can have at most one varargs parameter.

// 3. Lists in Java

// Lists are part of the Java Collections Framework and are used to store ordered collections of elements. 
// Unlike arrays, which have a fixed size, lists can grow and shrink dynamically as elements are added or removed.
// Java provides two main implementations of the List interface: ArrayList and LinkedList

// Create an empty ArrayList and add elements
ArrayList<String> fruits = new ArrayList<>();
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Orange");
System.out.println(fruits); // Output: [Apple, Banana, Orange]

// Accessing and modifying elements
ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
System.out.println(numbers.get(2)); // Output: 3
numbers.set(2, 10); // Updating
System.out.println(numbers); // Output: [1, 2, 10, 4, 5]



// LinkedLists
// Create an empty LinkedList
LinkedList<String> namesList = new LinkedList<>();

// Create a LinkedList with initial elements
LinkedList<Integer> numbersList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

LinkedList<String> cities = new LinkedList<>();
cities.add("New York");
cities.addFirst("Tokyo");
cities.addLast("London");
System.out.println(cities); // Output: [Tokyo, New York, London]
cities.removeFirst();
cities.removeLast();
System.out.println(cities); // Output: [New York]



// Common List Operations
List<String> list = new ArrayList<>();

// Add elements
list.add("Apple");
list.add("Banana");
list.add(0, "Orange"); // Insert at index 0

// Access elements
System.out.println(list.get(1)); // Output: Banana

// Update elements
list.set(1, "Grape");

// Remove elements
list.remove(0); // Remove element at index 0
list.remove("Grape"); // Remove the first occurrence of "Grape"

// Check if an element exists
System.out.println(list.contains("Apple")); // Output: true

// Get the size of the list
System.out.println(list.size()); // Output: 1

// Iterate over the list
for (String item : list) {
    System.out.println(item);
}



// List Sorting
// You can sort the elements of a List using the Collections.sort() method:
List<Double> marks = new ArrayList<>(Arrays.asList(23.4, 67.77, 86.45, 62.34));
Collections.sort(marks);
System.out.println(marks); // Output: [23.4, 62.34, 67.77, 86.45]





// List Conversion
// You can convert arrays to lists and vice versa 
// using utility methods from the Arrays and List classes:

String [] companies = {"FB","Amazon","Google"};
List<String> cp = Arrays.asList(companies);

String list2Arr [] = cp.toArray( new String[0]);

// The reason we include new String[0] when calling cp.toArray(new String[0])
//  is to provide a hint to the Java compiler about the type of array we want to create.
// or just use: String[] list2Arr = (String[]) cp.toArray();



// 4. Sorting an Array

int[] anArray = new int[] {5, 2, 1, 4, 8};
Arrays.sort(anArray); // anArray is now {1, 2, 4, 5, 8}

Integer[] anotherArray = new Integer[] {5, 2, 1, 4, 8};
Arrays.sort(anotherArray); // anotherArray is now {1, 2, 4, 5, 8}


char[] chars = new char[] {'O', 'C', 'B', 'S', 'A'};
Arrays.sort(chars);
System.out.println(Arrays.toString(chars)); // Output: [A, B, C, O, S]

// Note that when working with character arrays, you need to be careful about the difference between single quotes ('),
//  which are used for character literals, and double quotes ("), which are used for string literals. 
// Mixing them up can lead to compilation errors or incorrect behavior.


// How ArrayList differs to LinkedList
// ArrayList : O(1) where LinkedList is O(n)