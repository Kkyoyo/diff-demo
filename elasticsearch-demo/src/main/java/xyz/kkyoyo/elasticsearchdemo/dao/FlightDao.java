package xyz.kkyoyo.elasticsearchdemo.dao;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import xyz.kkyoyo.elasticsearchdemo.domain.Flight;


/**
 * @Author: Kyokyo
 * @Date: 2020-4-3
 */
public interface FlightDao extends ElasticsearchRepository<Flight, Long> {

}
