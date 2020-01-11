package com.nitesh.demo.client;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.nitesh.demo.model.IndResponse;
import com.nitesh.demo.model.RequestBody;
import com.nitesh.demo.model.ResponseGson;
import org.json.JSONArray;
import org.json.JSONException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.logging.Logger;

@Service
public class DemoRestClient {

    private static final Logger LOG = Logger.getLogger("DemoRestClient");

    public Collection<IndResponse> getRestClient(RequestBody requestBody) throws Exception {
        RestTemplate restTemplate = new RestTemplate();

        //building url in stringbuilder
        StringBuilder urlStringBuilder = new StringBuilder("https://api.worldbank.org/v2/country/");
        urlStringBuilder.append(requestBody.getCountryCode())
                .append("/indicator/")
                .append(requestBody.getIndicatorCode())
                .append("?scale=y")
                .append("&format=")
                .append(requestBody.getFormat())
                .append("&date=")
                .append(requestBody.getStartYear() + ":").append(requestBody.getEndYear());
        LOG.info("url formed :  " + urlStringBuilder.toString());


        ResponseEntity<String> response
                = restTemplate.getForEntity(urlStringBuilder.toString(), String.class);

        if (response.getStatusCode().is2xxSuccessful()) {
            System.out.println(response.getBody());

            String result = response.getBody();
            Gson gson = new Gson();

            JSONArray jsonArr = new JSONArray(result);

            ResponseGson res = gson.fromJson(jsonArr.get(0).toString(), ResponseGson.class);
            LOG.info("**********************************");
            // System.out.println(res);
            Type type = new TypeToken<Collection<IndResponse>>() {
            }.getType();
            Collection<IndResponse> list = gson.fromJson(jsonArr.get(1).toString(), type);

            if (res.getPages() > 1) {
                for (int i = 1; i < res.getPages(); i++) {
                    urlStringBuilder.append("&page=").append(i + 1);
                    LOG.info("url formed : " + urlStringBuilder.toString());
                    ResponseEntity<String> newresponse
                            = restTemplate.getForEntity(urlStringBuilder.toString(), String.class);

                    Collection<IndResponse> newList = gson.fromJson(jsonArr.get(1).toString(), type);
                    list.addAll(newList);
                }
            }

            return list;

        } else {
            throw new Exception("Error in fetching web services");
        }
    }

}
