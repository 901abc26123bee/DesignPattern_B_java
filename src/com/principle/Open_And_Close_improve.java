package com.principle;

import org.junit.Test;

public class Open_And_Close_improve {
	@Test
	public void test() {
		GraphicEditor editor = new GraphicEditor();
		editor.drawShape(new Rectangle());
		editor.drawShape(new Circle());
	}
}

//違反開閉原則，及對擴展開放（提供方Shape），對修改關閉（使用方GraphicEditor）：新增圖型類需修改繪製方法
class GraphicEditor{
	public void drawShape(Shape s) {
		s.draw();
	}
}

abstract class Shape{
	int m_type;
	public abstract void draw();
}

class Rectangle extends Shape{
	Rectangle() {
		super.m_type = 1;
	}
	@Override
	public void draw() {
		System.out.println("draw Rectangle");
	}
}

class Circle extends Shape{
	Circle() {
		super.m_type = 2;
	}
	@Override
	public void draw() {
		System.out.println("draw Circl]e");
	}
}
