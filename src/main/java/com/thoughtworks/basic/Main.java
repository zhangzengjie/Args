package com.thoughtworks.basic;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args){
        //Schema数据获取
        Schema.init();

        //TODO 获取参数
        String str = "-a 80 -b asx -c str";
        List<String[]> processStr = ProcessStr.processStr(str);

        //TODO 判断规则
        for (String[] temp : processStr){
            for(Map.Entry<String,String> entry : Schema.map.entrySet()){
                if (temp[0].equals(entry.getKey())){
                    if(Schema.judge(temp[0],temp[1])){
                        System.out.println(temp[0] + " - " + temp[1]);
                        break;
                    }
                }
            }
        }
    }
}
