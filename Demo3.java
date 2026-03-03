//Array of objects
class Student {
    String name;
    int marks;
}

public class Demo3 {
    public static void main(String[] args) {
        int arr[] = new int[6];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 12;
        arr[3] = 89;

        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }

        // for each
        for (int n : arr) {
            System.out.println(n);
        }

        Student s1 = new Student();
        s1.name = "Tri";
        s1.marks = 97;

        Student s2 = new Student();
        s2.name = "Pri";
        s2.marks = 92;

        Student s3 = new Student();
        s3.name = "Kri";
        s3.marks = 99;

        Student student[] = new Student[3];

        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        // for (int i = 0; i < student.length; i++) {
        // System.out.println(student[i].name + " " + student[i].marks);
        // }

        // enhanced for loop
        for (Student stu : student) {
            System.out.println(stu.name + " " + stu.marks);
        }

    }
}
