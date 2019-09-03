package ithilell;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class JUnitDemo {

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("before class");
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("after class");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after");
    }

    @Test
    public void test1() {
        System.out.println("Test1 passed...");
        Assert.assertEquals("hello", "hello");
        List<String> list=asList("h", "ww", "wqe");
        assertThat(list, hasItem("ww"));
    }

//    @Ignore
    @Test(expected = RuntimeException.class)
    public void test2() {
        System.out.println("Test2 passed...");
        throw new RuntimeException();
    }

    @Test
    public void test3() {
        System.out.println("Test3 passed...");
        Assert.assertEquals("hello", "hello");
//        Assert.fail();
    }
}
