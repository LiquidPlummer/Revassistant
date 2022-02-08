package com.revature.revassistant.models;

import java.time.LocalDateTime;

public class ActionItem {
    private Integer id;
    private String title;
    private String body;
    private Boolean complete;
    private LocalDateTime dueDate;

    public ActionItem() {
    }

    public ActionItem(String title, String body, LocalDateTime dueDate) {
        this.title = title;
        this.body = body;
        this.dueDate = dueDate;
    }

    public ActionItem(Integer id, String title, String body, LocalDateTime dueDate) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.dueDate = dueDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Boolean getComplete() {
        return complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }
}
