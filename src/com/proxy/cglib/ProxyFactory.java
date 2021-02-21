package com.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib 增強的動態代理， 不需要實現接口，
 */
public class ProxyFactory implements MBeanServerInterceptor {
    //維護一個目標對象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 返回一個代理對象: 是 target 對象的代理對象
    public Object getProxyInstance() {
    	// 1.創建一個工具類
        Enhancer enhancer = new Enhancer();
        // 2.設置父類
        enhancer.setSuperclass(target.getClass());
        // 3.設置回調函數
        enhancer.setCallback(this);
        // 4.創建子對象，及代理對象
        return enhancer.create();
    }


    @Override
    // 重寫 intercept 方法，會調用目標對象的方法
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib代理模式 ~~ 開始");
        Object invoke = method.invoke(target, objects);
        System.out.println("Cglib代理模式 ~~ 提交");
        return invoke;
    }
}