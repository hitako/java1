package lesson_2;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        //Первое задание
        //1.

        System.out.println(Arrays.toString(
                inverseArray(new int[] {0, 1, 1, 0, 0 , 0, 1})
        ));

        //Второе задание
        //2.
        fillArray();

        //Третье задание
        //3.
        task3();

        //Четвертое задание
        //4.
        int [][] array4 = { {2, 2, 2}, {3, 3, 3}, {4, 4, 4} };

        int [][] newArray5 = task4(array4);

        for (int i = 0; i < array4.length; i++) {
            System.out.println(Arrays.toString(newArray5[i]));
        }

        //Пятое задание
        //5.

        task5(new int[] {1, 2, 0, 5, 7, 11, 2});

        //Шестое задание
        //6.
        System.out.println(checkBalance(new int[] {1, 1, 1, 4, 7, 14}));

        //Седьмое задание
        //7.
        task7(new int[] {1, 3, 5, 8, 7}, 2);
    }


    private static int[] inverseArray(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0 ? 1 : 0);
        }

        return arr;
    }

    private static void fillArray() {
        int[] array = new int[8];

        for(int i = 0; i < array.length; i++) {
            array[i] = i * 3;
        }

        System.out.println(Arrays.toString(array));
    }

    private static void task3() {
        int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 6) {
                arr[i] *= 2;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    private static int[][] task4(int[][] arr) {

        for(int i = 0; i < arr.length; i++) {
            for(int k = 0; k < arr[i].length; k++) {
                if(i == k || (k == arr.length - i - 1) ) {
                    arr[i][k] = 1;
                }
            }
        }

        return arr;
    }

    private static void task5(int[] arr) {
        var arrMin = arr[0];
        var arrMax = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < arrMin) {
                arrMin = arr[i];
            }

            if(arr[i] > arrMax) {
                arrMax = arr[i];
            }
        }

        System.out.println("Минимальный элемент массива = " + arrMin);
        System.out.println("Максимальынй элемент массива = " + arrMax);
    }

    private static boolean checkBalance(int[] arr) {
        int leftSumm = 0, rightSumm;
        boolean breakFlag;

        rightSumm = arraySum(arr);

        breakFlag = arr[0] > rightSumm - arr[0];

        for(int i = 0; i < arr.length; i++) {
            leftSumm += arr[i];
            rightSumm -= arr[i];

            if(leftSumm == rightSumm)
                return true;

            if(leftSumm > rightSumm != breakFlag)
                break;
        }

        return false;
    }

    private static int arraySum(int[] arr) {
        int arrSumm = 0;
        for(int i = 0; i < arr.length; i++) {
            arrSumm += arr[i];
        }
        return arrSumm;
    }

    public static void task7(int[] arr, int n) {

        int k, l, m = 0;

        if(n < 0) n = arr.length + n;

        if(n != 0 && n != arr.length) {

            n = n > arr.length ? n - arr.length : n;

            l = arr[0];

            k = n;

            for (int i = 0; i < arr.length; i++) {

                if(arr.length % 2 == 0 && k  == arr.length) {
                    k += 1;
                }

                if(k >= arr.length)
                    k -= arr.length;

                //System.out.println(k);

                    if(i % 2 == 0) {
                        m = arr[k];
                        arr[k] = l;
                    } else {
                        l = arr[k];
                        arr[k] = m;
                    }

                k += n;
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
