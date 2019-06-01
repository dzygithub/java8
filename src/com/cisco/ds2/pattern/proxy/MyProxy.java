package com.cisco.ds2.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxy implements InvocationHandler {

    private IExecute executor;

    public void setExecutor(IExecute executor) {
        this.executor = executor;
    }

    public Object createExecuteProxy() {
        Object proxyInstance = Proxy.newProxyInstance(this.executor.getClass().getClassLoader(),
                this.executor.getClass().getInterfaces(),
                this);
        return proxyInstance;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        new Before().before();
        method.invoke(this.executor, args);
        new After().after();
        return null;
    }

    public static void main(String[] args) {
        MyProxy myProxy = new MyProxy();
        myProxy.setExecutor(new Execute());
        IExecute proxy = (IExecute) myProxy.createExecuteProxy();
//        do something before executing...
//        executing....
//        do something after executing...
        proxy.execute();
    }

}
