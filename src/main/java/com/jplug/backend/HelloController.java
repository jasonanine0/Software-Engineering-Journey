package com.jplug.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public ApiResponsive sayHello() {
        return new ApiResponsive("Hello from JASON'S API", "success");
    }
}
