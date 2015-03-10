package org.diosoft.spring.testfw;

import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-config-testfw.xml")
@ActiveProfiles({"dev", "qa"})
public class MyTestWithPrifileConfiguration {

}
