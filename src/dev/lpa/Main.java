package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        sortArray();
    }

    public static void sortArray() {
        Random random = new Random();
        int[] newArray = new int[10];

        for(int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(newArray));

        boolean test = true;
        while(test) {
            test = false;

            for(int i = 0; i < (newArray.length - 1); i++) {
                if(newArray[i] < newArray[i + 1]) {
                    int temp = newArray[i];
                    newArray[i] = newArray[i + 1];
                    newArray[i + 1] = temp;
                    test = true;
                }
            }
        }

        System.out.println(Arrays.toString(newArray));
    }
}
