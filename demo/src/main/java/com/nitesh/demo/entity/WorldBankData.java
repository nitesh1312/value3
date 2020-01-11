package com.nitesh.demo.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "worldbankdata")
public class WorldBankData {

    @EmbeddedId
    WorldBankDataID worldBankDataID;
   /* @Id
    @Column(name="country_id")
    private String countryId;*/

    @Column(name = "country_value")
    private String countryValue;
/*
    @Id
    @Column(name="indicator_id")
    private String indicatorId;*/

    @Column(name = "indicator_value")
    private String indicatorValue;

    @Column(name = "countryiso3code")
    private String countryIsoCode;

   /* @Id
    @Column(name="date")
    private String date;*/

    @Column(name = "value")
    private Integer value;

    @Column(name = "scale")
    private String scale;

    @Column(name = "unit")
    private String unit;

    @Column(name = "obs_status")
    private String obsStatus;

    @Column(name = "decimalVal")
    private Integer decimalVal;

    @Column(name = "runDateTime")
    private LocalDateTime runDateTime;

    public LocalDateTime getRunDateTime() {
        return runDateTime;
    }

    public void setRunDateTime(LocalDateTime runDateTime) {
        this.runDateTime = runDateTime;
    }

    public Integer getDecimalVal() {
        return decimalVal;
    }

    public void setDecimalVal(Integer decimalVal) {
        this.decimalVal = decimalVal;
    }

    public String getCountryValue() {
        return countryValue;
    }

    public void setCountryValue(String countryValue) {
        this.countryValue = countryValue;
    }

    public WorldBankDataID getWorldBankDataID() {
        return worldBankDataID;
    }

    public void setWorldBankDataID(WorldBankDataID worldBankDataID) {
        this.worldBankDataID = worldBankDataID;
    }

    public String getIndicatorValue() {
        return indicatorValue;
    }

    public void setIndicatorValue(String indicatorValue) {
        this.indicatorValue = indicatorValue;
    }

    public String getCountryIsoCode() {
        return countryIsoCode;
    }

    public void setCountryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
    }


    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getObsStatus() {
        return obsStatus;
    }

    public void setObsStatus(String obsStatus) {
        this.obsStatus = obsStatus;
    }


    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
