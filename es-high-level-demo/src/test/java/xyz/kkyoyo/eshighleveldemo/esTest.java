package xyz.kkyoyo.eshighleveldemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import xyz.kkyoyo.eshighleveldemo.service.RestHighLevelService;

import java.io.IOException;

/**
 * @Author: Kyokyo
 * @Date: 2020-5-11
 */
public class esTest extends EsHighLevelDemoApplicationTests {

    @Autowired
    RestHighLevelService service;

    @Test
    public void test1() throws IOException {
        service.testMonet("monet");

    }
}
