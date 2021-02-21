package com.observer;

public class BaiduSite implements Observer {

    private float temperature;
    private float pressure;
    private float humidity;


    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("===百度網站====");
        System.out.println("***百度網站 氣溫 : " + temperature + "***");
        System.out.println("***百度網站 氣壓: " + pressure + "***");
        System.out.println("***百度網站 濕度: " + humidity + "***");
    }

}