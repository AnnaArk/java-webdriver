package com.company.my.tasks.processors;

import com.company.my.tasks.displays.WeatherCurrentConditions;
import com.company.my.tasks.displays.WeatherForecast;
import com.company.my.tasks.displays.WeatherStatistics;
import com.company.my.tasks.interfaces.Listener;
import com.company.my.tasks.interfaces.Server;
import com.company.my.tasks.timeClients.TimeClientKyiv;
import com.company.my.tasks.timeClients.TimeClientLondon;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here


        System.out.println(new TimeClientKyiv().callServer());

        System.out.println(new TimeClientLondon ().callServer());

        
        System.out.println(new WeatherCurrentConditions().callServer());

        System.out.println(new WeatherForecast().callServer());

        System.out.println(new WeatherStatistics().callServer());
    }
}