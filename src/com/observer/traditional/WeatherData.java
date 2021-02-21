package com.observer.traditional;


public class WeatherData {

	private float temperatrue;
	private float pressure;
	private float humidity;
	private CurrentConditions currentConditions;

	public WeatherData(CurrentConditions currentConditions) {
		this.currentConditions = currentConditions;
	}

	public float getTemperatrue() {
		return temperatrue;
	}

	public void setTemperatrue(float temperatrue) {
		this.temperatrue = temperatrue;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	
	public void dataChange() {
		// 調用接入方的 update
		currentConditions.update(getTemperatrue(), getPressure(), getHumidity());
	}

	// 当数据有更新时，就调用 setData
	public void setData(float temperature, float pressure, float humidity) {
		this.temperatrue = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		// 調用 dataChange，將最新訊息 推送給 接收方
		dataChange();
	}
}
