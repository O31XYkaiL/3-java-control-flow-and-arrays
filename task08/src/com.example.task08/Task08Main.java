package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = new int[2];
        arr[0] = 2;
        arr[1] = 3;
        System.out.println(mult(arr));
         */
    }

    static long mult(int[] arr) {
        long sum = 0;
        if (arr.length == 0) {
            return sum;
        } else {
            sum = arr[0];
            for (int i = 1; i < arr.length; i++) {
                sum *= arr[i];
            }
        }
        return sum;
    }

}