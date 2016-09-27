package com.ironyard.data;

import java.util.List;

/**
 * Created by Raul on 9/27/16.
 */
public class Blog {
    private String title;
    private int date;
    private long id;
    private List<Entry> entries;


    public Blog(String title, int date, long id, List<Entry> entries) {
        this.title = title;
        this.date = date;
        this.id = id;
        this.entries = entries;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

}
