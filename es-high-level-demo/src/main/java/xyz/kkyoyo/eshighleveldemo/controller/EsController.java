package xyz.kkyoyo.eshighleveldemo.controller;

import org.elasticsearch.action.index.IndexResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.kkyoyo.eshighleveldemo.service.RestHighLevelService;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
}
