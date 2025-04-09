import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = scan.nextInt();
        System.out.print("Введите число b: ");
        int b = scan.nextInt();
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        System.out.println("Сложение " + (a + b));
        System.out.println("Вычитание " + (a - b));
        System.out.println("Деление " + (a / b));
        System.out.println("Умножение " + (a * b));


    }



}
