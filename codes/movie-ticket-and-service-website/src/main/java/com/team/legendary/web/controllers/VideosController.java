package com.team.legendary.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by HYPJUDY on 2017/5/22.
 */

@Controller
public class VideosController {

    @RequestMapping(value = "/videos")
    String videos() {
        return  "videos";
    }
}
