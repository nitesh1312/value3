package com.nitesh.demo.dao;

import com.nitesh.demo.entity.WorldBankData;
import com.nitesh.demo.entity.WorldBankDataID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataServiceRepository extends CrudRepository<WorldBankData, WorldBankDataID> {


}
