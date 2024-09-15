import java.util.Scanner;

public class Inverted_half_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What should be the height");
        int height = sc.nextInt();

        System.out.println("Here is your inverted Pyramid::");
        for(int i=height; i>=1; i--){
            
            for(int j=i; j>=1; j = j-1){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
