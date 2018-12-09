package lesson_3;

import java.util.Random;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        //task1();
        task2();
    }

    private static void task2() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        StringBuilder showWord;
        String userWord;
        String secretWord = words[words.length - 1 - new Random().nextInt(words.length)];
        Scanner scan = new Scanner(System.in);

        for(;;) {
            System.out.println("Введите загаданное компьютером слово:");
            userWord = scan.next();
            showWord = new StringBuilder();

            if(userWord.equals(secretWord)) {
                System.out.println("Вы угадали слово! Это - " + userWord);
                break;
            }
            else {
                for(int i = 0; i < (userWord.length() < secretWord.length() ? userWord.length() : secretWord.length()); i++) {
                    showWord = new StringBuilder((userWord.charAt(i) == secretWord.charAt(i) ? showWord.toString() + userWord.charAt(i) : showWord + "#"));
                }

                int curLength = showWord.length();

                for(int i = 15; i > curLength; i--) {
                    showWord.append("#");
                }

                System.out.println("Вы не угадали слово, но вот подсказка:");
                System.out.println(showWord);
            }
        }
    }

    private static void task1() {
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
        int secretNum = rnd.nextInt(10);
        int userNum, menu, n = 3;

        for(; n > 0; n--) {
            for (; ; ) {
                System.out.println("Угадайте секретное число от 0 до 9:");
                userNum = scan.nextInt();
                if (userNum >= 0 && userNum <= 9) break;

                System.out.println("Необходимо ввести число от 0 до 9!");
            }

            if (secretNum == userNum) {
                System.out.println("Вы выиграли!");
                break;
            }

            if (userNum > secretNum) {
                System.out.println("Введенное число больше секретного.");
            } else {
                System.out.println("Введенное число меньше секретного.");
            }
        }

        if(n == 0) {
            System.out.println("Вы проиграли! :(");
        }

        for(;;) {
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет:");
            menu = scan.nextInt();
            if(menu == 0 || menu == 1) {
                if(menu == 1) {
                    task1();
                }
                break;
            }

            System.out.println("Необходимо ввести 0 или 1!");
        }
    }
}
