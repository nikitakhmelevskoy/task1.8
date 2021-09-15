import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите скорость скорость лодки в стоячей воде (км/ч) v = ");
        double v = scan.nextDouble();
        System.out.print("Введите скорость течения (км/ч) u = ");
        double u = scan.nextDouble();
        System.out.print("Время движения без течения (ч) t1 = ");
        double t1 = scan.nextDouble();
        System.out.print("Время движения с течением (ч) t2 = ");
        double t2 = scan.nextDouble();
        double s = (t1 * v) + (t2 * (v - u));
        System.out.println("s = "+ s);
    }
}