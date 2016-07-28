package com.company.my.tasks.implementation;

import com.company.my.tasks.interfaces.Server;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by Anna_Arkhipova on 7/27/2016.
 */
public class TimeData implements Server {

    String timeShift;

    public TimeData(String timeShift){
        this.timeShift = timeShift;
    }

    @Override
    public String generateData() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT" + timeShift));
        Date date = new Date();
        // System.out.println(dateFormat.format(date));
        return dateFormat.format(date);
    }
}
