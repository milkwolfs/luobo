package com.bianyiit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getRequestParam")
    public String getRequestParam(@RequestParam("name") String username){
        System.out.println(username);
        return "success";
    }

    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body){
        System.out.println(body);
        return "success";
    }

    @RequestMapping("/testPathVariable/{id}")
    public String testPathVariable(@PathVariable String id){
        System.out.println(id);
        return "success";
    }

    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(name = "Accept") String header){
        System.out.println(header);
        return "success";
    }

    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue(name = "JSESSIONID") String cookie){
        System.out.println("这个方法用来获取cookie信息");
        System.out.println(cookie);
        return "success";
    }

    @ModelAttribute
    public void testModelAttribute(){
        System.out.println("test方法被执行了");
    }

    @RequestMapping("/addParam")
    public String addParam(Model model){
        Model model1 = model.addAttribute("msg", "hello");
        System.out.println(model1);
        return "success";
    }

}
