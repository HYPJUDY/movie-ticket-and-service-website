package com.team.legendary.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by HYPJUDY on 2017/5/22.
 */

@Controller
public class ErrorController {

    @RequestMapping(value = "/404")
    String error404() {
        return  "404";
    }

}
