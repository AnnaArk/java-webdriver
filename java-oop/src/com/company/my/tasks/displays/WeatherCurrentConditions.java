package com.company.my.tasks.displays;

import com.company.my.tasks.implementation.WeatherData;
import com.company.my.tasks.interfaces.Listener;

/**
 * Created by Anna_Arkhipova on 7/27/2016.
 */
public class WeatherCurrentConditions implements Listener {
    @Override
    public String callServer() {

        WeatherData wd = new WeatherData();

        return "\n Current weather conditions:" + "\n" + wd.generateData();
    }
}
