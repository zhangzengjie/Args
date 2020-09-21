package com.thoughtworks.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Schema {

    public static Map<String,String> map = new HashMap<String,String>();

    public static void init(){
        map.put("a","Integer");
        map.put("b","boolean");
        map.put("c","String");
    }

    public static boolean judge(String str,String context){
        boolean flag = false;
        switch (str){
            case "a":
                flag = judgeInteger(context);
                break;
            case "b":
                flag = judgeBoolean(context);
                break;
            case "c":
                flag = judgeString(context);
                break;
        }
        return flag;
    }

    public static boolean judgeString(String context) {
        String pattern = "^[a-zA-Z]+$";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(context);
        if(m.matches()){
            return true;
        }else {
            return false;
        }
    }

    private static boolean judgeBoolean(String context) {
        if (context.equals("true") || context.equals("false")){
            return true;
        }else {
            return false;
        }
    }

    public static boolean judgeInteger(String context) {
        String pattern = "^\\d+$";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(context);
        if(m.matches()){
            return true;
        }else {
            return false;
        }
    }

}
