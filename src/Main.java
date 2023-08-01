import jdk.jshell.Snippet;

import java.time.chrono.MinguoDate;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int[] weights = new int[3]; // Задание 1
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;

        double[] distance = {1.57, 7.654, 9.986, 0, 0, 0, 0, 0, 0, 0, 0, 0}; // Задание 2

        int[] another = {12, 36, 65, 40}; // Задание 3
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;

        for (int index = 0; index < weights.length; index++) {
            if (index == weights.length - 1) {
                System.out.println(weights[index]);
                break;
            }
            System.out.print(weights[index] + ", ");
        }
        double[] distance = {1.57, 7.654, 9.986, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int index = 0; index < distance.length; index++) {
            if (index == weights.length - 1) {
                System.out.print(distance[index]);
                break;
            }
            System.out.print(distance[index] + ", ");
        }
        System.out.println();

        int[] another = {12, 36, 65, 40};
        for (int index = 0; index < another.length; index++) {
            if (index == another.length - 1) {
                System.out.print(another[index]);
                break;
            }
            System.out.print(another[index] + ", ");
        }
        System.out.println();


    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        for (int index = 2; index < weights.length; index = index - 1) {
            if (index == weights[0] - 1) {
                System.out.print(weights[index]);
                break;
            }
            System.out.print(weights[index] + ", ");
        }
        System.out.println();
        double[] distance = {1.57, 7.654, 9.986, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 11; i < distance.length && i >= 0; i = i - 1) {
            if (i == distance[11]) {
                System.out.print(distance[i]);
                break;
            }
            System.out.print(distance[i] + " , ");
        }
        System.out.println();
        int[] another = new int[4];
        another[0] = 2;
        another[1] = 314;
        another[2] = 4;
        another[3] = 562;
        for (int i = 3; i < another.length; i = i - 1) {
            if (i == another.length - 4) {
                System.out.println(another[i]);
                break;
            }
            System.out.print(another[i] + ", ");
        }
    }
        public static void task4 () {
            System.out.println("Задача 4");
            int[] weights = new int[3];
            weights[0] = 1;
            weights[1] = 2;
            weights[2] = 3;
            for (int i = 0; i < weights.length; i++) {
                if (weights[i] % 2 != 0) {
                    weights[i] += 1;
                }
            }
                System.out.println(Arrays.toString(weights));
            }
        }















