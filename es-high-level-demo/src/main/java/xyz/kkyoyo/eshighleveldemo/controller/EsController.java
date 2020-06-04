package xyz.kkyoyo.eshighleveldemo.controller;

import com.alibaba.fastjson.JSON;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.search.SearchHit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.kkyoyo.eshighleveldemo.domain.KibanaFlight;
import xyz.kkyoyo.eshighleveldemo.service.RestHighLevelService;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @Author: Kyokyo
 * @Date: 2020-4-13
 */
@RestController
public class EsController {
    @Autowired
    RestHighLevelService service;

    @GetMapping("/es")
    public String testHigh(HttpServletResponse httpServletResponse) throws IOException {
        String source = "{\n" +
                "  \"name\" : \"耐苦无领运动半袖\",\n" +
                "  \"price\" : 300,\n" +
                "  \"num\" : 800,\n" +
                "  \"date\" : \"2019-07-28\"\n" +
                "}";

        IndexResponse response = service.addDoc("idx_clouthing", source);

//        httpServletResponse.getWriter().println();

        return response.toString();
    }

    @GetMapping("/esall")
    public String all() throws IOException {
        SearchResponse response =  service.search("DestCountry","JP",0,10,"kibana_sample_data_flights");
        SearchHit[] searchHit = response.getHits().getHits();
        for (SearchHit hit : searchHit){
            Map<String,Object> res = hit.getSourceAsMap();
            res.size();
        }
        service.testMonet("monet");

        return response.toString();
    }
}
