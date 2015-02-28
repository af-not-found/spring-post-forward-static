package net.afnf.forward_test_boot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test01Controller {

    @Autowired
    ApplicationContext applicationContext;

    @RequestMapping(value = "/")
    public String index() {
        return "test01";
    }

    @RequestMapping(value = "/post")
    public String post() {
        return "forward:/static/test01.js";
    }

    @RequestMapping(value = "/prg")
    public String prg() {
        return "redirect:/static/test01.js";
    }
}
