package com.flyweight;

import java.util.HashMap;

//網站工廠類，根據需要返回一個網站
public class WebSiteFactory {

    //集合，充當池的作用
    private HashMap<String,ConcreteWebSite> pool = new HashMap<>();

    //根據網站的類型，返回一個網站，如果沒有就創建一個網站，並放入到池中，並返回
    public WebSite getWebSiteCategory(String type){
        if (!pool.containsKey(type)){
            //創建一個網站，並放入到池中
            pool.put(type,new ConcreteWebSite(type));
        }

        return pool.get(type);
    }

    public int getWebSiteCount(){
        return pool.size();
    }
}