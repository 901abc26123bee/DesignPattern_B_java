package com.observer.traditional;

public class Client {
    public static void main(String[] args) {
    	// 1. create receiver : CurrentConditions
    	// 2. create broadcaster : WeatherData and receive a receiver as parameter
        WeatherData weatherData = new WeatherData(new CurrentConditions());
        weatherData.setData(10f, 40f, 50.55f);
        weatherData.setData(13f, 50f, 61.58f);
    }
}
