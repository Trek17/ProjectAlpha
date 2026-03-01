class Hello {
    public static void main(String a[]) {
        System.out.println("Hello, Trek");
        // Primitve Data Types
        int num1 = 5;
        byte b = 127;
        short s = 453;
        long l = 88888l; // needs l to be
        // added at the end, same reason as float
        System.out.println(num1);
        System.out.println(b);
        System.out.println(s);
        System.out.println(l);

        float num2 = 5.6f;// by default java
        // uses double, add f to explictly state
        // float
        // float num2 = 5.6 -> will give error

        System.out.println(num2);

        char string1 = 'a';// uses unicode and not ASCII
        System.out.println(string1);

        boolean output = true;
        System.out.println(output);

        // literals - all these values above
        int num3 = 0b101;// binary
        System.out.println(num3);
        int num4 = 0x7E;// hexa
        System.out.println(num4);

        int num6 = 1_000_000_00_0;// used for
        // easy seperation and readbility of code
        System.out.println(num6);

        double d1 = 56;// will get onverted to double
        double d2 = 12e11;
        System.out.println(d1);
        System.out.println(d2);

        char c1 = 'a';
        c1++;
        System.out.println(c1);

    }

}
