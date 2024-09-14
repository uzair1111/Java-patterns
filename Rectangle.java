import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What should be the height");
        int height = sc.nextInt();
        System.out.println("what should be the width");
        int width = sc.nextInt();

        System.out.println("Here is you rectangle::");
        for(int i=0; i<height; i++){
            
            for(int j=0; j<width; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
