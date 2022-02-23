package com.revature.revassistant.beans.controllers;

import com.revature.revassistant.beans.models.ActionItem;
import com.revature.revassistant.beans.models.Authorization;
import com.revature.revassistant.beans.services.ActionItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //@ResponseBody and @Controller are implied by @RestController
@RequestMapping("/actionItems")
public class ActionItemController {
    public ActionItemService service;

    @Autowired
    public ActionItemController(ActionItemService service) {
        this.service = service;
    }

    //get a single action item by ID
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ActionItem getActionItemByID(@PathVariable Integer id) {
        return service.getActionItemById(id);
    }

    //post new action item
    @RequestMapping(method = RequestMethod.POST)
    public void newActionItem(@RequestBody ActionItem item) {
        service.save(item);
    }

    //update one specific action item
    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public void updateActionItem(@RequestBody ActionItem item, @PathVariable Integer id) {
        service.save(item);
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteActionItem(@PathVariable Integer id) {
        service.delete(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<ActionItem> getAllActionItemsForUser(@RequestBody Authorization auth) {

        return service.getAllActionItems();
    }
}
