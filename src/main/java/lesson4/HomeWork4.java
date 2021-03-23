package lesson4;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    private static final char DEFAULT = '*';
    private static final char X = 'X';
    private static final char O = 'O';
    private static final int SIZE = 3;
    private static final char[][] Map = new char[SIZE][SIZE];

//
    public static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                Map[i][j] = DEFAULT;
            }
        }
    }
//
    public static void printMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(Map[i][j] + " ");
            }
            System.out.println();
        }
    }
//
    private static void game(Scanner in) {
        initMap();
        System.out.println("Игра Крестики - нолики.");
        System.out.println("Для хода необходимо ввести номер строки и номер столбца.");
        int stepCounter = 0;
        while (true) {
            System.out.println("Ваш ход: ");
            String line = in.nextLine();
            String[] args = line.split(" ");
            if (args.length != 2) {
                System.out.println("Введите два числа");
            } else {
                try {
                    int x = Integer.parseInt(args[0]);
                    int y = Integer.parseInt(args[1]);
                    x--;
                    y--;
                    if (isValid(x, y)) {
                        makeStep(x, y, X);
                        printMap();
                        stepCounter++;
                        if (checkVictory(X)) {
                            System.out.println("Вы победили!");
                            return;
                        }
                        if (stepCounter == 9) {
                            System.out.println("Ничья!");
                            return;
                        }
                        System.out.println("Ход компьютера: ");
                        movePC();
                        printMap();
                        stepCounter++;
                        if (checkVictory(O)) {
                            System.out.println("Вы проиграли!");
                            return;
                        }
                    } else {
                        System.out.println("Некорректный ход.\n" + "Введите два числа от 1 до 3");
                    }
                } catch (Exception e) {
                    System.out.println("Введите два числа");
                }
            }
        }
    }

//
    private static void movePC() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (Map[i][j] == DEFAULT) {
                    makeStep(i, j, O);
                    return;
                }
            }
        }
    }

//
    private static boolean checkVictory(char x) {
        for (int i = 0; i < SIZE; i++)
            if((Map[i][0] == x && Map[i][1] == x && Map[i][2] == x) ||
                    (Map[0][i] == x && Map[1][i] == x && Map[2][i] == x))
        return true;
        if ((Map[0][0] == x && Map[1][1] == x && Map[2][2] == x) ||
                (Map[2][0] == x && Map[1][1] == x && Map[0][2] == x))
            return true;

            if (Math.random() > 0.8) {
            return true;
        }
        return false;
    }
//
    private static void makeStep(int x, int y, char sym) {
        Map[x][y] = sym;
    }

//
    private static boolean isValid(int x, int y) {
    return x >= 0
            && x < SIZE
            && y >= 0
            && y < SIZE
            && Map[x][y] == DEFAULT;
}

//
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        game(in);




    }
}
