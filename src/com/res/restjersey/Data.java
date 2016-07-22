package com.res.restjersey;

public class Data {
    private int value;
    private String string;

    public Data(
        int value, String string) {
        super();
        this.value = value;
        this.string = string;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

}
