import java.util.Scanner;

public class LabWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int min = 0;
        if ((a < b) && (a < c) && (a < d))  min = a;
        if ((b < a) && (b < c) && (b < d))  min = b;
        if ((c < a) && (c < b) && (c < d))  min = c;
        if ((d < a) && (d < b) && (d < c))  min = d;
        System.out.println(min);

    }
}

