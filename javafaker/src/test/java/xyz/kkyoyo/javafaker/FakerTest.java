package xyz.kkyoyo.javafaker;

import cn.hutool.core.date.DateUtil;
import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import xyz.kkyoyo.javafaker.domain.BaMsAll;
import xyz.kkyoyo.javafaker.util.ListToCsvUtil;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * @Author: Kyokyo
 * @Date: 2020-5-15
 */
@Slf4j
public class FakerTest extends JavafakerApplicationTests{
    @Test
    public void faker(){
        Faker faker = new Faker(Locale.CHINA);
        log.info(faker.name().fullName());
        log.info(faker.address().city());
        Date randomDate = faker.date().between(DateUtil.parse("2018-11-11")
                ,DateUtil.parse("2020-11-11"));
        log.info(DateUtil.format(randomDate,"YYYY-MM-dd"));
        log.info(String.valueOf(faker.number().numberBetween(0,5)));
        String[] carrier = {"MF","NS","3U","BB"};
        log.info(faker.overwatch().hero());
        log.info(faker.letterify("?",true));
        log.info(faker.address().country());

        List<BaMsAll> list = new ArrayList<>();
        int dataSize = 1000000;

        for (int i = 0 ; i < dataSize ; i++){
            BaMsAll baMsAll = new BaMsAll();
            baMsAll.setId(StringUtils.join(faker.number().numberBetween(10000,10000000)));
            baMsAll.setDatadate(DateUtil.format(faker.date().between(DateUtil.parse("2020-01-11")
                    ,DateUtil.parse("2020-01-21")),"YYYY-MM-dd"));
            baMsAll.setOperateCarrierCode(carrier[faker.number().numberBetween(0,3)]);
            baMsAll.setMarketCarrierCode(carrier[faker.number().numberBetween(0,3)]);
            baMsAll.setIssCarrierCode(carrier[faker.number().numberBetween(0,3)]);
            baMsAll.setCabin(faker.letterify("?",true));
            baMsAll.setCabin(faker.letterify("?",true));
            baMsAll.setRegion(faker.address().state());
            baMsAll.setCountry(faker.address().country());
            baMsAll.setAirport(faker.address().city());
            baMsAll.setFltseg(faker.address().city()+faker.address().city());
            baMsAll.setFltno(faker.numerify("####"));
            baMsAll.setRoundFlag(StringUtils.join(faker.bool().bool()));
            baMsAll.setFltDate(DateUtil.format(faker.date().between(DateUtil.parse("2020-01-11")
                    ,DateUtil.parse("2020-01-21")),"YYYY-MM-dd"));
            baMsAll.setDow((short)faker.number().numberBetween(0,3));
            baMsAll.setTrueOAirport(faker.address().city());
            baMsAll.setTripOAirport(faker.address().city());
            baMsAll.setTrueOAirport(faker.address().city());
            baMsAll.setTrueOCity(faker.address().city());
            baMsAll.setTripOCity(faker.address().city());
            baMsAll.setTrueOCity(faker.address().city());
            baMsAll.setTrueOCountry(faker.address().country());
            baMsAll.setTripOCountry(faker.address().countryCode());
            baMsAll.setTrueOd(faker.address().countryCode());

            baMsAll.setTrueDAirport(faker.address().city());
            baMsAll.setTripDAirport(faker.address().city());
            baMsAll.setTrueDAirport(faker.address().city());
            baMsAll.setTrueDCity(faker.address().city());
            baMsAll.setTripDCity(faker.address().city());
            baMsAll.setTrueDCity(faker.address().city());
            baMsAll.setTrueDCountry(faker.address().country());
            baMsAll.setTripDCountry(faker.address().countryCode());
            baMsAll.setAlctCap((short)faker.number().numberBetween((long)100,(long) 300));
            baMsAll.setFltDistance(faker.number().randomNumber());
            baMsAll.setFareFuel(BigDecimal.valueOf(faker.number().numberBetween((long)2000,(long) 30000),1));
            baMsAll.setFareNofuel(BigDecimal.valueOf(faker.number().numberBetween((long)2000,(long) 20000),1));
            baMsAll.setFareOdFuel(BigDecimal.valueOf(faker.number().numberBetween((long)5000,(long) 30000),1));
            baMsAll.setFareOdNofuel(BigDecimal.valueOf(faker.number().numberBetween((long)5000,(long) 30000),1));
            baMsAll.setTNo(StringUtils.join(faker.number().numberBetween(100000000,900000000)));
            baMsAll.setOdId(StringUtils.join(faker.number().numberBetween(1000000,90000000)));
            list.add(baMsAll);
        }

        ListToCsvUtil.list2Csv(list,new BaMsAll(),"D:\\ItWork\\桌面\\1.csv");

    }

}
