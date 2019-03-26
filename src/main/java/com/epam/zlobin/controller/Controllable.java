package com.epam.zlobin.controller;

import com.epam.zlobin.model.Calculatable;
import com.epam.zlobin.view.Reportable;

public interface Controllable {
    public void run(Calculatable calculatable, Reportable reportable);
}
