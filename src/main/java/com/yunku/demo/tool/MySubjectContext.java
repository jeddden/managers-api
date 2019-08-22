package com.yunku.demo.tool;


import com.yunku.demo.core.subject.SignUser;

/**
 * @author Jeddden
 * @create 2019-08-16 14:41
 */
public class MySubjectContext {

    private static ThreadLocal<SignUser> tl = new ThreadLocal<>();

    public static void put(SignUser s) {
        tl.set(s);
    }

    public static SignUser get() {
        return tl.get();
    }

    public static void remove() {
        tl.remove();
    }
}
