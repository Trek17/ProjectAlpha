class Mobile {
    String brand;
    int price;
    // static makes name a class variable
    // it has a differet location where it will be stored
    // it is common to all objects
    // static is refered by class name
    // class.staticVariable
    static String name;

    public void show() {
        System.out.println("Brand: " + brand
                + "\n" + "Price: " + price +
                "\n" + "Name: " + name);
        System.out.println();
    }

}

public class DemoStatic {
    public static void main(String[] args) {

        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        Mobile m3 = new Mobile();

        m1.brand = "Apple";
        m1.price = 1500;
        Mobile.name = "Smartphone";

        m2.brand = "Google";
        m2.price = 1200;
        // name is static, that's why warning
        // should be referred by class name
        m2.name = "Smartphone";

        m3.brand = "Samsung";
        m3.price = 1300;
        Mobile.name = "Smartphone";
        m1.show();
        m2.show();
        m3.show();

        m1.name = "Phone"; // this will effect all
        // objects

        // why - name is static hence, its a class
        // variable, so common to all objects
        System.out.println("After static variable update!");
        m1.show();
        m2.show();
        m3.show();

    }
}
