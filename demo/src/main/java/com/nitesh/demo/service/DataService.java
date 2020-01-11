package com.nitesh.demo.service;

import com.nitesh.demo.client.DemoRestClient;
import com.nitesh.demo.dao.DataServiceRepository;
import com.nitesh.demo.entity.WorldBankData;
import com.nitesh.demo.entity.WorldBankDataID;
import com.nitesh.demo.model.CountryGs;
import com.nitesh.demo.model.IndResponse;
import com.nitesh.demo.model.IndicatorGs;
import com.nitesh.demo.model.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class DataService {

    private static final Logger LOG = Logger.getLogger("DataService");
    @Autowired
    DemoRestClient demoRestClient;

    @Autowired
    DataServiceRepository dataServiceRepository;

    public boolean saveDataFromApi(RequestBody requestBody) throws Exception {
        LOG.info(" In saveDataFromApi method");
        Collection<IndResponse> restClient = demoRestClient.getRestClient(requestBody);
        for (IndResponse indResponse : restClient) {
            CountryGs country = indResponse.getCountry();
            IndicatorGs indicator = indResponse.getIndicator();
            // setting ids first
            WorldBankDataID worldBankDataID = new WorldBankDataID();
            worldBankDataID.setCountryId(country.getId());
            worldBankDataID.setIndicatorId(indicator.getId());
            worldBankDataID.setDate(indResponse.getDate());


            // set all values needed in table

            Optional<WorldBankData> optionalWorldBankData = dataServiceRepository.findById(worldBankDataID);
           if(optionalWorldBankData.isPresent()){}
           else {
                WorldBankData worldBankData = new WorldBankData();
                worldBankData.setWorldBankDataID(worldBankDataID);

                worldBankData.setCountryValue(country.getValue());
                worldBankData.setCountryIsoCode(indResponse.getCountryiso3code());
                worldBankData.setDecimalVal(indResponse.getDecimal());
                worldBankData.setObsStatus(indResponse.getObsStatus());
                worldBankData.setScale(indResponse.getScale());
                worldBankData.setUnit(indResponse.getUnit());
                worldBankData.setValue(indResponse.getValue());
                worldBankData.setIndicatorValue(indicator.getValue());
                worldBankData.setRunDateTime(LocalDateTime.now());
                dataServiceRepository.save(worldBankData);
            }



        }
        LOG.info("Process completed ");
        return true;

    }


}
