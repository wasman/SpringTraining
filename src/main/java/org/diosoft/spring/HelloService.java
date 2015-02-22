package org.diosoft.spring;

import java.util.Arrays;
import java.util.Set;

import static java.lang.Thread.sleep;

public class HelloService {
    private final Set<String> values;
    private int count;

    public HelloService(Set<String> values) {
        this.values = values;
        System.out.println("HelloService created");
    }

    public String sayHello(String... toPrint) {
        System.out.println(values);
        System.out.println(Arrays.toString(toPrint));
        count++;
        System.out.println("Called times " + count);
        try {
            sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello world!";
    }
}
