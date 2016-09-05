package com.company.my.tasks.displays;

import com.company.my.tasks.implementation.WeatherData;
import com.company.my.tasks.interfaces.Listener;

/**
 * Created by Anna_Arkhipova on 7/28/2016.
 */
public class WeatherForecast implements Listener{
    @Override
    public String callServer() {

        WeatherData wf = new WeatherData();
        return "\n Weather Forecast:" + "\n" + wf.generateData();
    }
}
