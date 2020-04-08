package xyz.kkyoyo.elasticsearchdemo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import xyz.kkyoyo.elasticsearchdemo.dao.FlightDao;
import xyz.kkyoyo.elasticsearchdemo.domain.Flight;
import xyz.kkyoyo.elasticsearchdemo.service.IFlightService;


import java.util.Iterator;
import java.util.List;

/**
 * @Author: Kyokyo
 * @Date: 2020-4-3
 */
public class FlightService implements IFlightService {

    @Autowired
    private ElasticsearchRestTemplate elasticsearchRestTemplate;

    @Autowired
    private FlightDao flightDao;
    

    @Override
    public void createIndex(String index) {
        elasticsearchRestTemplate.createIndex(index);
    }

    @Override
    public void deleteIndex(String index) {
        elasticsearchRestTemplate.deleteIndex(index);
    }

    @Override
    public void save(Flight docBean) {

    }

    @Override
    public void saveAll(List<Flight> list) {

    }

    @Override
    public Iterator<Flight> findAll() {
        return flightDao.findAll().iterator();
    }
}
