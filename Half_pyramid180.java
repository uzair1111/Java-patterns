import java.util.Scanner;

public class Half_pyramid180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What should be the height");
        int height = sc.nextInt();

        System.out.println("Here is you rectangle::");
        for(int i=1; i<=height; i++){
            
            for(int j=1; j<=height; j++){
                if(j <= height-i){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        
    }
}
