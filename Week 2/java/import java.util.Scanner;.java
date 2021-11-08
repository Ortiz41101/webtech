import java.util.Scanner;

public class al_Ismail_ForLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = 0;

        System.out.println("Enter the amount of rows: ");
        size = sc.nextInt();

        for(int i=0; i<size; ++i)
        {
            for (int j = 0; j <=i; ++j)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}