package org.example;

import org.testng.Assert;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class ArithmeticTest {


    int a,b;
    Arithmetic arithmetic;

    @BeforeTest
    public void setUp() {
        arithmetic=new Arithmetic();
        a=50;
        b=5;

    }

    @AfterTest
    public void tearDown() {
        arithmetic=null;
        a=0;
        b=0;
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(55,arithmetic.add(a,b));
    }

    @Test
    public void testSub() {
        Assert.assertEquals(45,arithmetic.sub(a,b));
    }

    @Test
    public void testMul() {
        Assert.assertEquals(250,arithmetic.mul(a,b));
    }

    @Test
    public void testDiv() {
        Assert.assertEquals(10,arithmetic.div(a,b));
    }

    @Test(expectedExceptions = ArithmeticException.class)
    void testingDiv(){
        arithmetic.div(5,0);
    }

    @Test
    void printOddNumbers(){
        List <Integer> oddnum=new ArrayList<>();
        oddnum.add(1);
        oddnum.add(2);
        oddnum.add(3);
        oddnum.add(4);
        oddnum.add(5);
        oddnum.add(6);
        oddnum.add(7);
        Assert.assertEquals("[1, 3, 5, 7]",arithmetic.printOddNumbers(oddnum).toString());
    }

}