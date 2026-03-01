public class Hello1 {
    public static void main(String a[]) {
        // Type conversion and casting
        byte b = 127;// -128 to 127 = 256
        // implicit
        int num1 = b;
        System.out.println(num1);

        // casting
        int num2 = 12;
        byte b1 = (byte) num2; // explicit
        System.out.println(b1);

        int num7 = 257;
        byte b2 = (byte) num7; // 257%256 performed bts
        System.out.println(b2);

        float f1 = 5.6f;
        System.out.println(f1);
        int numf1 = (int) f1; // castes float into int
        // we loose the decimal
        System.out.println(numf1);

        // conclusion
        // conversion is automatic (implicit) line 6
        // casting is explicit conversion line 11 omnwards

        // Byte promotions
        byte b3 = 10;
        byte b4 = 30;
        // b1*b2 > 256, java does type promotion
        int result = b3 * b4;
        System.out.println(result);

    }

}
