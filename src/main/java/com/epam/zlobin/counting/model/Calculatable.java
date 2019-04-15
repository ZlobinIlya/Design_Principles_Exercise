package com.epam.zlobin.counting.model;

public interface Calculatable {

    public void calc(int lowLimit, int hiLimit, int[] args) throws IllegalArgumentException;

    public int getAmount();

    public int getlowLimit();

    public int gethiLimit();

    public int [] getNumber();
}
