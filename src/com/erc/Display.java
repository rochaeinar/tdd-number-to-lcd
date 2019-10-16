package com.erc;

import java.util.ArrayList;

public class Display {
    private ArrayList<LcdNumber> lcdNumbers;

    public Display() {
        this.lcdNumbers = new ArrayList<>();
    }

    public void addLcdNumber(LcdNumber lcdNumber) {
        this.lcdNumbers.add(lcdNumber);
    }

    public ArrayList<LcdNumber> getLcdNumbers() {
        return lcdNumbers;
    }

    public String getStringRepresentation() {

        StringBuffer[] lines = {new StringBuffer(), new StringBuffer(), new StringBuffer()};

        for (LcdNumber lcdNumber : lcdNumbers) {
            int currentLine = 0;
            for (String[] line : lcdNumber.getLcdRepresentation()) {
                for (String led : line) {
                    lines[currentLine].append(led);
                }
                currentLine++;
            }
        }

        return lines[0].toString() + "\n" +
                lines[1].toString() + "\n" +
                lines[2].toString() + "\n";
    }
}
