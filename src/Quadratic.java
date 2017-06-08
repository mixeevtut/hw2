import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        System.out.println("Решение квадратного уравнения вида ax2 + bx + c = 0");
        System.out.print("Введите a: ");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        System.out.print("Введите b: ");
        double b = input.nextDouble();
        System.out.print("Введите c: ");
        double c = input.nextDouble();
        double d = Math.pow(b,(double) 2) - (4 * a * c);
        if (a == 0) {
            System.out.println("a не может быть равно 0!");
        } else if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Дискриминант больше 0, два вещественных корня:");
            System.out.println("Первый корень = " + x1 + " Второй корень = " + x2);
        } else if (d == 0) {
            double x = (-b) / (2 * a);
            System.out.println("Дискриминант равен 0, один вещественный корень:");
            System.out.println("X = " + x);
        } else if (d < 0) {
            System.out.println("Дискриминант меньше 0, вещественных корней нет");
        }
    }
}
