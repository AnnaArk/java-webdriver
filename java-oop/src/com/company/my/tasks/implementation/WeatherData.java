package com.company.my.tasks.implementation;

import com.company.my.tasks.interfaces.Server;

/**
 * Created by Anna_Arkhipova on 7/27/2016.
 */
public class WeatherData implements Server {
    @Override
    public String generateData() {
        String weatherInfo;

//Generating random values for weather conditions in String format
        String precipitation = Double.toString(Math.rint(((Math.random()*100)*100)/100)); //rounding genarated random double
        String humidity = Double.toString(Math.rint((Math.random()*100)*100)/100);
        String wind = Double.toString(Math.rint((Math.random()*20)*100)/100);

        weatherInfo = "Precipitation:" + precipitation +"%" + "\n Humidity:" + humidity +"%" + "\n Wind:" + wind + "km/s";

        return weatherInfo;
    }
}
