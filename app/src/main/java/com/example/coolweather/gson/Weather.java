package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Description:
 * @author: Kivia
 * @date: 2020年11月17日 23:40
 * @Modify 2020年11月17日 23:40
 * @Modified by:
 * @Modified remark:
 */
public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
