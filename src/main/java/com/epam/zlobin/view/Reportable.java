package com.epam.zlobin.view;

public interface Reportable {

    public void sendReport();

    public void sendCalculatorReport();

    public void sendDefaultReport();

    public void sendErrorReport(Exception e);
}
