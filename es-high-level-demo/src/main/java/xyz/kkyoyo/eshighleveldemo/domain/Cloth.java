package xyz.kkyoyo.eshighleveldemo.domain;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Date;

/**
 * @Author: Kyokyo
 * @Date: 2020-4-13
 */
@Data
public class Cloth {
    @JSONField(ordinal = 0)
    private String id;

    @JSONField(ordinal = 1)
    private String name;

    @JSONField(ordinal = 2)
    private String desc;

    @JSONField(ordinal = 3)
    private Integer num;

    @JSONField(ordinal = 4)
    private double price;

    @JSONField(ordinal = 5, format = "yyyy-MM-dd HH:mm:ss")
    private Date date;

    public Cloth(String id, String name, String desc, Integer num, double price, Date date) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.num = num;
        this.price = price;
        this.date = date;
    }


    @Override
    public String toString() {
        return "Cloth{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", num=" + num +
                ", price=" + price +
                ", date=" + date +
                '}';
    }
}
