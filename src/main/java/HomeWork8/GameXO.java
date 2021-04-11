package HomeWork8;

import javax.swing.*;
import java.awt.*;

public class GameXO extends JFrame {

    private static final ImageIcon DEFAULT = new ImageIcon("3.png");
    private static final ImageIcon ICON_X = new ImageIcon("1.jpg");
    private static final ImageIcon ICON_0 = new ImageIcon("2.jpg");

    private JButton[][] map;

    public GameXO() throws HeadlessException {
        setSize(450, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        setResizable(false);
        JPanel panel = new JPanel(new GridLayout(3, 3));

        map = new JButton[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                map[i][j] = new JButton();
                map[i][j].setIcon(DEFAULT);
                JButton cur = map[i][j];
                panel.add(cur);
                cur.addActionListener(a -> {
                    cur.setDisabledIcon(ICON_X);
                    cur.setIcon(ICON_X);
                    cur.setEnabled(false);

                    // проверка победы
                    check();

                    movePC();

                    // проверка победы
                    check();
                });
            }
        }

        add(panel);
        setVisible(true);
    }

    public void check() {
        String message = "";
        String win = "Вы выиграли. Начать новую игру?";
        String lose = "Вы проиграли. Начать новую игру?";

        // Проверить главную диагональ
        if (map[0][0].getIcon() == map[1][1].getIcon() &&
                map[1][1].getIcon() == map[2][2].getIcon() &&
                map[2][2].getIcon() != DEFAULT
        ) {
            if (map[0][0].getIcon() == ICON_X) {
                message = win;
            } else {
                message = lose;
            }
        }
        // Проверить побочную диагональ
        if (map[2][0].getIcon() == map[1][1].getIcon() &&
                map[1][1].getIcon() == map[0][2].getIcon() &&
                map[2][0].getIcon() != DEFAULT
        ) {
            if (map[2][0].getIcon() == ICON_X) {
                message = win;
            } else {
                message = lose;
            }
        }
        // Проверить горизонтали
        for (int i = 0; i < 3; i ++) {
            if (map[i][0].getIcon() == map[i][1].getIcon() &&
                    map[i][1].getIcon() == map[i][2].getIcon() &&
                    map[i][2].getIcon() != DEFAULT
            ) {
                if (map[i][0].getIcon() == ICON_X) {
                    message = win;
                } else {
                    message = lose;
                }
            }
        }
        // Проверить вертикали
        for (int j = 0; j < 3; j ++) {
            if (map[0][j].getIcon() == map[1][j].getIcon() &&
                    map[1][j].getIcon() == map[2][j].getIcon() &&
                    map[2][j].getIcon() != DEFAULT
            ) {
                if (map[0][j].getIcon() == ICON_X) {
                    message = win;
                } else {
                    message = lose;
                }
            }
        }

        if (message != "") {
            int message_result = JOptionPane.showConfirmDialog(
                    GameXO.this,
                    message,
                    "Конец игры",
                    JOptionPane.YES_NO_OPTION);
            if (message_result == JOptionPane.NO_OPTION) {
                System.exit(0);
            } else {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        map[i][j].setIcon(DEFAULT);
                        map[i][j].setEnabled(true);
                    }
                }
            }
        }

    }

    private void movePC () {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[i][j].getIcon().equals(DEFAULT)) {
                    map[i][j].setDisabledIcon(ICON_0);
                    map[i][j].setIcon(ICON_0);
                    map[i][j].setEnabled(false);
                    return;
                }
            }
        }
    }

    public static void main (String[]args){
        new GameXO();
    }
}

