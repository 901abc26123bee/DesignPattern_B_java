package com.observer;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(new CurrentConditions());
        weatherData.setData(10f, 40f, 50.55f);

        System.out.println("----------------------------");
        weatherData.registerObserver(new BaiduSite());
        weatherData.setData(20f, 40f, 50.55f);

    }
}
