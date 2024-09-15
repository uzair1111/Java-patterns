import java.util.Scanner;

public class Hollow_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What should be the height");
        int height = sc.nextInt();
        System.out.println("what should be the width");
        int width = sc.nextInt();

        System.out.println("Here is your Hollow rectangle::");
        for(int i=0; i<height; i++){
            
            for(int j=0; j<width; j++){
                if(i==0 || i == height -1){
                    System.out.print("*");
                } else if(j==0 || j==width-1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}
