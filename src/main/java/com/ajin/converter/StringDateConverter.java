package com.ajin.converter;

import org.springframework.core.convert.converter.Converter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ajin on 16-12-8.
 */
public class StringDateConverter implements Converter<String,Date> {
    //实现convert方法
    public Date convert(String s) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return simpleDateFormat.parse(s);
        }catch (ParseException e){
            e.printStackTrace();
        }
        return null;
    }
}
