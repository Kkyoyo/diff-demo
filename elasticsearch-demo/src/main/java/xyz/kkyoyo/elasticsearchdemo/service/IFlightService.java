package xyz.kkyoyo.elasticsearchdemo.service;



import xyz.kkyoyo.elasticsearchdemo.domain.Flight;

import java.util.Iterator;
import java.util.List;

/**
 * @Author: Kyokyo
 * @Date: 2020-4-3
 */
public interface IFlightService {
    void createIndex();

    void deleteIndex(String index);

    void save(Flight docBean);

    void saveAll(List<Flight> list);

    Iterator<Flight> findAll();

}
