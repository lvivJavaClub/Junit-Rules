package ua.lviv.javaclub.junit4rulesdemo;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;

public class Demo_08_ClassExternalResource {

    @ClassRule
    public static final ExternalResource externalResource = new ExternalResource() {
        @Override
        protected void before() throws Throwable {
            // code to set up a specific external resource.
            System.err.println("before");
        }

        @Override
        protected void after() {
            // code to tear down the external resource
            System.err.println("after");
        }
    };

    @Test
    public void test1() {
        System.err.println("test1");
    }

    @Test
    public void test2() {
        System.err.println("test2");
    }
}
