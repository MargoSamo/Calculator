package com.mariia.calc;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Vector2DTest {

    @Test
    public void newVectorShouldHaveZeroLength() {
        Vector2D v1 = new Vector2D(); //action (deistvie)

        // assertion (proverit cto ojidaemiy rezultat covpadaet c facticeckim)
        Assert.assertEquals(0, v1.length(), 1e-9);
    }

    @Test
    public void newVectorShouldHaveZeroX() {
        Vector2D v1 = new Vector2D();
        Assert.assertEquals(0, v1.getX(), 1e-9);
    }

    @Test
    public void newVectorShouldHaveZeroY() {
        Vector2D v1 = new Vector2D();
        Assert.assertEquals(0, v1.getY(), 1e-9);
    }
}