package org.lee.com;

import org.junit.Assert;
import org.junit.Test;

public class testAdd {
    Calculator calculate = new Calculator();

    @Test
    public void testTwo(){
        int num = calculate.add(1,2);
        int num2 = calculate.add(-1,-1);
        Assert.assertEquals(3,num);
        Assert.assertEquals(-2,num2);

    }

    @Test
    public void testMultipleNumbers(){
        int num3 = calculate.add(1,2,3,4,5);
        Assert.assertEquals(15,num3);

    }
    //
    @Test
    public void testMultiplyTwoNumbers(){
        int num4 = calculate.multiply(1,3);
        Assert.assertEquals(3,num4);
    }
    @Test
    public void testMultiplyMultipleNumbers(){
        int num5 = calculate.multiply(1,2,3,4,5);
        Assert.assertEquals(120,num5);
    }

}
