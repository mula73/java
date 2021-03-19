package lesson2;

public class CycleExamples {
    public static void main(String[] args) {
        int n = 1;
        // вывести все числа от 1 до n
        while (n <= 10) {
            System.out.print(n + " ");
            n++;
        }
        System.out.println();

        // напечатать таблицу умножения от 1 до 9
        // iter = 9 * 9
        for (int i = 1; i < 10; i++) {
             for (int j = 1; j < 10; j++) {
                 System.out.printf("%3d", i * j);
            }
            System.out.println();
        }

    }
}