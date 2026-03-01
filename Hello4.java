public class Hello4 {
    public static void main(String[] args) {
        // loops for, while, do while
        if (false) {
            int i = 5;
            while (i <= 4) {
                System.out.println("Hi " + i);
                i++;
                int j = 1;
                while (j <= 3) {
                    System.out.println("Hello " + j);
                    j++;
                }
            }
        }
        // System.out.println("Final i = " + i);
        if (false) {
            int i = 9;
            do {
                System.out.println("Hi " + i);
                i++;
            } while (i <= 4);
            System.out.println("Final i = " + i);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println();

            switch (i) {
                case 0:
                    System.out.println("Monday");
                    break;
                case 1:
                    System.out.println("Tuesday");
                    break;
                case 2:
                    System.out.println("Wednesday");
                    break;
                case 3:
                    System.out.println("Thursday");
                    break;
                case 4:
                    System.out.println("Friday");
                    break;
                case 5:
                    System.out.println("Saturday");
                    break;
                case 6:
                    System.out.println("Sunday");
                    break;
                default:
                    break;

            }
            for (int j = 1; j < 10; j++)
                // System.out.println(" " + j + 8); //Here string concatenation
                // is taking place so output will be different from j+8
                // Instead
                // System.out.print(j + 8 + " ");
                // or
                System.out.println(" " + (j + 8) + " - " + (j + 9));
        }

    }

}
