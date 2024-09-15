import java.util.Scanner;

public class Solid_rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What should be the height");
        int height = sc.nextInt();

        System.out.println("Here is your rhombus:");
        
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < height; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
