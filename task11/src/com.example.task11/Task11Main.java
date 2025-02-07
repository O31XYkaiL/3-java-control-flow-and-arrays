package com.example.task11;

import java.util.Arrays;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void swap(int[] arr) {
        if (arr == null) {
            return;
        } else if (arr.length == 0) {
            System.out.println(Arrays.toString(arr));
        } else {
            int min = arr[0];
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    index = i;
                }
            }
            int a = arr[0];
            arr[0] = min;
            arr[index] = a;
            System.out.println(Arrays.toString(arr));
        }
    }

}