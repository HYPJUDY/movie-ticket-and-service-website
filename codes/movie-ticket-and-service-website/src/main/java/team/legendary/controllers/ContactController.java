package team.legendary.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by HYPJUDY on 2017/5/21.
 */
@Controller
public class ContactController {

    @RequestMapping("/contact")
    String contact() {
        return  "contact";
    }
}
