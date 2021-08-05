package helloworld;

import io.micronaut.http.annotation.*;

@Controller("/")
public class HelloWorldController {

    @Get(uri="/greet/{location}", produces="text/plain")
    public String greet(String location) {
        return "Hello "+location;
    }
}