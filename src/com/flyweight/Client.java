package com.flyweight;

public class Client {
    public static void main(String[] args){

        //創建一個工廠類
        WebSiteFactory factory = new WebSiteFactory();

        //客戶需要一個以新聞形式發布的網站
        WebSite webSite = factory.getWebSiteCategory("新聞");
        webSite.use(new User("tom"));

        //客戶需要一個以博客形式發布的網站
        WebSite webSite1 = factory.getWebSiteCategory("博客");
        webSite1.use(new User("jacak"));

        //客戶需要一個以博客形式發布的網站
        WebSite webSite2 = factory.getWebSiteCategory("博客");
        webSite2.use(new User("smith"));

        //客戶需要一個以博客形式發布的網站
        WebSite webSite3 = factory.getWebSiteCategory("博客");
        webSite3.use(new User("king"));

        System.out.println("網站的分類共 = " + factory.getWebSiteCount());
    }
}