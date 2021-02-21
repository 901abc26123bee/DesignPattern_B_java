package com.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 動態代理
 */
public class ProxyFactory {
	// 維護一個目對象，Object 
    private Object target;
    // 構造器，對 target 進行初始化
    public ProxyFactory(Object target) {
        this.target = target;
    }
    /*
     * public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h) 
       ClassLoader loader：指定當前目標對象使用的類加載器，獲取加載器的方法固定
       Class<?>[] interfaces：目標對象實現的接口類型，使用泛型方法確認類型
       InvocationHandler h：事情處理，執行目標對象方法時，會觸發事情處理氣方法，會把當前執行的目標對象方法作為參數傳入
     * */
    // 給目標對象生成一個代理對象
    public Object getProxyInstance(){
        ClassLoader loader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        Object proxyInstance = Proxy.newProxyInstance(loader, interfaces, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("JDK代理開始~~");
                // 反射機制調用目標對象的方法
                Object invoke = method.invoke(target, args);
                return invoke;
            }
        });
        return proxyInstance;
    }
    
}