package com.epam.zlobin.counting;

import com.epam.zlobin.counting.model.Calculatable;
import com.epam.zlobin.counting.model.Calculator;
import com.epam.zlobin.counting.view.ConsoleOutput;
import com.epam.zlobin.counting.view.Output;

/**
 * Main class Count
 * Подсчитать количество элементов, значения которых лежат в диапазоне от
 * lowLimit до hiLimit. Если среднее арифметическое значений элементов, которые
 * лежат в этом диапазоне, превышает количество таких элементов, то обнулить
 * элементы с положительными значениями.
 *
 * @version 1.0
 * @autor Zlobin Ilya
 */
public class Count {
    //TODO

    private static final int LOW_LIMIT = 1;
    private static final int HEIGHT_LIMIT = 12;
    private static final int[] VALUE = {-50, 0, 3, 1, -8, 10, 25};

    public static void main(String[] args) {
        Count count = new Count();
        count.run();
    }

    private void run() {
        Output consoleOutput = new ConsoleOutput();
        Calculatable calculator = new Calculator();
        try {
            calculator.calc(LOW_LIMIT, HEIGHT_LIMIT, VALUE);
            consoleOutput.setCalculator(calculator);
            consoleOutput.printInputDate();
            if (calculator.getAmount() != 0) {
                consoleOutput.printResult();
            } else {
                consoleOutput.printDefault();
            }
        } catch (IllegalArgumentException | ArithmeticException e) {
            consoleOutput.printError(e);
        }


    }
}
