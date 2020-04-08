package xyz.kkyoyo.eshighdemo.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import xyz.kkyoyo.eshighdemo.domain.Flight;

import java.util.Map;

import static javax.xml.crypto.dsig.Manifest.TYPE;
import static xyz.kkyoyo.eshighdemo.util.Constant.INDEX;

/**
 * @Author: Kyokyo
 * @Date: 2020-4-8
 */
@Service
@Slf4j
public class FlightService {
    private RestHighLevelClient client;
    private ObjectMapper objectMapper;

    @Autowired
    public FlightService(@Qualifier("elasticsearchRestHighLevelClient") RestHighLevelClient client, ObjectMapper objectMapper) {
        this.client = client;
        this.objectMapper = objectMapper;
    }

    public Flight findById(String id) throws Exception {
        GetRequest getRequest = new GetRequest(INDEX, TYPE, id);
        GetResponse getResponse = client.get(getRequest, RequestOptions.DEFAULT);
        Map<String, Object> resultMap = getResponse.getSource();
        return objectMapper.convertValue(resultMap,Flight.class);
    }

}
