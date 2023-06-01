package com.example.td1;

public enum ClassUniqueInstance {

    INSTANCE("Initial class info");

    private String click;

    private ClassUniqueInstance(String click) {
        this.click = click;
    }

    public String getClick() {
        return click;
    }

    public void setClick(String click) {
        this.click = click;
    }

    public static ClassUniqueInstance getInstance() {
        return INSTANCE;
    }
}
