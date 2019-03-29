package com.epam.zlobin.counting.view;

import com.epam.zlobin.counting.model.Calculatable;

public interface Output {

    public void printInputDate();

    public void printResult();

    public void printDefault();

    public void setCalculator(Calculatable calculator);

    public void printError(Exception e);

}
