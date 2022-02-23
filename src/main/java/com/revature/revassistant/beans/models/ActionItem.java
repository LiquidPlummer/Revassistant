package com.revature.revassistant.beans.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ActionItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "action_item_id")
    private Integer actionItemId;

    @Column()
    private String title;

    @Column
    private String body;

    @Column
    private Boolean complete;

    @Column(name = "due_date")
    private LocalDateTime dueDate;

    @Transient
    private String transientTest;
    private String nonTransientTest;





    public ActionItem() {
    }

    public ActionItem(String title, String body, LocalDateTime dueDate) {
        this.title = title;
        this.body = body;
        this.dueDate = dueDate;
    }

    public ActionItem(Integer actionItemId, String title, String body, LocalDateTime dueDate) {
        this.actionItemId = actionItemId;
        this.title = title;
        this.body = body;
        this.dueDate = dueDate;
    }

    public Integer getActionItemId() {
        return actionItemId;
    }

    public void setActionItemId(Integer actionItemId) {
        this.actionItemId = actionItemId;
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

    public String getTransientTest() {
        return transientTest;
    }

    public void setTransientTest(String transientTest) {
        this.transientTest = transientTest;
    }

    public String getNonTransientTest() {
        return nonTransientTest;
    }

    public void setNonTransientTest(String nonTransientTest) {
        this.nonTransientTest = nonTransientTest;
    }
}
