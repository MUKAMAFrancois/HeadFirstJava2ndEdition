// 1. Array methods
// Java provides a utility class called Arrays in the java.util package which contains various methods 
// for manipulating arrays (such as sorting and searching). 

import java.util.Arrays;
import java.util.List;
import java.util.Random;

class Arrays2{
    public static void main(String[] args) {
        //1. static <T> List<T> asList(T... a)
        //Converts an array into a fixed-size list backed by the specified array.


        String [] fruits = {"apple","mango","Pineaples"};
        List<String> fruits_list = Arrays.asList(fruits);
        System.out.println(fruits_list); //[apple, mango, Pineaples]


        //2. Arrays.binarySearch(int[] a, int key)
        //Searches the specified array for the specified value using the binary search algorithm. 
        //The array must be sorted prior to making this call.

        int ages [] ={34,36,42,50,56,89};
        int index50 = Arrays.binarySearch(ages, 50);
        System.out.println("50 ages is found on: " + index50); //3

        // 3. static <T> void sort(T[] a): Arrays.sort(T[] a)
        String [] students ={"Paul","Xeno","Daniel","Aaron","Beatrice","Alice"};
        Arrays.sort(students);
        System.out.println("Sorted students: " + Arrays.toString((students))); // [Aaron, Alice, Beatrice, Daniel, Paul, Xeno]


        // 4. static boolean equals(int[] a, int[] a2) : Arrays.equals(int[] a, int[] a2)
        //Returns true if the two specified arrays are equal to one another.

        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean areEqual = Arrays.equals(array1, array2);
        System.out.println(areEqual); // Output: true


        // 5. static String toString(int[] a): Arrays.toString(int[] a)
        // Returns a string representation of the contents of the specified array.

        int [] games ={1,2,3,4};
        String string_games = Arrays.toString(games);
        System.out.println("type of string_games: " + string_games.kiu767ass() + "| Result: " + string_games); 
        // type of string_games: class java.lang.String| Result: [1, 2, 3, 4]
        boolean classes_equal = string_games.getClass().equals(String.class);
        System.out.println(classes_equal); // true


        // 6. static int[] copyOf(int[] original, int newLength)
        //Arrays.copyOf(int[] original, int newLength)
        //Copies the specified array, truncating or padding with zeros (if necessary) so the copy has the specified length

        char [] letters = {'A','B','C','X'};
        char [] lt_copy = Arrays.copyOf(letters, letters.length);
        System.out.println(Arrays.toString(lt_copy));

        int[] array = {1, 2, 3};
        int[] newArray = Arrays.copyOf(array, 5);
        System.out.println(Arrays.toString(newArray)); // Output: [1, 2, 3, 0, 0]

        // 7. static void fill(int[] a, int val) : Arrays.fill(int[] a, int val)
        // Assigns the specified int value to each element of the specified array

        int array3 [] = new int[4];
        Arrays.fill(array3,10);
        System.out.println(array3); //[I@53d8d10a
        System.out.println(Arrays.toString(array3)); // [10, 10, 10, 10]

        // 8. static int hashCode(int[] a)
        // Arrays.hashCode(int[] a)
        //Returns a hash code based on the contents of the specified array.

        //In Java, a hash code is an integer value that is used to uniquely identify objects during hash-based operations, such as in hash tables, hash sets, and hash maps. 
        //The hashCode() method provides a way of generating this integer value based on the object's data.


        int hashcode = Arrays.hashCode(fruits);
        System.out.println(hashcode); // -304892494

        // 9. static <T> T[] copyOfRange(T[] original, int from, int to): Arrays.copyOfRange(T[] original, int from, int to)

        String laptops [] = {"mac","lenovo","hp","dell","toshiba","acer","Asus","huawei","microsoft","sumsung"};
        String his_laptops [] = Arrays.copyOfRange(laptops,0,4);
        System.out.println(his_laptops); // [Ljava.lang.String;@e9e54c2
        System.out.println(Arrays.toString(his_laptops)); //[mac, lenovo, hp, dell]

        // 10. static <T> void parallelSort(T[] a) : Arrays.parallelSort(T[] a)
        // Sorts the specified array into ascending order, using a parallel sorting algorithm.

        Integer nums [] ={22,9,12,0,-13,45};
        Arrays.parallelSort(nums);
        System.out.println(Arrays.toString(nums)); // [-13, 0, 9, 12, 22, 45]

        // 11. static void setAll(int[] array, IntUnaryOperator generator)
        // Arrays.setAll(int[] array, IntUnaryOperator generator)
        // Sets all elements of the specified array, using a generator function. generator: A function that computes the value for each element.

        int odds [] = new int[5];
        Arrays.setAll(odds, index -> 2*index+1);
        System.out.println(Arrays.toString(odds)); //[1, 3, 5, 7, 9]



        int[] array4 = new int[10];
        // Initialize array with indices
        Arrays.setAll(array4, index -> index);
        System.out.println(Arrays.toString(array4)); // Output: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]



        int array5 [] = new int[10];
        Random random = new Random();
        Arrays.setAll(array5, index -> random.nextInt(100));
        Arrays.sort(array5);
        System.out.println(Arrays.toString(array5));

        // 12. static void parallelPrefix(int[] array, IntBinaryOperator op)
        // Arrays.parallelPrefix(int[] array, IntBinaryOperator op)
        //Cumulates, in parallel, each element of the given array using the supplied function.


        int array6 [] = {1,2,3,4,5};
        Arrays.parallelPrefix(array6, (i,j) -> (i+j)); // Cumulative Sum
        System.out.println(Arrays.toString(array6)); //[1, 3, 6, 10, 15]



        int[] arr = {2, 3, 4, 5, 6};
        System.out.println("Original array: " + Arrays.toString(arr));
        // Compute product of all previous elements
        Arrays.parallelPrefix(arr, (a, b) -> a * b);
        System.out.println("After parallelPrefix: " + Arrays.toString(arr));


        int[] arr1 = {0b1010, 0b1100, 0b1001, 0b1111, 0b0101};
        System.out.println("Original array: " + Arrays.toString(arr));
        // Compute bitwise AND of all previous elements
        Arrays.parallelPrefix(arr1, (a, b) -> a & b);
        System.out.println("After parallelPrefix: " + Arrays.toString(arr1));

        // Original array: [2, 6, 24, 120, 720]
        // After parallelPrefix: [10, 8, 8, 8, 0]


        // Notice: In Java, arrays are fixed in size and do not support dynamic operations such as push, pop, or extend directly. 
        //These operations are typically associated with dynamic data structures like lists. 
        //Java provides the ArrayList class and other collection classes in the Java Collections Framework to support such operations


        // Java arrays are designed to be simple and efficient for cases where the size of the collection is known and does not change.
        // This simplicity and efficiency come at the cost of not having dynamic operations. 
        //For dynamic collections, the Java Collections Framework provides classes like ArrayList, LinkedList, HashSet, HashMap, etc.

    }
}