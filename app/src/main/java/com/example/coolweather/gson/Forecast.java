package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @Description:
 * @author: Kivia
 * @date: 2020年11月17日 23:36
 * @Modify 2020年11月17日 23:36
 * @Modified by:
 * @Modified remark:
 */
public class Forecast {
    public String date;
    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt_d")
        public String info;
    }

    @SerializedName("tmp")
    public Temperature temperature;

    public class Temperature{
        public String max;
        public String min;
    }
}
