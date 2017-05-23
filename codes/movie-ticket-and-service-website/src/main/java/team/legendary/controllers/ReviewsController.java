package team.legendary.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by HYPJUDY on 2017/5/22.
 */

@Controller
public class ReviewsController {

    @RequestMapping(value = "/reviews")
    String reviews() {
        return  "reviews";
    }

    @RequestMapping(value = "/single")
    String single() {
        return  "single";
    }
}
