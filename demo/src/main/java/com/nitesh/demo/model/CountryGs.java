package com.nitesh.demo.model;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class CountryGs {

    @SerializedName("id")
    private String id;

    @SerializedName("value")
    private String value;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return
                "Country{" +
                        "id = '" + id + '\'' +
                        ",value = '" + value + '\'' +
                        "}";
    }
}