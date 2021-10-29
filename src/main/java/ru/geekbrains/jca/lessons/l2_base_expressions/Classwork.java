package ru.geekbrains.jca.lessons.l2_base_expressions;

import java.util.Arrays;

public class Classwork {
    public static void main(String[] args) {
//        vendingIf();
//        vendingSwitch();
//        vendingSwitchNew();
//        whilePre();
//        whilePost();
//        simpleForExample();
//        simpleArr();
//        foreachExample();
//        stringArr();

//        int[][] arr = new int[3][3];
        int[][] arr = new int[3][];
        arr[0] = new int[10];
        arr[1] = new int[2];
        arr[2] = new int[5];

        arr[1][1] = 5;

//        int[][] array = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9},
//        };

        int[][] array = {
                {1, 2, 3, 6, 7, 8, 9, 34, 234, 43, 6},
                {4, 5, 6},
                {7, 8, 9, 3, 4, 5, 6, 4, 4, 6},
        };

//        System.out.println(array);
        print2dArray(array);
    }

    public static void print2dArray(int[][] arr) {
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                System.out.print(arr[y][x] + " ");
            }
            System.out.println();
        }
    }

    private static void stringArr() {
        String[] strings = {
                "January",
                "February",
                "March",
                "April"
        };

        for (String string : strings) {
            System.out.println(string);
        }

        System.out.println(Arrays.toString(strings));
    }

    private static void foreachExample() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i : arr) {
//            System.out.println(i);
            i *= 3;
        }

        printArray(arr);
    }

    private static void simpleArr() {
        int a1 = 10;
        int a2 = 20;
        int a3 = 30;
        int a4 = 40;
        int a5 = 50;

        int arr1[]; //c style - не рекомендуется
        int[] arr;
        arr = new int[5];
        arr[0] = a1;
        arr[1] = a2;
        arr[2] = a3;
        arr[3] = a4;
        arr[4] = a5;

        arr[2] = arr[4] - arr[0] + arr[3];
        System.out.println(arr[2]);


//        int[] arr2 = {}; // new int[0];
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9}; //new int[9] ...
        System.out.println(arr2.length);
        System.out.println(arr2);
        printArray(arr2);
        printArrayReversed(arr2);


        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr2[i] * 3;
        }

        printArray(arr2);
        for (int i = 0; i < arr2.length; i += 3) {
            arr2[i] = arr2[i] / 5;
        }

        printArray(arr2);

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > 15) {
                arr2[i] %= 2;
            }
        }

        printArray(arr2);
    }

    public static void printArrayReversed(int[] arr) {
        System.out.print("[");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]\n");
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]\n");
    }

    private static void simpleForExample() {
        // Инициализация         ;   условие                 ;  Итерация
        for (int i = 0, j = 10, k = 20; i < 10 && j > 0 && k < 100; i++, j--, k *= 1.5) {
            System.out.printf("I = %d, J = %d, K = %d\n", i, j, k);
            /*
             * %d - integers
             * %f - float
             * %b - boolean
             * %c - characters
             * %s - strings (universal)
             */
            System.out.println("I = " + i + ", J = " + j + ", K = " + k);
            String s = String.format("j  == %d\n", j);
        }
    }

    private static void whilePost() {
        int a = 1;
        do {
            System.out.println(a++);
        } while (a > 11);
    }

    private static void whilePre() {
        int a = 1;


//        while (a > 11) {
//        while (a > 0) {
//        while (a < 10 && 2 < 5) {
//        while (true) {
//            System.out.println(a++);
//            if (a == 15) {
//                break;
//            }
//        }

        someLabel:
        //Label что-то вроде goto, лучше не используйте

        while (a <= 10) {
            System.out.print(a++ + ":  ");
            int j = 1;

            while (j < 20) {
                System.out.print(j + " ");
                j *= 2;
                if (j == 4) break someLabel;
            }
            System.out.println();
        }
    }

    public static void vendingSwitchNew() { //Java 14+
        int choice = 2;

        switch (choice) {
            case 1, 20, 40 -> {
                System.out.println("Give Coca-Cola");
                System.out.println();
                //.....
            }
            case 2 -> System.out.println("Give Pepsi");
            case 3 -> System.out.println("Give Snickers");
            case 4 -> System.out.println("Give Mars");
            default -> System.out.println("ERROR wrong number");
        }
    }

    public static void vendingSwitch() {
        int choice = 2;

        switch (choice) {
            case 1, 19, 25:
                System.out.println("Give Coca-Cola");
                break;
            case 2:
                System.out.println("Give Pepsi");
                break;
            case 3:
                System.out.println("Give Snickers");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Give Mars");
                break;
            default:
                System.out.println("ERROR wrong number");
        }
    }

    public static void vendingIf() {
        int choice = 2;

        if (choice == 1) {
            System.out.println("Give Coca-Cola");
        } else if (choice == 2) {
            System.out.println("Give Pepsi");
        } else if (choice == 3) {
            System.out.println("Give Snickers");
        } else if (choice == 4) {
            System.out.println("Give Mars");
        } else {
            System.out.println("ERROR wrong number");
        }
    }
}
