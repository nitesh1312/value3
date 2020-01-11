package com.nitesh.demo.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class WorldBankDataID implements Serializable {

    @Column(name = "country_id")
    private String countryId;

    @Column(name = "indicator_id")
    private String indicatorId;

    @Column(name = "date")
    private String date;

    public WorldBankDataID() {
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getIndicatorId() {
        return indicatorId;
    }

    public void setIndicatorId(String indicatorId) {
        this.indicatorId = indicatorId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorldBankDataID that = (WorldBankDataID) o;
        return Objects.equals(countryId, that.countryId) &&
                Objects.equals(indicatorId, that.indicatorId) &&
                Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryId, indicatorId, date);
    }

    @Override
    public String toString() {
        return "WorldBankDataID{" +
                "countryId='" + countryId + '\'' +
                ", indicatorId='" + indicatorId + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
