package com.test.jacoco.test;

import static org.junit.Assert.assertEquals;

/**
 * Created by superZh on 2019/10/1.
 */

import org.junit.Test;
import com.test.jacoco.HelloWorld;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String a = hw.Method1();
        assertEquals("Hello World", a);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method2(2, 1);
        assertEquals(3, a);
    }
    
    @Test
    public void testMethod3() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
    	hw.Method3(6,-1,1);
        hw.Method3(6,-1,-0);
        hw.Method3(6,0,1);
        hw.Method3(6,0,0);
        hw.Method3(4,-1,1);
        hw.Method3(4,-1,0);
        hw.Method3(5,0,-2);
        hw.Method3(5,0,-3);
        hw.Method3(4,0,-2);
        hw.Method3(4,0,-3);
    }
    /**
     * TODO: add the test function of other methods in HelloWorld.java
     */

    @Test
    public void testMethod4() {
        HelloWorld hw = new HelloWorld();
        int a=hw.Method4(5,2,1,1,0);
        hw.Method4(5,5,1,0,0);
        hw.Method4(5,5,1,1,0);
        hw.Method4(0,5,1,0,0);
        hw.Method4(1,1,1,1,0);
        hw.Method4(1,1,1,0,0);
        hw.Method4(5,4,1,1,0);

    }

    @Test
    public void testbug() {
        HelloWorld hw = new HelloWorld();
        hw.bug(1);

    }

    @Test
    public void testisT() {
        HelloWorld hw = new HelloWorld();
        hw.isTriangle(1,1,1);
        hw.isTriangle(1,1,0);
        hw.isTriangle(1,0,0);
        hw.isTriangle(0,0,0);
        hw.isTriangle(3,4,5);
        hw.isTriangle(5,2,1);
        hw.isTriangle(2,5,1);
        hw.isTriangle(1,2,5);

    }

    @Test
    public void testisB() {
        HelloWorld hw = new HelloWorld();
        hw.isBirthday(1980,0,0);
        hw.isBirthday(2020,0,0);
        hw.isBirthday(2000,3,1);
        hw.isBirthday(2000,3,32);
        hw.isBirthday(2000,3,0);
        hw.isBirthday(2000,2,1);
        hw.isBirthday(2000,2,0);
        hw.isBirthday(2000,2,31);
        hw.isBirthday(2019,12,1);
        hw.isBirthday(2019,10,1);
        hw.isBirthday(2019,10,2);
        hw.isBirthday(2019,9,20);

    }

    @Test
    public void testminiC() {
        HelloWorld hw = new HelloWorld();
        hw.miniCalculator(1,1,'+');
        hw.miniCalculator(1,1,'-');
        hw.miniCalculator(2,2,'*');
        hw.miniCalculator(1,0,'/');
        hw.miniCalculator(7,2,'/');
        hw.miniCalculator(0,0,'!');

    }

}


















