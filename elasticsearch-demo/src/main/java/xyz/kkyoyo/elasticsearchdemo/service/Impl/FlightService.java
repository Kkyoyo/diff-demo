package xyz.kkyoyo.elasticsearchdemo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import xyz.kyokyo.esdemo.domain.Flight;
import xyz.kyokyo.esdemo.service.IFlightService;

import java.util.Iterator;
import java.util.List;

/**
 * @Author: Kyokyo
 * @Date: 2020-4-3
 */
public class FlightService implements IFlightService {

    @Autowired
    private ElasticsearchRestTemplate elasticsearchRestTemplate;
    

    @Override
    public void createIndex() {

    }

    @Override
    public void deleteIndex(String index) {

    }

    @Override
    public void save(Flight docBean) {

    }

    @Override
    public void saveAll(List<Flight> list) {

    }

    @Override
    public Iterator<Flight> findAll() {
        return null;
    }
}
