import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        double v = readNumber("Введите скорость лодки в км/ч = ");
        checkNum(v);
        double u = readNumber("Введите скорость течения в км/ч = ");
        checkNum(u);
        checkSpeed(v,u);
        double t1 = readNumber("Время движения лодки в озере в ч = ");
        checkNum(t1);
        double t2 = readNumber("Время движения лодки против течения в ч = ");
        checkNum(t2);

        double s = findDistance(v, u, t1, t2);

        System.out.printf("S = %1$.03f", s);
    }

    static double readNumber(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(text);
        return scanner.nextDouble();
    }

    static double findDistance(double v, double u, double t1, double t2) {
        return (t1 * v) + (t2 * (v - u));
    }

    static void checkNum(double num) {
        if (num < 0) {
            System.out.print("Ошибка, введите число > 0");
            System.exit(0);
        }
    }

    static void checkSpeed(double num1, double num2) {
        if (num2 > num1) {
            System.out.print("Ошибка, скорость течения должна быть меньше скорости лодки");
            System.exit(0);
        }
    }
}