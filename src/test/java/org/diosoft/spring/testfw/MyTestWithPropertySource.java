package org.diosoft.spring.testfw;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-config-testfw.xml")
@TestPropertySource(properties = {"runing.with.tests=true", "prop.value2: value2"})
public class MyTestWithPropertySource {

}
