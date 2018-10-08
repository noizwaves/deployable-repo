package io.pivotal.pal.demo;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DemoControllerTests {
    DemoController controller;

    @Before
    public void setup() throws Exception {
        controller = new DemoController();
    }

    @Test
    public void demo() throws Exception {
        String result = controller.demo();

        assertThat(result).isEqualTo("This is a demo");
    }
}