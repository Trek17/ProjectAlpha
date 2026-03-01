class Calculator {
    int a = 5;

    public int add(int n1, int n2) {
        System.out.println("In add");
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        System.out.println("In add 3 params");
        return n1 + n2 + n3;
    }

    public double add(double n1, double n2, double n3) {
        System.out.println("In add double 3 params");
        return n1 + n2 + n3;
    }

}

public class Demo {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 6;
        // calc is a reference variable
        // and not an object itself
        Calculator calc = new Calculator();
        Calculator calc1 = new Calculator();
        System.out.println(calc.a);
        System.out.println(calc1.a);

        calc.a = 6;
        System.out.println(calc.a);
        System.out.println(calc1.a);
        // int result = calc.add(num1, num2);
        // System.out.println(result);

        // What if I want to add 3 numbers
        // either have a new method
        // or do METHOD OVERIDING
        // same name, just different number of
        // parameters or return type
        // System.out.println(calc.add(1, 2, 3));
        // System.out.println(calc.add(1.3, 2.2, 3.5));
    }
}

// Class a blueprint for what I want to do
// Object knows something and does something
// has attributes and functions
// JVM uses class to know the design and creates
// an object on this design

// Analogy
// I need calling functionality
// I can design in by writing the class
// How will I use that ? I need something
// Object is that "something"

// JDK > JRE > JVM
// JRE and JVM are present on client's computer

// JVM is platform independent - can run on any OS
// But that's only possible if OS has JRE
// Can't run Java app on IOS, they don't support JRE

// Stack(LIFO) and Heap (this expands)
// Stack
// 1. Stores all the variables, key value (Name, value)
// 2. methods variable go into a new stack
// in above case add method variables num1 num2
// 3. Reference variable calc keeps address of object in heap

// Heap
// 1. This will have object
// having variable and method, add and a will be in here
// 2. From line 33-35 you see that calc and calc1 are
// stored as 2 different objects and with a being
// specific to each of them