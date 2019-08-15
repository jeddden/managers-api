package com.yunku.demo.tool;

import javax.servlet.http.HttpSession;

/**
 * 非Controller类中拿session
 *
 * @author Jeddden
 * @create 2019-08-14 15:06
 */
public class HttpSessionContext {

    private static ThreadLocal<HttpSession> tl = new ThreadLocal<HttpSession>();

    public static void put(HttpSession s) {
        tl.set(s);
    }

    public static HttpSession get() {
        return tl.get();
    }

    public static void remove() {
        tl.remove();
    }
}
