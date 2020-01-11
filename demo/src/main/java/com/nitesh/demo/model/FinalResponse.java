package com.nitesh.demo.model;

import java.util.ArrayList;

public class FinalResponse {

    ResponseGson responseGson;
    ArrayList<IndResponse> indResponseArrayList;

    public ResponseGson getResponseGson() {
        return responseGson;
    }

    public void setResponseGson(ResponseGson responseGson) {
        this.responseGson = responseGson;
    }

    public ArrayList<IndResponse> getIndResponseArrayList() {
        return indResponseArrayList;
    }

    public void setIndResponseArrayList(ArrayList<IndResponse> indResponseArrayList) {
        this.indResponseArrayList = indResponseArrayList;
    }
}
