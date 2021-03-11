import java.util.Scanner;

public class Hatodik {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("adj meg ket egesz szamot: ");
        int input = scanner.nextInt();
        int input2 = scanner.nextInt();
        for (int i = input + 1; i < input2; i++) {

            System.out.println((float)i / 2);
        }
    }
}