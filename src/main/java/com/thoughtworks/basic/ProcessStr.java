package com.thoughtworks.basic;

import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProcessStr {

    public static List<String[]> processStr(String str){
        List<String> list = Arrays.asList(str.split("-"));

        List<String[]> returnList = new ArrayList<>();
        for (String temp:list){
            if(StringUtils.isNotBlank(temp) || StringUtils.isNotEmpty(temp)){
                returnList.add(temp.split(" "));
            }
        }
        return returnList;
    }
}
