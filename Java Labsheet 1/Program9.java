import java.util.Scanner;

public class Program9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of subject 1: ");
        int m1 = sc.nextInt();
        System.out.print("Enter marks of subject 2: ");
        int m2 = sc.nextInt();
        System.out.print("Enter marks of subject 3: ");
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double percentage = total / 3.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (m1 >= 40 && m2 >= 40 && m3 >= 40 && percentage >= 40) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }
}
