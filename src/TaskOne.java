import java.util.Scanner;

import static java.lang.Math.*;

public class TaskOne {

    public static void main(String[] args) {
        double x, y;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение x: ");
        x = receiveNumber(scan);
        System.out.print("Введите значение y: ");
        y = receiveNumber(scan);
        double result = calculateResultOfExpression(x, y);
        System.out.print("Результат вычисления: " + result);
        scan.close();
    }


    private static double receiveNumber(Scanner scan) {
        double receivingNumber;
        while (!scan.hasNextDouble()) {
            System.out.println("Ошибка! Повторите ввод");
            scan.next();
        }
        receivingNumber = scan.nextDouble();
        return receivingNumber;
    }

    private static double calculateResultOfExpression(double x, double y) {
        double numerator = 1 + pow(sin(x + y), 2);
        double denominator = 2 + abs(x - (2 * x / (1 + pow(x * y, 2))));
        double result = 0;

        if (denominator != 0) {
            result = numerator / denominator + x;
        } else {
            System.out.println("Расчёт не возможен из-за значения знаменателя");
        }

        return result;
    }

}
