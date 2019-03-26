package com.epam.zlobin.model;

import java.util.Arrays;

/**
 * The class that implements the logic of the calculator
 *
 * @param 'hiLimit'  top limit
 * @param 'int[]     args' elements
 * @param 'lowLimit' low limit
 * @version 1.0
 * @autor Zlobin Ilya
 */

public class Calculator implements Calculatable {

    private int[] numbers;
    private int lowLimit = 0;
    private int hiLimit = 0;
    private int amount = 0;


    public Calculator(int lowLimit, int hiLimit, int[] args) {
        if (lowLimit == 0 && lowLimit == hiLimit) {
            throw new IllegalArgumentException();
        }
        this.lowLimit = lowLimit;
        this.hiLimit = hiLimit;
        numbers = new int[args.length];
        numbers = args;
    }

    public void calc() {
        //TODO
        int amount = getNumberOfCoincidences();
    }

    @Override
    public int getResault() {
        return amount;
    }

    private int getNumberOfCoincidences() {
        int sum = 0;
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            if ((numbers[i] >= lowLimit) && (numbers[i] <= hiLimit)) {
                amount++;
                sum += numbers[i];
            }
        }
        if ((amount != 0) && (sum / amount > amount)) {
            setZeroForPositiveNumbers();
        }
        return amount;
    }

    private void setZeroForPositiveNumbers() {
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            if (numbers[i] > 0) {
                numbers[i] = 0;
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(numbers);
    }

    @Override
    public int getlowLimit() {
        return lowLimit;
    }

    @Override
    public int gethiLimit() {
        return hiLimit;
    }

}