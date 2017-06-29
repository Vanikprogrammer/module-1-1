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
        System.out.println("Введите четыре числа:");
        int [] ch = new int[4];
        for(int i = 0; i < ch.length; i++){
            ch[i] = sc.nextInt();
        }
        Arrays.sort(ch);
        System.out.println(ch[3]);
    }

}
