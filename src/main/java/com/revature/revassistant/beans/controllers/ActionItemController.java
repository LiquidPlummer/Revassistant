package com.revature.revassistant.beans.controllers;

import com.revature.revassistant.models.ActionItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController //@ResponseBody and @Controller are implied by @RestController
@RequestMapping("/actionItems")
public class ActionItemController {

    //@Autowired //not necessary for now, as constructor has no dependencies.
    public ActionItemController() {

    }

    //get a single action item by ID
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ActionItem getActionItemByID(@PathVariable Integer id) {


        return null;
    }

    //post new action item
    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public void newActionItem(@RequestBody ActionItem item) {

    }




}
