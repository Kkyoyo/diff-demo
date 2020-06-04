package xyz.kkyoyo.javafaker.util;

import cn.hutool.core.text.csv.CsvUtil;
import cn.hutool.core.text.csv.CsvWriter;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.ReflectUtil;

import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;

/**
 * @author uspv
 * @date 2019-8-6
 */
public class ListToCsvUtil {
    /**
     *
     * @param dataT 数据
     * @param raw  数据类型
     * @param <T>  泛型
     */
    public static <T>  void  list2Csv(List<T> dataT, T raw, String filename) {
        Field[] fields = raw.getClass().getDeclaredFields();
        String[] names = new String[fields.length];
        for (int i=0;i<fields.length;i++){
            names[i] = fields[i].getName();
        }
        List<String[]> dataList = new LinkedList<>();
        dataList.add(names);
        CsvWriter writer = CsvUtil.getWriter(filename, CharsetUtil.CHARSET_UTF_8);
        writer.write(dataList);
        list2CsvAppend(dataT,filename);
    }

    public static <T>  void  list2CsvAppend(List<T> dataT, String filename){
        List<String[]> dataList = new LinkedList<>();
        for (T t:dataT){
            Object[] dataDetail =  ReflectUtil.getFieldsValue(t);
            String[] dataDetailStr = new String[dataDetail.length];
            for (int i = 0;i<dataDetail.length;i++){
                if (null!=dataDetail[i]){
                    dataDetailStr[i] = dataDetail[i].toString();
                }else{
                    dataDetailStr[i] = "";
                }
            }
            dataList.add(dataDetailStr);
        }
        CsvWriter writer = CsvUtil.getWriter(filename, CharsetUtil.CHARSET_UTF_8,true);
//
        writer.write(dataList);
    }

}
