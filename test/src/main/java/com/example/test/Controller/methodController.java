package com.example.test.Controller;

import com.example.test.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class methodController {

    @RequestMapping(value = "/get1",method = RequestMethod.GET)
    public String Get1(){
        return "Get方法";
    }

    @RequestMapping(value = "/get2",method = RequestMethod.GET)
    public String Get2(String nickname,String phone){
        System.out.println("nickname:"+nickname);
        System.out.println("phone:"+phone);
        return "Get请求";
    }
    @RequestMapping(value = "/get3",method = RequestMethod.GET)
    public String Get3(@RequestParam(value = "nickname",required = false) String name){
        System.out.println("nickname:"+name);
        return "Get请求";
    }
    @RequestMapping(value = "/post1",method=RequestMethod.POST)
    public String Post1(){
        return "POST请求";
    }
    @RequestMapping(value = "/post2",method = RequestMethod.POST)
    public String Post2(String username,String password){
        System.out.println("username:"+username);
        System.out.println("password:"+password);
        return "POST请求";
    }
    @RequestMapping(value = "/post3",method = RequestMethod.POST)
    public String Post3(User user){
        System.out.println(user);
        return "Post3";
    }

    @RequestMapping(value = "/post4",method = RequestMethod.POST)
    public String Post4(@RequestBody User user){
        System.out.println(user);
        return "Post4";
    }
    @GetMapping("/test/**")
    public String test(){
        return "通配符请求";
    }

}
