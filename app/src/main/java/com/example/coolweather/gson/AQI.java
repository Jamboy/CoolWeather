package com.example.coolweather.gson;

/**
 * @Description:
 * @author: Kivia
 * @date: 2020年11月17日 23:28
 * @Modify 2020年11月17日 23:28
 * @Modified by:
 * @Modified remark:
 */
public class AQI {
    public  AQICity city;

    private class AQICity {
        public String aqi;
        public String pm25;
    }
}
