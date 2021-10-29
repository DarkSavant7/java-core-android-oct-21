package ru.geekbrains.jca.lessons.l2_base_expressions;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertBinaryArray(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(fillArrayWithStep(8, 3)));
        int[] arr1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        workWithSix(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println(findMin(1, 234, 2435, 1, -87, -54));
        System.out.println(Arrays.toString(fillArrayRandom(10)));

        System.out.println(checkBalance(new int[]{1, 2, 3, 4, 4, 3, 2, 1}));
        System.out.println(checkBalance(new int[]{-1, 2, -3, 4, 4, 3, -2, 1}));

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        shiftArray(arr2, -16);
        System.out.println(Arrays.toString(arr));

        System.out.println(findMax(123, 2141, 545, 6767, 78, 78, 9));
        int[] arrr = {123, 2141, 545, 6767, 78, 78, 9};
        System.out.println(findMax(arrr));
    }

    //Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    //С помощью цикла и условия заменить 0 на 1, 1 на 0;
    static void invertBinaryArray(int[] arr) {
        if (arr == null) return;
        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 1) arr[i] = 0;
//            else arr[i] = 1;
//            arr[i] = arr[i] == 1 ? 0 : 1;
//            arr[i] = (arr[i] + 1) % 2;
//            arr[i] = (arr[i] - 1) * -1;
            arr[i] ^= 1;  // 1 ^ 1 = 0; 1 ^ 0 = 1;
        }
    }

    //Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

    static int[] fillArrayWithStep(int size, int step) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * step;
        }
        return arr;
    }

    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    static void workWithSix(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2; //arr[i] = arr[i] * 2
        }
    }

    //** Задать одномерный массив c целыми числами и найти в нем минимальный и максимальный элементы (без помощи интернета);
    static int findMin(int... arr) {
        int min = arr[0]; //Integer.MAX_VALUE
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
        }
        return min;
    }

    static int findMax(int... arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
        }
        return max;
    }

    static void shiftArray(int[] arr, int n) {
        int shift = (arr.length + n % arr.length) % arr.length;

        for (int i = 0; i < shift; i++) {
            int temp = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
    }

    static boolean checkBalance(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 2 != 0) return false;

        sum /= 2;
        int half = 0;

        for (int i = 0; i < arr.length; i++) {
            half += arr[i];
            if (half == sum) return true;
        }
        return false;
    }

    static void print2dArray(int[][] arr) {
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                System.out.print(arr[y][x] + "  ");
            }
            System.out.println();
        }
//        String
    }

    static int[] fillArrayRandom(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 2000 - 1000);
        }
        return arr;
    }
}
