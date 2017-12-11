package ASD;

import java.util.Arrays;

public class Main {
    /*Урок 3. Поиск в массиве. Простые сортировки
    1. Попробовать оптимизировать пузырьковую сортировку.
    Сравнить количество операций сравнения оптимизированной
    и не оптимизированной программы. Написать функции сортировки,
    которые возвращают количество операций.*/

    public static void main(String[] args) {
        int [] arr = {9,8,7,6,5,4,3,2,1,0};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
        int [] arr2 = {9,8,7,6,5,4,3,2,1,0};
        BubblePlus(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    public static void Bubble (int[] a){
        int count = 0;
        int temp;
        for (int i = 0; i < a.length; i++) {
            count++;
            for (int j = 0; j < a.length-1; j++) {
                if (a[j] > a[j+1]){
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void BubblePlus (int[] a){
        int count = 0;
        int temp;
        boolean flag = true;
        while (flag){
            flag = false;
            for (int i = 0; i < a.length-1; i++) {
                if (a[i] > a[i+1]){
                    temp = a[i+1];
                    a[i+1] = a[i];
                    a[i] = temp;
                    flag = true;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
