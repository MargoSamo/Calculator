package com.mariia.calc;

public class NetWorkUtils {
    public static void getConnection() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return;

    }

}
