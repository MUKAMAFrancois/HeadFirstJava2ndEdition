
// 1. Declaring and Initializing Variables:

// Variables must be declared with a specific type.
// Variables must be initialized before use.

int x;       // declaration
x = 3;       // initialization
int y = 4;   // declaration and initialization

// 2. Primitive Data Types:
// Java has eight primitive data types: byte, short, int, long, float, double, char, and boolean.

int count = 25;
double price = 19.99;
char grade = 'A';
boolean isValid = true;


// 3. Reference Variables:
// Reference variables store the memory address of objects.
// public class Dog {
//     String name;
    
//     public static void main(String[] args) {
//         Dog myDog = new Dog();
//         myDog.name = "Rex";
//         System.out.println(myDog.name);
//     }
// }


class Hotel{
    String name;
    float cost;
}

// Java is pass by Value : Value Type assignment and Reference type assignment.


class chapter3 {
    public static void main(String[] args) {
        int a=100;
        int b = a; // b=100
        b=330; // re-assigning value to b will not change the value of a bcz b stored the copy of a, not original value of a.

        System.out.println("a: " + a + "  b: " + b);

        Hotel htl1 = new Hotel(); // at the time of creating new keyword, 
        //the memory is created and htl1 variable holds the adress of the hotel Object
        htl1.name="Ax2SS";
        htl1.cost =234.34f;

        Hotel htl2;
        htl2=htl1;

        System.out.println(htl1); // adress
        System.out.println(htl2); // same adress as for htl1
    }
}

// 4. Array Basics:
// Arrays store multiple values of the same type.
// Arrays are objects in Java

// public class ArrayTest {
//     public static void main(String[] args) {
//         int[] numbers = new int[5];
//         numbers[0] = 10;
//         numbers[1] = 20;
//         numbers[2] = 30;
//         numbers[3] = 40;
//         numbers[4] = 50;
        
//         for (int i = 0; i < numbers.length; i++) {
//             System.out.println("Element at index " + i + ": " + numbers[i]);
//         }
//     }
// }




// 5. Variable Scope:
// Scope determines the visibility and lifetime of a variable.
// Local variables, instance variables, and class variables have different scopes.

// Default Values:
// Instance variables have default values.
// Local variables do not have default values and must be initialized before use.

class DefaultValues{
    int instanceInt;
    float instanceFloat;
    String instanceStr;

    void printValues(){
        // int localVar;
        System.out.println("default int: " + instanceInt);
        System.out.println("default float: " + instanceFloat);
        System.out.println("default String: " + instanceStr);
        // System.out.println("local Variable: " + localVar); // an error
    }
}  


class play {
    public static void main(String[] args) {
      DefaultValues df = new DefaultValues();
      df.printValues(); 

        // default int: 0
        // default float: 0.0
        // default String: null
        
    }
}
// Local Variables
// Local variables are declared within a method or a block and are only accessible within that method or block. They are created when the method is called and destroyed when the method exits.

// Instance Variables
// Instance variables are declared in a class but outside any method, constructor, or block. They are tied to a specific instance of a class. Each object has its own copy of instance variables.

// Class Variables
// Class variables (also known as static variables) are declared with the static keyword inside a class but outside any method, constructor, or block. They are shared among all instances of a class.
