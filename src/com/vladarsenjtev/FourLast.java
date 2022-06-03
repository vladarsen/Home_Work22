package com.vladarsenjtev;

import java.util.ArrayList;
import java.util.List;

public final class FourLast {

    public FourLast() {
    }

    public static int[] arraysFourLast(int[] arr) {
        List<Integer> saveFour = new ArrayList<>();
        int count = 0;
        for (int k : arr) {
            if (k == 4) {
                count++;
            }
        }

        if (count == 0) {
            throw new RuntimeException("В массиве нет числа 4");
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 4) {
                for (int j = i + 1; j < arr.length; j++) {
                    saveFour.add(arr[j]);
                }
                break;
            }
        }
        if (saveFour.size() == 0) {
            throw new RuntimeException("Число 4 последнее в массиве");
        }
        int[] arrOne = new int[saveFour.size()];
        for (int i = 0; i < arrOne.length; i++) {
            arrOne[i] = saveFour.get(i);
        }
        return arrOne;
    }

    public static boolean arraysOneFour(int[] arr) {
        int countOne = 0;
        int countFour = 0;

        for (int j : arr) {
            if (j == 4) {
                countFour++;
            }
        }
        for (int k : arr) {
            if (k == 1) {
                countOne++;
            }
        }
        return countFour != 0 && countOne != 0;
    }
}