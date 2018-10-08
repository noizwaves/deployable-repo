package io.pivotal.pal.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class DemoController {
    @GetMapping("/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/demo");
    }

    @GetMapping(path = "/demo")
    public String demo() {
        return "This is a demo";
    }
}
