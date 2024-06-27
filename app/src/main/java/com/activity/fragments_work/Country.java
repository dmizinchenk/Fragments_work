package com.activity.fragments_work;

import java.io.Serializable;

public class Country implements Serializable {
    private String title;
    private String capital;
    private int flag;

    public Country(String title, String capital, int flag) {
        this.title = title;
        this.capital = capital;
        this.flag = flag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
