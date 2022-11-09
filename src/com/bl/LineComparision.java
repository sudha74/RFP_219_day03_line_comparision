package com.bl;

public class LineComparision {
    public static void main(String[] args) {
        int x1, y1, x2, y2;
        double lengthOfLine;

        x1 = 2;
        y1 = 2;
        x2 = 5;
        y2 = 5;

        lengthOfLine = (Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        System.out.println("Length of line = " + lengthOfLine);
    }
}
