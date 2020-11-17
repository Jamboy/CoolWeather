package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @Description:
 * @author: Kivia
 * @date: 2020年11月17日 23:30
 * @Modify 2020年11月17日 23:30
 * @Modified by:
 * @Modified remark:
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
