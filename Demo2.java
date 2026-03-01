public class Demo2 {
    public static void main(String[] args) {
        // Array
        int arr[] = { 1, 2, 3 };
        System.out.println(arr[0]);

        // Dynamic array
        // When we don't have values yet
        int arr1[] = new int[4];
        System.out.println(arr1[0]);
        arr1[0] = 10;
        System.out.println(arr1[0]);

        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }

        // Multi Dimensional Array or Array of Arrays
        // 0 2 3 4
        // 0 0 0 0
        // 0 8 9 9
        System.out.println("Multi Dimensional Array");
        int arr3[][] = new int[3][4];
        // arr3[0][1] = 2;
        // arr3[0][2] = 3;
        // arr3[0][3] = 4;
        // arr3[2][1] = 8;
        // arr3[2][2] = 9;
        // arr3[2][3] = 9;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                arr3[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

    }
}
