package com.revature.revassistant.beans.controllers;

import com.revature.revassistant.beans.models.ActionItem;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/")
public class HealthCheckController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String ping() {
        return "pong!";
    }
}
