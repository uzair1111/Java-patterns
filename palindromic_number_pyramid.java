import java.util.Scanner;

public class palindromic_number_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What should be the height");
        int height = sc.nextInt();

        System.out.println("Here is your Pyramid:");
        int x= 0;
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j <= height-i; j++) {
                System.out.print("  ");
            }
            int number = i;
            boolean check = false;
            for (int j = 0; j < i+x; j++) {
                if(number==1){check = true;}
                System.out.print(number+" ");
                number = (check) ? number+1 : number-1;
            }
            x++;
            System.out.println();
        }
    }
}
