package com.chuan.controller;

import com.chuan.component.RequestScopeTestComponent;
import com.chuan.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author xucy-e
 */
@RestController
@RequestMapping("/play")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @Autowired
    private RequestScopeTestComponent requestScopeTestComponent;

    @GetMapping("/hello")
    public String sayHello() {
        System.out.println(1 / 0);
        return helloService.sayHello();
    }

    @GetMapping("/date/{date}")
    public Date echoDate(@PathVariable Date date) {
        System.out.println(date);
        return date;
    }

    @GetMapping("/string/{str}")
    public String echoString(@PathVariable String str) {
        System.out.println(str);
        return str;
    }

    @GetMapping("/controllerAdvice/modelAttribute")
    public String testModelAttribute(Model model) {
        return (String) model.getAttribute("userName");
    }
}
