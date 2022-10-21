package com.mariia.calc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class NetWorkUtilsTest {

    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    public void getConnectionShouldReturnFasterThanOneSecond() {
        NetWorkUtils.getConnection();
    }
}