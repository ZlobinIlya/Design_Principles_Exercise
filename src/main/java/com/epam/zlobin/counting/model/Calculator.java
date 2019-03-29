package com.epam.zlobin.counting.model;

/**
 * The class that implements the logic of the calculator
 *
 * @version 1.0
 * @autor Zlobin Ilya
 */

public class Calculator implements Calculatable {

    private int[] numbers;
    private int lowLimit;
    private int hiLimit;
    private int amount;

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public int getlowLimit() {
        return lowLimit;
    }

    @Override
    public int gethiLimit() {
        return hiLimit;
    }

    @Override
    public int[] getNumber() {
        return numbers;
    }


    private void validate(int lowLimit, int hiLimit, int[] args) {
        if (!((args != null && hiLimit > 1) || (lowLimit != hiLimit))) {
            throw new IllegalArgumentException("Wrong arguments!");
        }
    }

    @Override
    /**
     * Executes the main business logic;
     *
     * @param int lowLimit -bottom line of search
     * @param int hiLimit - top line search
     * @param 'int[] args' elements
     */
    public void calc(int lowLimit, int hiLimit, int[] args)
            throws IllegalArgumentException, ArithmeticException {
        validate(lowLimit, hiLimit, args);
        this.lowLimit = lowLimit;
        this.hiLimit = hiLimit;
        this.numbers = args;

        count();
        if (isAverageGreaterAmount()) {
            resetNumbers();
        }

    }

    private void count() {
        for (int i : numbers) {
            if (isInRange(i)) {
                amount++;
            }
        }
    }

    private double getArithmeticAverage() {
        int overlap = 0;
        double sum = 0;
        for (int i : numbers) {
            if (isInRange(i)) {
                sum += i;
                overlap++;
            }
        }
        if (overlap == 0) {
            throw new ArithmeticException("Division by zero!!!");
        }
        return sum / overlap;

    }

    private void resetNumbers() {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                numbers[i] = 0;
            }
        }
    }

    private boolean isInRange(int i) {
        return (i >= lowLimit) && (i <= hiLimit);
    }

    private boolean isAverageGreaterAmount() {
        return amount < getArithmeticAverage();
    }
}