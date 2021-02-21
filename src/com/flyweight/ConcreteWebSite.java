package com.flyweight;

//具體網站
public class ConcreteWebSite extends WebSite {

  //共享的部分，內部狀態
  private String type;//網站發布的形式（類型）

  public ConcreteWebSite(String type) {
      this.type = type;
  }

  @Override
  public void use(User user) {
	  // type = 共享的部分，內部狀態, user = 外部狀態不可共享的部分
      System.out.println("網站的發布形式為:" + type + " 在使用中 .. 使用者是" + user.getName());
  }
}
