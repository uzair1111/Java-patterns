import java.util.Scanner;

public class Inverted_number_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What should be the height");
        int height = sc.nextInt();

        System.out.println("Here is your inverted number pyramid::");
        for(int i=0; i<=height; i++){
            
            for(int j=1; j<=height-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
}

