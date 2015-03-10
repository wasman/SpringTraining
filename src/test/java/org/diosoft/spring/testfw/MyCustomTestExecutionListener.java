package org.diosoft.spring.testfw;

import org.springframework.test.context.TestContext;
import org.springframework.test.context.TestExecutionListener;

public class MyCustomTestExecutionListener implements TestExecutionListener {

    @Override
    public void beforeTestClass(TestContext testContext) throws Exception {
        System.out.println("#beforeTestClass");
    }

    @Override
    public void prepareTestInstance(TestContext testContext) throws Exception {
        System.out.println("#prepareTestInstance");
    }

    @Override
    public void beforeTestMethod(TestContext testContext) throws Exception {
        System.out.println("#beforeTestMethod");
    }

    @Override
    public void afterTestMethod(TestContext testContext) throws Exception {
        System.out.println("#afterTestMethod");
    }

    @Override
    public void afterTestClass(TestContext testContext) throws Exception {
        System.out.println("#afterTestClass");
    }
}
