package tasks;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
 Написать программу которая считает 4 числа c клавиатуры и выведет на
 экран самое большое из них.
 */
public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ch[] = new int[4];
        System.out.println("Введите четыре числа:");
        for (int i = 0; i < ch.length; i++) {

            try {
                ch[i] = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Вы ввели не число!!!");
                System.out.println("Введите число!!!");
                i--;
                sc.nextLine();
            }
        }


        int max = ch[0];
        for (int j = 0; j < ch.length; j++) {
            if (ch[j] > max) {
                max = ch[j];
            }
        }

        System.out.println(max);
    }
}


