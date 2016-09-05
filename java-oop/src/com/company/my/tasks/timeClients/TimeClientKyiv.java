package com.company.my.tasks.timeClients;

import com.company.my.tasks.implementation.TimeData;
import com.company.my.tasks.interfaces.Listener;

/**
 * Created by Anna_Arkhipova on 7/27/2016.
 */
public class TimeClientKyiv implements Listener {
    @Override
    public String callServer() {
        TimeData td = new TimeData("+3"); // time shift for Kyiv
        return "\n Kyiv time:" + "\n" + td.generateData();
    }
}
