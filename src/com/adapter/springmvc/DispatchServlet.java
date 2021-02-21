package com.adapter.springmvc;

import java.util.ArrayList;
import java.util.List;

public class DispatchServlet {

    public static List<HandlerAdapter> handlerAdapters = new ArrayList<HandlerAdapter>();

    public DispatchServlet() {
        handlerAdapters.add(new AnnotationHandlerAdapter());
        handlerAdapters.add(new HttpHandlerAdapter());
        handlerAdapters.add(new SimpleHandlerAdapter());
    }

    public void doDispatch() {
        // 此處模擬SpringMVC從request取handler的對象，
        // 適配器可以獲取到希望的Controller
        HttpController controller = new HttpController();
        // AnnotationController controller = new AnnotationController();
        //SimpleController controller = new SimpleController();
        // 得到對應適配器
        HandlerAdapter adapter = getHandler(controller);
        // 通過適配器執行對應的controller對應方法
        adapter.handle(controller);
    }

    public HandlerAdapter getHandler(Controller controller) {
        //遍歷：根據得到的controller(handler), 返回對應適配器
        for (HandlerAdapter adapter : this.handlerAdapters) {
            if (adapter.supports(controller)) {
                return adapter;
            }
        }
        return null;
    }

    public static void main(String[] args){
        new DispatchServlet().doDispatch();
    }
}