package com.adapter.springmvc;

//定義一個Adapter接口
public interface HandlerAdapter {
    public boolean supports(Object object);

    public void handle(Object object);
}

//多種適配器類
class SimpleHandlerAdapter implements HandlerAdapter{

    @Override
    public boolean supports(Object object) {
        return object instanceof SimpleController;
    }

    @Override
    public void handle(Object object) {
        ((SimpleController)object).doSimplerHandler();
    }
}

class HttpHandlerAdapter implements HandlerAdapter{

    @Override
    public boolean supports(Object object) {
        return object instanceof HttpController;
    }

    @Override
    public void handle(Object object) {
        ((HttpController)object).doHttpHandler();
    }
}

class AnnotationHandlerAdapter implements HandlerAdapter{

    @Override
    public boolean supports(Object object) {
        return object instanceof AnnotationController;
    }

    @Override
    public void handle(Object object) {
        ((AnnotationController)object).doAnnotationHandler();
    }
}
