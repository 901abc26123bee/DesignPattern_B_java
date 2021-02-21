package com.observer;

import java.util.ArrayList;

import lombok.Data;

@Data
public class WeatherData implements Subject {
	private float temperatrue;
	private float pressure;
	private float humidity;
	private ArrayList<Observer> observers;// 觀察者集合，當數據有更新時，通知所有接收方

	public WeatherData() {
		observers = new ArrayList<>();
	}

	// 當數據有更新時，就調用 setData
	public void setData(float temperature, float pressure, float humidity) {
		this.temperatrue = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		dataChange();
	}

	public void dataChange() {
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		if (observers.contains(o))
			observers.remove(o);
	}

	@Override
	// 遍歷所有觀察者，並通知
	public void notifyObservers() {
		observers.forEach(observer -> observer.update(temperatrue, pressure, humidity));
	}
}
