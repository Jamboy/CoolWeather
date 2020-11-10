package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * @Description:
 * @author: Kivia
 * @date: 2020年11月10日 10:00
 * @Modify 2020年11月10日 10:00
 * @Modified by:
 * @Modified remark:
 */
public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
