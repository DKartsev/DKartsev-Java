import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку a: ");
        String text1 = scan.nextLine();
        System.out.print("Введите строку b: ");
        String text2 = scan.nextLine();
        if (text1.equals(text2)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки не идентичны");
        }
    }

}
