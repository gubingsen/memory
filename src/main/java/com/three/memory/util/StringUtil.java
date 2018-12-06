package com.three.memory.util;


public class StringUtil {
    public static boolean checkEmpty(String... values){
        boolean r=false;
        for(String v:values){
            if(!(v!=null && v.length()>0)){
                r=true;
            }
        }
        return r;
    }
    public static boolean checkNoEmpty(String... values){
        boolean r=true;
        for(String v:values){
            if(!(v!=null && v.length()>0)){
                r=false;
            }
        }
        return r;
    }
}
