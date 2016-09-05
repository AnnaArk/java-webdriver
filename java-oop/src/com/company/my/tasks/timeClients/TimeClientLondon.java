package com.company.my.tasks.timeClients;

import com.company.my.tasks.implementation.TimeData;
import com.company.my.tasks.interfaces.Listener;

/**
 * Created by Anna_Arkhipova on 7/27/2016.
 */
public class TimeClientLondon implements Listener {
    @Override
    public String callServer() {
        TimeData td = new TimeData("+1"); // time shift for London
        return "\n London time:" + "\n" + td.generateData();
    }
}
