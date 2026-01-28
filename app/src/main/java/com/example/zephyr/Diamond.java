package com.example.zephyr;

public class Diamond extends Shape {

    private int width;
    private int height;

    public Diamond(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
