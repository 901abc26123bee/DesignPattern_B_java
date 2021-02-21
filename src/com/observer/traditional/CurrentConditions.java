package com.observer.traditional;

public class CurrentConditions{

    // 溫度，氣壓，濕度
    private float temperature;
    private float pressure;
    private float humidity;


    // 使用推送模式
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("***Today mTemperature: " + temperature + "***");
        System.out.println("***Today mPressure: " + pressure + "***");
        System.out.println("***Today mHumidity: " + humidity + "***");
    }


}
