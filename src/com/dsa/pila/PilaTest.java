package com.dsa.pila;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class PilaTest {
    IPila<Integer> p;

    @Before
    public void setUp() throws Exception {

        this.p = new Pila<>(5);

        p.push(4);
        p.push(6);
        p.push(2);

    }

    @Test
    public void testPush() throws Exception {

        Assert.assertEquals("testPush", 3, p.size());
        p.push(4);
        Assert.assertEquals("testPush", 4, p.size());
        p.push(6);
        Assert.assertEquals("testPush", 5, p.size());
    }

    @Test
    public void testPop() throws Exception {
        Assert.assertEquals("testPop", 3, p.size());

        int i = p.pop();
        Assert.assertEquals("testPush", 2, p.size());
        Assert.assertEquals("testPush", 2, i);

        int i2 = p.pop();
        Assert.assertEquals("testPush", 1, p.size());
        Assert.assertEquals("testPush", 6, i2);

        int i3 = p.pop();
        Assert.assertEquals("testPush", 0, p.size());
        Assert.assertEquals("testPush", 4, i3);
    }

    @Test(expected = EmptyStackException.class)
    public void testPopEmpty() throws Exception {

        p.mostra();

        Assert.assertEquals("testPush", 3, p.size());
        int i = p.pop();
        Assert.assertEquals("testPush", 2, p.size());
        Assert.assertEquals("testPush", 2, i);

        int i2 = p.pop();
        Assert.assertEquals("testPush", 1, p.size());
        Assert.assertEquals("testPush", 6, i2);

        int i3 = p.pop();
        Assert.assertEquals("testPush", 0, p.size());
        Assert.assertEquals("testPush", 4, i3);

        p.pop();
    }

    @Test(expected=FullStackException.class)
    public void testPushFull() throws Exception {
        Assert.assertEquals("testPush", 3, p.size());
        p.push(4);
        Assert.assertEquals("testPush", 4, p.size());
        p.push(6);

        Assert.assertEquals("testPush", 5, p.size());

        p.push(999999);
    }

}
