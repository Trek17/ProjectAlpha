public class Hello2 {
    public static void main(String[] args) {
        // operators
        // Arithemetic
        int n1 = 10;
        int n2 = 20;
        int result = n1 + n2;
        System.out.println(result);

        result = n1 - n2;
        System.out.println(result);

        result = n1 * n2;
        System.out.println(result);

        result = n1 / n2; // gives quotient;
        System.out.println(result);

        result = n1 % n2; // gives remainder;
        System.out.println(result);

        // short hand
        // n1 = n1 + 1;
        // n1 += 1;
        // n1 ++; //post increment
        // or
        // n1 -= 1;
        // n1--;
        n1 += 2; // n1 = n1 + 2
        System.out.println(n1);

        n1 *= n2; // n1*n2
        System.out.println(n1);
        // 240
        ++n1; // 241
        System.out.println(n1); // 241
        n1++;// 242
        System.out.println(n1); // 242
        // here appear same, now lets assign n1

        n1 = 7;
        result = ++n1; // increment and then fetch value
        System.out.println(result);
        n1 = 7;
        result = n1++; // fetch value then increment
        System.out.println(result);

        // Realtional
        // >,<,== (equal),!= (not equal)
        // <=, >=
        // = in java is for assignment
        // Beware, for comparison we use ==
        System.out.println(7 <= 7);
        float f3 = 5.6f;
        double d4 = 5.61;
        boolean output = f3 == d4;
        System.out.println(output);

        // & (AND) | -> called pipe (OR) ! (NOT)
        boolean b1 = true | false;
        System.out.println("true OR false: " + b1);
        boolean b2 = true & false;
        System.out.println("true AND false: " + b2);
        boolean b3 = !b2;
        System.out.println("NOT (true AND false): " + b3);

        // Shortcircit
        // && ||
        // doesn't check for next value if output can be
        // determined by the first value itself

        boolean b4 = 7 > 5; // true
        boolean b5 = 7 < 5; // false
        boolean bool1 = b4 && b5;
        boolean bool2 = b4 || b5;
        System.out.println("b4: " + b4 + "," + "b5: " + b5);
        System.out.println("b4 AND b5 " + bool1);
        System.out.println("b4 OR b5 " + bool2);

    }
}
