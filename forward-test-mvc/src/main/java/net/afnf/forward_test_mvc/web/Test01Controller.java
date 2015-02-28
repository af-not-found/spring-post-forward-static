package net.afnf.forward_test_mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test01Controller {

    @RequestMapping(value = "/")
    public String index() {
        return "test01";
    }

    @RequestMapping(value = "/post")
    public String post() {
        // return "redirect:/static/test01.js";
        return "forward:/static/test01.js";
    }
}
