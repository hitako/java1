package lesson_4;

import java.util.Random;
import java.util.Scanner;

public class MainClass {

    static char[][] map;
    static final int mapSize = 5;
    static final char userLable = 'X';
    static final char computerLable = 'O';
    static final char emptyLable = '*';
    static final int chipCount = 4;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        createMap();
        showMap();
        startPlay(scanner, random);
    }

    private static void startPlay(Scanner scanner, Random random) {
        for(;;) {
            playerMove(scanner);
            if(checkWinner(userLable, chipCount)) {
                System.out.println("Поздравляем, Вам удалось одолеть компьютер!");
                break;
            }

            if (mapIsFull()) {
                System.out.println("Ничья!");
                break;
            }

            computerMove(random);
            if(checkWinner(computerLable, chipCount)) {
                System.out.println("Сожалеем, но Вам не удалось одолеть компьютер..");
                break;
            }

            showMap();

            if (mapIsFull()) {
                System.out.println("Ничья!");
                break;
            }
        }

        showMap();
    }

    private static boolean checkWinner(char lable, int chipCount) {
        boolean result = false;
        if(checkLines(lable, chipCount) || checkDiagonals(lable, chipCount)) result = true;
        return result;
    }

    private static boolean checkLeftDiagonal(char lable, int chipCount) {
        int cnt = 0;
        for(int i = 0; i < mapSize; i++) {
            if(mapSize - i + cnt < chipCount) break;
            if(map[i][i] == lable) {
                cnt++;
                if(cnt == chipCount) return true;
            } else cnt = 0;
        }

        return false;
    }

    private static boolean checkDiagonals(char lable, int chipCount) {
        return (checkLeftDiagonal(lable, chipCount) || checkRightDiagonal(lable, chipCount));
    }

    private static boolean checkRightDiagonal(char lable, int chipCount) {
        int cnt = 0;
        for(int i = 0; i < mapSize; i++) {
            cnt = 0;
            for(int j = 0; j < mapSize; j++) {
                if(mapSize - j + cnt < chipCount) break;
                if(map[i][mapSize - j - 1] == lable) {
                    cnt++;
                    if(cnt == chipCount) return true;
                } else cnt = 0;
            }
        }

        return false;
    }

    private static boolean checkLines(char lable, int chipCount) {
        int cnt = 0;
        for(int i = 0; i < mapSize; i++) {
            cnt = 0;
            for(int j = 0; j < mapSize; j++) {
                if(mapSize - j + cnt < chipCount) break;
                if(map[i][j] == lable) {
                    cnt++;
                    if(cnt == chipCount) return true;
                } else cnt = 0;
            }
        }

        return false;
    }

    private static void computerMove(Random random) {
        int bound = 1 + mapSize;
        int x = random.nextInt(bound);
        int y = random.nextInt(bound);

        if(!putLable(computerLable, x, y)) {
            computerMove(random);
        }
    }

    private static void playerMove(Scanner scanner) {
        System.out.println("Введите через пробел координаты Вашего хода: столбец и строку (от 1 до " + mapSize + "):");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if(!putLable(userLable, x, y)) {
            playerMove(scanner);
        }
    }

    private static boolean mapIsFull() {
        boolean result = true;

        for(int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                if(map[i][j] == emptyLable) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    private static boolean putLable(char lable, int x, int y) {
        boolean result = false;
        if(x > 0 && x <= mapSize && y > 0 && y <= mapSize) {
            if(map[y-1][x-1] == emptyLable) {
                map[y-1][x-1] = lable;
                result = true;
            } else if(lable == userLable) System.out.println("В данную координату ранее был совершен ход.");
        } else if(lable == userLable) System.out.println("На поле нет введенной координаты.");

        return result;
    }

    private static void createMap() {
        map = new char [mapSize][mapSize];
        for(int i = 0; i < mapSize; i++) {
            for(int j = 0; j < mapSize; j++) {
                map[i][j] = emptyLable;
            }
        }
    }

    private static void showMap() {
        for(int i = 0; i < mapSize; i++) {
            for(int j = 0; j < mapSize; j++) {
                System.out.printf("%4s", map[i][j]);
            }
            System.out.println();
        }
    }
}
