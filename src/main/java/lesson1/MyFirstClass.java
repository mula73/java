package lesson1;

//ДЗ_1 Сидоровой Л.Н.

public class MyFirstClass {
    /**
     * @param args - аргументы командной стороки
     * */
        // Создать пустой проект в IntelliJ IDEA и прописать метод main()
    public static void main(String[] args) {
        // напечатать на экране текст Hello world!
        System.out.println("Hello world!");

        // Создать переменные всех пройденных типов данных и инициализировать их значения

            //Примитивные
            //целочисленные:
            byte byteValue = 16; // 8-битное знаковое целое число, от -128 до 127
            short shortValue = 10001; // 16-битное знаковое целое число,
            int intValue = 2_000_000_000; // 32-битное знаковое целое число, от -2147483648 до 2147483647
            long longValue = 1_000_000_000_000L; // 64-битное знаковое целое число
            //с плавающей запятой:
            float floatValue = 12.23f;// 32-битное знаковое число с плавающей запятой одинарной точности
            System.out.println(floatValue);
            double doubleValue = 0.5; // 64-битное знаковое число с плавающей запятой двойной точности
            //символьный:
            char charValue = '\''; //16-битный тип данных, предназначенный для хранения символов в кодировке Unicode
            System.out.println(charValue);
            char charVal1 = '3';
            System.out.println(charVal1);
            //логический:
            boolean booleanValue = true; // логический тип данных, false, true
            System.out.println(booleanValue);

        //Ссылочные
            //строка:
            String hello = "Hello ";
            String world = "world!";
            System.out.println(hello + world);
    }
}