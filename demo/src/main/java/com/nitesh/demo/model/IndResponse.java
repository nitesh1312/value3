package com.nitesh.demo.model;

import com.google.gson.annotations.SerializedName;

public class IndResponse {

    @SerializedName("indicator")
    private IndicatorGs indicator;

    @SerializedName("date")
    private String date;

    @SerializedName("country")
    private CountryGs country;

    @SerializedName("unit")
    private String unit;

    @SerializedName("countryiso3code")
    private String countryiso3code;

    @SerializedName("scale")
    private String scale;

    @SerializedName("decimal")
    private int decimal;

    @SerializedName("value")
    private int value;

    @SerializedName("obs_status")
    private String obsStatus;

    public IndicatorGs getIndicator() {
        return indicator;
    }

    public void setIndicator(IndicatorGs indicator) {
        this.indicator = indicator;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public CountryGs getCountry() {
        return country;
    }

    public void setCountry(CountryGs country) {
        this.country = country;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getCountryiso3code() {
        return countryiso3code;
    }

    public void setCountryiso3code(String countryiso3code) {
        this.countryiso3code = countryiso3code;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public int getDecimal() {
        return decimal;
    }

    public void setDecimal(int decimal) {
        this.decimal = decimal;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getObsStatus() {
        return obsStatus;
    }

    public void setObsStatus(String obsStatus) {
        this.obsStatus = obsStatus;
    }

    @Override
    public String toString() {
        return
                "IndResponse{" +
                        "indicator = '" + indicator + '\'' +
                        ",date = '" + date + '\'' +
                        ",country = '" + country + '\'' +
                        ",unit = '" + unit + '\'' +
                        ",countryiso3code = '" + countryiso3code + '\'' +
                        ",scale = '" + scale + '\'' +
                        ",decimal = '" + decimal + '\'' +
                        ",value = '" + value + '\'' +
                        ",obs_status = '" + obsStatus + '\'' +
                        "}";
    }
}