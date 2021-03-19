package lesson3;

import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random numbers = new Random();
        int try3 =0;
        int random = numbers.nextInt(9);
        System.out.print("Игра: Угадай число!");


        System.out.println();
        System.out.println("У Вас три попытки.");

        while (try3 < 3) {
             System.out.print("Введите число от 0 до 9. Какое число я загадал?: ");
            int number = in.nextInt();
            if (number > random) {
                System.out.println("Вы ввели слишком большое число. Попробуйте еще раз.");
                System.out.println();
            } else if (number < random) {
                System.out.println("Вы ввели слишком маленькое число. Попробуйте еще раз.");
                System.out.println();
            } else if (number == random) {
                System.out.println("Поздравляю! Вы угадали!");
                System.out.println();
                return;
            }
            try3++;
        }

        System.out.print("Вы проиграли. Повторить игру еще раз? 1 – повторить, 0 – нет");
        String userData = in.next();
        if(userData.equals("1")) {
            main(null);

        }
    }
}