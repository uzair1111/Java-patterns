import java.util.Scanner;

public class Floyds_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What should be the height");
        int height = sc.nextInt();

        System.out.println("Here is your floyd's triangle::");
        int x = 0;
        for(int i=1; i<=height; i++){
            
            for(int j=0; j<i; j++){
                x++;
                System.out.print(x+" ");
            }
            System.out.println();
        }
        
    }
}
