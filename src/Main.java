import java.util.Scanner;

public class Main {

    private static int num,counter = 0;
    private static Scanner sc;
    public static void main(String[] args) { 
        sc= new Scanner(System.in);
        System.out.print("Ate que numero deseja saber se é primo: ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            counter = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0){  
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.println("O numero " + i + " é primo");
            }
        }
    }
}