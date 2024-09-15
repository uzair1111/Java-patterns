import java.util.Scanner;

public class Number_half_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What should be the height");
        int height = sc.nextInt();

        System.out.println("Here is you Number Pyramid::");
        for(int i=1; i<=height; i++){
            
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
}
