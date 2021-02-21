package com.principle;

import org.junit.Test;

public class Open_And_Close_bad {
//	@Test
//	public void test() {
//		GraphicEditor editor = new GraphicEditor();
//		editor.drawRectangle(new Rectangle());
//		editor.drawCircle(new Circle());
//	}
}
// 違反開閉原則，及對擴展開放（提供方Shape），對修改關閉（使用方GraphicEditor）：新增圖型類需修改繪製方法
//class GraphicEditor{
//	public void drawShape(Shape s) {
//		if(s.m_type == 1) {
//			drawRectangle(s);
//		}else if(s.m_type == 2){
//			drawCircle(s);
//		}
//	}
//	public void drawRectangle(Shape s) {
//		System.out.println("draw Rectangle");
//	}
//	public void drawCircle(Shape s) {
//		System.out.println("draw Circl]e");
//	}
//}
//
//class Shape{
//	int m_type;
//}
//
//class Rectangle extends Shape{
//	Rectangle() {
//		super.m_type = 1;
//	}
//}
//
//class Circle extends Shape{
//	Circle() {
//		super.m_type = 2;
//	}
//}

