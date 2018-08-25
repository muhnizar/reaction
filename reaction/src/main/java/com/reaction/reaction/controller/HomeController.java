package com.reaction.reaction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by muhammad.nizar01 on 8/22/2018.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }

}
