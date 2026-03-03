public class DemoString {

    public static void main(String[] args) {
        String name = "Tri";
        System.out.println(name);
        System.out.println(name.concat("Sha"));

        name = name + "123";
        System.out.println(name);

        String s1 = "tri";
        String s2 = "tri";

        System.out.println(s1 == s2);

        // String objects are stored in
        // String constant pool
        // java checks if string already exists in it
        // to save memory it assigns address to new
        // variable if string is pre existing
        // the string objects which are not pointed by
        // any variable are garbage collected at some
        // point in time
        // statement on line 19 can be verified by
        // output of line 14

        // StringBuffer
        StringBuffer str = new StringBuffer();
        System.out.println(str.capacity()); // gives 16 bytes by default

        str.append("qwert");
        System.out.println(str.length());
        System.out.println(str);

        str.insert(5, "yyyy");
        System.out.println(str);
        System.out.println(str.capacity());

        // StringBuffer vs StringBuilder
        // SBuffer is thread-safe
        // What is thread safe ?
        // We'll see soon enough!

    }
}