import java.util.Scanner;

class Frequency {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(" " + a[i]);
        }
        for (int i = 0; i < n; i++) {
            int x = a[i];
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (a[j] == x) {
                    count++;
                }
            }
            System.out.println("The frequency of " + x + " is " + count);
        }
    }
}
