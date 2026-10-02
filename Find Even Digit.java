import java.util.Scanner;

public class EvenDigitNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int t = 0;

        for (int i = 0; i < a.length; i++) {

            int num = a[i];
            int s = 0;

            while (num > 0) {
                s = s + num % 10;
                num = num / 10;
            }

            if (s % 2 == 0) {
                System.out.println(a[i]);
                t++;
            }
        }

        System.out.println("Count = " + t);

        sc.close();
    }
}
