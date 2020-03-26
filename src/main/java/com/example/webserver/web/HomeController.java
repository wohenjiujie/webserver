package com.example.webserver.web;

import com.example.webserver.service.TrackService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by INvo
 * on 2020/3/26.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "home";
    }
}
