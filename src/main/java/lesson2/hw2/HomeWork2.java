package lesson2.hw2;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
    //Делала сама.
    /* Задача 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    С помощью цикла и условия заменить 0 на 1, 1 на 0; */
        //Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        int[] a = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        //С помощью цикла и условия заменить 0 на 1, 1 на 0
        for (int i = 0; i < a.length; i++)
            if (a[i] == 1) {
                a[i] = 0;
            } else a[i] = 1;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

    /*Задача 2. Задать пустой целочисленный массив размером 8.
    С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21*/
        int[] b = new int[8];
        int value = 0;
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < b.length; i++) {
            b[i] = value;
            value += 3;
            System.out.print(b[i] + " ");
        }
        System.out.println();

    /*Задача 3.  Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
    и числа меньшие 6 умножить на 2 */
        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 6) mas[i] = mas[i] * 2;
            System.out.print(mas[i] + " ");
        }

        System.out.println();

    /*Задача 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами*/
        int mass[][] = new int[3][3];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                System.out.print(mass[i][j] + " ");
            }

           System.out.println();
            }
        for (int i = 0; i < mass.length; i++){
            for (int j = 0; j < mass.length; j++) {
                mass[i][i] = 1;
                mass[i][3-i-1] =1;
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
}

    /*Посмотрела Вашу лекцию (ошибка или комментарий- JetBrains annotations library is missing.
    Without the library, IntelliJ IDEA cannot run the analysis. Would you like to add it?)добавила в библиотеку*/
     /*Задача 5. Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета)*/

    static void getMinMax(int [] arr) {
        int min = arr[0], max = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
                         }
        System.out.println(min);
        System.out.println(max);
    }
    }







































