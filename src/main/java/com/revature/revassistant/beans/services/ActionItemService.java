package com.revature.revassistant.beans.services;

import com.revature.revassistant.beans.models.ActionItem;
import com.revature.revassistant.beans.repositories.ActionItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActionItemService {
    private final ActionItemRepository repo;

    @Autowired
    public ActionItemService(ActionItemRepository repo) {
        this.repo = repo;
    }

    public void save(ActionItem item) {
        repo.save(item);
    }

    public ActionItem getActionItemById(Integer id) {
        return repo.getById(id);
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }

    public List<ActionItem> getAllActionItems() {
        return repo.findAll();
    }


}
