package com.nitesh.demo.controller;

import com.nitesh.demo.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataServiceController {

    @Autowired
    DataService dataService;

    @PostMapping("/data_loader")
    public boolean saveDataOfWorldBank(@RequestBody com.nitesh.demo.model.RequestBody requestBody) throws Exception {

        return dataService.saveDataFromApi(requestBody);
    }
}
