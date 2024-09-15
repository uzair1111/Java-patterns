import java.util.Scanner;

public class Binary_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What should be the height");
        int height = sc.nextInt();

        System.out.println("Here is your triangle:");
        
        for (int i = 0; i < height; i++) {
            int x = (i%2 == 0) ? 0 : 1;
            for (int j = 0; j <= i; j++) {
                x = (x==0)? 1: 0;
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
