package com.company.my.tasks.displays;

import com.company.my.tasks.implementation.WeatherData;
import com.company.my.tasks.interfaces.Listener;

/**
 * Created by Anna_Arkhipova on 7/28/2016.
 */
public class WeatherStatistics implements Listener{
    @Override
    public String callServer() {

        WeatherData ws = new WeatherData();
        return "\n Weather Statistics:" +"\n" + ws.generateData();
    }
}
