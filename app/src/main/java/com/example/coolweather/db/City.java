package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * @Description:
 * @author: Kivia
 * @date: 2020年11月10日 10:03
 * @Modify 2020年11月10日 10:03
 * @Modified by:
 * @Modified remark:
 */
public class City extends DataSupport {
    private String cityName;
    private int id;
    private int cityCode;
    private int provinceCode;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
