import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        System.out.println("Определение максимального числа");
        System.out.print("Введите первое число: ");
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        System.out.print("Введите второе число: ");
        int second = input.nextInt();
        System.out.print("Введите третье число: ");
        int third = input.nextInt();
        int [] max = new int[] {first,second,third};
        int maxValue = max [0];
        for (int i = 0; i < max.length; i++) {
            if(maxValue < max[i]) {
                maxValue = max[i];
            }
        }
        System.out.println("Максимальное значение: " + maxValue);
    }
}
