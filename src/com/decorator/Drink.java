package com.decorator;

public abstract class Drink {
	   public String des;//描述
	   private float price = 0.0f;


	    public String getDes() {
	        return des;
	    }

	    public void setDes(String des) {
	        this.des = des;
	    }

	    public float getPrice() {
	        return price;
	    }

	    public void setPrice(float price) {
	        this.price = price;
	    }

	    //計算費用的抽象方法，子類實現
	    public abstract float cost();
	}