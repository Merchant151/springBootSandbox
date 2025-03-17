package com.merchant151.sandbox;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")//where on the site should we map this to
    public String index(){
        return "index.html";
    }
}
