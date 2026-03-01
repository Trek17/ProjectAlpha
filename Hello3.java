public class Hello3 {
    public static void main(String[] args) {
        int num1 = 16;
        int num2 = 10;
        int num3 = 17;

        if (num1 > num2 && num1 > num3)
            System.out.println(num1);
        // else if (num2 > num1 && num2 > num3) // in first if
        // we already check for num1 is greatest or not
        // if num1 comes out less than num2
        // no need to check num2>num1
        // if num1 > num2
        // again no need to check num2>num1
        // as if num1 is greatest it will be printed
        // if num1 less than num3, then only check needed is
        // whether num2 > num3, then num2 can be declared
        // else only option left is for num3 to be greatest
        else if (num2 > num3)
            System.out.println(num2);
        else
            System.out.println(num3);
        System.out.println();
        // Tertnary operator
        // ?:
        int num4 = 15;
        if (num4 % 2 == 0)
            System.out.println(10);
        else
            System.out.println(20);

        System.out.println("Tertnary operator");

        int result = num4 % 2 == 0 ? 10 : 20;
        System.out.println("10 if even, 20 if odd: " + result);

        System.out.println();
        //
        int num5 = 11;
        if (num5 > 10) {
            System.out.println("first if");
            System.out.println(num5);
        }

        if (num5 < 15) {
            System.out.println("second if");
            System.out.println(num5);
        }
        if (num5 <= 10) {

            System.out.println("third if");
            System.out.println(num5);
        } else
            System.out.println("In else");
        System.out.println();

        num5 = 10;
        if (num5 > 10) {
            System.out.println("first if");

            System.out.println(num5);
        } else if (num5 < 15) {
            System.out.println("sec else if");
            System.out.println(num5);

        } else if (num5 < 11) {
            System.out.println("third else if");
            System.out.println(num5);
        } else
            System.out.println("Condition not satisfied");
        System.out.println();

        int n = 3;
        switch (n) {
            case 1:
                System.out.println("Mon");
            case 2:
                System.out.println("Tue");
            case 3:
                System.out.println("Wed");
            case 4:
                System.out.println("Thu");
            case 5:
                System.out.println("Fri");
            case 6:
                System.out.println("Sat");
            case 7:
                System.out.println("Sun");
        }

        System.out.println();

        n = 3;
        switch (n) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
        }

        System.out.println();

        n = 8;
        switch (n) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Enter valid number");
        }
    }
}
