package com.epam.zlobin.view;

import com.epam.zlobin.model.Calculatable;

public class Report implements Reportable {
    public Calculatable calculatable;
    private static final String AMOUNT =
            " Amount of element belonging to a range from  %d to %d  = %d%n ";
    private static final String NOT_AMOUNT =
            "Array hasn't elements belonging to a given range";
    private static final String ARREY_AFTER_TRANSFORM =
            "Array after transformations: \n";


    public Report() {
    }

    public Report(Calculatable calculatable) {
        this.calculatable = calculatable;
    }

    @Override
    //TODO
    public void sendReport() {

        System.out.println("Origin Array:");
        System.out.println(calculatable.toString());
    }


    @Override
    public void sendCalculatorReport() {

        System.out.format(AMOUNT, calculatable.getlowLimit(),
                calculatable.gethiLimit(), calculatable.getResault());
        System.out.print(ARREY_AFTER_TRANSFORM + calculatable.toString());
    }
    //TODO(форматеры!!!)

    @Override
    public void sendDefaultReport() {
        System.out.println(NOT_AMOUNT);
    }

    @Override
    //TODO
    public void sendErrorReport(Exception e) {
        System.out.println("ERROR!!!" + e);
    }
}
