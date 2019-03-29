package com.epam.zlobin.counting.view;

import com.epam.zlobin.counting.model.Calculatable;

import java.util.Arrays;

/**
 * The class responsible for the output to the console
 *
 * @version 1.0
 * @autor Zlobin Ilya
 */
public class ConsoleOutput implements Output {

    private static final String AMOUNT =
            "Amount of element belonging to a range from  %d to %d  = %d%n ";
    private static final String NOT_AMOUNT =
            "Array hasn't elements belonging to a given range";
    private static final String ARREY_AFTER_TRANSFORM =
            "Array after transformations:";
    private static final String STATE = " Origin Array:";
    private static final String RANGE = " Value range from  %d to %d%n ";
    private Calculatable calculator;

    @Override
    public void setCalculator(Calculatable calculator) {
        this.calculator = calculator;
    }

    /**
     * This method displays information about exceptions and errors;
     *
     * @param e - exeption
     */
    @Override
    public void printError(Exception e) {
        System.out.println(e);
    }

    /**
     * This method displays the input data;
     */
    @Override
    public void printInputDate() {
        System.out.println(STATE);
        System.out.println(Arrays.toString(calculator.getNumber()));
        System.out.format(RANGE,
                calculator.getlowLimit(),
                calculator.gethiLimit());

    }

    /**
     * This method displays the result of the calculator;
     */
    @Override
    public void printResult() {
        System.out.format(AMOUNT,
                calculator.getlowLimit(),
                calculator.gethiLimit(),
                calculator.getAmount());
        System.out.println(ARREY_AFTER_TRANSFORM);
        System.out.println(Arrays.toString(calculator.getNumber()));

    }

    /**
     * This method displays the default value;
     */
    @Override
    public void printDefault() {
        System.out.println(NOT_AMOUNT);
    }

}
