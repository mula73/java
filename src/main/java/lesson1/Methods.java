package lesson1;

//ДЗ_1 Сидоровой Л.Н.

public class Methods {

    /* Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    где a, b, c, d – аргументы этого метода, имеющие тип float */
    public static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    /* Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
    (включительно), если да – вернуть true, в противном случае – false */

    public static boolean isSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    /* Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     */
    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    /* Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
    если число отрицательное, и вернуть false если положительное*/
    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        }
        return false;
    }

    /* Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    Метод должен вывести в консоль сообщение «Привет, указанное_имя!»*/
    public static void greetings(String name) {
        System.out.println("Привет, Людмила!");
    }

    public static void main(String[] args) {
        System.out.println(calculate(2, 2, 2, 2));
    }
}
