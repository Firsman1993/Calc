import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        double number1 = scanner.nextDouble();
        System.out.println("Введите операцию");
        char operation = scanner.next().charAt(0);
        System.out.println("Введите второе число");
        double number2 = scanner.nextDouble();
        double result = 0;
        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                System.out.println("Операция не поддерживается");
        }
        System.out.println("Результат: " + result);
    }
}