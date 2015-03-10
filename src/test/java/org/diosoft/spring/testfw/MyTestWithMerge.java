package org.diosoft.spring.testfw;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-config-testfw.xml")
//@TestExecutionListeners(
//    listeners = MyCustomTestExecutionListener.class,
//    mergeMode = MERGE_WITH_DEFAULTS
//)
public class MyTestWithMerge {

    @Before
    public void before(){
        System.out.println("Before lunched");
    }

    @Test
    public void testExecution() throws Exception {
        System.out.println("Test executed");
    }

}
