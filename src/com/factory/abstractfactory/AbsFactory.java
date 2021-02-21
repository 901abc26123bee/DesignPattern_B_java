package com.factory.abstractfactory;

//一個抽象工廠模式的抽象層（接口）
public interface AbsFactory {
  //讓下面的工廠子類來實現，具體實現
  public Pizza createPizza(String orderType);
}