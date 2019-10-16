package com.erc;

public class LineHelper {

    private int with;
    private int height;

    public LineHelper(int with, int height) {
        this.with = with;
        this.height = height;
    }

    public boolean isTopBorder(int j) {
        return j == 0;
    }

    public boolean isBottomBorder(int j) {
        return j == height - 1;
    }

    public boolean isLeftBorder(int i) {
        return i == 0;
    }

    public boolean isRightBorder(int i) {
        return i == with - 1;
    }

    public boolean isTopLeftCorner(int i, int j) {
        return isTopBorder(j) && isLeftBorder(i);
    }

    public boolean isTopRightCorner(int i, int j) {
        return isTopBorder(j) && isRightBorder(i);
    }

    public boolean isBottomLeftCorner(int i, int j) {
        return isBottomBorder(j) && isLeftBorder(i);
    }

    public boolean isBottomRightCorner(int i, int j) {
        return isBottomBorder(j) && isRightBorder(i);
    }

    public boolean isMiddle(int j) {
        return j == (height / 2);
    }

    public boolean isMiddleLeftCorner(int i, int j) {
        return isMiddle(j) && isLeftBorder(i);
    }

    public boolean isMiddleRightCorner(int i, int j) {
        return isMiddle(j) && isRightBorder(i);
    }

    public boolean isCorner(int i, int j) {
        return isBottomRightCorner(i, j) ||
                isBottomLeftCorner(i, j) ||
                isTopLeftCorner(i, j) ||
                isTopRightCorner(i, j) ||
                isMiddleLeftCorner(i, j) ||
                isMiddleRightCorner(i, j);
    }
}
