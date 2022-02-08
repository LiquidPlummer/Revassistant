package com.revature.revassistant.beans.controllers;

import com.revature.revassistant.models.ActionItem;
import com.revature.revassistant.models.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.List;

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
    @RequestMapping(method = RequestMethod.POST)
    public void newActionItem(@RequestBody ActionItem item) {

    }

    //update one specific action item
    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public void updateActionItem(@RequestBody ActionItem item, @PathVariable Integer id) {

    }


    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteActionItem(@PathVariable Integer id) {

    }

    @RequestMapping(method = RequestMethod.GET)
    public List<ActionItem> getAllActionItemsForUser(@RequestBody Authorization auth) {

        return null;
    }
}
