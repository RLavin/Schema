package com.ironyard.data;

/**
 * Created by Raul on 9/27/16.
 */
public class Entry {
    private String title;
    private String text;
    private int date;
    private long id;


    public Entry(String title, String text, int date, long id) {
        this.title = title;
        this.text = text;
        this.date = date;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
