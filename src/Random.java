import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * size);
        }
        int minValue = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
                minIndex = i;
            }
        }
        System.out.println("Минимальное значение: " + minValue);
        System.out.println("Позиция в массиве: " + minIndex);
    }
}
