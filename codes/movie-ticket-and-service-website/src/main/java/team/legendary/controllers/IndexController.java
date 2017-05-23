package team.legendary.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by HYPJUDY on 2017/5/21.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    String root() {
        return  "index";
    }

    @RequestMapping("/index")
    String index() {
        return  "index";
    }

    @RequestMapping("/ticket")
    String ticket() {
        return  "ticket";
    }
}
