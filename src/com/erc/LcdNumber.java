package com.erc;

public class LcdNumber {

    private int number;
    private int with;
    private int height;

    public LcdNumber(int number, int with, int height) {
        this.number = number;
        this.with = with;
        this.height = height;
        fillDefaultLcdNumber();
        applyLcdMapRepresentation();
    }

    public int getNumber() {
        return number;
    }

    private String[][] defaultLcdNumber;

    public String[][] getLcdRepresentation() {
        return defaultLcdNumber;
    }

    private void applyLcdMapRepresentation() {
        for (int lcdLedPosition : LcdMap.getMap(this.number)) {
            switch (lcdLedPosition) {
                case 1:
                    clearHorizontalLcdLed(0);
                    break;
                case 2:
                    clearVerticalLcdLed(0, 0);
                    break;
                case 3:
                    clearVerticalLcdLed(getTotalWith() - 1, 0);
                    break;
                case 4:
                    clearHorizontalLcdLed(getTotalHeight() / 2);
                    break;
                case 5:
                    clearVerticalLcdLed(0, getTotalHeight() / 2);
                    break;
                case 6:
                    clearVerticalLcdLed(getTotalWith() - 1, getTotalHeight() / 2);
                    break;
                case 7:
                    clearHorizontalLcdLed(getTotalHeight() - 1);
                    break;
            }
        }
    }

    public int getTotalWith() {
        return 2 + this.with;
    }

    public int getTotalHeight() {
        return 3 + (height * 2);
    }

    private void fillDefaultLcdNumber() {
        defaultLcdNumber = new String[getTotalHeight()][getTotalWith()];

        LineHelper lineHelper = new LineHelper(getTotalWith(), getTotalHeight());

        for (int i = 0; i < getTotalWith(); i++) {
            for (int j = 0; j < getTotalHeight(); j++) {
                if (!lineHelper.isCorner(i, j)) {
                    if (lineHelper.isLeftBorder(i) || lineHelper.isRightBorder(i)) {
                        defaultLcdNumber[j][i] = "|";
                    } else if (lineHelper.isTopBorder(j) || lineHelper.isBottomBorder(j) || lineHelper.isMiddle(j)) {
                        defaultLcdNumber[j][i] = "_";
                    } else {
                        defaultLcdNumber[j][i] = " ";
                    }
                } else {
                    defaultLcdNumber[j][i] = " ";
                }
            }
        }
    }

    private void clearHorizontalLcdLed(int j) {
        for (int i = 0; i < getTotalWith(); i++) {
            defaultLcdNumber[j][i] = " ";
        }
    }

    private void clearVerticalLcdLed(int i, int j) {
        for (int k = j; k < (j + getTotalHeight() / 2); k++) {
            defaultLcdNumber[k][i] = " ";
        }
    }
}
