package tasks;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Есть девятиэтажный дом, в котором 4 подъезда. Номер подъезда
 начинается с единицы. На одном этаже 4 квартиры. Напишите программу
 которая получит номер квартиры с клавиатуры, и выведет на экран на
 каком этаже, какого подъезда расположенна эта квартира. Если такой
 квартиры нет в этом доме то нужно сообщить об этом пользователю.
 */
public class Home {

    public static void main(String[] args) {
        System.out.println("Введите номер квартиры:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int c[] = new int[4];
        int z = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 4; k++) {
                    c[i] = z++;
                    if(c[i]==number){
                        System.out.println("Данная квартира находится на " + (j+1)+ " этаже подъезда № " + (i+1));
                    }
                }
            }
        }
    }
}




