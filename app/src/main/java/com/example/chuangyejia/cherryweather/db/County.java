package com.example.chuangyejia.cherryweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by chuangyejia on 17/3/22.
 */

public class County extends DataSupport {

    private int id;
    private String coountyName;
    private String weatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoountyName() {
        return coountyName;
    }

    public void setCoountyName(String coountyName) {
        this.coountyName = coountyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
