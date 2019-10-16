package com.erc;

public class LcdNumber {

    private int number;

    public LcdNumber(int number) {
        this.number = number;
        applyLcdMapRepresentation();
    }

    public int getNumber() {
        return number;
    }

    private String[][] defaultLcdNumber =
            {
                    {" ", "_", " "},
                    {"|", "_", "|"},
                    {"|", "_", "|"}
            };

    public String[][] getLcdRepresentation() {
        return defaultLcdNumber;
    }

    private void applyLcdMapRepresentation() {
        for (int i : LcdMap.getMap(this.number)) {
            int y = i % 3;
            int x = i / 3;
            defaultLcdNumber[x][y] = " ";
        }
    }
}
