package com.nitesh.demo.model;

import com.google.gson.annotations.SerializedName;

public class ResponseGson {

    @SerializedName("sourceid")
    private String sourceid;

    @SerializedName("per_page")
    private int perPage;

    @SerializedName("total")
    private int total;

    @SerializedName("pages")
    private int pages;

    @SerializedName("lastupdated")
    private String lastupdated;

    @SerializedName("page")
    private int page;

    public String getSourceid() {
        return sourceid;
    }

    public void setSourceid(String sourceid) {
        this.sourceid = sourceid;
    }

    public int getPerPage() {
        return perPage;
    }

    public void setPerPage(int perPage) {
        this.perPage = perPage;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getLastupdated() {
        return lastupdated;
    }

    public void setLastupdated(String lastupdated) {
        this.lastupdated = lastupdated;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return
                "ResponseGson{" +
                        "sourceid = '" + sourceid + '\'' +
                        ",per_page = '" + perPage + '\'' +
                        ",total = '" + total + '\'' +
                        ",pages = '" + pages + '\'' +
                        ",lastupdated = '" + lastupdated + '\'' +
                        ",page = '" + page + '\'' +
                        "}";
    }
}