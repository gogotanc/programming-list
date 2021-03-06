package org.tanc.proxy.dynamic;

import org.tanc.proxy.Movable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 使用动态代理实现计时功能。
 * Created by tanc on 2017/4/11.
 */
public class TimeTrace implements InvocationHandler {

    private Movable movable;

    public TimeTrace(Movable movable) {
        this.movable = movable;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        long start = System.currentTimeMillis();

        method.invoke(movable, args);

        long end = System.currentTimeMillis();
        System.out.println("运行时间为：" + (end - start) + "毫秒。");

        return null;

    }
}
