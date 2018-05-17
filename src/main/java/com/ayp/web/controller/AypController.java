package com.ayp.web.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author qiumeng
 * @Package com.ayp.web.controller
 * @Description:
 * @date 2018 2018/5/17 13:58
 */
// @Controller
public class AypController {


    /**
     * 测试hello
     * @return
     */
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("name", "Dear");
        return "hello";
    }
}
