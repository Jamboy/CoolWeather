package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @Description:
 * @author: Kivia
 * @date: 2020年11月17日 23:18
 * @Modify 2020年11月17日 23:18
 * @Modified by:
 * @Modified remark:
 */
public class Basic {
    @SerializedName("city")
    public String  cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
