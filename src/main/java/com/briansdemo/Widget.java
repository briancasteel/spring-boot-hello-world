package com.briansdemo;

/**
 * Created by Brian Casteel on 2/8/2016.
 */
public class Widget {
    public String getType() {
        return type;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    private String type;
    private int length;
    private int height;

    public Widget(String type, int length, int height){
        this.type = type;
        this.length = length;
        this.height = height;
    }


}
