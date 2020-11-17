package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @Description:
 * @author: Kivia
 * @date: 2020年11月17日 23:32
 * @Modify 2020年11月17日 23:32
 * @Modified by:
 * @Modified remark:
 */
public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;

    @SerializedName("sport")
    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
